import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class InterfazApp extends JFrame {
    private JButton[][] tablero = new JButton[3][3];
    private JTextField inputNombre;
    private JLabel estadoLabel;
    private MongoCollection<Document> collectionJugadores;
    private boolean turnoJugador1 = true; // True para Jugador 1 (X), False para Jugador 2 (O)
    private int movimientos = 0; // Contador de movimientos para detectar empate
    private int puntuacionJugador1 = 0; // Puntuación del Jugador 1
    private int puntuacionJugador2 = 0; // Puntuación del Jugador 2
    private JLabel puntuacionLabel; // Mostrar puntuaciones
    private JButton resetButton; // Botón de reinicio, visible tras ganar/empatar
    private JLabel[] etiquetasColumnas; // Etiquetas para los equipos (columnas)
    private JLabel[] etiquetasFilas; // Etiquetas para las posiciones (filas)
    private List<String> categoriasEquipos; // Lista de equipos para columnas
    private List<String> categoriasPosiciones; // Lista de posiciones para filas

    public InterfazApp() {
        // Conexión a MongoDB
        String direccion_mongo = "mongodb+srv://Nicolas:tirlppc64YyaXJrJ@clusterefa0.dlerdp1.mongodb.net/?retryWrites=true&w=majority&appName=ClusterEFA0";
        try {
            MongoClient mongoClient = MongoClients.create(direccion_mongo);
            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
            collectionJugadores = database.getCollection("jugadores");
        } catch (Exception e) {
            e.printStackTrace();
            estadoLabel = new JLabel("Error al conectar con la base de datos");
            return;
        }

        setTitle("Fútbol en Raya");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(34, 139, 34)); // Verde campo

        // Inicializar categorías
        inicializarCategorias();

        // Panel superior para etiquetas de equipos (columnas)
        JPanel panelSuperior = new JPanel(new GridLayout(1, 4));
        panelSuperior.setBackground(new Color(34, 139, 34));
        panelSuperior.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelSuperior.add(new JLabel()); // Esquina vacía
        etiquetasColumnas = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            etiquetasColumnas[i] = new JLabel(categoriasEquipos.get(i), SwingConstants.CENTER);
            etiquetasColumnas[i].setFont(new Font("Verdana", Font.BOLD, 18));
            etiquetasColumnas[i].setForeground(Color.WHITE);
            panelSuperior.add(etiquetasColumnas[i]);
        }
        add(panelSuperior, BorderLayout.NORTH);

        // Panel central para etiquetas de posiciones (filas) y tablero
        JPanel panelCentro = new JPanel(new GridLayout(4, 4, 5, 5));
        panelCentro.setBackground(new Color(34, 139, 34));
        panelCentro.setBorder(new EmptyBorder(10, 10, 10, 10));
        etiquetasFilas = new JLabel[3];
        // Primera fila: esquina vacía + etiquetas de columnas (ya en panelSuperior)
        panelCentro.add(new JLabel()); // Esquina vacía
        for (int i = 0; i < 3; i++) {
            panelCentro.add(new JLabel()); // Celdas vacías encima del tablero
        }
        // Filas 2-4: etiquetas de filas + botones del tablero
        for (int i = 0; i < 3; i++) {
            etiquetasFilas[i] = new JLabel(categoriasPosiciones.get(i), SwingConstants.CENTER);
            etiquetasFilas[i].setFont(new Font("Verdana", Font.BOLD, 18));
            etiquetasFilas[i].setForeground(Color.WHITE);
            panelCentro.add(etiquetasFilas[i]);
            for (int j = 0; j < 3; j++) {
                int fila = i;
                int col = j;
                tablero[i][j] = new JButton();
                tablero[i][j].setFont(new Font("Verdana", Font.BOLD, 24));
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].setForeground(Color.BLACK);
                tablero[i][j].setBorder(new LineBorder(Color.BLACK, 2, true));
                tablero[i][j].setOpaque(true);
                tablero[i][j].setPreferredSize(new Dimension(100, 100));
                tablero[i][j].addActionListener(e -> manejarJugada(fila, col));
                panelCentro.add(tablero[i][j]);
            }
        }
        add(panelCentro, BorderLayout.CENTER);

        // Panel inferior: entrada, estado, puntuación y botón de reinicio
        JPanel panelSur = new JPanel(new FlowLayout());
        panelSur.setBackground(new Color(200, 200, 200));
        panelSur.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel nombreLabel = new JLabel("Nombre jugador: ");
        nombreLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        panelSur.add(nombreLabel);
        inputNombre = new JTextField(20);
        inputNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
        panelSur.add(inputNombre);
        estadoLabel = new JLabel("Jugador 1: Introduce nombre y elige una casilla");
        estadoLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        panelSur.add(estadoLabel);
        puntuacionLabel = new JLabel("Puntuación - Jugador 1: 0 | Jugador 2: 0");
        puntuacionLabel.setFont(new Font("Verdana", Font.BOLD, 14));
        panelSur.add(puntuacionLabel);
        resetButton = new JButton("Reiniciar");
        resetButton.setFont(new Font("Verdana", Font.BOLD, 14));
        resetButton.setBackground(new Color(255, 215, 0));
        resetButton.setForeground(Color.BLACK);
        resetButton.setBorder(new LineBorder(Color.BLACK, 2, true));
        resetButton.setVisible(false); // Oculto hasta que termine el juego
        resetButton.addActionListener(e -> reiniciarJuego());
        panelSur.add(resetButton);
        add(panelSur, BorderLayout.SOUTH);
    }

    private void inicializarCategorias() {
        // Lista de equipos basada en la base de datos
        categoriasEquipos = new ArrayList<>(Arrays.asList(
            "Valencia", "Osasuna", "Sevilla", "Real Madrid", "Barcelona",
            "Atlético de Madrid", "Villarreal", "Athletic Club", "Real Betis",
            "Real Sociedad", "Girona", "Celta", "Espanyol", "Getafe",
            "Las Palmas", "Mallorca", "Leganés", "Rayo Vallecano", "Valladolid", "Alavés"
        ));
        // Lista de posiciones limitada a Delantero, Centrocampista y Defensa
        categoriasPosiciones = new ArrayList<>(Arrays.asList("Delantero", "Centrocampista", "Defensa"));
        // Mezclar y seleccionar 3 equipos
        Collections.shuffle(categoriasEquipos, new Random());
        categoriasEquipos = categoriasEquipos.subList(0, 3);
        // No mezclamos posiciones, ya que queremos que estén fijas: Delantero, Centrocampista, Defensa
    }

    private void manejarJugada(int fila, int col) {
        // Verificar si la celda ya está ocupada
        if (!tablero[fila][col].getText().isEmpty()) {
            estadoLabel.setText("Casilla ocupada, elige otra");
            return;
        }

        String nombre = inputNombre.getText().trim();
        if (nombre.isEmpty()) {
            estadoLabel.setText("Introduce un nombre válido");
            return;
        }

        // Validar el jugador contra las categorías (equipo y posición)
        String equipoRequerido = categoriasEquipos.get(col);
        String posicionRequerida = categoriasPosiciones.get(fila);
        List<String> posicionesValidas = new ArrayList<>();
        // Ajustar posiciones para incluir variaciones
        if (posicionRequerida.equals("Centrocampista")) {
            posicionesValidas.add("Centrocampista");
            posicionesValidas.add("Centrocampista Defensivo");
            posicionesValidas.add("Mediapunta"); // Incluimos Mediapunta como Centrocampista
        } else if (posicionRequerida.equals("Defensa")) {
            posicionesValidas.add("Defensa");
            posicionesValidas.add("Defensa Central");
        } else {
            posicionesValidas.add(posicionRequerida);
        }

        Document query = new Document("equipos", new Document("$in", Arrays.asList(equipoRequerido)))
                        .append("posiciones", new Document("$in", posicionesValidas))
                        .append("nombre", nombre);
        Document jugador = collectionJugadores.find(query).first();

        if (jugador == null) {
            estadoLabel.setText("Error: Jugador no válido para " + equipoRequerido + " y " + posicionRequerida);
            // Animación de error: parpadeo en rojo
            new Timer(200, e -> {
                Color currentColor = tablero[fila][col].getBackground();
                if (currentColor.equals(Color.RED)) {
                    tablero[fila][col].setBackground(Color.WHITE);
                } else {
                    tablero[fila][col].setBackground(Color.RED);
                }
            }).start();
            new Timer(1200, e -> tablero[fila][col].setBackground(Color.WHITE)).start();
            inputNombre.setText(""); // Limpiar entrada
            return;
        }

        // Jugada válida: colocar X o O y actualizar UI
        String simbolo = turnoJugador1 ? "X" : "O";
        tablero[fila][col].setText(simbolo);
        tablero[fila][col].setForeground(turnoJugador1 ? Color.YELLOW : Color.BLUE); // Amarillo para X, Azul para O
        // Animación de éxito: transición a verde
        tablero[fila][col].setBackground(new Color(50, 205, 50));
        tablero[fila][col].setEnabled(false); // Deshabilitar botón
        movimientos++;

        // Actualizar estado y cambiar turno
        if (turnoJugador1) {
            estadoLabel.setText("Jugador 2: Introduce nombre para " + categoriasEquipos.get(col) + " y " + categoriasPosiciones.get(fila));
        } else {
            estadoLabel.setText("Jugador 1: Introduce nombre para " + categoriasEquipos.get(col) + " y " + categoriasPosiciones.get(fila));
        }
        turnoJugador1 = !turnoJugador1;

        // Verificar ganador o empate
        if (comprobarGanador(simbolo)) {
            estadoLabel.setText("¡Jugador " + simbolo + " gana!");
            if (simbolo.equals("X")) {
                puntuacionJugador1++;
            } else {
                puntuacionJugador2++;
            }
            actualizarPuntuacion();
            deshabilitarTablero();
            resetButton.setVisible(true);
        } else if (movimientos == 9) {
            estadoLabel.setText("¡Empate!");
            deshabilitarTablero();
            resetButton.setVisible(true);
        }

        // Limpiar campo de entrada
        inputNombre.setText("");
    }

    private boolean comprobarGanador(String simbolo) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].getText().equals(simbolo) &&
                tablero[i][1].getText().equals(simbolo) &&
                tablero[i][2].getText().equals(simbolo)) {
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j].getText().equals(simbolo) &&
                tablero[1][j].getText().equals(simbolo) &&
                tablero[2][j].getText().equals(simbolo)) {
                return true;
            }
        }
        // Verificar diagonales
        if (tablero[0][0].getText().equals(simbolo) &&
            tablero[1][1].getText().equals(simbolo) &&
            tablero[2][2].getText().equals(simbolo)) {
            return true;
        }
        if (tablero[0][2].getText().equals(simbolo) &&
            tablero[1][1].getText().equals(simbolo) &&
            tablero[2][0].getText().equals(simbolo)) {
            return true;
        }
        return false;
    }

    private void deshabilitarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setEnabled(false);
            }
        }
    }

    private void reiniciarJuego() {
        // Limpiar tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setText("");
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].setForeground(Color.BLACK);
                tablero[i][j].setEnabled(true);
            }
        }
        // Restablecer estado del juego
        movimientos = 0;
        turnoJugador1 = true;
        estadoLabel.setText("Jugador 1: Introduce nombre y elige una casilla");
        resetButton.setVisible(false);
        // Randomizar categorías (solo equipos, posiciones son fijas)
        inicializarCategorias();
        // Actualizar etiquetas de categorías
        for (int i = 0; i < 3; i++) {
            etiquetasColumnas[i].setText(categoriasEquipos.get(i));
            etiquetasFilas[i].setText(categoriasPosiciones.get(i));
        }
    }

    private void actualizarPuntuacion() {
        puntuacionLabel.setText("Puntuación - Jugador 1: " + puntuacionJugador1 + " | Jugador 2: " + puntuacionJugador2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazApp().setVisible(true));
    }
}
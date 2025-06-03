import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterfazApp extends JFrame {
    private JButton[][] tablero = new JButton[3][3];
    private JTextField inputNombre;
    private JLabel estadoLabel;
    private MongoCollection<Document> coleccionJugadores;
    private boolean esTurnoJugador1 = true;
    private int movimientos = 0;
    private int puntuacionJugador1 = 0;
    private int puntuacionJugador2 = 0;
    private JLabel puntuacionLabel;
    private JButton botonReiniciar;
    private JLabel[] etiquetasEquipos;
    private JLabel[] etiquetasPosiciones;
    private List<String> equipos;
    private List<String> posiciones;
    private static final Color VERDE_CAMPO = new Color(34, 139, 34);
    private static final Color GRIS_CLARO = new Color(200, 200, 200);
    private static final Color AMARILLO = Color.YELLOW;
    private static final Color AZUL = Color.BLUE;
    private static final Color VERDE_EXITO = new Color(50, 205, 50);

    public InterfazApp() {
        setTitle("Futbol en Raya");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(VERDE_CAMPO);

        String urlMongo = "mongodb+srv://Nicolas:tirlppc64YyaXJrJ@clusterefa0.dlerdp1.mongodb.net/?retryWrites=true&w=majority&appName=ClusterEFA0";
        try {
            MongoClient cliente = MongoClients.create(urlMongo);
            MongoDatabase baseDatos = cliente.getDatabase("futbol3raya");
            coleccionJugadores = baseDatos.getCollection("jugadores");
        } catch (Exception e) {
            estadoLabel = new JLabel("Error al conectar con la base de datos");
            estadoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            add(estadoLabel, BorderLayout.CENTER);
            return;
        }

        inicializarListas();

        JPanel panelSuperior = new JPanel(new GridLayout(1, 4));
        panelSuperior.setBackground(VERDE_CAMPO);
        panelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelSuperior.add(new JLabel());
        etiquetasEquipos = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            etiquetasEquipos[i] = new JLabel(equipos.get(i), SwingConstants.CENTER);
            etiquetasEquipos[i].setFont(new Font("Arial", Font.BOLD, 18));
            etiquetasEquipos[i].setForeground(Color.WHITE);
            panelSuperior.add(etiquetasEquipos[i]);
        }
        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelTablero = new JPanel(new GridLayout(4, 4, 5, 5));
        panelTablero.setBackground(VERDE_CAMPO);
        panelTablero.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelTablero.add(new JLabel());
        for (int i = 0; i < 3; i++) {
            panelTablero.add(new JLabel());
        }
        etiquetasPosiciones = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            etiquetasPosiciones[i] = new JLabel(posiciones.get(i), SwingConstants.CENTER);
            etiquetasPosiciones[i].setFont(new Font("Arial", Font.BOLD, 18));
            etiquetasPosiciones[i].setForeground(Color.WHITE);
            panelTablero.add(etiquetasPosiciones[i]);
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = new JButton();
                tablero[i][j].setFont(new Font("Arial", Font.BOLD, 24));
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                int fila = i;
                int col = j;
                tablero[i][j].addActionListener(e -> manejarJugada(fila, col));
                panelTablero.add(tablero[i][j]);
            }
        }
        add(panelTablero, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.setBackground(GRIS_CLARO);
        panelInferior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel etiquetaNombre = new JLabel("Nombre jugador: ");
        etiquetaNombre.setFont(new Font("Arial", Font.PLAIN, 14));
        panelInferior.add(etiquetaNombre);
        inputNombre = new JTextField(20);
        inputNombre.setFont(new Font("Arial", Font.PLAIN, 14));
        panelInferior.add(inputNombre);
        estadoLabel = new JLabel("Jugador 1: Introduce nombre y elige una casilla");
        estadoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        panelInferior.add(estadoLabel);
        puntuacionLabel = new JLabel("Puntuacion - Jugador 1: 0 | Jugador 2: 0");
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panelInferior.add(puntuacionLabel);
        botonReiniciar = new JButton("Reiniciar");
        botonReiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        botonReiniciar.setBackground(AMARILLO);
        botonReiniciar.setVisible(false);
        botonReiniciar.addActionListener(e -> reiniciarJuego());
        panelInferior.add(botonReiniciar);
        add(panelInferior, BorderLayout.SOUTH);
    }

    private void inicializarListas() {
        equipos = new ArrayList<>(Arrays.asList(
            "Valencia", "Osasuna", "Sevilla", "Real Madrid", "Barcelona",
            "Atletico de Madrid", "Villarreal", "Athletic Club", "Real Betis",
            "Real Sociedad", "Girona", "Celta", "Espanyol", "Getafe",
            "Las Palmas", "Mallorca", "Leganes", "Rayo Vallecano", "Valladolid", "Alaves"
        ));
        Collections.shuffle(equipos);
        equipos = equipos.subList(0, 3);
        posiciones = Arrays.asList("Delantero", "Centrocampista", "Defensa");
    }

    private void manejarJugada(int fila, int col) {
        if (!tablero[fila][col].getText().isEmpty()) {
            estadoLabel.setText("Casilla ocupada, elige otra");
            return;
        }

        String nombre = inputNombre.getText().trim();
        if (nombre.isEmpty()) {
            estadoLabel.setText("Introduce un nombre valido");
            return;
        }

        String equipoRequerido = etiquetasEquipos[col].getText();
        String posicionRequerida = etiquetasPosiciones[fila].getText();
        List<String> posicionesValidas = new ArrayList<>();
        if (posicionRequerida.equals("Centrocampista")) {
            posicionesValidas.addAll(Arrays.asList("Centrocampista", "Centrocampista Defensivo", "Mediapunta"));
        } else if (posicionRequerida.equals("Defensa")) {
            posicionesValidas.addAll(Arrays.asList("Defensa", "Defensa Central"));
        } else {
            posicionesValidas.add(posicionRequerida);
        }

        Document consulta = new Document("equipos", equipoRequerido)
                           .append("posiciones", new Document("$in", posicionesValidas))
                           .append("nombre", nombre);
        Document jugador = coleccionJugadores.find(consulta).first();

        if (jugador == null) {
            estadoLabel.setText("Error: Jugador no valido para " + equipoRequerido + " y " + posicionRequerida);
            Timer timer = new Timer(200, e -> {
                Color colorActual = tablero[fila][col].getBackground();
                tablero[fila][col].setBackground(colorActual.equals(Color.RED) ? Color.WHITE : Color.RED);
            });
            timer.setRepeats(true);
            timer.start();
            new Timer(1200, e -> {
                timer.stop();
                tablero[fila][col].setBackground(Color.WHITE);
            }).start();
            inputNombre.setText("");
            return;
        }

        String simbolo;
        if (esTurnoJugador1) {
            simbolo = "X";
        } else {
            simbolo = "O";
        }

        tablero[fila][col].setText(simbolo);
        tablero[fila][col].setForeground(esTurnoJugador1 ? AMARILLO : AZUL);
        tablero[fila][col].setBackground(VERDE_EXITO);
        tablero[fila][col].setEnabled(false);
        movimientos++;

        esTurnoJugador1 = !esTurnoJugador1;

        String siguienteJugador;
        if (esTurnoJugador1) {
            siguienteJugador = "Jugador 1";
        } else {
            siguienteJugador = "Jugador 2";
        }
        estadoLabel.setText(siguienteJugador + ": Introduce nombre para " + equipoRequerido + " y " + posicionRequerida);

        if (comprobarGanador(simbolo)) {
            estadoLabel.setText("Jugador " + simbolo + " gana!");
            if (simbolo.equals("X")) {
                puntuacionJugador1++;
            } else {
                puntuacionJugador2++;
            }
            actualizarPuntuacion();
            deshabilitarTablero();
            botonReiniciar.setVisible(true);
        } else if (movimientos == 9) {
            estadoLabel.setText("Empate!");
            deshabilitarTablero();
            botonReiniciar.setVisible(true);
        }

        inputNombre.setText("");
    }

    private boolean comprobarGanador(String simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].getText().equals(simbolo) &&
                tablero[i][1].getText().equals(simbolo) &&
                tablero[i][2].getText().equals(simbolo)) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j].getText().equals(simbolo) &&
                tablero[1][j].getText().equals(simbolo) &&
                tablero[2][j].getText().equals(simbolo)) {
                return true;
            }
        }
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setText("");
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].setForeground(Color.BLACK);
                tablero[i][j].setEnabled(true);
            }
        }
        movimientos = 0;
        esTurnoJugador1 = true;
        estadoLabel.setText("Jugador 1: Introduce nombre y elige una casilla");
        botonReiniciar.setVisible(false);
        inicializarListas();
        for (int i = 0; i < 3; i++) {
            etiquetasEquipos[i].setText(equipos.get(i));
            etiquetasPosiciones[i].setText(posiciones.get(i));
        }
    }

    private void actualizarPuntuacion() {
        puntuacionLabel.setText("Puntuacion - Jugador 1: " + puntuacionJugador1 + " | Jugador 2: " + puntuacionJugador2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazApp().setVisible(true));
    }
}
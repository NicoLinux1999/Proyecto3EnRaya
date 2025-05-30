import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
	
	public static void insertarJugadores(MongoCollection<Document> collection) {
		List<Document> jugadores = new ArrayList<>();
		// Jugador 1
        List<String> equiposMessi = new ArrayList<>();
        equiposMessi.add("Barcelona");
        equiposMessi.add("PSG");
        equiposMessi.add("Inter Miami");

        List<String> posicionesMessi = new ArrayList<>();
        posicionesMessi.add("Delantero");
        posicionesMessi.add("Extremo Derecho");

        Document jugador1 = new Document("nombre", "Lionel Messi")
                .append("nacionalidad", "Argentina")
                .append("edad", 36)
                .append("equipos", equiposMessi)
                .append("posiciones", posicionesMessi);

        // Jugador 2
        List<String> equiposMbappe = new ArrayList<>();
        equiposMbappe.add("Monaco");
        equiposMbappe.add("PSG");

        List<String> posicionesMbappe = new ArrayList<>();
        posicionesMbappe.add("Delantero");
        posicionesMbappe.add("Extremo Izquierdo");

        Document jugador2 = new Document("nombre", "Kylian Mbapp�")
                .append("nacionalidad", "Francia")
                .append("edad", 25)
                .append("equipos", equiposMbappe)
                .append("posiciones", posicionesMbappe);


        // Jugador 0: Robert Lewandowski (Barcelona)
        List<String> equiposLewandowski = new ArrayList<>();
        equiposLewandowski.add("Lech Poznań");
        equiposLewandowski.add("Borussia Dortmund");
        equiposLewandowski.add("Bayern Munich");
        equiposLewandowski.add("Barcelona");

        List<String> posicionesLewandowski = new ArrayList<>();
        posicionesLewandowski.add("Delantero");

        Document jugador0 = new Document("nombre", "Robert Lewandowski")
                .append("nacionalidad", "Polonia")
                .append("edad", 36)
                .append("equipos", equiposLewandowski)
                .append("posiciones", posicionesLewandowski);
        jugadores.add(jugador0);

        // Jugador 3: Antoine Griezmann (Atlético de Madrid)
        List<String> equiposGriezmann = new ArrayList<>();
        equiposGriezmann.add("Real Sociedad");
        equiposGriezmann.add("Atlético de Madrid");
        equiposGriezmann.add("Barcelona");
        equiposGriezmann.add("Atlético de Madrid");

        List<String> posicionesGriezmann = new ArrayList<>();
        posicionesGriezmann.add("Delantero");
        posicionesGriezmann.add("Mediapunta");

        Document jugador3 = new Document("nombre", "Antoine Griezmann")
                .append("nacionalidad", "Francia")
                .append("edad", 33)
                .append("equipos", equiposGriezmann)
                .append("posiciones", posicionesGriezmann);
        jugadores.add(jugador3);

        // Jugador 4: Vinicius Junior (Real Madrid)
        List<String> equiposVinicius = new ArrayList<>();
        equiposVinicius.add("Flamengo");
        equiposVinicius.add("Real Madrid");

        List<String> posicionesVinicius = new ArrayList<>();
        posicionesVinicius.add("Extremo Izquierdo");
        posicionesVinicius.add("Delantero");

        Document jugador4 = new Document("nombre", "Vinicius Junior")
                .append("nacionalidad", "Brasil")
                .append("edad", 24)
                .append("equipos", equiposVinicius)
                .append("posiciones", posicionesVinicius);
        jugadores.add(jugador4);

        // Jugador 5: Dani Olmo (Barcelona)
        List<String> equiposOlmo = new ArrayList<>();
        equiposOlmo.add("Dinamo Zagreb");
        equiposOlmo.add("RB Leipzig");
        equiposOlmo.add("Barcelona");

        List<String> posicionesOlmo = new ArrayList<>();
        posicionesOlmo.add("Mediapunta");
        posicionesOlmo.add("Extremo Derecho");

        Document jugador5 = new Document("nombre", "Dani Olmo")
                .append("nacionalidad", "España")
                .append("edad", 27)
                .append("equipos", equiposOlmo)
                .append("posiciones", posicionesOlmo);
        jugadores.add(jugador5);

        // Jugador 6: Julián Álvarez (Atlético de Madrid)
        List<String> equiposAlvarez = new ArrayList<>();
        equiposAlvarez.add("River Plate");
        equiposAlvarez.add("Manchester City");
        equiposAlvarez.add("Atlético de Madrid");

        List<String> posicionesAlvarez = new ArrayList<>();
        posicionesAlvarez.add("Delantero");
        posicionesAlvarez.add("Extremo Derecho");

        Document jugador6 = new Document("nombre", "Julián Álvarez")
                .append("nacionalidad", "Argentina")
                .append("edad", 24)
                .append("equipos", equiposAlvarez)
                .append("posiciones", posicionesAlvarez);
        jugadores.add(jugador6);

        // Jugador 7: Álvaro Morata (Atlético de Madrid)
        List<String> equiposMorata = new ArrayList<>();
        equiposMorata.add("Real Madrid");
        equiposMorata.add("Juventus");
        equiposMorata.add("Chelsea");
        equiposMorata.add("Atlético de Madrid");
        equiposMorata.add("Juventus");
        equiposMorata.add("Atlético de Madrid");

        List<String> posicionesMorata = new ArrayList<>();
        posicionesMorata.add("Delantero");

        Document jugador7 = new Document("nombre", "Álvaro Morata")
                .append("nacionalidad", "España")
                .append("edad", 32)
                .append("equipos", equiposMorata)
                .append("posiciones", posicionesMorata);
        jugadores.add(jugador7);

        // Jugador 8: Nico Williams (Athletic Club)
        List<String> equiposWilliams = new ArrayList<>();
        equiposWilliams.add("Athletic Club");

        List<String> posicionesWilliams = new ArrayList<>();
        posicionesWilliams.add("Extremo Izquierdo");
        posicionesWilliams.add("Extremo Derecho");

        Document jugador8 = new Document("nombre", "Nico Williams")
                .append("nacionalidad", "España")
                .append("edad", 22)
                .append("equipos", equiposWilliams)
                .append("posiciones", posicionesWilliams);
        jugadores.add(jugador8);

        // Jugador 9: Álex Baena (Villarreal)
        List<String> equiposBaena = new ArrayList<>();
        equiposBaena.add("Villarreal");
        equiposBaena.add("Girona"); // Cesión
        equiposBaena.add("Villarreal");

        List<String> posicionesBaena = new ArrayList<>();
        posicionesBaena.add("Mediapunta");
        posicionesBaena.add("Extremo Izquierdo");

        Document jugador9 = new Document("nombre", "Álex Baena")
                .append("nacionalidad", "España")
                .append("edad", 23)
                .append("equipos", equiposBaena)
                .append("posiciones", posicionesBaena);
        jugadores.add(jugador9);

        // Jugador 10: Donny van de Beek (Girona)
        List<String> equiposVanDeBeek = new ArrayList<>();
        equiposVanDeBeek.add("Ajax");
        equiposVanDeBeek.add("Manchester United");
        equiposVanDeBeek.add("Everton"); // Cesión
        equiposVanDeBeek.add("Eintracht Frankfurt"); // Cesión
        equiposVanDeBeek.add("Girona");

        List<String> posicionesVanDeBeek = new ArrayList<>();
        posicionesVanDeBeek.add("Centrocampista");
        posicionesVanDeBeek.add("Mediapunta");

        Document jugador10 = new Document("nombre", "Donny van de Beek")
                .append("nacionalidad", "Países Bajos")
                .append("edad", 27)
                .append("equipos", equiposVanDeBeek)
                .append("posiciones", posicionesVanDeBeek);
        jugadores.add(jugador10);

     // Jugador 11: Iago Aspas (Celta)
        List<String> equiposAspas = new ArrayList<>();
        equiposAspas.add("Celta");
        equiposAspas.add("Liverpool");
        equiposAspas.add("Sevilla");
        equiposAspas.add("Celta");

        List<String> posicionesAspas = new ArrayList<>();
        posicionesAspas.add("Delantero");
        posicionesAspas.add("Extremo Derecho");

        Document jugador11 = new Document("nombre", "Iago Aspas")
                .append("nacionalidad", "España")
                .append("edad", 37)
                .append("equipos", equiposAspas)
                .append("posiciones", posicionesAspas);
        jugadores.add(jugador11);

        // Jugador 12: Takefusa Kubo (Real Sociedad)
        List<String> equiposKubo = new ArrayList<>();
        equiposKubo.add("Tokyo");
        equiposKubo.add("Real Madrid");
        equiposKubo.add("Mallorca"); // Cesión
        equiposKubo.add("Real Sociedad");

        List<String> posicionesKubo = new ArrayList<>();
        posicionesKubo.add("Extremo Derecho");
        posicionesKubo.add("Mediapunta");

        Document jugador12 = new Document("nombre", "Takefusa Kubo")
                .append("nacionalidad", "Japón")
                .append("edad", 23)
                .append("equipos", equiposKubo)
                .append("posiciones", posicionesKubo);
        jugadores.add(jugador12);

        // Jugador 13: Alexander Sørloth (Atlético de Madrid)
        List<String> equiposSorloth = new ArrayList<>();
        equiposSorloth.add("Crystal Palace");
        equiposSorloth.add("RB Leipzig");
        equiposSorloth.add("Villarreal");
        equiposSorloth.add("Atlético de Madrid");

        List<String> posicionesSorloth = new ArrayList<>();
        posicionesSorloth.add("Delantero");

        Document jugador13 = new Document("nombre", "Alexander Sørloth")
                .append("nacionalidad", "Noruega")
                .append("edad", 29)
                .append("equipos", equiposSorloth)
                .append("posiciones", posicionesSorloth);
        jugadores.add(jugador13);

        // Jugador 14: Raphinha (Barcelona)
        List<String> equiposRaphinha = new ArrayList<>();
        equiposRaphinha.add("Vitória Guimarães");
        equiposRaphinha.add("Sporting CP");
        equiposRaphinha.add("Rennes");
        equiposRaphinha.add("Leeds United");
        equiposRaphinha.add("Barcelona");

        List<String> posicionesRaphinha = new ArrayList<>();
        posicionesRaphinha.add("Extremo Derecho");
        posicionesRaphinha.add("Extremo Izquierdo");

        Document jugador14 = new Document("nombre", "Raphinha")
                .append("nacionalidad", "Brasil")
                .append("edad", 28)
                .append("equipos", equiposRaphinha)
                .append("posiciones", posicionesRaphinha);
        jugadores.add(jugador14);

        // Jugador 15: Ayoze Pérez (Villarreal)
        List<String> equiposAyoze = new ArrayList<>();
        equiposAyoze.add("Tenerife");
        equiposAyoze.add("Newcastle United");
        equiposAyoze.add("Leicester City");
        equiposAyoze.add("Real Betis");
        equiposAyoze.add("Villarreal");

        List<String> posicionesAyoze = new ArrayList<>();
        posicionesAyoze.add("Delantero");
        posicionesAyoze.add("Extremo Izquierdo");

        Document jugador15 = new Document("nombre", "Ayoze Pérez")
                .append("nacionalidad", "España")
                .append("edad", 31)
                .append("equipos", equiposAyoze)
                .append("posiciones", posicionesAyoze);
        jugadores.add(jugador15);

        // Jugador 16: Javi Puado (Espanyol)
        List<String> equiposPuado = new ArrayList<>();
        equiposPuado.add("Espanyol");

        List<String> posicionesPuado = new ArrayList<>();
        posicionesPuado.add("Delantero");
        posicionesPuado.add("Extremo Derecho");

        Document jugador16 = new Document("nombre", "Javi Puado")
                .append("nacionalidad", "España")
                .append("edad", 27)
                .append("equipos", equiposPuado)
                .append("posiciones", posicionesPuado);
        jugadores.add(jugador16);

        // Jugador 17: Borja Mayoral (Getafe)
        List<String> equiposMayoral = new ArrayList<>();
        equiposMayoral.add("Real Madrid");
        equiposMayoral.add("Levante"); // Cesión
        equiposMayoral.add("Roma"); // Cesión
        equiposMayoral.add("Getafe");

        List<String> posicionesMayoral = new ArrayList<>();
        posicionesMayoral.add("Delantero");

        Document jugador17 = new Document("nombre", "Borja Mayoral")
                .append("nacionalidad", "España")
                .append("edad", 28)
                .append("equipos", equiposMayoral)
                .append("posiciones", posicionesMayoral);
        jugadores.add(jugador17);

        // Jugador 18: Oihan Sancet (Athletic Club)
        List<String> equiposSancet = new ArrayList<>();
        equiposSancet.add("Athletic Club");

        List<String> posicionesSancet = new ArrayList<>();
        posicionesSancet.add("Mediapunta");
        posicionesSancet.add("Centrocampista");

        Document jugador18 = new Document("nombre", "Oihan Sancet")
                .append("nacionalidad", "España")
                .append("edad", 25)
                .append("equipos", equiposSancet)
                .append("posiciones", posicionesSancet);
        jugadores.add(jugador18);

        // Jugador 19: Lucas Ocampos (Sevilla)
        List<String> equiposOcampos = new ArrayList<>();
        equiposOcampos.add("River Plate");
        equiposOcampos.add("Monaco");
        equiposOcampos.add("Marseille");
        equiposOcampos.add("Sevilla");

        List<String> posicionesOcampos = new ArrayList<>();
        posicionesOcampos.add("Extremo Derecho");
        posicionesOcampos.add("Extremo Izquierdo");

        Document jugador19 = new Document("nombre", "Lucas Ocampos")
                .append("nacionalidad", "Argentina")
                .append("edad", 30)
                .append("equipos", equiposOcampos)
                .append("posiciones", posicionesOcampos);
        jugadores.add(jugador19);

        // Jugador 20: Ante Budimir (Osasuna)
        List<String> equiposBudimir = new ArrayList<>();
        equiposBudimir.add("Celta");
        equiposBudimir.add("Mallorca");
        equiposBudimir.add("Osasuna");

        List<String> posicionesBudimir = new ArrayList<>();
        posicionesBudimir.add("Delantero");

        Document jugador20 = new Document("nombre", "Ante Budimir")
                .append("nacionalidad", "Croacia")
                .append("edad", 33)
                .append("equipos", equiposBudimir)
                .append("posiciones", posicionesBudimir);
        jugadores.add(jugador20);
        
     // Jugador 21: Kike García (Alavés)
        List<String> equiposKikeGarcia = new ArrayList<>();
        equiposKikeGarcia.add("Eibar");
        equiposKikeGarcia.add("Alavés");

        List<String> posicionesKikeGarcia = new ArrayList<>();
        posicionesKikeGarcia.add("Delantero");

        Document jugador21 = new Document("nombre", "Kike García")
                .append("nacionalidad", "España")
                .append("edad", 35)
                .append("equipos", equiposKikeGarcia)
                .append("posiciones", posicionesKikeGarcia);
        jugadores.add(jugador21);

        // Jugador 22: Johnny Cardoso (Real Betis)
        List<String> equiposCardoso = new ArrayList<>();
        equiposCardoso.add("Internacional");
        equiposCardoso.add("Real Betis");

        List<String> posicionesCardoso = new ArrayList<>();
        posicionesCardoso.add("Centrocampista Defensivo");

        Document jugador22 = new Document("nombre", "Johnny Cardoso")
                .append("nacionalidad", "Estados Unidos")
                .append("edad", 23)
                .append("equipos", equiposCardoso)
                .append("posiciones", posicionesCardoso);
        jugadores.add(jugador22);

        // Jugador 23: Sandro Ramírez (Las Palmas)
        List<String> equiposSandro = new ArrayList<>();
        equiposSandro.add("Barcelona");
        equiposSandro.add("Everton");
        equiposSandro.add("Sevilla");
        equiposSandro.add("Real Sociedad");
        equiposSandro.add("Las Palmas");

        List<String> posicionesSandro = new ArrayList<>();
        posicionesSandro.add("Delantero");
        posicionesSandro.add("Extremo Izquierdo");

        Document jugador23 = new Document("nombre", "Sandro Ramírez")
                .append("nacionalidad", "España")
                .append("edad", 29)
                .append("equipos", equiposSandro)
                .append("posiciones", posicionesSandro);
        jugadores.add(jugador23);

        // Jugador 24: Manu Morlanes (Mallorca)
        List<String> equiposMorlanes = new ArrayList<>();
        equiposMorlanes.add("Villarreal");
        equiposMorlanes.add("Espanyol"); // Cesión
        equiposMorlanes.add("Almería"); // Cesión
        equiposMorlanes.add("Mallorca");

        List<String> posicionesMorlanes = new ArrayList<>();
        posicionesMorlanes.add("Centrocampista");

        Document jugador24 = new Document("nombre", "Manu Morlanes")
                .append("nacionalidad", "España")
                .append("edad", 26)
                .append("equipos", equiposMorlanes)
                .append("posiciones", posicionesMorlanes);
        jugadores.add(jugador24);

        // Jugador 25: Yvan Neyou (Leganés)
        List<String> equiposNeyou = new ArrayList<>();
        equiposNeyou.add("Braga");
        equiposNeyou.add("Leganés");

        List<String> posicionesNeyou = new ArrayList<>();
        posicionesNeyou.add("Centrocampista Defensivo");

        Document jugador25 = new Document("nombre", "Yvan Neyou")
                .append("nacionalidad", "Camerún")
                .append("edad", 28)
                .append("equipos", equiposNeyou)
                .append("posiciones", posicionesNeyou);
        jugadores.add(jugador25);

        // Jugador 26: Jorge de Frutos (Rayo Vallecano)
        List<String> equiposDeFrutos = new ArrayList<>();
        equiposDeFrutos.add("Real Madrid");
        equiposDeFrutos.add("Levante");
        equiposDeFrutos.add("Rayo Vallecano");

        List<String> posicionesDeFrutos = new ArrayList<>();
        posicionesDeFrutos.add("Extremo Derecho");

        Document jugador26 = new Document("nombre", "Jorge de Frutos")
                .append("nacionalidad", "España")
                .append("edad", 28)
                .append("equipos", equiposDeFrutos)
                .append("posiciones", posicionesDeFrutos);
        jugadores.add(jugador26);

        // Jugador 27: Pepelu (Valencia)
        List<String> equiposPepelu = new ArrayList<>();
        equiposPepelu.add("Levante");
        equiposPepelu.add("Valencia");

        List<String> posicionesPepelu = new ArrayList<>();
        posicionesPepelu.add("Centrocampista Defensivo");

        Document jugador27 = new Document("nombre", "Pepelu")
                .append("nacionalidad", "España")
                .append("edad", 26)
                .append("equipos", equiposPepelu)
                .append("posiciones", posicionesPepelu);
        jugadores.add(jugador27);

        // Jugador 28: Raúl Moro (Valladolid)
        List<String> equiposMoro = new ArrayList<>();
        equiposMoro.add("Lazio");
        equiposMoro.add("Valladolid"); // Cesión y luego traspaso

        List<String> posicionesMoro = new ArrayList<>();
        posicionesMoro.add("Extremo Izquierdo");
        posicionesMoro.add("Delantero");

        Document jugador28 = new Document("nombre", "Raúl Moro")
                .append("nacionalidad", "España")
                .append("edad", 22)
                .append("equipos", equiposMoro)
                .append("posiciones", posicionesMoro);
        jugadores.add(jugador28);

        // Jugador 29: Willy Kambwala (Villarreal)
        List<String> equiposKambwala = new ArrayList<>();
        equiposKambwala.add("Manchester United");
        equiposKambwala.add("Villarreal"); // Cesión

        List<String> posicionesKambwala = new ArrayList<>();
        posicionesKambwala.add("Defensa Central");

        Document jugador29 = new Document("nombre", "Willy Kambwala")
                .append("nacionalidad", "Francia")
                .append("edad", 20)
                .append("equipos", equiposKambwala)
                .append("posiciones", posicionesKambwala);
        jugadores.add(jugador29);

        // Jugador 30: Pere Milla (Espanyol)
        List<String> equiposMilla = new ArrayList<>();
        equiposMilla.add("Elche");
        equiposMilla.add("Espanyol");

        List<String> posicionesMilla = new ArrayList<>();
        posicionesMilla.add("Delantero");
        posicionesMilla.add("Extremo Izquierdo");

        Document jugador30 = new Document("nombre", "Pere Milla")
                .append("nacionalidad", "España")
                .append("edad", 32)
                .append("equipos", equiposMilla)
                .append("posiciones", posicionesMilla);
        jugadores.add(jugador30);

        // Jugador 31: Unai Simón (Athletic Club)
        List<String> equiposSimon = new ArrayList<>();
        equiposSimon.add("Athletic Club");

        List<String> posicionesSimon = new ArrayList<>();
        posicionesSimon.add("Portero");

        Document jugador31 = new Document("nombre", "Unai Simón")
                .append("nacionalidad", "España")
                .append("edad", 27)
                .append("equipos", equiposSimon)
                .append("posiciones", posicionesSimon);
        jugadores.add(jugador31);

        // Jugador 32: Federico Valverde (Real Madrid)
        List<String> equiposValverde = new ArrayList<>();
        equiposValverde.add("Peñarol");
        equiposValverde.add("Real Madrid");

        List<String> posicionesValverde = new ArrayList<>();
        posicionesValverde.add("Centrocampista");
        posicionesValverde.add("Mediapunta");

        Document jugador32 = new Document("nombre", "Federico Valverde")
                .append("nacionalidad", "Uruguay")
                .append("edad", 26)
                .append("equipos", equiposValverde)
                .append("posiciones", posicionesValverde);
        jugadores.add(jugador32);
        
        // Creamos una lista donde a�adimos a todos los jugadores
        
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        
        // Insertamos los jugadores dentro de la coleccion de jugadores
        collection.insertMany(jugadores);
    }

	public static void main(String[] args) {
        // Direccion de la BBDD en MongoDB
        String direccion_mongo = "mongodb+srv://Nicolas:tirlppc64YyaXJrJ@clusterefa0.dlerdp1.mongodb.net/?retryWrites=true&w=majority&appName=ClusterEFA0";

        try  {       	
        	MongoClient mongoClient = MongoClients.create(direccion_mongo);
            
            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
            MongoCollection<Document> collectionJugadores = database.getCollection("jugadores");
            
            insertarJugadores(collectionJugadores);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

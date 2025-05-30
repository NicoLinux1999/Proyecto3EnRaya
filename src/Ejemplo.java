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

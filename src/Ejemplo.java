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

        List<String> equiposMbappe = new ArrayList<>();
        equiposMbappe.add("Monaco");
        equiposMbappe.add("PSG");

        List<String> posicionesMbappe = new ArrayList<>();
        posicionesMbappe.add("Delantero");
        posicionesMbappe.add("Extremo Izquierdo");

        Document jugador2 = new Document("nombre", "Kylian Mbappe")
                .append("nacionalidad", "Francia")
                .append("edad", 25)
                .append("equipos", equiposMbappe)
                .append("posiciones", posicionesMbappe);

        List<String> equiposLewandowski = new ArrayList<>();
        equiposLewandowski.add("Lech Poznan");
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

        List<String> equiposGriezmann = new ArrayList<>();
        equiposGriezmann.add("Real Sociedad");
        equiposGriezmann.add("Atletico de Madrid");
        equiposGriezmann.add("Barcelona");
        equiposGriezmann.add("Atletico de Madrid");

        List<String> posicionesGriezmann = new ArrayList<>();
        posicionesGriezmann.add("Delantero");
        posicionesGriezmann.add("Mediapunta");

        Document jugador3 = new Document("nombre", "Antoine Griezmann")
                .append("nacionalidad", "Francia")
                .append("edad", 33)
                .append("equipos", equiposGriezmann)
                .append("posiciones", posicionesGriezmann);
        jugadores.add(jugador3);

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

        List<String> equiposOlmo = new ArrayList<>();
        equiposOlmo.add("Dinamo Zagreb");
        equiposOlmo.add("RB Leipzig");
        equiposOlmo.add("Barcelona");

        List<String> posicionesOlmo = new ArrayList<>();
        posicionesOlmo.add("Mediapunta");
        posicionesOlmo.add("Extremo Derecho");

        Document jugador5 = new Document("nombre", "Dani Olmo")
                .append("nacionalidad", "Espana")
                .append("edad", 27)
                .append("equipos", equiposOlmo)
                .append("posiciones", posicionesOlmo);
        jugadores.add(jugador5);

        List<String> equiposAlvarez = new ArrayList<>();
        equiposAlvarez.add("River Plate");
        equiposAlvarez.add("Manchester City");
        equiposAlvarez.add("Atletico de Madrid");

        List<String> posicionesAlvarez = new ArrayList<>();
        posicionesAlvarez.add("Delantero");
        posicionesAlvarez.add("Extremo Derecho");

        Document jugador6 = new Document("nombre", "Julian Alvarez")
                .append("nacionalidad", "Argentina")
                .append("edad", 24)
                .append("equipos", equiposAlvarez)
                .append("posiciones", posicionesAlvarez);
        jugadores.add(jugador6);

        List<String> equiposMorata = new ArrayList<>();
        equiposMorata.add("Real Madrid");
        equiposMorata.add("Juventus");
        equiposMorata.add("Chelsea");
        equiposMorata.add("Atletico de Madrid");
        equiposMorata.add("Juventus");
        equiposMorata.add("Atletico de Madrid");

        List<String> posicionesMorata = new ArrayList<>();
        posicionesMorata.add("Delantero");

        Document jugador7 = new Document("nombre", "Alvaro Morata")
                .append("nacionalidad", "Espana")
                .append("edad", 32)
                .append("equipos", equiposMorata)
                .append("posiciones", posicionesMorata);
        jugadores.add(jugador7);

        List<String> equiposWilliams = new ArrayList<>();
        equiposWilliams.add("Athletic Club");

        List<String> posicionesWilliams = new ArrayList<>();
        posicionesWilliams.add("Extremo Izquierdo");
        posicionesWilliams.add("Extremo Derecho");

        Document jugador8 = new Document("nombre", "Nico Williams")
                .append("nacionalidad", "Espana")
                .append("edad", 22)
                .append("equipos", equiposWilliams)
                .append("posiciones", posicionesWilliams);
        jugadores.add(jugador8);

        List<String> equiposBaena = new ArrayList<>();
        equiposBaena.add("Villarreal");
        equiposBaena.add("Girona");
        equiposBaena.add("Villarreal");

        List<String> posicionesBaena = new ArrayList<>();
        posicionesBaena.add("Mediapunta");
        posicionesBaena.add("Extremo Izquierdo");

        Document jugador9 = new Document("nombre", "Alex Baena")
                .append("nacionalidad", "Espana")
                .append("edad", 23)
                .append("equipos", equiposBaena)
                .append("posiciones", posicionesBaena);
        jugadores.add(jugador9);

        List<String> equiposVanDeBeek = new ArrayList<>();
        equiposVanDeBeek.add("Ajax");
        equiposVanDeBeek.add("Manchester United");
        equiposVanDeBeek.add("Everton");
        equiposVanDeBeek.add("Eintracht Frankfurt");
        equiposVanDeBeek.add("Girona");

        List<String> posicionesVanDeBeek = new ArrayList<>();
        posicionesVanDeBeek.add("Centrocampista");
        posicionesVanDeBeek.add("Mediapunta");

        Document jugador10 = new Document("nombre", "Donny van de Beek")
                .append("nacionalidad", "Paises Bajos")
                .append("edad", 27)
                .append("equipos", equiposVanDeBeek)
                .append("posiciones", posicionesVanDeBeek);
        jugadores.add(jugador10);

        List<String> equiposAspas = new ArrayList<>();
        equiposAspas.add("Celta");
        equiposAspas.add("Liverpool");
        equiposAspas.add("Sevilla");
        equiposAspas.add("Celta");

        List<String> posicionesAspas = new ArrayList<>();
        posicionesAspas.add("Delantero");
        posicionesAspas.add("Extremo Derecho");

        Document jugador11 = new Document("nombre", "Iago Aspas")
                .append("nacionalidad", "Espana")
                .append("edad", 37)
                .append("equipos", equiposAspas)
                .append("posiciones", posicionesAspas);
        jugadores.add(jugador11);

        List<String> equiposKubo = new ArrayList<>();
        equiposKubo.add("Tokyo");
        equiposKubo.add("Real Madrid");
        equiposKubo.add("Mallorca");
        equiposKubo.add("Real Sociedad");

        List<String> posicionesKubo = new ArrayList<>();
        posicionesKubo.add("Extremo Derecho");
        posicionesKubo.add("Mediapunta");

        Document jugador12 = new Document("nombre", "Takefusa Kubo")
                .append("nacionalidad", "Japon")
                .append("edad", 23)
                .append("equipos", equiposKubo)
                .append("posiciones", posicionesKubo);
        jugadores.add(jugador12);

        List<String> equiposSorloth = new ArrayList<>();
        equiposSorloth.add("Crystal Palace");
        equiposSorloth.add("RB Leipzig");
        equiposSorloth.add("Villarreal");
        equiposSorloth.add("Atletico de Madrid");

        List<String> posicionesSorloth = new ArrayList<>();
        posicionesSorloth.add("Delantero");

        Document jugador13 = new Document("nombre", "Alexander Sorloth")
                .append("nacionalidad", "Noruega")
                .append("edad", 29)
                .append("equipos", equiposSorloth)
                .append("posiciones", posicionesSorloth);
        jugadores.add(jugador13);

        List<String> equiposRaphinha = new ArrayList<>();
        equiposRaphinha.add("Vitoria Guimaraes");
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

        List<String> equiposAyoze = new ArrayList<>();
        equiposAyoze.add("Tenerife");
        equiposAyoze.add("Newcastle United");
        equiposAyoze.add("Leicester City");
        equiposAyoze.add("Real Betis");
        equiposAyoze.add("Villarreal");

        List<String> posicionesAyoze = new ArrayList<>();
        posicionesAyoze.add("Delantero");
        posicionesAyoze.add("Extremo Izquierdo");

        Document jugador15 = new Document("nombre", "Ayoze Perez")
                .append("nacionalidad", "Espana")
                .append("edad", 31)
                .append("equipos", equiposAyoze)
                .append("posiciones", posicionesAyoze);
        jugadores.add(jugador15);

        List<String> equiposPuado = new ArrayList<>();
        equiposPuado.add("Espanyol");

        List<String> posicionesPuado = new ArrayList<>();
        posicionesPuado.add("Delantero");
        posicionesPuado.add("Extremo Derecho");

        Document jugador16 = new Document("nombre", "Javi Puado")
                .append("nacionalidad", "Espana")
                .append("edad", 27)
                .append("equipos", equiposPuado)
                .append("posiciones", posicionesPuado);
        jugadores.add(jugador16);

        List<String> equiposMayoral = new ArrayList<>();
        equiposMayoral.add("Real Madrid");
        equiposMayoral.add("Levante");
        equiposMayoral.add("Roma");
        equiposMayoral.add("Getafe");

        List<String> posicionesMayoral = new ArrayList<>();
        posicionesMayoral.add("Delantero");

        Document jugador17 = new Document("nombre", "Borja Mayoral")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposMayoral)
                .append("posiciones", posicionesMayoral);
        jugadores.add(jugador17);

        List<String> equiposSancet = new ArrayList<>();
        equiposSancet.add("Athletic Club");

        List<String> posicionesSancet = new ArrayList<>();
        posicionesSancet.add("Mediapunta");
        posicionesSancet.add("Centrocampista");

        Document jugador18 = new Document("nombre", "Oihan Sancet")
                .append("nacionalidad", "Espana")
                .append("edad", 25)
                .append("equipos", equiposSancet)
                .append("posiciones", posicionesSancet);
        jugadores.add(jugador18);

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

        List<String> equiposKikeGarcia = new ArrayList<>();
        equiposKikeGarcia.add("Eibar");
        equiposKikeGarcia.add("Alaves");

        List<String> posicionesKikeGarcia = new ArrayList<>();
        posicionesKikeGarcia.add("Delantero");

        Document jugador21 = new Document("nombre", "Kike Garcia")
                .append("nacionalidad", "Espana")
                .append("edad", 35)
                .append("equipos", equiposKikeGarcia)
                .append("posiciones", posicionesKikeGarcia);
        jugadores.add(jugador21);

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

        List<String> equiposSandro = new ArrayList<>();
        equiposSandro.add("Barcelona");
        equiposSandro.add("Everton");
        equiposSandro.add("Sevilla");
        equiposSandro.add("Real Sociedad");
        equiposSandro.add("Las Palmas");

        List<String> posicionesSandro = new ArrayList<>();
        posicionesSandro.add("Delantero");
        posicionesSandro.add("Extremo Izquierdo");

        Document jugador23 = new Document("nombre", "Sandro Ramirez")
                .append("nacionalidad", "Espana")
                .append("edad", 29)
                .append("equipos", equiposSandro)
                .append("posiciones", posicionesSandro);
        jugadores.add(jugador23);

        List<String> equiposMorlanes = new ArrayList<>();
        equiposMorlanes.add("Villarreal");
        equiposMorlanes.add("Espanyol");
        equiposMorlanes.add("Almeria");
        equiposMorlanes.add("Mallorca");

        List<String> posicionesMorlanes = new ArrayList<>();
        posicionesMorlanes.add("Centrocampista");

        Document jugador24 = new Document("nombre", "Manu Morlanes")
                .append("nacionalidad", "Espana")
                .append("edad", 26)
                .append("equipos", equiposMorlanes)
                .append("posiciones", posicionesMorlanes);
        jugadores.add(jugador24);

        List<String> equiposNeyou = new ArrayList<>();
        equiposNeyou.add("Braga");
        equiposNeyou.add("Leganes");

        List<String> posicionesNeyou = new ArrayList<>();
        posicionesNeyou.add("Centrocampista Defensivo");

        Document jugador25 = new Document("nombre", "Yvan Neyou")
                .append("nacionalidad", "Camerun")
                .append("edad", 28)
                .append("equipos", equiposNeyou)
                .append("posiciones", posicionesNeyou);
        jugadores.add(jugador25);

        List<String> equiposDeFrutos = new ArrayList<>();
        equiposDeFrutos.add("Real Madrid");
        equiposDeFrutos.add("Levante");
        equiposDeFrutos.add("Rayo Vallecano");

        List<String> posicionesDeFrutos = new ArrayList<>();
        posicionesDeFrutos.add("Extremo Derecho");

        Document jugador26 = new Document("nombre", "Jorge de Frutos")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposDeFrutos)
                .append("posiciones", posicionesDeFrutos);
        jugadores.add(jugador26);

        List<String> equiposPepelu = new ArrayList<>();
        equiposPepelu.add("Levante");
        equiposPepelu.add("Valencia");

        List<String> posicionesPepelu = new ArrayList<>();
        posicionesPepelu.add("Centrocampista Defensivo");

        Document jugador27 = new Document("nombre", "Pepelu")
                .append("nacionalidad", "Espana")
                .append("edad", 26)
                .append("equipos", equiposPepelu)
                .append("posiciones", posicionesPepelu);
        jugadores.add(jugador27);

        List<String> equiposMoro = new ArrayList<>();
        equiposMoro.add("Lazio");
        equiposMoro.add("Valladolid");

        List<String> posicionesMoro = new ArrayList<>();
        posicionesMoro.add("Extremo Izquierdo");
        posicionesMoro.add("Delantero");

        Document jugador28 = new Document("nombre", "Raul Moro")
                .append("nacionalidad", "Espana")
                .append("edad", 22)
                .append("equipos", equiposMoro)
                .append("posiciones", posicionesMoro);
        jugadores.add(jugador28);

        List<String> equiposKambwala = new ArrayList<>();
        equiposKambwala.add("Manchester United");
        equiposKambwala.add("Villarreal");

        List<String> posicionesKambwala = new ArrayList<>();
        posicionesKambwala.add("Defensa Central");

        Document jugador29 = new Document("nombre", "Willy Kambwala")
                .append("nacionalidad", "Francia")
                .append("edad", 20)
                .append("equipos", equiposKambwala)
                .append("posiciones", posicionesKambwala);
        jugadores.add(jugador29);

        List<String> equiposMilla = new ArrayList<>();
        equiposMilla.add("Elche");
        equiposMilla.add("Espanyol");

        List<String> posicionesMilla = new ArrayList<>();
        posicionesMilla.add("Delantero");
        posicionesMilla.add("Extremo Izquierdo");

        Document jugador30 = new Document("nombre", "Pere Milla")
                .append("nacionalidad", "Espana")
                .append("edad", 32)
                .append("equipos", equiposMilla)
                .append("posiciones", posicionesMilla);
        jugadores.add(jugador30);

        List<String> equiposSimon = new ArrayList<>();
        equiposSimon.add("Athletic Club");

        List<String> posicionesSimon = new ArrayList<>();
        posicionesSimon.add("Portero");

        Document jugador31 = new Document("nombre", "Unai Simon")
                .append("nacionalidad", "Espana")
                .append("edad", 27)
                .append("equipos", equiposSimon)
                .append("posiciones", posicionesSimon);
        jugadores.add(jugador31);

        List<String> equiposValverde = new ArrayList<>();
        equiposValverde.add("Penarol");
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

        List<String> equiposBellingham = new ArrayList<>();
        equiposBellingham.add("Birmingham City");
        equiposBellingham.add("Borussia Dortmund");
        equiposBellingham.add("Real Madrid");

        List<String> posicionesBellingham = new ArrayList<>();
        posicionesBellingham.add("Centrocampista");
        posicionesBellingham.add("Mediapunta");

        Document jugador33 = new Document("nombre", "Jude Bellingham")
                .append("nacionalidad", "Inglaterra")
                .append("edad", 21)
                .append("equipos", equiposBellingham)
                .append("posiciones", posicionesBellingham);
        jugadores.add(jugador33);

        List<String> equiposYamal = new ArrayList<>();
        equiposYamal.add("Barcelona");

        List<String> posicionesYamal = new ArrayList<>();
        posicionesYamal.add("Extremo Derecho");
        posicionesYamal.add("Extremo Izquierdo");

        Document jugador34 = new Document("nombre", "Lamine Yamal")
                .append("nacionalidad", "Espana")
                .append("edad", 17)
                .append("equipos", equiposYamal)
                .append("posiciones", posicionesYamal);
        jugadores.add(jugador34);

        List<String> equiposKroos = new ArrayList<>();
        equiposKroos.add("Bayern Munich");
        equiposKroos.add("Real Madrid");

        List<String> posicionesKroos = new ArrayList<>();
        posicionesKroos.add("Centrocampista");
        posicionesKroos.add("Centrocampista Defensivo");

        Document jugador35 = new Document("nombre", "Toni Kroos")
                .append("nacionalidad", "Alemania")
                .append("edad", 35)
                .append("equipos", equiposKroos)
                .append("posiciones", posicionesKroos);
        jugadores.add(jugador35);

        List<String> equiposGundogan = new ArrayList<>();
        equiposGundogan.add("Borussia Dortmund");
        equiposGundogan.add("Manchester City");
        equiposGundogan.add("Barcelona");

        List<String> posicionesGundogan = new ArrayList<>();
        posicionesGundogan.add("Centrocampista");
        posicionesGundogan.add("Mediapunta");

        Document jugador36 = new Document("nombre", "Ilkay Gundogan")
                .append("nacionalidad", "Alemania")
                .append("edad", 34)
                .append("equipos", equiposGundogan)
                .append("posiciones", posicionesGundogan);
        jugadores.add(jugador36);

        List<String> equiposPedri = new ArrayList<>();
        equiposPedri.add("Las Palmas");
        equiposPedri.add("Barcelona");

        List<String> posicionesPedri = new ArrayList<>();
        posicionesPedri.add("Centrocampista");
        posicionesPedri.add("Mediapunta");

        Document jugador37 = new Document("nombre", "Pedri")
                .append("nacionalidad", "Espana")
                .append("edad", 22)
                .append("equipos", equiposPedri)
                .append("posiciones", posicionesPedri);
        jugadores.add(jugador37);

        List<String> equiposGavi = new ArrayList<>();
        equiposGavi.add("Barcelona");

        List<String> posicionesGavi = new ArrayList<>();
        posicionesGavi.add("Centrocampista");
        posicionesGavi.add("Mediapunta");

        Document jugador38 = new Document("nombre", "Gavi")
                .append("nacionalidad", "Espana")
                .append("edad", 20)
                .append("equipos", equiposGavi)
                .append("posiciones", posicionesGavi);
        jugadores.add(jugador38);

        List<String> equiposZubimendi = new ArrayList<>();
        equiposZubimendi.add("Real Sociedad");

        List<String> posicionesZubimendi = new ArrayList<>();
        posicionesZubimendi.add("Centrocampista Defensivo");

        Document jugador39 = new Document("nombre", "Martin Zubimendi")
                .append("nacionalidad", "Espana")
                .append("edad", 26)
                .append("equipos", equiposZubimendi)
                .append("posiciones", posicionesZubimendi);
        jugadores.add(jugador39);

        List<String> equiposMerino = new ArrayList<>();
        equiposMerino.add("Osasuna");
        equiposMerino.add("Borussia Dortmund");
        equiposMerino.add("Newcastle United");
        equiposMerino.add("Real Sociedad");

        List<String> posicionesMerino = new ArrayList<>();
        posicionesMerino.add("Centrocampista");

        Document jugador40 = new Document("nombre", "Mikel Merino")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposMerino)
                .append("posiciones", posicionesMerino);
        jugadores.add(jugador40);

        List<String> equiposRodrygo = new ArrayList<>();
        equiposRodrygo.add("Santos");
        equiposRodrygo.add("Real Madrid");

        List<String> posicionesRodrygo = new ArrayList<>();
        posicionesRodrygo.add("Extremo Derecho");
        posicionesRodrygo.add("Delantero");

        Document jugador41 = new Document("nombre", "Rodrygo")
                .append("nacionalidad", "Brasil")
                .append("edad", 24)
                .append("equipos", equiposRodrygo)
                .append("posiciones", posicionesRodrygo);
        jugadores.add(jugador41);

        List<String> equiposTerStegen = new ArrayList<>();
        equiposTerStegen.add("Borussia Monchengladbach");
        equiposTerStegen.add("Barcelona");

        List<String> posicionesTerStegen = new ArrayList<>();
        posicionesTerStegen.add("Portero");

        Document jugador42 = new Document("nombre", "Marc Andre ter Stegen")
                .append("nacionalidad", "Alemania")
                .append("edad", 33)
                .append("equipos", equiposTerStegen)
                .append("posiciones", posicionesTerStegen);
        jugadores.add(jugador42);

        List<String> equiposAraujo = new ArrayList<>();
        equiposAraujo.add("Boston River");
        equiposAraujo.add("Barcelona");

        List<String> posicionesAraujo = new ArrayList<>();
        posicionesAraujo.add("Defensa Central");
        posicionesAraujo.add("Lateral Derecho");

        Document jugador43 = new Document("nombre", "Ronald Araujo")
                .append("nacionalidad", "Uruguay")
                .append("edad", 26)
                .append("equipos", equiposAraujo)
                .append("posiciones", posicionesAraujo);
        jugadores.add(jugador43);

        List<String> equiposKounde = new ArrayList<>();
        equiposKounde.add("Bordeaux");
        equiposKounde.add("Sevilla");
        equiposKounde.add("Barcelona");

        List<String> posicionesKounde = new ArrayList<>();
        posicionesKounde.add("Defensa Central");
        posicionesKounde.add("Lateral Derecho");

        Document jugador44 = new Document("nombre", "Jules Kounde")
                .append("nacionalidad", "Francia")
                .append("edad", 26)
                .append("equipos", equiposKounde)
                .append("posiciones", posicionesKounde);
        jugadores.add(jugador44);

        List<String> equiposFrenkie = new ArrayList<>();
        equiposFrenkie.add("Ajax");
        equiposFrenkie.add("Barcelona");

        List<String> posicionesFrenkie = new ArrayList<>();
        posicionesFrenkie.add("Centrocampista");
        posicionesFrenkie.add("Centrocampista Defensivo");

        Document jugador45 = new Document("nombre", "Frenkie de Jong")
                .append("nacionalidad", "Paises Bajos")
                .append("edad", 28)
                .append("equipos", equiposFrenkie)
                .append("posiciones", posicionesFrenkie);
        jugadores.add(jugador45);

        List<String> equiposModric = new ArrayList<>();
        equiposModric.add("Dinamo Zagreb");
        equiposModric.add("Tottenham Hotspur");
        equiposModric.add("Real Madrid");

        List<String> posicionesModric = new ArrayList<>();
        posicionesModric.add("Centrocampista");
        posicionesModric.add("Mediapunta");

        Document jugador46 = new Document("nombre", "Luka Modric")
                .append("nacionalidad", "Croacia")
                .append("edad", 39)
                .append("equipos", equiposModric)
                .append("posiciones", posicionesModric);
        jugadores.add(jugador46);

        List<String> equiposAlaba = new ArrayList<>();
        equiposAlaba.add("Bayern Munich");
        equiposAlaba.add("Real Madrid");

        List<String> posicionesAlaba = new ArrayList<>();
        posicionesAlaba.add("Defensa Central");
        posicionesAlaba.add("Lateral Izquierdo");

        Document jugador47 = new Document("nombre", "David Alaba")
                .append("nacionalidad", "Austria")
                .append("edad", 32)
                .append("equipos", equiposAlaba)
                .append("posiciones", posicionesAlaba);
        jugadores.add(jugador47);

        List<String> equiposCarvajal = new ArrayList<>();
        equiposCarvajal.add("Real Madrid");
        equiposCarvajal.add("Bayer Leverkusen");

        List<String> posicionesCarvajal = new ArrayList<>();
        posicionesCarvajal.add("Lateral Derecho");

        Document jugador48 = new Document("nombre", "Dani Carvajal")
                .append("nacionalidad", "Espana")
                .append("edad", 33)
                .append("equipos", equiposCarvajal)
                .append("posiciones", posicionesCarvajal);
        jugadores.add(jugador48);

        List<String> equiposCourtois = new ArrayList<>();
        equiposCourtois.add("Genk");
        equiposCourtois.add("Atletico de Madrid");
        equiposCourtois.add("Chelsea");
        equiposCourtois.add("Real Madrid");

        List<String> posicionesCourtois = new ArrayList<>();
        posicionesCourtois.add("Portero");

        Document jugador49 = new Document("nombre", "Thibaut Courtois")
                .append("nacionalidad", "Belgica")
                .append("edad", 33)
                .append("equipos", equiposCourtois)
                .append("posiciones", posicionesCourtois);
        jugadores.add(jugador49);

        List<String> equiposMilitao = new ArrayList<>();
        equiposMilitao.add("Sao Paulo");
        equiposMilitao.add("Porto");
        equiposMilitao.add("Real Madrid");

        List<String> posicionesMilitao = new ArrayList<>();
        posicionesMilitao.add("Defensa Central");

        Document jugador50 = new Document("nombre", "Eder Militao")
                .append("nacionalidad", "Brasil")
                .append("edad", 27)
                .append("equipos", equiposMilitao)
                .append("posiciones", posicionesMilitao);
        jugadores.add(jugador50);

        List<String> equiposKepa = new ArrayList<>();
        equiposKepa.add("Athletic Club");
        equiposKepa.add("Chelsea");
        equiposKepa.add("Real Madrid");

        List<String> posicionesKepa = new ArrayList<>();
        posicionesKepa.add("Portero");

        Document jugador51 = new Document("nombre", "Kepa Arrizabalaga")
                .append("nacionalidad", "Espana")
                .append("edad", 30)
                .append("equipos", equiposKepa)
                .append("posiciones", posicionesKepa);
        jugadores.add(jugador51);

        List<String> equiposLeNormand = new ArrayList<>();
        equiposLeNormand.add("Real Sociedad");

        List<String> posicionesLeNormand = new ArrayList<>();
        posicionesLeNormand.add("Defensa Central");

        Document jugador52 = new Document("nombre", "Robin Le Normand")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposLeNormand)
                .append("posiciones", posicionesLeNormand);
        jugadores.add(jugador52);

        List<String> equiposGuruzeta = new ArrayList<>();
        equiposGuruzeta.add("Athletic Club");

        List<String> posicionesGuruzeta = new ArrayList<>();
        posicionesGuruzeta.add("Delantero");

        Document jugador53 = new Document("nombre", "Gorka Guruzeta")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposGuruzeta)
                .append("posiciones", posicionesGuruzeta);
        jugadores.add(jugador53);

        List<String> equiposDePaul = new ArrayList<>();
        equiposDePaul.add("Racing Club");
        equiposDePaul.add("Valencia");
        equiposDePaul.add("Udinese");
        equiposDePaul.add("Atletico de Madrid");

        List<String> posicionesDePaul = new ArrayList<>();
        posicionesDePaul.add("Centrocampista");
        posicionesDePaul.add("Mediapunta");

        Document jugador54 = new Document("nombre", "Rodrigo De Paul")
                .append("nacionalidad", "Argentina")
                .append("edad", 31)
                .append("equipos", equiposDePaul)
                .append("posiciones", posicionesDePaul);
        jugadores.add(jugador54);

        List<String> equiposKoke = new ArrayList<>();
        equiposKoke.add("Atletico de Madrid");

        List<String> posicionesKoke = new ArrayList<>();
        posicionesKoke.add("Centrocampista");
        posicionesKoke.add("Centrocampista Defensivo");

        Document jugador55 = new Document("nombre", "Koke")
                .append("nacionalidad", "Espana")
                .append("edad", 33)
                .append("equipos", equiposKoke)
                .append("posiciones", posicionesKoke);
        jugadores.add(jugador55);

        List<String> equiposOblak = new ArrayList<>();
        equiposOblak.add("Olimpija Ljubljana");
        equiposOblak.add("Benfica");
        equiposOblak.add("Atletico de Madrid");

        List<String> posicionesOblak = new ArrayList<>();
        posicionesOblak.add("Portero");

        Document jugador56 = new Document("nombre", "Jan Oblak")
                .append("nacionalidad", "Eslovenia")
                .append("edad", 32)
                .append("equipos", equiposOblak)
                .append("posiciones", posicionesOblak);
        jugadores.add(jugador56);

        List<String> equiposFornals = new ArrayList<>();
        equiposFornals.add("Malaga");
        equiposFornals.add("West Ham United");
        equiposFornals.add("Real Betis");

        List<String> posicionesFornals = new ArrayList<>();
        posicionesFornals.add("Mediapunta");
        posicionesFornals.add("Extremo Izquierdo");

        Document jugador57 = new Document("nombre", "Pablo Fornals")
                .append("nacionalidad", "Espana")
                .append("edad", 29)
                .append("equipos", equiposFornals)
                .append("posiciones", posicionesFornals);
        jugadores.add(jugador57);

        List<String> equiposIsco = new ArrayList<>();
        equiposIsco.add("Valencia");
        equiposIsco.add("Malaga");
        equiposIsco.add("Real Madrid");
        equiposIsco.add("Sevilla");
        equiposIsco.add("Real Betis");

        List<String> posicionesIsco = new ArrayList<>();
        posicionesIsco.add("Mediapunta");
        posicionesIsco.add("Centrocampista");

        Document jugador58 = new Document("nombre", "Isco")
                .append("nacionalidad", "Espana")
                .append("edad", 33)
                .append("equipos", equiposIsco)
                .append("posiciones", posicionesIsco);
        jugadores.add(jugador58);

        List<String> equiposChimy = new ArrayList<>();
        equiposChimy.add("San Lorenzo");
        equiposChimy.add("Osasuna");
        equiposChimy.add("Real Betis");

        List<String> posicionesChimy = new ArrayList<>();
        posicionesChimy.add("Delantero");
        posicionesChimy.add("Extremo Derecho");

        Document jugador59 = new Document("nombre", "Chimy Avila")
                .append("nacionalidad", "Argentina")
                .append("edad", 31)
                .append("equipos", equiposChimy)
                .append("posiciones", posicionesChimy);
        jugadores.add(jugador59);

        List<String> equiposHerrera = new ArrayList<>();
        equiposHerrera.add("Pachuca");
        equiposHerrera.add("Porto");
        equiposHerrera.add("Atletico de Madrid");
        equiposHerrera.add("Girona");

        List<String> posicionesHerrera = new ArrayList<>();
        posicionesHerrera.add("Centrocampista Defensivo");

        Document jugador60 = new Document("nombre", "Hector Herrera")
                .append("nacionalidad", "Mexico")
                .append("edad", 35)
                .append("equipos", equiposHerrera)
                .append("posiciones", posicionesHerrera);
        jugadores.add(jugador60);

        List<String> equiposSavic = new ArrayList<>();
        equiposSavic.add("Partizan");
        equiposSavic.add("Manchester City");
        equiposSavic.add("Fiorentina");
        equiposSavic.add("Atletico de Madrid");

        List<String> posicionesSavic = new ArrayList<>();
        posicionesSavic.add("Defensa Central");

        Document jugador61 = new Document("nombre", "Stefan Savic")
                .append("nacionalidad", "Montenegro")
                .append("edad", 34)
                .append("equipos", equiposSavic)
                .append("posiciones", posicionesSavic);
        jugadores.add(jugador61);

        List<String> equiposEnNesyri = new ArrayList<>();
        equiposEnNesyri.add("Malaga");
        equiposEnNesyri.add("Sevilla");

        List<String> posicionesEnNesyri = new ArrayList<>();
        posicionesEnNesyri.add("Delantero");

        Document jugador62 = new Document("nombre", "Youssef En Nesyri")
                .append("nacionalidad", "Marruecos")
                .append("edad", 28)
                .append("equipos", equiposEnNesyri)
                .append("posiciones", posicionesEnNesyri);
        jugadores.add(jugador62);

        List<String> equiposSuso = new ArrayList<>();
        equiposSuso.add("Liverpool");
        equiposSuso.add("Almeria");
        equiposSuso.add("Milan");
        equiposSuso.add("Sevilla");

        List<String> posicionesSuso = new ArrayList<>();
        posicionesSuso.add("Extremo Derecho");
        posicionesSuso.add("Mediapunta");

        Document jugador63 = new Document("nombre", "Suso")
                .append("nacionalidad", "Espana")
                .append("edad", 31)
                .append("equipos", equiposSuso)
                .append("posiciones", posicionesSuso);
        jugadores.add(jugador63);

        List<String> equiposGimenez = new ArrayList<>();
        equiposGimenez.add("Danubio");
        equiposGimenez.add("Atletico de Madrid");

        List<String> posicionesGimenez = new ArrayList<>();
        posicionesGimenez.add("Defensa Central");

        Document jugador64 = new Document("nombre", "Jose Maria Gimenez")
                .append("nacionalidad", "Uruguay")
                .append("edad", 30)
                .append("equipos", equiposGimenez)
                .append("posiciones", posicionesGimenez);
        jugadores.add(jugador64);

        List<String> equiposDarder = new ArrayList<>();
        equiposDarder.add("Espanyol");
        equiposDarder.add("Mallorca");

        List<String> posicionesDarder = new ArrayList<>();
        posicionesDarder.add("Centrocampista");
        posicionesDarder.add("Mediapunta");

        Document jugador65 = new Document("nombre", "Sergi Darder")
                .append("nacionalidad", "Espana")
                .append("edad", 31)
                .append("equipos", equiposDarder)
                .append("posiciones", posicionesDarder);
        jugadores.add(jugador65);

        List<String> equiposCouto = new ArrayList<>();
        equiposCouto.add("Sporting Braga");
        equiposCouto.add("Girona");
        equiposCouto.add("Manchester City");
        equiposCouto.add("Valencia");

        List<String> posicionesCouto = new ArrayList<>();
        posicionesCouto.add("Lateral Derecho");

        Document jugador66 = new Document("nombre", "Yan Couto")
                .append("nacionalidad", "Brasil")
                .append("edad", 23)
                .append("equipos", equiposCouto)
                .append("posiciones", posicionesCouto);
        jugadores.add(jugador66);

        List<String> equiposVazquez = new ArrayList<>();
        equiposVazquez.add("Real Madrid");

        List<String> posicionesVazquez = new ArrayList<>();
        posicionesVazquez.add("Lateral Derecho");
        posicionesVazquez.add("Extremo Derecho");

        Document jugador67 = new Document("nombre", "Lucas Vazquez")
                .append("nacionalidad", "Espana")
                .append("edad", 34)
                .append("equipos", equiposVazquez)
                .append("posiciones", posicionesVazquez);
        jugadores.add(jugador67);

        List<String> equiposGuedes = new ArrayList<>();
        equiposGuedes.add("Benfica");
        equiposGuedes.add("PSG");
        equiposGuedes.add("Valencia");
        equiposGuedes.add("Wolverhampton");
        equiposGuedes.add("Villarreal");

        List<String> posicionesGuedes = new ArrayList<>();
        posicionesGuedes.add("Extremo Izquierdo");
        posicionesGuedes.add("Delantero");

        Document jugador68 = new Document("nombre", "Goncalo Guedes")
                .append("nacionalidad", "Portugal")
                .append("edad", 28)
                .append("equipos", equiposGuedes)
                .append("posiciones", posicionesGuedes);
        jugadores.add(jugador68);

        List<String> equiposFermin = new ArrayList<>();
        equiposFermin.add("Barcelona");

        List<String> posicionesFermin = new ArrayList<>();
        posicionesFermin.add("Centrocampista");
        posicionesFermin.add("Mediapunta");

        Document jugador69 = new Document("nombre", "Fermin Lopez")
                .append("nacionalidad", "Espana")
                .append("edad", 22)
                .append("equipos", equiposFermin)
                .append("posiciones", posicionesFermin);
        jugadores.add(jugador69);

        List<String> equiposBrahim = new ArrayList<>();
        equiposBrahim.add("Manchester City");
        equiposBrahim.add("Real Madrid");
        equiposBrahim.add("Milan");

        List<String> posicionesBrahim = new ArrayList<>();
        posicionesBrahim.add("Mediapunta");
        posicionesBrahim.add("Extremo Derecho");

        Document jugador70 = new Document("nombre", "Brahim Diaz")
                .append("nacionalidad", "Marruecos")
                .append("edad", 25)
                .append("equipos", equiposBrahim)
                .append("posiciones", posicionesBrahim);
        jugadores.add(jugador70);

        List<String> equiposBlind = new ArrayList<>();
        equiposBlind.add("Ajax");
        equiposBlind.add("Manchester United");
        equiposBlind.add("Bayern Munich");
        equiposBlind.add("Girona");

        List<String> posicionesBlind = new ArrayList<>();
        posicionesBlind.add("Defensa Central");
        posicionesBlind.add("Centrocampista Defensivo");

        Document jugador71 = new Document("nombre", "Daley Blind")
                .append("nacionalidad", "Paises Bajos")
                .append("edad", 35)
                .append("equipos", equiposBlind)
                .append("posiciones", posicionesBlind);
        jugadores.add(jugador71);

        List<String> equiposCamarasa = new ArrayList<>();
        equiposCamarasa.add("Levante");
        equiposCamarasa.add("Real Betis");
        equiposCamarasa.add("Alaves");
        equiposCamarasa.add("Oviedo");

        List<String> posicionesCamarasa = new ArrayList<>();
        posicionesCamarasa.add("Centrocampista");

        Document jugador72 = new Document("nombre", "Victor Camarasa")
                .append("nacionalidad", "Espana")
                .append("edad", 31)
                .append("equipos", equiposCamarasa)
                .append("posiciones", posicionesCamarasa);
        jugadores.add(jugador72);

        List<String> equiposCama = new ArrayList<>();
        equiposCama.add("Real Madrid");

        List<String> posicionesCama = new ArrayList<>();
        posicionesCama.add("Centrocampista");
        posicionesCama.add("Centrocampista Defensivo");

        Document jugador73 = new Document("nombre", "Eduardo Camavinga")
                .append("nacionalidad", "Francia")
                .append("edad", 22)
                .append("equipos", equiposCama)
                .append("posiciones", posicionesCama);
        jugadores.add(jugador73);

        List<String> equiposTchouameni = new ArrayList<>();
        equiposTchouameni.add("Bordeaux");
        equiposTchouameni.add("Monaco");
        equiposTchouameni.add("Real Madrid");

        List<String> posicionesTchouameni = new ArrayList<>();
        posicionesTchouameni.add("Centrocampista Defensivo");
        posicionesTchouameni.add("Defensa Central");

        Document jugador74 = new Document("nombre", "Aurelien Tchouameni")
                .append("nacionalidad", "Francia")
                .append("edad", 25)
                .append("equipos", equiposTchouameni)
                .append("posiciones", posicionesTchouameni);
        jugadores.add(jugador74);

        List<String> equiposBalde = new ArrayList<>();
        equiposBalde.add("Barcelona");

        List<String> posicionesBalde = new ArrayList<>();
        posicionesBalde.add("Lateral Izquierdo");

        Document jugador75 = new Document("nombre", "Alejandro Balde")
                .append("nacionalidad", "Espana")
                .append("edad", 21)
                .append("equipos", equiposBalde)
                .append("posiciones", posicionesBalde);
        jugadores.add(jugador75);

        List<String> equiposChristensen = new ArrayList<>();
        equiposChristensen.add("Chelsea");
        equiposChristensen.add("Barcelona");

        List<String> posicionesChristensen = new ArrayList<>();
        posicionesChristensen.add("Defensa Central");
        posicionesChristensen.add("Centrocampista Defensivo");

        Document jugador76 = new Document("nombre", "Andreas Christensen")
                .append("nacionalidad", "Dinamarca")
                .append("edad", 29)
                .append("equipos", equiposChristensen)
                .append("posiciones", posicionesChristensen);
        jugadores.add(jugador76);

        List<String> equiposCubarsi = new ArrayList<>();
        equiposCubarsi.add("Barcelona");

        List<String> posicionesCubarsi = new ArrayList<>();
        posicionesCubarsi.add("Defensa Central");

        Document jugador77 = new Document("nombre", "Pau Cubarsi")
                .append("nacionalidad", "Espana")
                .append("edad", 18)
                .append("equipos", equiposCubarsi)
                .append("posiciones", posicionesCubarsi);
        jugadores.add(jugador77);

        List<String> equiposOyarzabal = new ArrayList<>();
        equiposOyarzabal.add("Real Sociedad");

        List<String> posicionesOyarzabal = new ArrayList<>();
        posicionesOyarzabal.add("Extremo Izquierdo");
        posicionesOyarzabal.add("Delantero");

        Document jugador78 = new Document("nombre", "Mikel Oyarzabal")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposOyarzabal)
                .append("posiciones", posicionesOyarzabal);
        jugadores.add(jugador78);

        List<String> equiposBarrios = new ArrayList<>();
        equiposBarrios.add("Atletico de Madrid");

        List<String> posicionesBarrios = new ArrayList<>();
        posicionesBarrios.add("Centrocampista");

        Document jugador79 = new Document("nombre", "Pablo Barrios")
                .append("nacionalidad", "Espana")
                .append("edad", 21)
                .append("equipos", equiposBarrios)
                .append("posiciones", posicionesBarrios);
        jugadores.add(jugador79);

        List<String> equiposLlorente = new ArrayList<>();
        equiposLlorente.add("Real Madrid");
        equiposLlorente.add("Atletico de Madrid");

        List<String> posicionesLlorente = new ArrayList<>();
        posicionesLlorente.add("Centrocampista");
        posicionesLlorente.add("Lateral Derecho");

        Document jugador80 = new Document("nombre", "Marcos Llorente")
                .append("nacionalidad", "Espana")
                .append("edad", 30)
                .append("equipos", equiposLlorente)
                .append("posiciones", posicionesLlorente);
        jugadores.add(jugador80);

        List<String> equiposRiquelme = new ArrayList<>();
        equiposRiquelme.add("Atletico de Madrid");

        List<String> posicionesRiquelme = new ArrayList<>();
        posicionesRiquelme.add("Extremo Izquierdo");
        posicionesRiquelme.add("Lateral Izquierdo");

        Document jugador81 = new Document("nombre", "Rodrigo Riquelme")
                .append("nacionalidad", "Espana")
                .append("edad", 25)
                .append("equipos", equiposRiquelme)
                .append("posiciones", posicionesRiquelme);
        jugadores.add(jugador81);

        List<String> equiposBerchiche = new ArrayList<>();
        equiposBerchiche.add("Real Sociedad");
        equiposBerchiche.add("PSG");
        equiposBerchiche.add("Athletic Club");

        List<String> posicionesBerchiche = new ArrayList<>();
        posicionesBerchiche.add("Lateral Izquierdo");

        Document jugador82 = new Document("nombre", "Yuri Berchiche")
                .append("nacionalidad", "Espana")
                .append("edad", 35)
                .append("equipos", equiposBerchiche)
                .append("posiciones", posicionesBerchiche);
        jugadores.add(jugador82);

        List<String> equiposVivian = new ArrayList<>();
        equiposVivian.add("Athletic Club");

        List<String> posicionesVivian = new ArrayList<>();
        posicionesVivian.add("Defensa Central");

        Document jugador83 = new Document("nombre", "Dani Vivian")
                .append("nacionalidad", "Espana")
                .append("edad", 25)
                .append("equipos", equiposVivian)
                .append("posiciones", posicionesVivian);
        jugadores.add(jugador83);

        List<String> equiposParedes = new ArrayList<>();
        equiposParedes.add("Athletic Club");

        List<String> posicionesParedes = new ArrayList<>();
        posicionesParedes.add("Defensa Central");

        Document jugador84 = new Document("nombre", "Aitor Paredes")
                .append("nacionalidad", "Espana")
                .append("edad", 25)
                .append("equipos", equiposParedes)
                .append("posiciones", posicionesParedes);
        jugadores.add(jugador84);

        List<String> equiposAguirrezabala = new ArrayList<>();
        equiposAguirrezabala.add("Athletic Club");

        List<String> posicionesAguirrezabala = new ArrayList<>();
        posicionesAguirrezabala.add("Portero");

        Document jugador85 = new Document("nombre", "Julen Agirrezabala")
                .append("nacionalidad", "Espana")
                .append("edad", 24)
                .append("equipos", equiposAguirrezabala)
                .append("posiciones", posicionesAguirrezabala);
        jugadores.add(jugador85);

        List<String> equiposHerrando = new ArrayList<>();
        equiposHerrando.add("Osasuna");

        List<String> posicionesHerrando = new ArrayList<>();
        posicionesHerrando.add("Defensa Central");

        Document jugador86 = new Document("nombre", "Jorge Herrando")
                .append("nacionalidad", "Espana")
                .append("edad", 24)
                .append("equipos", equiposHerrando)
                .append("posiciones", posicionesHerrando);
        jugadores.add(jugador86);

        List<String> equiposAreso = new ArrayList<>();
        equiposAreso.add("Athletic Club");
        equiposAreso.add("Osasuna");

        List<String> posicionesAreso = new ArrayList<>();
        posicionesAreso.add("Lateral Derecho");

        Document jugador87 = new Document("nombre", "Jesus Areso")
                .append("nacionalidad", "Espana")
                .append("edad", 25)
                .append("equipos", equiposAreso)
                .append("posiciones", posicionesAreso);
        jugadores.add(jugador87);

        List<String> equiposMoncayola = new ArrayList<>();
        equiposMoncayola.add("Osasuna");

        List<String> posicionesMoncayola = new ArrayList<>();
        posicionesMoncayola.add("Centrocampista");
        posicionesMoncayola.add("Centrocampista Defensivo");

        Document jugador88 = new Document("nombre", "Jon Moncayola")
                .append("nacionalidad", "Espana")
                .append("edad", 27)
                .append("equipos", equiposMoncayola)
                .append("posiciones", posicionesMoncayola);
        jugadores.add(jugador88);

        List<String> equiposTorre = new ArrayList<>();
        equiposTorre.add("Celta");

        List<String> posicionesTorre = new ArrayList<>();
        posicionesTorre.add("Centrocampista");
        posicionesTorre.add("Mediapunta");

        Document jugador89 = new Document("nombre", "Pablo Torre")
                .append("nacionalidad", "Espana")
                .append("edad", 22)
                .append("equipos", equiposTorre)
                .append("posiciones", posicionesTorre);
        jugadores.add(jugador89);

        List<String> equiposLarsen = new ArrayList<>();
        equiposLarsen.add("Groningen");
        equiposLarsen.add("Celta");

        List<String> posicionesLarsen = new ArrayList<>();
        posicionesLarsen.add("Delantero");

        Document jugador90 = new Document("nombre", "Jorgen Strand Larsen")
                .append("nacionalidad", "Noruega")
                .append("edad", 25)
                .append("equipos", equiposLarsen)
                .append("posiciones", posicionesLarsen);
        jugadores.add(jugador90);

        List<String> equiposMingueza = new ArrayList<>();
        equiposMingueza.add("Barcelona");
        equiposMingueza.add("Celta");

        List<String> posicionesMingueza = new ArrayList<>();
        posicionesMingueza.add("Lateral Derecho");
        posicionesMingueza.add("Defensa Central");

        Document jugador91 = new Document("nombre", "Oscar Mingueza")
                .append("nacionalidad", "Espana")
                .append("edad", 26)
                .append("equipos", equiposMingueza)
                .append("posiciones", posicionesMingueza);
        jugadores.add(jugador91);

        List<String> equiposBamba = new ArrayList<>();
        equiposBamba.add("Lille");
        equiposBamba.add("Celta");

        List<String> posicionesBamba = new ArrayList<>();
        posicionesBamba.add("Extremo Izquierdo");
        posicionesBamba.add("Delantero");

        Document jugador92 = new Document("nombre", "Jonathan Bamba")
                .append("nacionalidad", "Costa de Marfil")
                .append("edad", 29)
                .append("equipos", equiposBamba)
                .append("posiciones", posicionesBamba);
        jugadores.add(jugador92);

        List<String> equiposGaya = new ArrayList<>();
        equiposGaya.add("Valencia");

        List<String> posicionesGaya = new ArrayList<>();
        posicionesGaya.add("Lateral Izquierdo");

        Document jugador93 = new Document("nombre", "Jose Gaya")
                .append("nacionalidad", "Espana")
                .append("edad", 30)
                .append("equipos", equiposGaya)
                .append("posiciones", posicionesGaya);
        jugadores.add(jugador93);

        List<String> equiposGuerra = new ArrayList<>();
        equiposGuerra.add("Valencia");

        List<String> posicionesGuerra = new ArrayList<>();
        posicionesGuerra.add("Centrocampista");

        Document jugador94 = new Document("nombre", "Javi Guerra")
                .append("nacionalidad", "Espana")
                .append("edad", 22)
                .append("equipos", equiposGuerra)
                .append("posiciones", posicionesGuerra);
        jugadores.add(jugador94);

        List<String> equiposDuro = new ArrayList<>();
        equiposDuro.add("Getafe");
        equiposDuro.add("Valencia");

        List<String> posicionesDuro = new ArrayList<>();
        posicionesDuro.add("Defensa Central");

        Document jugador95 = new Document("nombre", "Hugo Duro")
                .append("nacionalidad", "Espana")
                .append("edad", 25)
                .append("equipos", equiposDuro)
                .append("posiciones", posicionesDuro);
        jugadores.add(jugador95);

        List<String> equiposMamardashvili = new ArrayList<>();
        equiposMamardashvili.add("Dinamo Tbilisi");
        equiposMamardashvili.add("Valencia");

        List<String> posicionesMamardashvili = new ArrayList<>();
        posicionesMamardashvili.add("Portero");

        Document jugador96 = new Document("nombre", "Giorgi Mamardashvili")
                .append("nacionalidad", "Georgia")
                .append("edad", 24)
                .append("equipos", equiposMamardashvili)
                .append("posiciones", posicionesMamardashvili);
        jugadores.add(jugador96);

        List<String> equiposGerard = new ArrayList<>();
        equiposGerard.add("Villarreal");
        equiposGerard.add("Eibar");
        equiposGerard.add("Villarreal");

        List<String> posicionesGerard = new ArrayList<>();
        posicionesGerard.add("Delantero");

        Document jugador97 = new Document("nombre", "Gerard Moreno")
                .append("nacionalidad", "Espana")
                .append("edad", 33)
                .append("equipos", equiposGerard)
                .append("posiciones", posicionesGerard);
        jugadores.add(jugador97);

        List<String> equiposParejo = new ArrayList<>();
        equiposParejo.add("Real Madrid");
        equiposParejo.add("Getafe");
        equiposParejo.add("Valencia");
        equiposParejo.add("Villarreal");

        List<String> posicionesParejo = new ArrayList<>();
        posicionesParejo.add("Centrocampista");

        Document jugador98 = new Document("nombre", "Dani Parejo")
                .append("nacionalidad", "Espana")
                .append("edad", 36)
                .append("equipos", equiposParejo)
                .append("posiciones", posicionesParejo);
        jugadores.add(jugador98);

        List<String> equiposComesana = new ArrayList<>();
        equiposComesana.add("Rayo Vallecano");
        equiposComesana.add("Villarreal");

        List<String> posicionesComesana = new ArrayList<>();
        posicionesComesana.add("Centrocampista");

        Document jugador99 = new Document("nombre", "Santi Comesana")
                .append("nacionalidad", "Espana")
                .append("edad", 28)
                .append("equipos", equiposComesana)
                .append("posiciones", posicionesComesana);
        jugadores.add(jugador99);

        List<String> equiposAlbiol = new ArrayList<>();
        equiposAlbiol.add("Valencia");
        equiposAlbiol.add("Real Madrid");
        equiposAlbiol.add("Napoli");
        equiposAlbiol.add("Villarreal");

        List<String> posicionesAlbiol = new ArrayList<>();
        posicionesAlbiol.add("Defensa Central");

        Document jugador100 = new Document("nombre", "Raul Albiol")
                .append("nacionalidad", "Espana")
                .append("edad", 39)
                .append("equipos", equiposAlbiol)
                .append("posiciones", posicionesAlbiol);
        jugadores.add(jugador100);

        List<String> equiposRamos = new ArrayList<>();
        equiposRamos.add("Sevilla");
        equiposRamos.add("Real Madrid");
        equiposRamos.add("PSG");
        equiposRamos.add("Sevilla");

        List<String> posicionesRamos = new ArrayList<>();
        posicionesRamos.add("Defensa Central");
        posicionesRamos.add("Lateral Derecho");

        Document jugador101 = new Document("nombre", "Sergio Ramos")
                .append("nacionalidad", "Espana")
                .append("edad", 39)
                .append("equipos", equiposRamos)
                .append("posiciones", posicionesRamos);
        jugadores.add(jugador101);

        List<String> equiposNavas = new ArrayList<>();
        equiposNavas.add("Sevilla");
        equiposNavas.add("Manchester City");
        equiposNavas.add("PSG");
        equiposNavas.add("Sevilla");

        List<String> posicionesNavas = new ArrayList<>();
        posicionesNavas.add("Lateral Derecho");

        Document jugador102 = new Document("nombre", "Jesus Navas")
                .append("nacionalidad", "Espana")
                .append("edad", 39)
                .append("equipos", equiposNavas)
                .append("posiciones", posicionesNavas);
        jugadores.add(jugador102);

        jugadores.add(jugador1);
        jugadores.add(jugador2);

        collection.insertMany(jugadores);
    }

    public static void main(String[] args) {
        String direccionMongo = "mongodb+srv://Nicolas:tirlppc64YyaXJrJ@clusterefa0.dlerdp1.mongodb.net/?retryWrites=true&w=majority&appName=ClusterEFA0";
        try {
            MongoClient mongoClient = MongoClients.create(direccionMongo);
            MongoDatabase database = mongoClient.getDatabase("futbol3raya");
            MongoCollection<Document> collectionJugadores = database.getCollection("jugadores");
            insertarJugadores(collectionJugadores);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
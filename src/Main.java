public class ArcadeChallenge {
    public static void main(String[] args) {
        System.out.println("===== ARCADE CHALLENGE =====\n");

        String[] nombres = {"Laura", "Andrés", "Camila"};
        int[] edades = {19, 22, 20};
        int[] puntajesAcumulados = {1500, 2200, 2200};
        boolean[] esVip = {true, false, true};

        System.out.println("--- RETO 1: INFORMACIÓN DE JUGADORES ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Jugador: " + nombres[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Puntaje acumulado: " + puntajesAcumulados[i]);
            System.out.println("VIP: " + (esVip[i] ? "Sí" : "No"));
            System.out.println();
        }

        int[][] matrizPuntajes = {
                {800, 500, 200},
                {700, 900, 600},
                {950, 400, 850}
        };

        System.out.println("--- RETO 2: TABLA DE PUNTUACIONES ---");
        System.out.printf("%-10s | %-16s | %-18s | %-15s\n", "Jugador", "Carrera", "Invasores", "Robots");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-10s | %-16d | %-18d | %-15d\n",
                    nombres[i], matrizPuntajes[i][0], matrizPuntajes[i][1], matrizPuntajes[i][2]);
        }

        System.out.println("\n[Pregunta Reto 2] ¿Qué posición contiene la puntuación de Camila en Invasores espaciales?");
        System.out.println("Respuesta: matrizPuntajes[2][1]\n");

        int[][][] campeonato = new int[2][2][3];

        campeonato[0][0][0] = 400; campeonato[0][0][1] = 350; campeonato[0][0][2] = 500;
        campeonato[0][1][0] = 300; campeonato[0][1][1] = 400; campeonato[0][1][2] = 450;

        campeonato[1][0][0] = 450; campeonato[1][0][1] = 700; campeonato[1][0][2] = 500;
        campeonato[1][1][0] = 350; campeonato[1][1][1] = 750; campeonato[1][1][2] = 750;

        System.out.println("--- RETO 3: RESULTADOS DÍA 1 ---");
        for (int ronda = 0; ronda < 2; ronda++) {
            System.out.println("Ronda " + (ronda + 1) + ":");
            for (int jugador = 0; jugador < 3; jugador++) {
                System.out.println("  - " + nombres[jugador] + ": " + campeonato[0][ronda][jugador] + " puntos");
            }
        }

        System.out.println("\n[Pregunta Reto 3] ¿Cómo accederías al puntaje del tercer jugador en la segunda ronda del primer día?");
        System.out.println("Respuesta: campeonato[0][1][2]\n");

        System.out.println("--- RETO 4: RESULTADOS FINALES Y GANADOR ---");
        int[] totales = new int[3];
        int maxPuntaje = -1;

        for (int i = 0; i < nombres.length; i++) {
            int suma = 0;
            for (int j = 0; j < matrizPuntajes[i].length; j++) {
                suma += matrizPuntajes[i][j];
            }
            totales[i] = suma;
            System.out.println(nombres[i] + ": " + totales[i] + " puntos");
            if (totales[i] > maxPuntaje) {
                maxPuntaje = totales[i];
            }
        }

        String ganadores = "";
        int cantidadGanadores = 0;
        for (int i = 0; i < nombres.length; i++) {
            if (totales[i] == maxPuntaje) {
                if (cantidadGanadores == 0) {
                    ganadores = nombres[i];
                } else {
                    ganadores += " y " + nombres[i];
                }
                cantidadGanadores++;
            }
        }

        System.out.println();
        if (cantidadGanadores > 1) {
            System.out.println(">>> ¡Tenemos un empate entre " + ganadores + " con " + maxPuntaje + " puntos!");
        } else {
            System.out.println(">>> ¡El ganador es " + ganadores + " con " + maxPuntaje + " puntos!");
        }
    }
}
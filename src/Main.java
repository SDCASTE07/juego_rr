//Este codigo es elaborado por Sergio Daniel Castellanos Rodriguez
import java.util.Scanner;

public class Main {

    //5.	Interacción en el main:
    //•	Crear una instancia de RuletaRusa.
    //•	Permitir al usuario disparar en un bucle hasta que se dispare la bala o el usuario decida salir.
    //•	Mostrar mensajes en consola indicando el resultado de cada disparo (sobrevivir o perder).
    public static void main(String[] args) {
        // Inicializa el Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crea una instancia de RuletaRusa para comenzar el juego
        RuletaRusa ruleta = new RuletaRusa();

        // Variable para controlar si el usuario quiere seguir jugando
        boolean jugar = true;

        // Mensaje de bienvenida
        System.out.println("\n| BIENVENIDO AL IMPACTANTE JUEGO DE LA RULETA RUSA |");
        System.out.println("\n|      EL TAMBOR DEL REVOLVER TIENE 6 CAMARAS      |");
        System.out.println("\n|         TE DESEO LA MEJOR DE LAS SUERTES         |");

        // Bucle principal del juego
        while (jugar) {
            // Pregunta al usuario si quiere disparar
            System.out.println("\n¿QUIERES REALIZAR UN DISPARO? (s/n): ");
            String opcion = scanner.nextLine().trim().toLowerCase(); // Lee y normaliza la entrada

            // Verifica la opción del usuario
            if (opcion.equals("s")) {
                // El usuario decide disparar
                ruleta.mostrarEstado(); // Muestra el estado actual del juego

                // Llama al método disparar y verifica si el jugador pierde
                if (ruleta.disparar()) {
                    // Si el jugador pierde, pregunta si quiere reiniciar el juego
                    System.out.println("\n¿QUIERES REVIVIR Y VOLVER A JUGAR? (s/n): ");
                    String reiniciar = scanner.nextLine().trim().toLowerCase();

                    if (reiniciar.equals("s")) {
                        ruleta.reiniciarJuego(); // Reinicia el juego
                        System.out.println("\n|  HAS REVIVIDO ESPERO TENGAS MAS SUERTE ESTA VEZ   |");
                        System.out.println("\n| BUENA SUERTE Y RECUERDA QUE TODO EN EXESO ES MALO |");
                    } else {
                        // Si el usuario no quiere reiniciar, termina el juego
                        System.out.println("|GRACIAS POR PROBAR TU SUERTE Y NOS VEMOS EN UNA PROXIMA OPORTUNIDAD|");
                        jugar = false; // Sale del bucle
                    }
                }
            } else if (opcion.equals("n")) {
                // El usuario decide salir del juego
                System.out.println("|HAS DECIDIDO PRESERVAR TU VIDA GRACIAS POR PARTICIPAR|");
                jugar = false; // Sale del bucle
            } else {
                // Si la opción no es válida, muestra un mensaje de error
                System.out.println("\nINGRESASTE UNA OPCION NO VALIDA OPRIME |s| PARA DISPARA");
                System.out.println("\nINGRESASTE UNA OPCION NO VALIDA OPRIME |n| PARA   SALIR");

            }
        }

        // Cierra el Scanner para liberar recursos
        scanner.close();
    }
}

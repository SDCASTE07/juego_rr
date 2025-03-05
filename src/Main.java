import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario
        RuletaRusa ruleta = new RuletaRusa();     // Crear una instancia de RuletaRusa
        boolean jugar = true;                    // Controlar si el usuario quiere seguir jugando

        System.out.println("¡Bienvenido a la Ruleta Rusa!");

        while (jugar) {
            System.out.println("\n¿Quieres disparar? (s/n): ");
            String opcion = scanner.nextLine().trim().toLowerCase();

            if (opcion.equals("s")) {
                // El usuario decide disparar
                if (ruleta.disparar()) {
                    System.out.println("¡BANG! Has perdido.");
                    jugar = false; // Termina el juego
                } else {
                    System.out.println("Click. Sigues vivo.");
                }
            } else if (opcion.equals("n")) {
                // El usuario decide salir
                System.out.println("Has decidido salir. ¡Gracias por jugar!");
                jugar = false; // Termina el juego
            } else {
                // Opción no válida
                System.out.println("Opción no válida. Introduce 's' para disparar o 'n' para salir.");
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}
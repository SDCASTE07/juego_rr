//Este codigo es elaborado por Sergio Daniel Castellanos Rodriguez
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletaRusa {

    //1.	Clase: RuletaRusa
    // La clase debe incluir los siguientes atributos:
    //•	List<Integer> tambor: Una lista que contiene las posiciones (por ejemplo, de 0 a 5) representando las cámaras.
    //•	int bala: La posición (índice) de la bala dentro de la lista.
    //•	int posicionActual: La posición actual del tambor en cada disparo.
    //•	Random random: Un generador de números aleatorios para asignar la posición de la bala.

    // Lista que representa las cámaras del revólver (0 a 5)
    private List<Integer> tambor;
    // Posición de la bala en el tambor (índice de la lista)
    private int bala;
    // Posición actual del tambor (índice de la lista)
    private int posicionActual;
    // Generador de números aleatorios para asignar la bala
    private Random random;

    //2.	Constructor RuletaRusa():
    //•	Inicializa la lista de cámaras (por ejemplo, agregando los números 0 a 5).
    //•	Asigna de forma aleatoria la posición de la bala dentro de la lista.
    //•	Establece la posición actual inicial (por ejemplo, en 0).
    //•	Inicializa el generador aleatorio.

    public RuletaRusa() {
        // Inicializa la lista de cámaras (tambor) con valores del 0 al 5
        // Agrega cada número al tambor
        tambor = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            tambor.add(i);
        }

        // Inicializa el generador de números aleatorios
        random = new Random();

        // Asigna de forma aleatoria la posición de la bala para un número entre 0 y 5
        bala = random.nextInt(tambor.size());

        // Establece la posición actual del tambor en 0
        posicionActual = 0;

        // Mensaje
        System.out.println("QUE INICIE EL JUEGO LA BALA SE ENCUENTRA EN ESTA POSICION: " + bala);
    }

    //3.	Método boolean disparar():
    //•	Simula la acción de tirar el gatillo.
    //•	Verifica si la posición actual coincide con la posición de la bala:
    //	Si coincide, retorna true (indicando que se disparó la bala y el jugador pierde).
    //	Si no coincide, retorna false (el jugador sobrevive).
    //•	Actualiza la posición actual avanzando a la siguiente cámara (simulando el giro del tambor).
    public boolean disparar() {
        // Verifica si la posición actual del tambor coincide con la posición de la bala
        // Retorna a  true si el jugador pierde
        if (posicionActual == bala) {
            System.out.println("¡CABUUUUUUUUMMM! LA BALA ESTABA EN ESTA POSICION DEL TAMBOR " + bala + ". HAS MUERTO FIN DEL JUEGO");
            return true;
        } else {
            // Si no coincide, el jugador sobrevive
            System.out.println("CLAAAAK. LA BALA NO ESTABA EN ESTA POSICION " + posicionActual + ". SIGUES VIVO PUEDES CONTINUAR EL JUEGO.");

            // Avanza a la siguiente cámara (simula el giro del tambor)
            posicionActual = (posicionActual + 1) % tambor.size(); // Usa módulo para volver al inicio después de la última cámara
            return false; // Retorna false si el jugador sobrevive
        }
    }

    //4.	Método void reiniciarJuego():
    //•	Permite reiniciar el juego reestableciendo la lista de cámaras, asignando una nueva posición aleatoria para la bala y reiniciando la posición actual.
    public void reiniciarJuego() {
        // Asigna una nueva posición aleatoria para la bala
        bala = random.nextInt(tambor.size());

        // Reinicia la posición actual del tambor a 0
        posicionActual = 0;

        // Mensaje de depuración (opcional, para verificar la nueva posición de la bala)
        System.out.println("|SE REINICIA EL JUEGO| AHORA SE HA GIRADO EL TAMBOR Y LA BALA SE ENCUENTRA EN UNA NUEVA POSICION: " + bala);
    }

    // 5. Método para mostrar el estado actual del juego
    public void mostrarEstado() {
        System.out.println("\n----------------------------------------------------");
        System.out.println("\n----------------------------------------------------");
        System.out.println("\n---- COMO SE ENCUENTRA EL JUEGO EN ESTE MOMENTO ----");
        System.out.println("\n---- POSICION EN LA QUE SE ENCUENTRA EL TAMBOR:  " + posicionActual);
        System.out.println("\n---- POSICION EN LA QUE SE ENCUENTRA LA BALA:    " + bala);
        System.out.println("\n-------------------------------");
    }
}


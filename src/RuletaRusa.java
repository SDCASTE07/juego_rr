
import java.util.Random;


public class RuletaRusa {

    // 1. Atributos de la clase
    private int[] tambor;       // Array que representa las cámaras del revólver
    private int bala;           // Posición de la bala en el tambor
    private int posicionActual; // Posición actual del tambor
    private Random random;      // Generador de números aleatorios

    // Constructor
    // 	Inicializa la lista de cámaras (por ejemplo, agregando los números 0 a 5).
    //Asigna de forma aleatoria la posición de la bala dentro de la lista.
    // Establece la posición actual inicial (por ejemplo, en 0).
    // Inicializa el generador aleatorio.

    //2. Constructor
    public RuletaRusa() {
        // Inicializa el arreglo de cámaras (números 0 a 5)
        tambor = new int[6];
        for (int i = 0; i < tambor.length; i++) {
            tambor[i] = i;
        }

        // Inicializa el generador aleatorio
        random = new Random();

        // Asigna de forma aleatoria la posición de la bala
        bala = random.nextInt(tambor.length);

        // Establece la posición actual inicial en 0
        posicionActual = 0;
    }
    //3. Método boolean disparar():
    //Simula la acción de tirar el gatillo.
    //Verifica si la posición actual coincide con la posición de la bala:
    //Si coincide, retorna true (indicando que se disparó la bala y el jugador pierde).
    //Si no coincide, retorna false (el jugador sobrevive).
    //Actualiza la posición actual avanzando a la siguiente cámara (simulando el giro del tambor).
    // Método disparar
    public boolean disparar() {
        // Verifica si la posición actual coincide con la posición de la bala
        if (posicionActual == bala) {
            return true; // Se disparó la bala, el jugador pierde
        } else {
            // Avanza a la siguiente cámara (simula el giro del tambor)
            posicionActual = (posicionActual + 1) % tambor.length;
            return false; // El jugador sobrevive
        }
    }
    //4. Método void reiniciarJuego():
    // Permite reiniciar el juego reestableciendo la lista de cámaras, asignando una nueva posición aleatoria para la bala y reiniciando la posición actual.
    public void reiniciarJuego() {
        // Reinicia la lista de cámaras (números 0 a 5)
        for (int i = 0; i < tambor.length; i++) {
            tambor[i] = i;
        }

        // Asigna una nueva posición aleatoria para la bala
        bala = random.nextInt(tambor.length);

        // Reinicia la posición actual a 0
        posicionActual = 0;
    }


}



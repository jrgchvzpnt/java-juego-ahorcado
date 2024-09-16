import java.util.Scanner;
import java.util.Arrays;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Palabra secreta
        String palabraSecreta = "JAVA";
        palabraSecreta = palabraSecreta.toUpperCase();

        // Array para almacenar las letras adivinadas
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        Arrays.fill(palabraAdivinada, '_');

        int intentosRestantes = 6; // Número máximo de intentos
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("\nPalabra: " + String.valueOf(palabraAdivinada));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);

            // Verificar si la letra está en la palabra secreta
            boolean letraAdivinada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    letraAdivinada = true;
                }
            }

            // Si la letra no está en la palabra, se resta un intento
            if (!letraAdivinada) {
                intentosRestantes--;
                System.out.println("Letra incorrecta.");
            }

            // Verificar si el jugador ha ganado
            if (Arrays.equals(palabraAdivinada, palabraSecreta.toCharArray())) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                juegoTerminado = true;
            }

            // Verificar si el jugador ha perdido
            if (intentosRestantes == 0) {
                System.out.println("Te has quedado sin intentos. La palabra era: " + palabraSecreta);
                juegoTerminado = true;
            }
        }

        scanner.close();
    }
}

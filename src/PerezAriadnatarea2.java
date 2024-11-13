import java.util.Scanner;

public class PerezAriadnatarea2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño del tablero
        System.out.print("Introduce el número de filas del tablero, suele ser 8: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas del tablero, suele ser 8: ");
        int columnas = scanner.nextInt();

        // Tamaño de cada casilla version caracteres
        System.out.print("Introduce el tamaño de cada casilla, en caracteres: ");
        int tamanoCasilla = scanner.nextInt();


        // Personalización de símbolos
        String simboloBlanco = "*"; // Casilla blanca con el símbolo '*'
        System.out.print("Introduce el símbolo para las casillas negras: ");
        String simboloNegro = scanner.next();

        // Crear el tablero
        String[][] tablero = new String[filas][columnas];

        // Llenar el tablero con casillas alternadas
        llenarTablero(tablero, simboloBlanco, simboloNegro);

        // Mostrar el tablero en la consola
        mostrarTablero(tablero);

        // Cerrar el scanner
        scanner.close();
    }

    // Llenar el Tablero con casillas personalizadas
    private static void llenarTablero(String[][] tablero, String simboloBlanco, String simboloNegro) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                // Alternar entre los símbolos según si la casilla es blanca o negra
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = simboloBlanco; // Casilla blanca con 'A'
                } else {
                    tablero[i][j] = simboloNegro; // Casilla negra con el símbolo elegido
                }
            }
        }
    }

    // Mostrar simbolo en la consola
    private static void mostrarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");  // Imprime la casilla con el símbolo
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}

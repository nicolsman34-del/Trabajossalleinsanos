
import java.util.Scanner;

public class enteros {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leer los diez numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ":");
            numeros[i] = consola.nextInt();
        }

        // Suponer que el primer numero es el mayor y el menor
        int mayor = numeros[0];
        int menor = numeros[0];

        int posicionMayor = 1;
        int posicionMenor = 1;

        // Buscar el mayor y el menor
        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i + 1;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i + 1;
            }
        }

        // Mostrar resultados
        System.out.println();
        System.out.println("NUMEROS INGRESADOS:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + (i + 1) + ": " + numeros[i]);
        }

        System.out.println();
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("Su posicion es: " + posicionMayor);

        System.out.println("El numero menor es: " + menor);
        System.out.println("Su posicion es: " + posicionMenor);

        consola.close();
    }
}


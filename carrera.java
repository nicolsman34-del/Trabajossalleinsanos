
import java.util.Random;
import java.util.Scanner;

public class carrera {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int datoEntrada = 25;
        int[] mesNacimiento = new int[12];
        double[] numerosAleatorios = new double[5];
        double suma = 0;
        double promedio = 0;

        // Etapa 1: promedio de 5 numeros enteros aleatorios
        System.out.println("ETAPA 1");

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = aleatorio.nextInt(10) + 1;
            System.out.println("Numero " + (i + 1) + ": "
                    + numerosAleatorios[i]);
            suma += numerosAleatorios[i];
        }

        promedio = suma / numerosAleatorios.length;
        datoEntrada += promedio;

        System.out.println("Promedio: " + promedio);
        System.out.println("Salida etapa 1: " + datoEntrada);


        // Capturar mes de nacimiento
        int mes;
        do {
            System.out.print("\nIngresa el mes en que naciste (1-12): ");
            mes = teclado.nextInt();
        } while (mes < 1 || mes > 12);

        mesNacimiento[mes - 1] = mes;


        // Etapa 2: residuo entre 7
        System.out.println("\nETAPA 2");

        int entrada2 = datoEntrada;
        int residuo = entrada2 % 7;
        datoEntrada = entrada2 + residuo;

        System.out.println("Entrada: " + entrada2);
        System.out.println("Residuo: " + residuo);
        System.out.println("Salida etapa 2: " + datoEntrada);


        // Etapa 3: porcentaje del 12%
        System.out.println("\nETAPA 3");

        double entrada3 = datoEntrada;
        double porcentaje = entrada3 * 0.12;
        datoEntrada = (int) (entrada3 + (entrada3 * 0.12));

        System.out.println("Entrada: " + entrada3);
        System.out.println("Porcentaje del 12%: " + porcentaje);
        System.out.println("Salida etapa 3: " + datoEntrada);


        // Etapa 4: suma de 10 valores
        System.out.println("\nETAPA 4");

        int[] valores = new int[10];
        int sumaValores = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            valores[i] = teclado.nextInt();
            sumaValores += valores[i];
        }

        int entrada4 = datoEntrada;
        datoEntrada = entrada4 + sumaValores;

        System.out.println("Entrada: " + entrada4);
        System.out.println("Suma de los 10 valores: " + sumaValores);
        System.out.println("Salida etapa 4: " + datoEntrada);


        // Etapa 5: elegir un divisor del 1 al 9
        System.out.println("\nETAPA 5");

        int divisor;
        do {
            System.out.print("Elige un divisor del 1 al 9: ");
            divisor = teclado.nextInt();
        } while (divisor < 1 || divisor > 9);

        double entrada5 = datoEntrada;
        double salida5 = entrada5 / divisor;

        System.out.println("Entrada: " + entrada5);
        System.out.println("Divisor: " + divisor);
        System.out.println("Salida etapa 5: " + salida5);
        System.out.println("Sistema realizado por: Jose Angel Sierra");

        teclado.close();
    }
}

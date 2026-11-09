
import java.util.Scanner;

public class ventavivero{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String[] productos = {"Cactus", "Suculenta", "Maceta", "Tierra", "Fertilizante"};

        double[] precios = {45.5, 35.5, 60, 80, 95};

        double[][] ventas = new double[6][5];

        int unidades;

        for (int i = 0; i < 6; i++) {
            System.out.println("\nVentas del dia " + dias[i]);

            for (int j = 0; j < 5; j++) {
                System.out.print("Unidades vendidas de " + productos[j] + ": ");
                unidades = entrada.nextInt();

                ventas[i][j] = unidades * precios[j];
            }
        }

        System.out.println("\nREPORTE DE VENTAS DEL VIVERO");

        for (int i = 0; i < 6; i++) {
            System.out.println("\n" + dias[i]);

            for (int j = 0; j < 5; j++) {
                System.out.println(productos[j] + ": $" + ventas[i][j]);
            }
        }

        entrada.close();
    }
}

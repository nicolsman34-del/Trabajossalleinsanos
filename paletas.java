import java.util.Scanner;

public class paletas {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        String[] sabores = {"Fresa", "Limon", "Coco"};
        int[] precios = {15, 12, 18};

        int totalPaletas;
        int dineroDia;
        int totalGeneral = 0;
        int dineroTotal = 0;

        // Ciclo para los dos dias
        for (int dia = 1; dia <= 2; dia++) {

            totalPaletas = 0;
            dineroDia = 0;

            System.out.println();
            System.out.println("VENTAS DEL DIA " + dia);

            // Ciclo para los tres sabores
            for (int i = 0; i < sabores.length; i++) {

                System.out.println("¿Cuantas paletas de "
                        + sabores[i] + " se vendieron?");

                int cantidad = consola.nextInt();

                totalPaletas = totalPaletas + cantidad;
                dineroDia = dineroDia + (cantidad * precios[i]);
            }

            System.out.println();
            System.out.println("Resultados del dia " + dia);
            System.out.println("Paletas vendidas: " + totalPaletas);
            System.out.println("Dinero recaudado: $" + dineroDia);

            totalGeneral = totalGeneral + totalPaletas;
            dineroTotal = dineroTotal + dineroDia;
        }

        System.out.println();
        System.out.println("RESUMEN DE LOS DOS DIAS");
        System.out.println("Total de paletas vendidas: " + totalGeneral);
        System.out.println("Dinero total recaudado: $" + dineroTotal);

        consola.close();
    }
}

    


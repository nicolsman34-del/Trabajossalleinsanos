 
import java.util.ArrayList;
import java.util.Scanner;

public class Examen2Parcial_Sierra_JoseAngel {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        String[] productos = {"Chocolate", "Paleta", "Gomitas", "Galletas"};
        double[] precios = {18, 12, 25, 15};

        ArrayList<String> clientes = new ArrayList<String>();
        int[] vendidos = new int[4];

        int cantidadClientes = 0;
        double totalRecaudado = 0;

        System.out.println("SISTEMA DE VENTAS DE UNA DULCERIA");
        System.out.println("--------------------------------");

        // 1. Solicitar la cantidad de clientes
        while (cantidadClientes <= 0) {
            System.out.print("Ingresa la cantidad de clientes que atenderas: ");

            if (consola.hasNextInt()) {
                cantidadClientes = consola.nextInt();
                consola.nextLine();

                if (cantidadClientes <= 0) {
                    System.out.println("Ingresa un numero mayor que cero.");
                }
            } else {
                System.out.println("Dato incorrecto. Ingresa un numero entero.");
                consola.nextLine();
            }
        }

        // 2. Registrar a todos los clientes
        for (int i = 0; i < cantidadClientes; i++) {

            System.out.println("\n================================");
            System.out.println("REGISTRO DEL CLIENTE " + (i + 1));
            System.out.println("================================");

            System.out.print("Nombre del cliente: ");
            String nombre = consola.nextLine();

            clientes.add(nombre);

            double totalCliente = 0;
            String respuesta = "s";

            // 3. Registrar las compras de cada cliente
            while (respuesta.equalsIgnoreCase("s")) {

                System.out.println("\nCATALOGO DE PRODUCTOS");
                System.out.println("1. Chocolate - $18");
                System.out.println("2. Paleta - $12");
                System.out.println("3. Gomitas - $25");
                System.out.println("4. Galletas - $15");

                int codigo = 0;
                int posicion = -1;

                // Validar el codigo del producto
                while (posicion == -1) {
                    System.out.print("Selecciona el codigo del producto (1-4): ");

                    if (consola.hasNextInt()) {
                        codigo = consola.nextInt();
                        consola.nextLine();

                        switch (codigo) {
                            case 1:
                                posicion = 0;
                                break;
                            case 2:
                                posicion = 1;
                                break;
                            case 3:
                                posicion = 2;
                                break;
                            case 4:
                                posicion = 3;
                                break;
                            default:
                                System.out.println("Codigo incorrecto. Intenta otra vez.");
                        }
                    } else {
                        System.out.println("Debes ingresar un numero entero.");
                        consola.nextLine();
                    }
                }

                // Validar la cantidad que se desea comprar
                int cantidad = 0;

                while (cantidad <= 0) {
                    System.out.print("Cantidad que deseas comprar: ");

                    if (consola.hasNextInt()) {
                        cantidad = consola.nextInt();
                        consola.nextLine();

                        if (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor que cero.");
                        }
                    } else {
                        System.out.println("Debes ingresar un numero entero.");
                        consola.nextLine();
                    }
                }

                // Calcular el importe de la compra
                double importe = precios[posicion] * cantidad;

                totalCliente = totalCliente + importe;
                vendidos[posicion] = vendidos[posicion] + cantidad;

                System.out.println("Producto: " + productos[posicion]);
                System.out.println("Precio unitario: $" + precios[posicion]);
                System.out.println("Unidades compradas: " + cantidad);
                System.out.println("Importe: $" + importe);
                System.out.println("Total del cliente hasta ahora: $" + totalCliente);

                // Preguntar si quiere comprar otro producto
                System.out.print("Deseas agregar otro producto (s/n): ");
                respuesta = consola.nextLine();

                while (!respuesta.equalsIgnoreCase("s")
                        && !respuesta.equalsIgnoreCase("n")) {
                    System.out.print("Escribe s para continuar o n para terminar: ");
                    respuesta = consola.nextLine();
                }
            }

            totalRecaudado = totalRecaudado + totalCliente;

            System.out.println("\nCOMPRA TERMINADA");
            System.out.println("Cliente: " + nombre);
            System.out.println("Total de su compra: $" + totalCliente);
        }

        // 4. Mostrar el reporte de productos vendidos
        System.out.println("\n==============================================");
        System.out.println("REPORTE DE PRODUCTOS VENDIDOS");
        System.out.println("==============================================");

        System.out.printf("%-15s %10s %12s %12s%n",
                "Producto", "Precio", "Cantidad", "Importe");

        for (int i = 0; i < productos.length; i++) {
            double importeProducto = precios[i] * vendidos[i];

            System.out.printf("%-15s $%9.2f %12d $%10.2f%n",
                    productos[i], precios[i], vendidos[i], importeProducto);
        }

        // 5. Mostrar el reporte final
        double promedioVenta = totalRecaudado / cantidadClientes;

        System.out.println("\n==============================================");
        System.out.println("REPORTE FINAL");
        System.out.println("==============================================");

        System.out.println("Cantidad de clientes atendidos: " + clientes.size());

        System.out.println("\nLISTA DE CLIENTES");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }

        System.out.println("\nCANTIDAD TOTAL VENDIDA POR PRODUCTO");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + vendidos[i] + " unidades");
        }

        System.out.printf("%nTotal recaudado sin descuentos: $%.2f%n",
                totalRecaudado);

        System.out.printf("Promedio de venta por cliente: $%.2f%n",
                promedioVenta);

        System.out.println("\nFIN DEL PROGRAMA");
        System.out.println("Sistema realizado por el insano de Jose Ángel Sierra Pérez");

        consola.close();
    }
}


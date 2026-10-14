import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("CALCULADORA DE IMC");

            // Entrada de datos del usuario
            System.out.print("Ingresa tu peso en kg: ");
            double peso = entrada.nextDouble();

            System.out.print("Ingresa tu altura en metros (ej. 1.75): ");
            double altura = entrada.nextDouble();

            // Cálculo del IMC: peso / (altura * altura)
            double imc = peso / (altura * altura);

            System.out.printf("\nTu IMC es: %.2f\n", imc);

            // Clasificación del IMC mediante estructuras if / else
            String clasificacion = "";
            int nivelRiesgo = 0;

            if (imc < 18.5) {
                clasificacion = "Bajo peso";
                nivelRiesgo = 1;
                System.out.println("Clasificacion: Bajo peso");
                System.out.println(
                        "Recomendacion: Aumentar la ingesta calorica con alimentos nutritivos y realizar entrenamiento de fuerza.");
            } else if (imc >= 18.5 && imc < 25.0) {
                clasificacion = "Peso normal";
                nivelRiesgo = 2;
                System.out.println("Clasificacion: Peso normal");
                System.out.println(
                        "Recomendacion: Mantener una dieta balanceada y continuar haciendo ejercicio regularmente.");
            } else if (imc >= 25.0 && imc < 30.0) {
                clasificacion = "Sobrepeso";
                nivelRiesgo = 3;
                System.out.println("Clasificacion: Sobrepeso");
                System.out.println(
                        "Recomendacion: Reducir azucares y grasas saturadas, e incrementar el ejercicio aerobico diario.");
            } else if (imc >= 30.0 && imc < 35.0) {
                clasificacion = "Obesidad Grado I";
                nivelRiesgo = 4;
                System.out.println("Clasificacion: Obesidad Grado I");
                System.out.println(
                        "Recomendacion: Consultar a un nutricionista para un plan de alimentacion estructurado.");
            } else if (imc >= 35.0 && imc < 40.0) {
                clasificacion = "Obesidad Grado II";
                nivelRiesgo = 5;
                System.out.println("Clasificacion: Obesidad Grado II");
                System.out.println(
                        "Recomendacion: Iniciar seguimiento medico y nutricional integral para prevenir complicaciones.");
            } else {
                clasificacion = "Obesidad Grado III (Morbida)";
                nivelRiesgo = 6;
                System.out.println("Clasificacion: Obesidad Grado III (Morbida)");
                System.out.println("Recomendacion: Atencion medica prioritaria y evaluacion multidisciplinaria.");
            }

            // Recomendación adicional según el tipo de condición usando switch-case
            System.out.println("\nOrientacion de Salud ");
            switch (nivelRiesgo) {
                case 1:
                    System.out.println(
                            "Nota de salud: Su condicion requiere superavit calorico controlado para evitar fatiga o deficiencia de nutrientes.");
                    break;
                case 2:
                    System.out.println(
                            "Nota de salud: Su condicion es optima. Enfocate en mantener habitos saludables a largo plazo.");
                    break;
                case 3:
                    System.out.println(
                            "Nota de salud: Su condicion presenta un riesgo moderado; pequeños cambios en su rutina marcaran una gran diferencia.");
                    break;
                case 4:
                case 5:
                    System.out.println(
                            "Nota de salud: Su condicion implica riesgo elevado de cardiopatias y diabetes. Se aconseja monitoreo continuo.");
                    break;
                case 6:
                    System.out.println(
                            "Nota de salud: Su condicion requiere intervencion medica especializada de manera prioritaria.");
                    break;
                default:
                    System.out.println("Nota de salud: Evalua tu estado de salud con un especialista.");
                    break;
            }

            // Pregunta para repetir el ciclo
            System.out.print("\n¿Deseas calcular otro IMC? (s/n): ");
            continuar = entrada.next().toLowerCase().charAt(0);
            System.out.println();

        } while (continuar == 's');

        System.out.println("Programa finalizado.");
        System.out.println("Programa realizado por Jose Angel Sierra Perez.");
        entrada.close();
    }
}
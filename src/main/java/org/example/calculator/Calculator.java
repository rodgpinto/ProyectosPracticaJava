package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*** Calculadora ***");

            // Menu de la calculadora
            mostrarMenu();
            try {
                int operacion = sc.nextInt();
                sc.nextLine(); // Consume el carácter de nueva línea

                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, sc);
                } else if (operacion == 5) {
                    System.out.println("Saliendo...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }

                System.out.println(" ");
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
                sc.nextLine(); // Consume el carácter de nueva línea en caso de error
            }
        } // Fin while
    } // Fin Main

    private static void mostrarMenu() { //funcion menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicar
                4. Dividir
                5. Salir
                """);

        System.out.print("Selecciona la operacion a realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner sc) {
        System.out.print("Proporciona el numero 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Proporciona el numero 2: ");
        double num2 = sc.nextDouble();
        double resultado;
        switch (operacion) {
            case 1: // Suma
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2: // Resta
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3: // Multiplicacion
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
                break;
            case 4: // Division
                if (num2 > 0){
                resultado = num1 / num2;
                System.out.println("Resultado de la division: " + resultado);}
                else {
                    System.out.println("No se puede dividir por '0', prueba otro numero");
                }
                break;
            default:
                System.out.println("Opcion erronea: " + operacion);
        }

    }
} // Fin Clase

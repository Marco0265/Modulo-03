/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cajero_consola;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Cajero_consola {
public static void main(String[] args) {
        saldo cuenta = new saldo(1000); // Saldo inicial de 1000
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Cajero. Elija una opción:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar Saldo");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidad = scanner.nextDouble();
                    cuenta.retirarSaldo(cantidad);
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el cajero.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}

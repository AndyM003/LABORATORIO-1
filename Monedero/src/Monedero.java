/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

import java.util.Scanner;

public class Monedero {
    private double cantidad;

    public Monedero(double cantidadInicial) {
        this.cantidad = cantidadInicial;
    }

    public void meterDinero(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se han añadido " + cantidad + " unidades al monedero.");
        } else {
            System.out.println("La cantidad a añadir debe ser mayor que cero.");
        }
    }

    public void sacarDinero(double cantidad) {
        if (cantidad >= 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han sacado " + cantidad + " unidades del monedero.");
        } else {
            System.out.println("Cantidad insuficiente en el monedero.");
        }
    }

    public double consultarDisponible() {
        return this.cantidad;
    }

    public static void main(String[] args) {
        // Crear un monedero con 100 unidades
        Monedero miMonedero = new Monedero(100);

        // Crear un objeto Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            // Mostrar el saldo actual
            System.out.println("Saldo actual: " + miMonedero.consultarDisponible());

            // Solicitar operación al usuario
            System.out.println("Elige una operación: ");
            System.out.println("1. Agregar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de dinero a añadir: ");
                    double cantidadAIngresar = scanner.nextDouble();
                    miMonedero.meterDinero(cantidadAIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dinero a retirar: ");
                    double cantidadARetirar = scanner.nextDouble();
                    miMonedero.sacarDinero(cantidadARetirar);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

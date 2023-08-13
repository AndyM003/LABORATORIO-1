/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class Raices {
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        
        if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        
        if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Raíz única: " + raiz);
        } else {
            System.out.println("No existe una raíz única.");
        }
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los coeficientes de la ecuación de segundo grado:");
        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();

        // Cerrar el Scanner
        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class PersonajeDeAccion {
    private String nombre;
    private double altura;
    private double peso;
    private String colorDePiel;
    private double porcentajeDePoder;
    private boolean estadoVivo;

    public PersonajeDeAccion(String nombre, double altura, double peso, String colorDePiel) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorDePiel = colorDePiel;
        this.porcentajeDePoder = 100.0;
        this.estadoVivo = true;
    }

    public void atacar() {
        System.out.println(nombre + " está atacando a un enemigo.");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo a toda velocidad.");
    }

    public void saltar() {
        System.out.println(nombre + " está saltando sobre un obstáculo.");
    }

    public void esquivar() {
        System.out.println(nombre + " está esquivando un ataque enemigo.");
    }

    public void morir() {
        estadoVivo = false;
        System.out.println(nombre + " ha muerto.");
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Estado: " + (estadoVivo ? "Vivo" : "Muerto") + ", Poder: " + porcentajeDePoder + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los detalles de los personajes:");

        PersonajeDeAccion[] personajes = new PersonajeDeAccion[4];

        for (int i = 0; i < personajes.length; i++) {
            System.out.print("Nombre del personaje " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Altura del personaje " + (i + 1) + ": ");
            double altura = scanner.nextDouble();

            System.out.print("Peso del personaje " + (i + 1) + ": ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            System.out.print("Color de piel del personaje " + (i + 1) + ": ");
            String colorDePiel = scanner.nextLine();

            personajes[i] = new PersonajeDeAccion(nombre, altura, peso, colorDePiel);
        }

        for (PersonajeDeAccion personaje : personajes) {
            personaje.mostrarEstado();
            personaje.atacar();
            personaje.correr();
            personaje.saltar();
            personaje.esquivar();
            personaje.morir();
            personaje.mostrarEstado();
            System.out.println();
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

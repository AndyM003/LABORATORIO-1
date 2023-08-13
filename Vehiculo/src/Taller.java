/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Taller {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Mustang", "Ferch", 2020, "123ABC456DEF\n");
        Vehiculo vehiculo2 = new Vehiculo("Ferrari", "Mustang", 2018, "456DEF789GHI\n");
        Vehiculo vehiculo3 = new Vehiculo("Honda", "Civic", 2019, "789GHI012JKL\n");
        Vehiculo vehiculo4 = new Vehiculo("Hyundai", "Camaro", 2022, "012JKL345MNO\n");
        Vehiculo vehiculo5 = new Vehiculo("Nissan", "Supra", 2013, "345MNO678PQR\n");

        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        vehiculo3.mostrarInformacion();
        vehiculo4.mostrarInformacion();
        vehiculo5.mostrarInformacion();

        vehiculo1.iniciarReparacion();
        vehiculo2.finalizarReparacion();
        vehiculo3.iniciarReparacion();
        vehiculo4.finalizarReparacion();
        vehiculo5.iniciarReparacion();

        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        vehiculo3.mostrarInformacion();
        vehiculo4.mostrarInformacion();
        vehiculo5.mostrarInformacion();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String placa;
    private boolean enReparacion;

    public Vehiculo(String marca, String modelo, int anio, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.enReparacion = false;
    }

    // Métodos de acceso (getters)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isEnReparacion() {
        return enReparacion;
    }

    // Métodos de modificación (setters)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNumeroVIN(String placa) {
        this.placa = placa;
    }

    public void setEnReparacion(boolean enReparacion) {
        this.enReparacion = enReparacion;
    }

    public void iniciarReparacion() {
        enReparacion = true;
    }

    public void finalizarReparacion() {
        enReparacion = false;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Número de placa: " + placa);
        System.out.println("En reparación: " + (enReparacion ? "Sí" : "No"));
    }
}





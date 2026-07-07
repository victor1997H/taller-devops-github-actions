package com.taller;

public class Cliente {
    private String nombre;
    private String cedula;
    private String correo;

    public Cliente(String nombre, String cedula, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean tieneCorreoValido() {
        return correo != null && correo.contains("@");
    }

    public String mostrarInformacion() {
        return "Cliente: " + nombre + " - Cedula: " + cedula;
    }
}
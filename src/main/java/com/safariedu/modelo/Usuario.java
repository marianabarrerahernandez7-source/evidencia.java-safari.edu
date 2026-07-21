package com.safariedu.modelo; // ESTA LÍNEA ES CLAVE

public class Usuario {
    private String nombre;
    private int edad;
    private String animalFavorito;

    public Usuario(String nombre, int edad, String animalFavorito) {
        this.nombre = nombre;
        this.edad = edad;
        this.animalFavorito = animalFavorito;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getAnimalFavorito() { return animalFavorito; }
}
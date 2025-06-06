package com.example.Adapter;

public class Main {
    public static void main(String[] args) {
        ConsolaVideojuegosActual consola = new ConsolaVideojuegosActual();
        AdaptadorHDMI adaptador = new AdaptadorHDMI(consola);
        adaptador.Conectar();
    }
}
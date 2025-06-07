package com.example.SingletonAOP;

public class Main {
    public static void main(String[] args) {
        Configuracion config1 = new Configuracion();
        Configuracion config2 = new Configuracion();

        config1.mostrarConfiguracion();

        System.out.println(config1 == config2); 
    }
}

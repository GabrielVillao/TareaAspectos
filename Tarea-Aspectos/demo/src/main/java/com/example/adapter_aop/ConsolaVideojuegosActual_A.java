package com.example.adapter_aop;
import org.springframework.stereotype.Component;

@Component
public class ConsolaVideojuegosActual_A {
    public boolean HDMI = false;

    public void Conectar_HDMI() {
        this.HDMI = true;
        System.out.println("HDMI conectado.");
    }
}
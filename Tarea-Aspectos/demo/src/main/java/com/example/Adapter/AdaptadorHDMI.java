package com.example.Adapter;

public class AdaptadorHDMI implements Televisor90s{
    private ConsolaVideojuegosActual consola;

    public AdaptadorHDMI(ConsolaVideojuegosActual consola) {
        this.consola = consola;
    }
    @Override
    public void Entrada_video() {
        if(consola.HDMI==false){
            System.out.println("Entrada de video no conectada");
        }
        else{
            System.out.println("Entrada de video conectada a consola");
        }
    }

    @Override
    public void Entrada_audio_izq() {
        if(consola.HDMI==false){
            System.out.println("Entrada de audio izquierdo no conectada");
        }
        else{
            System.out.println("Entrada de audio izquierdo conectada a consola");
        }
    }
    @Override
    public void Entrada_audio_der() {
        if(consola.HDMI==false){
            System.out.println("Entrada de audio derecha no conectada");
        }
        else{
            System.out.println("Entrada de audio derecha conectada a consola");
        }
    }
    public void Conectar(){
        consola.Conectar_HDMI();
        Entrada_video();
        Entrada_audio_izq();
        Entrada_audio_der();
    }
}

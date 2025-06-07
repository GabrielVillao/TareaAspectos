public class AdaptadorHDMI_A implements Televisor90s_A {
    private final ConsolaVideojuegosActual_A consola;

    public AdaptadorHDMI_A(ConsolaVideojuegosActual_A consola) {
        this.consola = consola;
    }

    public ConsolaVideojuegosActual_A getConsola() {
        return consola;
    }

    @Override
    public void Entrada_video() {}

    @Override
    public void Entrada_audio_izq() {}

    @Override
    public void Entrada_audio_der() {}

    public void Conectar() {
        consola.Conectar_HDMI();
        Entrada_video();
        Entrada_audio_izq();
        Entrada_audio_der();
    }
}
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConexionAspecto_A {

    @Before("execution(* AdaptadorHDMI_A.Entrada_video(..)) && target(adaptador)")
    public void video(JoinPoint joinPoint, AdaptadorHDMI_A adaptador) {
        if (!adaptador.getConsola().HDMI) {
            System.out.println("Entrada de video no conectada");
        } else {
            System.out.println("Entrada de video conectada a consola");
        }
    }

    @Before("execution(* AdaptadorHDMI_A.Entrada_audio_izq(..)) && target(adaptador)")
    public void audioIzq(JoinPoint joinPoint, AdaptadorHDMI_A adaptador) {
        if (!adaptador.getConsola().HDMI) {
            System.out.println("Entrada de audio izquierdo no conectada");
        } else {
            System.out.println("Entrada de audio izquierdo conectada a consola");
        }
    }

    @Before("execution(* AdaptadorHDMI_A.Entrada_audio_der(..)) && target(adaptador)")
    public void audioDer(JoinPoint joinPoint, AdaptadorHDMI_A adaptador) {
        if (!adaptador.getConsola().HDMI) {
            System.out.println("Entrada de audio derecha no conectada");
        } else {
            System.out.println("Entrada de audio derecha conectada a consola");
        }
    }
}
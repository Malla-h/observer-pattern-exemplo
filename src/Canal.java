import java.util.ArrayList;
import java.util.List;

public class Canal implements Sujeito{
    private String nome;
    private String ultimoVideo;
    private final List<Observer> observer = new ArrayList<>();

    public Canal(String nome) {
        this.nome = nome;
    }
    
    public void inscreverObservador(Observer o) {
        observer.add(o);
    }

    public void desinscreverObservador(Observer o) {
        observer.remove(o);
    }

    public void notificarObservadores(String titulo, String nome) {
        for (Observer inscrito : observer) {
            inscrito.receberNotificacao(titulo, nome);
        }
    }

    public void postarVideo(String titulo) {
        this.ultimoVideo = titulo;
        notificarObservadores(ultimoVideo, nome);
    }
}

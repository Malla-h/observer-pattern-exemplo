import java.util.ArrayList;
import java.util.List;

public class Canal {
    private String nome;
    private final List<Inscrito> inscritos = new ArrayList<>();

    public Canal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverUsuario(Inscrito u) {
        inscritos.add(u);
    }

    public void desinscreverUsuario(Inscrito u) {
        inscritos.remove(u);
    }

    private void notificar(String titulo, String nome) {
        for (Inscrito inscrito : inscritos) {
            inscrito.receberNotificacao(titulo, nome);
        }
    }

    public void postarVideo(String titulo) {
        notificar(titulo, nome);
    }
}

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

    private void enviarNotificacaoParaTodosOsUsuarios(String titulo, String nome) {

    }

    public void postarVideo(String titulo) {
        enviarNotificacaoParaTodosOsUsuarios(titulo, nome);
    }
}

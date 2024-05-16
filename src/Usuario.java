public class Usuario implements Inscrito {
    private String nome;
    private final int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public void onNotificacao(String tituloConteudo, String canal) {
        System.out.println("[" + nome + "] '" + canal + "' postou: '" + tituloConteudo + "'.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public boolean temNotificacoes(Canal c) {
        return true;
    }
}

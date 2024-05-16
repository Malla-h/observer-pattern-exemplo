public class Usuario implements Observer {
    private String nome;
    private final int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public void receberNotificacao(String tituloConteudo, String canal) {
        System.out.println("[" + nome + "] '" + canal + "' postou: '" + tituloConteudo + "'.");
    }
}

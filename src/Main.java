
public class Main {
    public static void main(String[] args) {
        Canal canalDeCulinaria = new Canal("Receitas Incríveis");
        Canal canalDeEntretenimento = new Canal("Humor e Piadas");

        Usuario joana = new Usuario("Joana", 0);
        Usuario carlos = new Usuario("Carlos", 1);
        Usuario diego = new Usuario("Diego", 2);

        canalDeCulinaria.inscreverUsuario(joana);
        canalDeCulinaria.inscreverUsuario(carlos);

        canalDeCulinaria.postarVideo("Video de Culinaria!");
        canalDeEntretenimento.postarVideo("Video de Entretenimento!");

        

    }
}

public interface Sujeito {    
    public void inscreverObservador(Observer observer);  
    public void desinscreverObservador(Observer observer);    
    public void notificarObservadores(String titulo, String nome);    
}
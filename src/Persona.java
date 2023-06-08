

public class Persona extends Thread {
    private String nome;
    private Museo museo;
     
    
    public Persona (String nome, Museo ms){
        this.nome=nome;
        this.museo=ms;
    }

    public String getNome(){
        return nome;
    }
    @Override
    public void run(){
        museo.visita(nome);
        
    }

}

public class Museo {
    private String nome;
    private Semaforo sm;

    public Museo (String nome, Semaforo sem){
            this.nome=nome;
            this.sm=sem;
    }
    
    public void visita(String n){
        try {
            sm.P();
            System.out.println(n+" entra nel museo");
        } catch (InterruptedException e1) {}
        

        sm.V();
        System.out.println(n+" esce dal museo");


    }

    
}



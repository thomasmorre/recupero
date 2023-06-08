public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforo= new Semaforo(1);
        Museo ms = new Museo("Uffizi", semaforo);
                
        Persona pa = new Persona("a",ms);
        Persona pb = new Persona("b",ms);
        Persona pc = new Persona("c",ms);
        Persona pd = new Persona("d",ms);
        Persona pe = new Persona("e",ms);
        
        
        

        pa.start();
        pb.start();
        pc.start();
        pd.start();
        pe.start();


    }
}



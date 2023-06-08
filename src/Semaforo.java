public class Semaforo {
    private int s;

    public Semaforo(int s){
       this.s=s;
    }

    synchronized public void V (){
        s++;
        notify();
    }

    synchronized public void P() throws InterruptedException{
        while(s==0){
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        s--;
    }
}

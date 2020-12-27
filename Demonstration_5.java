// use of suspend and resume method
import java.lang.*;
class ThreadAA extends Thread{
    public void run(){
        try{
        System.out.println("Beging of Thread A ");
        sleep(1000);
        System.out.println("Finishes thread A");
        }
        catch(Exception e){
            System.out.println("Given exception caught "+ e.getMessage());
        }
    }

}
class ThreadBB extends Thread{
    public void run(){
        try{
        System.out.println("Second thread B starts");
        System.out.println("Second thread suspended itself");
        suspend();
        System.out.println("Second thread run again");
        }
        catch(Exception e){
            System.out.println("given exception is "+ e.getMessage());
        }
    }
}

public class Demonstration_5 {
    public static void main(String args[]){
        ThreadAA t1 = new ThreadAA();
        ThreadBB t2 = new ThreadBB();
        t1.start();
        t2.start();
        System.out.println("Revive the second thread");
        t2.resume(); // if suspended
    }
}

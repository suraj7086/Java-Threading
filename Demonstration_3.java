// Demonstration of Thread class method to getId()
// java code for thread creation by extending thread class
import java.lang.*;
class ThreadId extends Thread{
    public void run(){
        try{
            //displaying the tread that is running
            System.out.println(" current Thread id is "+ Thread.currentThread().getId());

        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class Demonstration_3 {
    public static void main(String args[]){
    int n =8; // number of threads 
    for(int i=0;i<8;i++){
        ThreadId object = new ThreadId();
        object.start();
    }
   }
}

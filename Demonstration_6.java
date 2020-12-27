// setting priority to thread 
import java.lang.*;
public class Demonstration_6 {
    public static void main(String args[]){
        ThreadA  ta = new ThreadA();
        ThreadB  tb = new ThreadB();
        ThreadC  tc = new ThreadC();
        ta.setPriority(Thread.MAX_PRIORITY);
        tb.setPriority(Thread.NORM_PRIORITY);
        tc.setPriority(Thread.MIN_PRIORITY);
        ta.start();
        tb.start();
        tc.start();
        System.out.println("End of the priority threads");
    }
}

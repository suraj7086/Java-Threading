import java.lang.*;
// implementation of thread using runnable interface
class ThreadA implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("From thread A with i = "+ -1*i);
        }
        System.out.println("Existing from thread A that is dead state");
    }
}
class ThreadB implements Runnable{
   public void run(){
    for(int j=0;j<5;j++){
        System.out.println("Even number from thread B with i = "+ 2*j);
    }
    System.out.println("Existing from thread B have an eye on order of execution of thread");
 }
}
class ThreadC implements Runnable{
    public void run(){
        for(int k=0;k<5;k++){
            System.out.println("From thread C with i = "+1+k);
        }
        System.out.println("Existing from thread C");
    }
}
// Priority is not given so it executiion of order of threadd is unknown
public class Demonstration_2{
    public static void main(String args[]){
        ThreadA a = new ThreadA(); // create object 
        Thread t1 = new Thread(a); // creating thread
        ThreadB b = new ThreadB();
        Thread t2 = new Thread(b);
        ThreadC c = new ThreadC();
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("..... Multithreading is over ");
    }
}
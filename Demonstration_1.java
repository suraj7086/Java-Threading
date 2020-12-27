import java.lang.*;
// implementation of thread using Thread class in lang package.
class ThreadA extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("From thread A with i = "+ -1*i);
        }
        System.out.println("Existing from thread A that is dead state");
    }
}
class ThreadB extends Thread{
   public void run(){
    for(int j=0;j<5;j++){
        System.out.println("Even number from thread B with i = "+ 2*j);
    }
    System.out.println("Existing from thread B have an eye on order of execution of thread");
 }
}
class ThreadC extends Thread {
    public void run(){
        for(int k=0;k<5;k++){
            System.out.println("From thread C with i = "+1+k);
        }
        System.out.println("Existing from thread C");
    }
}
// Priority is not given so it executiion of order of threadd is unknown
public class Demonstration_1{
    public static void main(String args[]){
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("..... Multithreading is over ");
    }
}
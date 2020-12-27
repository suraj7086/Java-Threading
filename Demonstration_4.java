// use of yield,stop and sleep method 
import java.lang.*;

class ClassA extends Thread{
    public void run(){
        System.out.println("Start thread A ....");
        for(int i=0;i<5;i++){
            if(i==1)
                yield();
            System.out.println("From thread A " + i);
        }
        System.out.println("Exist from thread A");
    }
}
class ClassB extends Thread{
    public void run(){
        System.out.println("Start thread B ....");
        for(int j=0;j<5;j++){
            System.out.println("From thread VB " + j);
            if(j==2)
            {
                stop();
            }
        }
        System.out.println("Exist from thread B");
    }
}
class ClassC extends Thread{
    public void run(){
        System.out.println("Start thread C ....");
        for(int k=0;k<5;k++){
            System.out.println("From thread C " + k);
            if(k==3){
                try{
                    sleep(1000);
                }
                catch(Exception e){
                    System.out.println("caught an exception");
                }
            }
        }
        System.out.println("Exist from thread C");
    }
}

public class Demonstration_4 {
    public static void main(String args[]){
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        a.start();
        b.start();
        c.start();
        System.out.println("End of Execution");
    }
}

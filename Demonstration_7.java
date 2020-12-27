// data race example
import java.lang.*;
public class Demonstration_7 extends Thread{
    public static int count;
    public void run(){
        for(int i=0;i<100;i++){
            count=count+1;
            count=count-1;
        }
    }
    public static void main(String args[]){
        count=0;
        for(int j=0;j<1000;j++){
            new Demonstration_7().start();
            System.out.println(count);
        }
    
    }
}

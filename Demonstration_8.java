//program to demonstrate the transcation in bank can be carried out concurrently
import java.lang.*;
class Account{
    public int balance;
    public int accountNo;
    void displayBalance(){
        System.out.println("Account number is "+ accountNo +" Balance is "+balance);

    }
    synchronized void deposit(int amount){
            balance = balance + amount;
            System.out.println(amount + " is deposited");
            displayBalance();
    }
    synchronized void withdraw(int amount){
        balance = balance - amount;
        System.out.println(amount + " is withdrawn");
        displayBalance();
    }
}

class TransactionDeposit implements Runnable{
    int amount;
    Account accountx;
    TransactionDeposit(Account x ,int amount){
        accountx = x;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        accountx.deposit(amount);
    }
}
class TransactionWithdraw implements Runnable{
    int amounty;
    Account accounty;
    TransactionWithdraw(Account y,int amounty ){
        accounty = y;
        this.amounty = amounty;
        new Thread(this).start();
    }
    public void run(){
        accounty.withdraw(amounty);
    }
}
public class Demonstration_8 {
    public static void main(String args[]){
        Account abc = new Account();
        abc.balance = 1000;
        abc.accountNo = 101;
        TransactionDeposit t1;
        TransactionWithdraw t2;
        t1 = new TransactionDeposit(abc, 500);
        t2 = new TransactionWithdraw(abc, 200);
    }
}

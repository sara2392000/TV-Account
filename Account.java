/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;
import java.util.Scanner;

public class Account {
private int id  = 1122;
private  double balance = 20000;
private double annualItreseRate;
  private  int dateCreated;
    
  Account(){}  
    
    Account(int Id ,double Balance){
    
  id = Id; 
    balance =Balance;
    
  
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualItreseRate(double annualItreseRate) {
        this.annualItreseRate = annualItreseRate;
    }

    public double getAnnualItreseRate() {
        return annualItreseRate;
    }

    public int getDateCreated() {
        return dateCreated;
    }

 
    public void GitMonthlyInterseRate(  double annualItreseRate){
    
    
    
  double  monthlyRate = ((balance *annualItreseRate)/12)/100;
    
    System.out.println("monthly rate is : " + monthlyRate +"%" );
   
    }
    
    public  void withdraw (double money){
    
   double newBalance  = balance - money;
    
    System.out.println( money +" is withdrawn  and the new balance is " + newBalance);
    }
    
    public void Deposit(double DMoney){
    
  double newbalance =balance+DMoney;
       System.out.println( DMoney+" is deposited and the new account is "  + newbalance);
        
    }
    public static void main(String[] args) {
   
        Account a = new Account();
     
      a.GitMonthlyInterseRate(4.5);
       a.withdraw(2500);
        a.Deposit(3000);
        
        
        
        
        
        
        
        
        
        
    }
    
}

package assignment_1;
import java.util.Date;
public class Account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    Account()
    {
        id=0;
        balance=0.0;
        annualInterestRate = 0.0;
    }
    Account(int ID, double b)
    {
        id = ID;
        balance = b;
    }
    public void setIdBlalance(int ID ,double b)
    {
         id = ID;
        balance = b;
    }
    public void setDataCreated(Date d)
    {
      dateCreated=d;
    }
    public double getMonthlyInterestRate()
    {
        double monthlyInterest = 0;
        annualInterestRate /=100;
        annualInterestRate /= 12;
        monthlyInterest = annualInterestRate * balance;
        return monthlyInterest;
    }
    public void withdraw(double wd)
    {
        if(balance - wd < 0)
            System.out.println("You can't withdraw more than your balance: " + balance);
        else
            balance -= wd;
    } 
     public void deposit(double depo)
     {            
        balance += depo;
     }
     public void display()
     {
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("Monthly Interset: " + getMonthlyInterestRate());
        System.out.println("The date:  " + dateCreated);
     }
}

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Scanner;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount 
{  
   private double balance;
   private int accountNumber;
   
   /**
      Constructs a bank account with a zero balance
   */
   public BankAccount()
   {   
      balance = 0;
   }
   
   public BankAccount(int accountNumber, double balance){
	   this.accountNumber=accountNumber;
	   this.balance = balance;
   }
   
   public void formatTo(Formatter formatter, int width) throws IOException
   {
	   Appendable a = formatter.out();
	   String output = Double.toString(balance);
	   while(output.length()<10)
		   output = " " + output;
	   a.append(output);
   }

   /**
      Constructs a bank account with a given balance
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
       if(initialBalance < 0)
       {
    	   throw new IllegalArgumentException("Initial balance is negative");
       }
	   balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      if(amount<0)
      {
    	  throw new IllegalArgumentException("Deposit amount is negative");
      }
	  double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      if(amount<0 || amount > getBalance())
      {
    	  throw new IllegalArgumentException("Withdrawel is not within balance range");
      }
	  double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   /**
      Adds interest to the bank account
      @param interest rate
   */
   public void addInterest(double rate)
   {   
      balance = balance + (double)Math.round(balance*rate)/100;
   }
   
   public String toString(){
	   return Double.toString(balance);
   }
   
   /**
   Reads an account number and balance.
   @param in the scanner
   @return true if the data was read
   false if the end of the stream was reached
	*/
	public boolean read(Scanner in) throws IOException
	{
		while(in.hasNext())
			return true;
		return false;
	}
   
   /**
   Gets the account number of the bank account.
   @return the account number
	*/
	public int getAccountNumber()
	{
	   return accountNumber;
	}
}

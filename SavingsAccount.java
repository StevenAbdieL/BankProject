

/************************************************************
*This file contain all methods to calculate                 *
*the requested information by user.                         *
*                                                           *
*The file contain the following:                            *
*int data field for id, double data field for               *
*account balance, annual intRate and store the              *
*updated rate using the this.keyword and addition.          *
*A no argument constructor, accessor and mutator,           *
*accessor for dateEstablish                                 *
*and method getWeeklyIntRate that returns weekly Rate       *
*based on balance and annual rate                           *
*************************************************************/


//this will import 
import java.util.Date;

public class SavingsAccount {
	
	//Variables required for SavingsAccount.java:
	int id;
	double balance,deposit,annualIntRate;
	Date dateEstablished;
	
	//No Argument:
	public SavingsAccount() {
		
	}
	public SavingsAccount(int Id, double Balance, double Rate) {
		this.id=Id;
		this.balance=Balance;
		this.annualIntRate=Rate;
	}
	
	//method for option 1:
	public void newBalance(double deposit) {
		this.balance+=deposit;
		System.out.printf("New balance:$%.2f",this.balance);	
	}
	
	//method for option 2:
	public double getWeeklyIntRate() {
		
		double WeeklyRate=(balance*(annualIntRate/52))/100;
		return WeeklyRate;
		
	}
	
	//method(s) for option 3:
	public int getId() {
		
		return id;
		
	}
	
	public static Date dateEstablished() {
		
		Date date = new Date();
		date.getTime();
		date.toString();
		return date;
	}
	
	//method 4
	public static void optionFour() {
		
		System.out.println("\nThank you - Goodbye!");
		System.exit(0);
		
	}
		
}

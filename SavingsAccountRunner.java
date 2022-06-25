
/*************************************************************
 * WRITEN BY:STEVEN QUISTIAN                                 *
 * PROFESSOR:KEVIN KELLY                                     *
 * LAST MODIFICATION:06.24.2022@2:07PM                       *
 *                                                           *
 * DESCRIPTION:                                              *
 * THIS PROGRAM ASK THE USER TO ENTER                        *
 * HIS BANKING INFORMATION. IT USES THE GIVEN                *
 * INFO TO CALCULATE WEEKLY INTEREST RATE,                   *
 * UPDATE THE BALANCE. THE PROGRAM USED SEVERAL              *
 * METHODS TO MAKE THE PROGRAM MORE EFFICIENT                *
 * THE PROGRAM ALSO USES A DO WHILE LOOP TO                  *
 * DISPLAY A SWITCH/CASE MENU AS MANY TIMES THE USER         *
 * WISHES TO CONTINUE.                                       *
 *************************************************************/



import java.util.Scanner;

/**********************************************************************************************
* SavingsAccountRunner is the test program, it asks the user to enter their account number,   *
* initial balance, and annual interest rate, it also displays the list of options from 1-4    *
* and performs error checking for the menu, and deposit                                       *
* this program also invokes the methods needed to display needed information to the user.     *
***********************************************************************************************/
public class SavingsAccountRunner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variables that will hold user info for its account:
		int id;
		double AnnualIntRate;
		double InitialBalance;
		double Deposit;
		
		//PROMP THE USER TO THE PROGRAM AND GET HIS ACCOUNT INFO:
		System.out.println("Welcome to your Savings Account App!");
		System.out.print("Enter your Account number:");
		id = input.nextInt();
		
		System.out.print("Enter your Initial Balance:$");
		InitialBalance = input.nextDouble();
		
		System.out.print("Enter your Annual Interest Rate:");
		AnnualIntRate = input.nextDouble();
		
		SavingsAccount Account = new SavingsAccount(id,InitialBalance,AnnualIntRate);
		
		//THE OPTION VARIABLE WILL HOLD USER CHOICE IN THE MENU (MENU WILL LOOP AS LONG AS USER WANT TO):
		int selection;
		do {
			System.out.println("\n===============================================");
			System.out.println("=                OPTIONS BELOW                =");
			System.out.println("===============================================");
			System.out.println("1. DEPOSIT");
			System.out.println("2. VIEW WEEKLY INTEREST RATE");
			System.out.println("3. VIEW ACCOUNT DETAILS");
			System.out.println("4. EXIT");
			System.out.print("ENTER YOUR SELECTION:");
			selection = input.nextInt();
			
			switch(selection) {
			
			case 1:
				
				System.out.print("Enter your deposit amount:$");
				Deposit = input.nextDouble();
				
				while (Deposit<=0) {
					
					System.out.print("ERROR:Please deposit money - TRY AGAIN!");
					System.out.print("Enter your deposit amount:$");
					Deposit = input.nextDouble();
		
				}
				
				Account.newBalance(Deposit);
				
				break;
					
			case 2:
				
				System.out.printf("Your Weekly Interest Rate:$%.2f",Account.getWeeklyIntRate());
				break;
				
			case 3:
				
				System.out.println("\nYour account Details:");
				System.out.println("Accoun ID:"+Account.getId());
				System.out.println("Account Creation Date/Time:"+Account.dateEstablished());
				System.out.printf("Weekly Interest Rate:$%.2f",Account.getWeeklyIntRate());
				break;
				
			case 4:
				
				SavingsAccount.optionFour();
				break;
			
			default:
				
				System.out.println("INVALID SELECTION(s)- TRY AGAIN!");
				System.out.println("Enter your selection:");
				selection = input.nextInt();
			
			
			}
			
		 }while(selection>1||selection<4);
		
		
		
	}
}

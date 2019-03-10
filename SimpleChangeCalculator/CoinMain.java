import java.util.Scanner;

public class CoinMain {
	   public static void main (String [] args) {
		   	//create Scanner objects
		      Scanner input=new Scanner(System.in);
		      
		      //declare variables
		      double pennies, nickels, dimes, quarters;

		      //retrieves user input of different types of change
		      System.out.println("Please enter the number of pennies");
		      pennies=input.nextInt();
		      System.out.println("Please enter the number of nickels");
		      nickels=input.nextInt();
		      System.out.println("Please enter the number of dimes");
		      dimes=input.nextInt();
		      System.out.println("Please enter the number of quarters");
		      quarters=input.nextInt();
		      input.close();
		      
		      //displays total amount
		      changeCalculator changeCalculator = new changeCalculator(pennies, nickels, quarters, dimes);
		      System.out.print("You have $"+ changeCalculator.toString());

	   }
}      
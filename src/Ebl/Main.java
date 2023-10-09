package Ebl;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Consumer Name: ");
	        String consumerName = scanner.nextLine();

	        System.out.print("Enter Meter Number: ");
	        int meterNumber = scanner.nextInt();

	        System.out.print("Enter the number of units consumed: ");
	        int units = scanner.nextInt();

	        ElectricityBill bill = new ElectricityBill(consumerName, meterNumber, units);
	        bill.displayBill();

	        System.out.print("\nDo you want to generate another bill? (yes/no): ");
	        String choice = scanner.next();

	        if (choice.equalsIgnoreCase("yes")) {
	            scanner.nextLine(); // Consume the newline character
	            main(args); // Restart the program
	        }
	    
	
		

	}

}

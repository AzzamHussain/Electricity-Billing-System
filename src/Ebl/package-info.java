package Ebl;
import java.util.Scanner;

class ElectricityBill{
	  private String consumerName;
	  private int meterNumber;
	  private int units;
	
	
	public ElectricityBill(String consumerName, int meterNumber, int units) {
        this.consumerName = consumerName;
        this.meterNumber = meterNumber;
        this.units = units;

		
	}
	public double calculateBill() {
        double totalBill = 0;

        switch (units / 100) {
            case 0:
                totalBill = units * 22;
                break;
            case 1:
                totalBill = 100 * 22 + (units - 100) * 32;
                break;
            case 2:
                totalBill = 100 * 22 + 100 * 32 + (units - 200) * 37;
                break;
            case 3:
                totalBill = 100 * 22 + 100 * 32 + 100 * 37 + (units - 300) * 43;
                break;
            default:
                totalBill = 100 * 22 + 100 * 32 + 100 * 37 + 100 * 43 + (units - 400) * 50;
        }

        return totalBill;
    }
    public void displayBill() {
        double totalAmount = calculateBill();
        System.out.println("\nConsumer Name: " + consumerName);
        System.out.println("Meter Number: " + meterNumber);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount);
    }

}
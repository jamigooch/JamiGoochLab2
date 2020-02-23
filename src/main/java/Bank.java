
import java.util.Scanner;

public class Bank {
     public static void main(String[] args) {

        System.out.println("This is Bank Charges");

        Scanner keyboard = new Scanner(System.in);
        
        //Get Number of Checks Written
        System.out.println("Please enter number of checks written for the month.");
   
        Double Check = keyboard.nextDouble();
        
        //Total Amount
        Double Total;
        
        //Base Fee Amount
        Double Base = 10.00;
        
        //Each Check Amount
        if (Check < 20) {
            Total = Base + (Check * 0.10);
            System.out.println("The total bank service fee for the month is " + Total);
        }
        if (Check >= 20 && Check <= 39) {
            Total = Base + (Check * 0.08);
            System.out.println("The total bank service fee for the month is " + Total);
        }
        if (Check >=40 && Check <= 59) {
            Total = Base + (Check * 0.06);
            System.out.println("The total bank service fee for the month is " + Total);
        }
        if (Check >= 60) {
            Total = Base + (Check * 0.04);
            System.out.println("The total bank service fee for the month is " + Total);
        }
        
     }
     
}

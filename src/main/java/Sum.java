
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("This is Sum of Numbers");

        Scanner keyboard = new Scanner(System.in);
        
        //Get Positive Nonzero Integer Value
        System.out.println("Please enter a positive nonzero integer value");
        
        //Get Number of Checks Written
        Double Value = keyboard.nextDouble();
        
        //Set total number
        int Total = 0;
        
        //Loop Equation
        for (int i = 1; 
                
                i<= Value; 
                
                i++) {
            
        Total = i + Total;
            
        }
        
        // Display Loop
        System.out.println("Sum from 1 to " + Value + " is " + Total);
        
        
}
}

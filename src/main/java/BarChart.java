
import java.util.Scanner;

public class BarChart {
   public static void main(String[] args) {

        System.out.println("This is Bar Chart");

        Scanner keyboard = new Scanner(System.in);
        
        //5 Stores Integers
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        
        
        //Store 1
        System.out.println("Please enter Store 1 Sales for today");
        Double Store1Sales = keyboard.nextDouble();
        
        //Store 2
        System.out.println("Please enter Store 2 Sales for today");   
        Double Store2Sales = keyboard.nextDouble();
        
       //Store 3
        System.out.println("Please enter Store 3 Sales for today");
        Double Store3Sales = keyboard.nextDouble();
        
        //Store 4
        System.out.println("Please enter Store 4 Sales for today");
        Double Store4Sales = keyboard.nextDouble();
        
        //Store 5
        System.out.println("Please enter Store 5 Sales for today");
        Double Store5Sales = keyboard.nextDouble();
        
        
        //Store 1 Display
        System.out.print("Store 1 Sales: ");
        do {
            System.out.print("*");
            a += 100;
        } while (a < Store1Sales);
        System.out.println(" ");
        

        //Store 2 Display
        System.out.print("Store 2 Sales: ");
        do {
            System.out.print("*");
            b += 100;
        } while (b < Store2Sales);
        System.out.println(" ");

        
        //Store 3 Display
        System.out.print("Store 3 Sales: ");
        do {
            System.out.print("*");
            c += 100;
        } while (c < Store3Sales);
        System.out.println(" ");
        

        //Store 4 Display
        System.out.print("Store 4 Sales: ");
        do {
            System.out.print("*");
            d += 100;
        } while (d < Store4Sales);
        System.out.println(" ");
        
        
        //Store 5 Display
        System.out.print("Store 5 Sales: ");
        do {
            System.out.print("*");
            e += 100;
        } while (e < Store5Sales);
        System.out.println(" ");
        
}
}
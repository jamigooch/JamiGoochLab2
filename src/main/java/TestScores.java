
import java.util.Scanner;


public class TestScores {
  public static void main(String[] args) {

        System.out.println("This is Test Scores and Grades");
        Scanner keyboard = new Scanner(System.in);

        //Test Score 1
        System.out.println("Please enter score 1");

        //Set variable called Score1 as double from user input
        Double Score1 = keyboard.nextDouble();

        //Test Score 2
        System.out.println("Please enter score 2");

        //Set variable called Score2 as double from user input
        Double Score2 = keyboard.nextDouble();

        //Test Score 3
        System.out.println("Please enter score 3");

        //Set variable called Score3 as double from user input
        Double Score3 = keyboard.nextDouble();
        
       //Set variable called AvgScore as double
        Double AvgScore = (Score1 + Score2 + Score3) / 3;

        //Average Test Score
        if (AvgScore >= 90) {
            System.out.println("The average test score is " + AvgScore + ". That is an A letter grade.");
                } 
        if (AvgScore <= 89 && AvgScore >= 80) {
            System.out.println("The average test score is " + AvgScore + ". That is an B letter grade.");
                } 
        if (AvgScore <= 79 && AvgScore >= 70) {
            System.out.println("The average test score is " + AvgScore + ". That is an C letter grade.");
                } 
        if (AvgScore <= 69 && AvgScore >= 60) {
            System.out.println("The average test score is " + AvgScore + ". That is an D letter grade.");
                } 
        if (AvgScore <= 59)
            System.out.println("The average test score is " + AvgScore + ". That is an F letter grade.");       
                }
}

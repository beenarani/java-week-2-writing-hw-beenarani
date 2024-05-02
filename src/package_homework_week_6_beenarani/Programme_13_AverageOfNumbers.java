package package_homework_week_6_beenarani;
import java.util.Scanner;

/**
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

public class Programme_13_AverageOfNumbers {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        averageOfThreeNumbers(a, b, c);
        // closing the scanner object
        scanner.close();
    }

    // Calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.print("The average of " + a + " , " + b + " and " + c + " is : " + average);
    }

}


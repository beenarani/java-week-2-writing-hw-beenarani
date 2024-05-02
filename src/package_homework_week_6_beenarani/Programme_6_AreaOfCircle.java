package package_homework_week_6_beenarani;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //scanner declaration from reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaofcircle(radius);
        //closing the scanner object
        scanner.close();
    }
    //calculating the area of the circle
    public static void areaofcircle(double radius) {
        double pi = Math.PI;
        Double area = (pi*radius*radius);
        System.out.println("The Area of the circle is : " + area);

    }
}

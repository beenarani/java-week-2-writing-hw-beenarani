package package_homework_week_6_beenarani;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        //obj. creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.ConvertTempToDegreeCelsius(temp);
        //closing the scanner object
        scanner.close();
    }
    //Temperature conversion method
    public void ConvertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5/9);
        System.out.println("The temperature "  + temp + " fahrenheit is equal to " + c + " degree celsius");
    }
}

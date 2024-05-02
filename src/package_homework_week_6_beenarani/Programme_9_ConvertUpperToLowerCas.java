package package_homework_week_6_beenarani;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCas {
    public static void main(String[] args) {
        //Scanner declaration for reading output from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCas t = new Programme_9_ConvertUpperToLowerCas();
        t.ConvertUpperToLowerCas(uppercase);
        scanner.close();
    }

    //conversion of uppercase to lower case method
    public void ConvertUpperToLowerCas(String text) {
        System.out.println("The lowercase value is = " + text.toLowerCase());
    }
}

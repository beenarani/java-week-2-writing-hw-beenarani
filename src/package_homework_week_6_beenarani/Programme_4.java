package package_homework_week_6_beenarani;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */


public class Programme_4 {
    //4.1 Declare two instance and two static variables.
    //Instance Variable
    String name = "Beena";
    String surname = "Rani";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);

    }

    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Programme_4 programme4 = new Programme_4();
        System.out.println(programme4.name);
        System.out.println(programme4.surname);
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    //4.5 Declare the main method.
    // 4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_4 programme4 = new Programme_4();
        programme4.instanceMethod();
        staticMethod();
    }

}
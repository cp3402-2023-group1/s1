import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Convert the name to uppercase
        String uppercaseName = name.toUpperCase();

        // Greet the user
        System.out.println("Hello, " + uppercaseName + ", nice to meet you!");

        // Close the scanner
        scanner.close();
    }
}

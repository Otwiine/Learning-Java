import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner input = new Scanner(System.in);

        // Ask for First number
        System.out.print("Enter first Number: ");
        double num1 = input.nextDouble();

        // Ask for Second number
        System.out.print("Enter second Number: ");
        double num2 = input.nextDouble();

        // Ask for operation
        System.out.print("Select an Operator (+,-,*,/): ");
        char operator = input.next().charAt(0); // read first character of input

        // Perform calculation based on operator
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        // Check if num2 is zero and prevents division by zero
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
        }
        // Checks for invalid operator
        else {
            System.out.println("Invalid operator.");
            return;
        }
        // Prints Result
        System.out.println("Result: " + result);
        }
    }

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


        }
    }

import java.util.Scanner;

public class SimpleConsoleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation;

        do {
            // Read first number
            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();

            // Read operator
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Read second number
            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            // Perform calculation
            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        System.out.println("Error: Division by zero");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.printf("Result: %.2f%n", result);
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculation = scanner.next();

        } while (continueCalculation.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Calculator closed.");
    }
}

// Name: Vedant Singh Thakur
// PRN: 23071026144
// Batch: AIML B3
// Main file for Calculator and Fibonacci Program

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Program!");

        // Creating an instance of UserInput to manage inputs
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        // Display menu and perform operations
        int choice;
        do {
            choice = userInput.getOperationChoice();
            switch (choice) {
                case 1: // Addition
                    double[] addNums = userInput.getArrayInput();
                    System.out.println("Sum: " + calculator.add(addNums));
                    break;
                case 2: // Subtraction
                    System.out.println("Enter two numbers:");
                    double num1 = userInput.getNumberInput();
                    double num2 = userInput.getNumberInput();
                    System.out.println("Difference: " + calculator.subtract(num1, num2));
                    break;
                case 3: // Multiplication
                    double[] mulNums = userInput.getArrayInput();
                    System.out.println("Product: " + calculator.multiply(mulNums));
                    break;
                case 4: // Division
                    System.out.println("Enter two numbers:");
                    num1 = userInput.getNumberInput();
                    num2 = userInput.getNumberInput();
                    System.out.println("Quotient: " + calculator.divide(num1, num2));
                    break;
                case 5: // Fibonacci
                    System.out.println("Enter the number of Fibonacci terms:");
                    int n = (int) userInput.getNumberInput();
                    int[] fib = calculator.generateFibonacci(n);
                    System.out.print("Fibonacci Sequence: ");
                    for (int num : fib) System.out.print(num + " ");
                    System.out.println();
                    break;
                case 6: // Sum of array
                    double[] arr = userInput.getArrayInput();
                    System.out.println("Sum of Array: " + calculator.add(arr));
                    break;
                case 7: // Mean of array
                    arr = userInput.getArrayInput();
                    System.out.println("Mean of Array: " + calculator.mean(arr));
                    break;
                case 0:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}

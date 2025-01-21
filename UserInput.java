// Handles user inputs for numbers, arrays, and operations
import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    // Get a number from the user
    public double getNumberInput() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    // Get an array of numbers from the user
    public double[] getArrayInput() {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    // Display operation menu and get user choice
    public int getOperationChoice() {
        System.out.println("\nSelect an operation:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Fibonacci Sequence");
        System.out.println("6: Sum of Array");
        System.out.println("7: Mean of Array");
        System.out.println("0: Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}

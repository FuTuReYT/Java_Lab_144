// Contains calculator logic for various operations

public class Calculator {

    // Addition of array elements
    public double add(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Subtraction of two numbers
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication of array elements
    public double multiply(double[] numbers) {
        double product = 1;
        for (double num : numbers) {
            product *= num;
        }
        return product;
    }

    // Division of two numbers
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    // Generate Fibonacci sequence
    public int[] generateFibonacci(int n) {
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Calculate mean of array elements
    public double mean(double[] numbers) {
        return add(numbers) / numbers.length;
    }
}

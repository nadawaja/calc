public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute factorial of a negative number.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
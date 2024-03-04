/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_package;

/**
 *
 * @author Admin
 */
public class MathLibrary {
     public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) dividend / divisor;
    }

    public static int square(int number) {
        return number * number;
    }

    public static double power(double base, int exponent) {
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root of negative numbers is undefined");
        }
        return Math.sqrt(number);
    }

    public static int absoluteValue(int number) {
        return number >= 0 ? number : -number;
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static int min(int a, int b) {
        return a <= b ? a : b;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

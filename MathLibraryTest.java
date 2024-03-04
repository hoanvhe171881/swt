/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_package;
import code_package.MathLibrary;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathLibraryTest {

    @Test
    public void testAddition() {
        assertEquals(4, MathLibrary.add(2, 2));
        assertEquals(10, MathLibrary.add(5, 5));
        assertEquals(20, MathLibrary.add(10, 10));
        assertEquals(100, MathLibrary.add(50, 50));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, MathLibrary.subtract(2, 2));
        assertEquals(5, MathLibrary.subtract(10, 5));
        assertEquals(2, MathLibrary.subtract(5, 3));
        assertEquals(10, MathLibrary.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(4, MathLibrary.multiply(2, 2));
        assertEquals(25, MathLibrary.multiply(5, 5));
        assertEquals(100, MathLibrary.multiply(10, 10));
        assertEquals(2500, MathLibrary.multiply(50, 50));
    }

    @Test
    public void testDivision() {
        assertEquals(2, MathLibrary.divide(4, 2));
        assertEquals(5, MathLibrary.divide(25, 5));
        assertEquals(10, MathLibrary.divide(100, 10));
        assertEquals(50, MathLibrary.divide(2500, 50));
    }

    @Test
    public void testSquare() {
        assertEquals(4, MathLibrary.square(2));
        assertEquals(25, MathLibrary.square(5));
        assertEquals(100, MathLibrary.square(10));
        assertEquals(2500, MathLibrary.square(50));
    }

    @Test
    public void testPower() {
        assertEquals(4, MathLibrary.power(2, 2));
        assertEquals(125, MathLibrary.power(5, 3));
        assertEquals(1000, MathLibrary.power(10, 3));
        assertEquals(125000, MathLibrary.power(50, 3));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, MathLibrary.factorial(0));
        assertEquals(1, MathLibrary.factorial(1));
        assertEquals(120, MathLibrary.factorial(5));
        assertEquals(3628800, MathLibrary.factorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeInput() {
        MathLibrary.factorial(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        MathLibrary.divide(10, 0);
    }
    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(-4, MathLibrary.add(-2, -2));
        assertEquals(0, MathLibrary.add(-5, 5));
        assertEquals(10, MathLibrary.add(-10, 20));
        assertEquals(-50, MathLibrary.add(-25, -25));
    }

    @Test
    public void testSubtractionWithNegativeNumbers() {
        assertEquals(0, MathLibrary.subtract(-2, -2));
        assertEquals(-10, MathLibrary.subtract(-5, 5));
        assertEquals(-30, MathLibrary.subtract(-10, 20));
        assertEquals(0, MathLibrary.subtract(-25, -25));
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        assertEquals(4, MathLibrary.multiply(-2, -2));
        assertEquals(-25, MathLibrary.multiply(-5, 5));
        assertEquals(-200, MathLibrary.multiply(-10, 20));
        assertEquals(625, MathLibrary.multiply(-25, -25));
    }

    @Test
    public void testDivisionWithNegativeNumbers() {
        assertEquals(1, MathLibrary.divide(-2, -2));
        assertEquals(-1, MathLibrary.divide(-5, 5));
        assertEquals(0, MathLibrary.divide(-10, 20));
        assertEquals(1, MathLibrary.divide(-25, -25));
    }
    @Test
    public void testSquareWithNegativeNumbers() {
        assertEquals(4, MathLibrary.square(-2));
        assertEquals(25, MathLibrary.square(-5));
        assertEquals(100, MathLibrary.square(-10));
        assertEquals(2500, MathLibrary.square(-50));
    }

    @Test
    public void testPowerWithNegativeExponent() {
        assertEquals(0.25, MathLibrary.power(2, -2), 0.0001);
        assertEquals(0.008, MathLibrary.power(2, -3), 0.0001);
        assertEquals(0.01, MathLibrary.power(10, -2), 0.0001);
        assertEquals(0.0004, MathLibrary.power(10, -4), 0.0001);
    }

    @Test
    public void testPowerWithZeroExponent() {
        assertEquals(1, MathLibrary.power(2, 0));
        assertEquals(1, MathLibrary.power(10, 0));
        assertEquals(1, MathLibrary.power(100, 0));
        assertEquals(1, MathLibrary.power(0, 0));
    }

    @Test
    public void testFactorialWithLargeNumbers() {
        assertEquals(2432902008176640000L, MathLibrary.factorial(20));
        assertEquals(1307674368000L, MathLibrary.factorial(15));
        assertEquals(479001600, MathLibrary.factorial(12));
        assertEquals(362880, MathLibrary.factorial(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithLargeNegativeInput() {
        MathLibrary.factorial(-20);
    }

    @Test
    public void testFactorialWithZero() {
        assertEquals(1, MathLibrary.factorial(0));
    }

    @Test
    public void testPowerWithLargeNumbers() {
        assertEquals(1099511627776L, MathLibrary.power(2, 40));
        assertEquals(1000000000000000000L, MathLibrary.power(10, 18));
        assertEquals(1000000000000L, MathLibrary.power(10, 12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowerWithLargeNegativeBase() {
        MathLibrary.power(-2, 10);
    }

    @Test
    public void testPowerWithLargeNegativeExponent() {
        assertEquals(0.00000000001, MathLibrary.power(10, -11), 0.00000000000001);
        assertEquals(0.0000000001, MathLibrary.power(10, -10), 0.00000000000001);
    }

    @Test
    public void testPowerWithLargeBaseAndExponent() {
        assertEquals(10000000000L, MathLibrary.power(10, 10));
        assertEquals(100000000000L, MathLibrary.power(10, 11));
        assertEquals(1000000000000L, MathLibrary.power(10, 12));
    }
     @Test
    public void testPowerWithZeroBase() {
        assertEquals(0, MathLibrary.power(0, 10));
        assertEquals(0, MathLibrary.power(0, 5));
        assertEquals(0, MathLibrary.power(0, 1));
        assertEquals(0, MathLibrary.power(0, 0));
    }

    @Test
    public void testFactorialWithSmallNumbers() {
        assertEquals(1, MathLibrary.factorial(1));
        assertEquals(2, MathLibrary.factorial(2));
        assertEquals(6, MathLibrary.factorial(3));
        assertEquals(24, MathLibrary.factorial(4));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2, MathLibrary.squareRoot(4), 0.0001);
        assertEquals(3, MathLibrary.squareRoot(9), 0.0001);
        assertEquals(5, MathLibrary.squareRoot(25), 0.0001);
        assertEquals(10, MathLibrary.squareRoot(100), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootOfNegativeNumber() {
        MathLibrary.squareRoot(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootOfZero() {
        MathLibrary.squareRoot(0);
    }

    @Test
    public void testAbsoluteValue() {
        assertEquals(4, MathLibrary.absoluteValue(4));
        assertEquals(5, MathLibrary.absoluteValue(-5));
        assertEquals(0, MathLibrary.absoluteValue(0));
        assertEquals(100, MathLibrary.absoluteValue(-100));
    }

    @Test
    public void testMax() {
        assertEquals(5, MathLibrary.max(4, 5));
        assertEquals(10, MathLibrary.max(10, -5));
        assertEquals(100, MathLibrary.max(100, 0));
        assertEquals(0, MathLibrary.max(0, -10));
    }

    @Test
    public void testMin() {
        assertEquals(4, MathLibrary.min(4, 5));
        assertEquals(-5, MathLibrary.min(10, -5));
        assertEquals(0, MathLibrary.min(100, 0));
        assertEquals(-10, MathLibrary.min(0, -10));
    }

    @Test
    public void testIsPrime() {
        assertTrue(MathLibrary.isPrime(2));
        assertTrue(MathLibrary.isPrime(3));
        assertTrue(MathLibrary.isPrime(5));
        assertFalse(MathLibrary.isPrime(4));
        assertFalse(MathLibrary.isPrime(9));
        assertFalse(MathLibrary.isPrime(15));
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(MathLibrary.isPrime(-2));
        assertFalse(MathLibrary.isPrime(-5));
    }

    @Test
    public void testIsPrimeWithZeroAndOne() {
        assertFalse(MathLibrary.isPrime(0));
        assertFalse(MathLibrary.isPrime(1));
    }

    @Test
    public void testIsPrimeWithLargePrimeNumber() {
        assertTrue(MathLibrary.isPrime(99991));
    }

    @Test
    public void testIsPrimeWithLargeNonPrimeNumber() {
        assertFalse(MathLibrary.isPrime(99992));
    }
    @Test
    public void testAbsoluteValueWithNegativeNumbers() {
        assertEquals(4, MathLibrary.absoluteValue(-4));
        assertEquals(5, MathLibrary.absoluteValue(-5));
        assertEquals(0, MathLibrary.absoluteValue(-0));
        assertEquals(100, MathLibrary.absoluteValue(-100));
    }

    @Test
    public void testMaxWithNegativeNumbers() {
        assertEquals(5, MathLibrary.max(-4, 5));
        assertEquals(10, MathLibrary.max(10, -5));
        assertEquals(100, MathLibrary.max(-100, 0));
        assertEquals(0, MathLibrary.max(0, -10));
    }

    @Test
    public void testMinWithNegativeNumbers() {
        assertEquals(-4, MathLibrary.min(-4, 5));
        assertEquals(-5, MathLibrary.min(10, -5));
        assertEquals(-100, MathLibrary.min(-100, 0));
        assertEquals(-10, MathLibrary.min(0, -10));
    }

    @Test
    public void testIsPrimeWithNegativeNumbers() {
        assertFalse(MathLibrary.isPrime(-2));
        assertFalse(MathLibrary.isPrime(-5));
        assertFalse(MathLibrary.isPrime(-13));
    }

    @Test
    public void testIsPrimeWithLargeNegativeNumbers() {
        assertFalse(MathLibrary.isPrime(-99991));
        assertFalse(MathLibrary.isPrime(-99992));
    }

    @Test
    public void testIsPrimeWithPositiveAndNegativeNumbers() {
        assertFalse(MathLibrary.isPrime(0));
        assertFalse(MathLibrary.isPrime(1));
        assertFalse(MathLibrary.isPrime(-1));
        assertTrue(MathLibrary.isPrime(2));
        assertTrue(MathLibrary.isPrime(-2));
        assertTrue(MathLibrary.isPrime(3));
        assertTrue(MathLibrary.isPrime(-3));
    }

    @Test
    public void testIsPrimeWithLargePrimeNumbers() {
        assertTrue(MathLibrary.isPrime(99991));
        assertTrue(MathLibrary.isPrime(99989));
    }

    @Test
    public void testIsPrimeWithLargeNonPrimeNumbers() {
        assertFalse(MathLibrary.isPrime(99992));
        assertFalse(MathLibrary.isPrime(99993));
    }


    @Test
    public void testIsPrimeWithSmallNumbers() {
        assertTrue(MathLibrary.isPrime(2));
        assertTrue(MathLibrary.isPrime(3));
        assertTrue(MathLibrary.isPrime(5));
        assertTrue(MathLibrary.isPrime(7));
        assertFalse(MathLibrary.isPrime(4));
        assertFalse(MathLibrary.isPrime(6));
        assertFalse(MathLibrary.isPrime(8));
        assertFalse(MathLibrary.isPrime(9));
    }
}


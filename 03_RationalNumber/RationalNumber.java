public class RationalNumber {
    // Instance variables for numerator and denominator
    private int num;
    private int den;

    // Default constructor (defaults to 0/1)
    public RationalNumber() {
        this.num = 0;
        this.den = 1;
    }

    // Parameterized constructor with basic check for zero denominator
    public RationalNumber(int num, int den) {
        if (den == 0) {
            System.out.println("Warning: Denominator cannot be 0. Setting to 1.");
            den = 1;
        }
        this.num = num;
        this.den = den;
        simplify(); // Simplify fraction upon object creation
    }

    // Helper method to simplify the fraction using GCD
    private void simplify() {
        int gcd = findGCD(Math.abs(num), Math.abs(den));
        this.num /= gcd;
        this.den /= gcd;

        // Keep the negative sign in the numerator if present
        if (this.den < 0) {
            this.num = -this.num;
            this.den = -this.den;
        }
    }

    // Euclidean algorithm to calculate greatest common divisor
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Adds two rational numbers: (a/b) + (c/d) = (ad + bc) / bd
    public RationalNumber add(RationalNumber r) {
        int newNum = (this.num * r.den) + (r.num * this.den);
        int newDen = this.den * r.den;
        return new RationalNumber(newNum, newDen);
    }

    // Subtracts two rational numbers: (a/b) - (c/d) = (ad - bc) / bd
    public RationalNumber subtract(RationalNumber r) {
        int newNum = (this.num * r.den) - (r.num * this.den);
        int newDen = this.den * r.den;
        return new RationalNumber(newNum, newDen);
    }

    // Formats fraction as string (e.g., "1/2" or just "3" if denominator is 1)
    @Override
    public String toString() {
        if (den == 1) return String.valueOf(num);
        return num + "/" + den;
    }
}
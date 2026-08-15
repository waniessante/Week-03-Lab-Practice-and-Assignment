public class ComplexNumber {
    // Instance variables for real and imaginary parts
    private double real;
    private double img;

    // Default constructor (initializes to 0 + 0i)
    public ComplexNumber() {
        this.real = 0;
        this.img = 0;
    }

    // Parameterized constructor
    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    // Copy constructor
    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.img = other.img;
    }

    // Adds current complex number with another and returns a new object
    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.real, this.img + c.img);
    }

    // Subtracts another complex number from current one
    public ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(this.real - c.real, this.img - c.img);
    }

    // Displays the complex number in 'a + bi' or 'a - bi' format
    @Override
    public String toString() {
        if (img >= 0) {
            return real + " + " + img + "i";
        } else {
            return real + " - " + Math.abs(img) + "i";
        }
    }
}
public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber num1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber num2 = new ComplexNumber(1.5, 4.5);

        // Add the two complex numbers
        ComplexNumber result = num1.add(num2);

        // Print the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
    }
}

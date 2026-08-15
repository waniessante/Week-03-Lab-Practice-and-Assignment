public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, 2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
    }
}
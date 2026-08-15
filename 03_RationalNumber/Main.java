public class Main {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(2, 4);
        RationalNumber r2 = new RationalNumber(1, 3);

        System.out.println("r1 (simplified): " + r1);
        System.out.println("r2: " + r2);

        System.out.println("r1 + r2 = " + r1.add(r2));
        System.out.println("r1 - r2 = " + r1.subtract(r2));
    }
}
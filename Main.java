public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        // Testing addition and subtraction
        Point sum = p1.add(p2);
        Point diff = p2.subtract(p1);
        System.out.println("Sum of P1 and P2: " + sum);
        System.out.println("Diff of P2 - P1: " + diff);

        // Testing copy constructor
        Point copyP1 = new Point(p1);
        System.out.println("Copied Point 1: " + copyP1);

        // Triangle test
        Triangle t = new Triangle(p1, p2, p3);
        System.out.println(t);
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    }
}
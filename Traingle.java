public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    // Constructor using Point objects (using copy constructor for safety)
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    public double getPerimeter() {
        double side1 = p1.distanceTo(p2);
        double side2 = p2.distanceTo(p3);
        double side3 = p3.distanceTo(p1);
        return side1 + side2 + side3;
    }

    public double getArea() {
        // Heron's Formula
        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangle vertices: " + p1 + ", " + p2 + ", " + p3;
    }
}
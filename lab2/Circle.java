public class Circle {
    Point centre;
    double radius;

    Circle(Point p, double r) {
        centre = p;
        radius = r;
    }

    Point getCentre(Circle c) {
        return centre;
    }

    void move(Point a) {
        centre = a;
    }

    void enlarge(double r2) {
        radius = r2;
    }

    double getRadius(Circle c) {
        return radius;
    }

    public String toString() {
        return "Centre: " + centre + " Radius:" + radius;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Circle c = new Circle(p, 1.5);
        System.out.println("Radius of Circle : " + c.getRadius(c));
        System.out.println(c.toString());
        p.move(3, 4);
        c.move(p);
        c.enlarge(3.5);
        System.out.println("New circle: " + c);
    }
}

// this keyword in java refers to the current object in a method or a
// constructor it is used to eliminate the confusion between class attributes
// and parameters having same name
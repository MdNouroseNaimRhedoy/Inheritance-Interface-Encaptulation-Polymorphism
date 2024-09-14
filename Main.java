// This is parent class called shape
class Shape {
    protected String name;
    // Constructor
    public Shape(String name) {
        this.name = name;
    }
    // Method to calculate area(override)
    public double calculateArea() {
        return 0;
    }
    // Method to display shape info
    public void displayShapeInfo() {
        System.out.println("This is a " + name);
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize circle with radius
    public Circle(double radius) {
        super("Circle"); // Call parent constructor
        this.radius = radius;
    }

    // Overriding the calculateArea method to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}



// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize rectangle with width and height
    public Rectangle(double width, double height) {
        super("Rectangle"); // Call parent constructor
        this.width = width;
        this.height = height;
    }

    // Overriding the calculateArea method to calculate the area of a rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a circle with radius 5
        Circle circle = new Circle(5);
        circle.displayShapeInfo();
        System.out.println("Area of circle: " + circle.calculateArea());

        // Create a rectangle with width 4 and height 6
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.displayShapeInfo();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

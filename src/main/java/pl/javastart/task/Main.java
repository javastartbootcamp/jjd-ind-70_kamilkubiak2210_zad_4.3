package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(3);
        double squareArea = square.calculateSquareArea();
        System.out.println("squareArea: " + squareArea);

        Circle circle = new Circle(3);
        double circleArea = circle.calculateCircleArea();
        System.out.println("circleArea: " + circleArea);

        Triangle triangle = new Triangle(3, 3, 3);
        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        System.out.println("trianglePerimeter: " + trianglePerimeter);

        Rectangle rectangle = new Rectangle(3, 3);
        double rectPerimeter = rectangle.calculateRectPerimeter();
        System.out.println("rectPerimeter: " + rectPerimeter);
    }
}

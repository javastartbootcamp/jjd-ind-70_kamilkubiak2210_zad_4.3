package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(3);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3, 3, 3);
        Rectangle rectangle = new Rectangle(3, 3);

        double squareArea = shapeCalculator.calculateSquareArea(square);
        System.out.println("squareArea: " + squareArea);
        double circleArea = shapeCalculator.calculateCircleArea(circle);
        System.out.println("circleArea: " + circleArea);
        double trianglePerimeter = shapeCalculator.calculateTrianglePerimeter(triangle);
        System.out.println("trianglePerimeter: " + trianglePerimeter);
        double rectPerimeter = shapeCalculator.calculateRectPerimeter(rectangle);
        System.out.println("rectPerimeter: " + rectPerimeter);
    }
}

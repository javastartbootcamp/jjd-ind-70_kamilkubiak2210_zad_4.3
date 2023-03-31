package pl.javastart.task;

public class ShapeCalculator {
    public double calculateSquareArea(Square square) {
        return square.getA() * square.getA();

    }

    public double calculateCircleArea(Circle circle) {
        return circle.getPi() * circle.getR() * circle.getR();
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return (rectangle.getA()) * 2 + (rectangle.getB() * 2);
    }
}

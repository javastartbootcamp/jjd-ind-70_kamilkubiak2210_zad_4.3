package pl.javastart.task;

public class Rectangle {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double calculateRectPerimeter() {
        return (a * 2) + (b * 2);
    }
}

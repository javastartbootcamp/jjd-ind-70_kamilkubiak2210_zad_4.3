package pl.javastart.task;

public class Triangle {
    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateTrianglePerimeter() {
        return a + b + c;
    }
}

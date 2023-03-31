package pl.javastart.task;

public class Circle {
    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    public double calculateCircleArea() {
        double pi = 3.1415;
        return pi * r * r;
    }
}

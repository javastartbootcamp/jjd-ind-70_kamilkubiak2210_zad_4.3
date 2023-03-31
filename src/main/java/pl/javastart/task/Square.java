package pl.javastart.task;

public class Square {
    private final int a;

    public Square(int a) {
        this.a = a;
    }

    public double calculateSquareArea() {
        return a * a;
    }
}

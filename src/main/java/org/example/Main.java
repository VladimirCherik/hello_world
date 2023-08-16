package org.example;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        new ShapeTest().ShapeTests(circle);
        new ShapeTest().ShapeTests(triangle);
    }
}
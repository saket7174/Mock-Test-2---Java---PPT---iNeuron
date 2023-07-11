package com.assignment;
// 2. Create a superclass called Shape with an abstract method calculateArea() 
// that returns the area of the shape. Implement subclasses Rectangle, Circle,
//  and Triangle that inherit from the Shape class. Implement the calculateArea() method in each subclass 
// to calculate and return the area of a rectangle, circle, and triangle, respectively.
//  Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts
//  an object of type Shape and prints its area. Demonstrate polymorphism by passing instances of different 
// subclasses to the printArea() method
abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area is: " + area);
    }
}

public class Two{
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 10);
        calculator.printArea(rectangle);  // Output: The area is: 50.0

        Circle circle = new Circle(3);
        calculator.printArea(circle);     // Output: The area is: 28.274333882308138

        Triangle triangle = new Triangle(4, 6);
        calculator.printArea(triangle);   // Output: The area is: 12.0
    }
}


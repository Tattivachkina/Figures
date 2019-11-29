package com.company;

public class Circle extends Figure implements Moveable {
    private float radius;

    public Circle(float xx, float yy, float radius) {
        super(xx, yy);
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * this.radius * this.radius);
    }

    @Override
    float getPerimeter() {
        return (float) (2 * Math.PI * this.radius);
    }

    @Override
    public String toString() {
        System.out.println("Circle");
        System.out.println("Center: (" + this.x + ", " + this.y + ")");
        return "Radius: " + this.radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void resize(float koeff) {
        this.radius *= koeff;
    }
}

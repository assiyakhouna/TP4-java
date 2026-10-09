
package com.example.tp;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translation(double a, double b) {
        return new Point(this.x + a, this.y + b);
    }

    public static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    @Override
    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}
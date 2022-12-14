package ru.omsu.lab1.Point3D.MyPoint3D;

import java.util.Objects;

public class Point3D {
    double x, y, z;

    public Point3D() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.getX(), getX()) == 0 && Double.compare(point3D.getY(), getY()) == 0
                && Double.compare(point3D.getZ(), getZ()) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return "{x=" + x +
                "; y=" + y +
                "; z=" + z +
                '}';
    }

    public static double distance(Point3D p1, Point3D p2) {
        double d = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y) + (p2.z - p1.z) * (p2.z - p1.z));
        return d;
    }
}

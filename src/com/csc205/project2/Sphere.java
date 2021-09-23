package com.csc205.project2;
import java.lang.Math;

//Sphere is a subclass of Shape
public class Sphere extends Shape{

    //variable for the Shape class
    private double radius;

    //sets the variable to zero
    public Sphere() {
        super();
        this.radius = 0.0;
    }

    //creating a new variable for radius
    public Sphere(double v) {
        super();
        this.radius = v;
    }

    //setter and getter for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //calculating the surface area of a sphere
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    //calculating the volume of a sphere
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }


    //used a toString method to form a statement about the sphere class
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

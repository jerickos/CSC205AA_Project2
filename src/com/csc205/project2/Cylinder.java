package com.csc205.project2;
import java.lang.Math;

//Cylinder is a subclass of the Shape class
public class Cylinder extends Shape{

    //variables for the Cylinder class
    private double height;
    private double radius;

    //sets the variables to 0.0
    public Cylinder(){
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }
    //creating a new variable for height and radius
    public Cylinder(double h, double r){
        super();
        this.height = h;
        this.radius =r;
    }

    //setters and getters for height and radius
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    //calculating the surface area of a cylinder
    public double surfaceArea() {
        return 2.0 * Math.PI * radius *height + 2.0 * Math.PI * Math.pow(radius, 2.0);
    }
    //calculating the volume of a cylinder
    public double volume() {
        return Math.PI * Math.pow(radius, 2.0) * height;
    }


    //used a toString method to form a statement about the Cylinder class
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

package com.csc205.project2;
import java.lang.Math;

//the Cone class is a subclass of the Shape class
public class Cone extends Shape {

    //variables for the Cone class
    private double height;
    private double radius;

    //sets the variables to 0
    public Cone(){
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    //creating a new variable for height and radius
    public Cone(double a, double b){
        super();
        this.height = a;
        this.radius = b;
    }

    //setters and getters for the variables height and radius
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

    //calculates the surface area for cone
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }
    //calculates the volume for cone
    public double volume() {
        return Math.PI * Math.pow(radius,2) * (height/3);
    }



    //used a toString method to form a statement about the Cone class
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

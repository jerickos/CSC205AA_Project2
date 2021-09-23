package com.csc205.project2;
import java.lang.Math;

//Cube is a subclass of the Shape class
public class Cube extends Shape {

    //variable for the cube class
    private double width;

    //sets the variable to zero
    public Cube(){
        super();
        this.width = 0.0;
    }

    //creating a new variable for width
    public Cube(double c) {
        super();
        this.width = c;
    }

    //setter and getter for width
    public double getWidth(){
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //calculates the surface area of a cube
    public double surfaceArea(){
        return 6.0 * Math.pow(width, 2);
    }
    //calculates the volume of a cube
    public double volume(){
        return Math.pow(width,3);
    }



    //used a toString method to form a statement about the Cube class
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

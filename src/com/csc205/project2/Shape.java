package com.csc205.project2;


/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */


// abstract parent class
// implements the methods from ThreeDimensionalShape interface

public abstract class Shape implements ThreeDimensionalShape {
    public static void main(String[] args) {


        //prints out info about the subclasses
        Sphere sphere = new Sphere(2.0);
        System.out.println(sphere);

        Cube cube = new Cube(5.0);
        System.out.println(cube);

        Cylinder cylinder = new Cylinder(4.0, 1.0);
        System.out.println(cylinder);

        Cone cone = new Cone(5, 3);
        System.out.println(cone);
    }

}

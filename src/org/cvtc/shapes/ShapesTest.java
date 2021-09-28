package org.cvtc.shapes;

import javax.swing.*;


public class ShapesTest {


    public static void main(String[] args) {

        float length = 0.0f;
        float width = 0.0f;
        float height = 0.0f;
        float radius = 0.0f;

        //Values for Cuboid to render
        Cuboid cuboid = new Cuboid(width, height, length);
        if (cuboid.surfaceArea() < 0 || cuboid.volume() < 0) {
            JOptionPane.showMessageDialog(null, "One or more values are below zero.");
        } else {
            cuboid.render();
        }

        //Values for Cylinder to render
        Cylinder cylinder = new Cylinder(radius, height);
        if (cylinder.surfaceArea() < 0 || cylinder.volume() < 0){
            JOptionPane.showMessageDialog(null, "One or more values are below zero.");
        } else {
            cylinder.render();
        }

        //Values for Sphere to render
        Sphere sphere = new Sphere(1);
        if (sphere.surfaceArea() < 0 || sphere.volume() < 0) {
            JOptionPane.showMessageDialog(null, "One or more values are below zero.");
        } else {
            sphere.render();
        }

        //TODO: Create Scanner to allow user input
        //TODO: Add parameters to make sure value is never negative






    }



} //End of Code

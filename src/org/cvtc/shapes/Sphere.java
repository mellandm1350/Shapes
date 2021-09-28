package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shapes{

    private float radius = 0.0f;
    private final float pi = (float) Math.PI;

    //Default Constructor
    public Sphere(){
    }

    //Overload Constructor
    public Sphere(float radius) {
        //set the attributes
        super();
        this.radius = radius;

    }

    //Methods
    public double getRadius() {
        return radius;
    }

    private void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public float surfaceArea() {
        float surfaceArea = 4 * pi * (float)Math.pow(radius, 2);
        return surfaceArea;
    }

    @Override
    public float volume() {
        float volume = 1.333f * pi * (float)Math.pow(radius, 3);
        return volume;
    }

    @Override
    public void render() {

        //Stores values in message
        String message = "\nShape: Sphere";
        message += "\nRadius: " + radius;
        message += "\nSurface Area: " + surfaceArea();
        message += "\nVolume: " + volume();

        //Creates and window for message
        JOptionPane.showMessageDialog(null, message);

    }
}

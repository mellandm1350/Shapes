package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shapes {

    private float radius = 0.0f;
    private float height = 0.0f;

    private final float pi = (float) Math.PI;

    //Default Constructor
    public Cylinder(){
    }

    //Overload Constructor
    public Cylinder(float radius, float height) {
        //set the attributes
        super();
        this.radius = radius;
        this.height = height;

    }

    //Methods
    public float getRadius() {
        return radius;
    }
    private void setRadius(float radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    private void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float surfaceArea() {
        float circumferenceArea = (float) (Math.pow(radius,2) * pi);
        float circumference = 2 * radius * pi;
        float sideArea = (circumference * height);
        return (circumferenceArea * 2) + sideArea;
    }

    @Override
    public float volume() {
        float volume = (float) ((Math.pow(radius,2) * pi) * height);
        return volume;
    }

    @Override
    public void render() {

        //Stores values in message
        String message = "\nShape: Cylinder";
        message += "\nRadius: " + radius;
        message += "\nHeight: " + height;
        message += "\nSurface Area: " + surfaceArea();
        message += "\nVolume: " + volume();

        //Creates and window for message
        JOptionPane.showMessageDialog(null, message);
    }
}

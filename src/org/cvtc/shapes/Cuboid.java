package org.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shapes{

    private float width = 0.0f;
    private float height = 0.0f;
    private float length = 0.0f;



    //Default Constructor
    public Cuboid() {
    }

    //Overload Constructor
    public Cuboid(float width, float height, float length) {
        //set the attributes
        super();
        this.width = width;
        this.height = height;
        this.length = length;
    }

    //Methods
    public double getWidth() {
        return width;
    }
    private void setWidth(float width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    private void setHeight(float height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }
    private void setLength(float length) {
        this.length = length;
    }


    @Override
    public float surfaceArea() {
        float surfaceArea = (2 * (length * width)) + (2 * (height * width)) + (2 * (length * height));
        return surfaceArea;
    }

    @Override
    public float volume() {
        float volume = length * height * width;
        return volume;
    }

    @Override
    public void render() {
        //Stores values in message
        String message = "\nShape: Cuboid";
        message += "\nWidth: " + width;
        message += "\nHeight: " + height;
        message += "\nLength: " + length;
        message += "\nSurface Area: " + surfaceArea();
        message += "\nVolume: " + volume();

        //Creates and window for message
        //TODO: Change showMessageDialog to InputDialog for user input
        JOptionPane.showMessageDialog(null, message);


    }
}

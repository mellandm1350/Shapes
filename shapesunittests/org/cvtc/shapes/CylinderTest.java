package org.cvtc.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    Cylinder cylinder1 = new Cylinder(2, 2);
    Cylinder cylinder2 = new Cylinder(1, 1);
    Cylinder cylinder3 = new Cylinder(5, 5);
    Shapes shapes;

    @Test
    public void Constructor() {
        shapes = new Cylinder(2, 2);

        assertTrue(shapes instanceof Cylinder);
    }

    @Test
    public void getRadius() {
        assertEquals(2, cylinder1.getRadius(), 0.0);
    }

    @Test
    public void getHeight() {
        assertEquals(2, cylinder1.getHeight(), 0.0);
    }

    @Test
    public void surfaceArea() {
        assertEquals(50.27, cylinder1.surfaceArea(), 0.01 );
        assertEquals(12.57, cylinder2.surfaceArea(), 0.01 );
        assertEquals(314.16, cylinder3.surfaceArea(), 0.01);
    }

    @Test
    public void volume() {
        assertEquals(25.13, cylinder1.volume(), 0.01);
        assertEquals(3.14, cylinder2.volume(), 0.01);
        assertEquals(392.7, cylinder3.volume(), 0.01);
    }

}
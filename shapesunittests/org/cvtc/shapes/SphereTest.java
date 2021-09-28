package org.cvtc.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SphereTest {

    Sphere sphere1 = new Sphere(1);
    Sphere sphere2 = new Sphere(2);
    Sphere sphere3 = new Sphere(3);
    Shapes shapes;

    @Test
    public void getRadius() {
        shapes = new Sphere(1);
    }

    @Test
    public void surfaceArea() {
        assertEquals(1, sphere1.getRadius(), 0.0);
    }

    @Test
    public void volume() {
        assertEquals(12.57, sphere1.surfaceArea(), 0.01);
        assertEquals(50.27, sphere2.surfaceArea(), 0.01);
        assertEquals(113.1, sphere3.surfaceArea(), 0.01);
    }

}
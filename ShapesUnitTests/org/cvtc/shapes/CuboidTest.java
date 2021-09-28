package org.cvtc.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuboidTest {

    Cuboid cuboid1 = new Cuboid(2,2,2);
    Cuboid cuboid2 = new Cuboid(1,1,1);
    Cuboid cuboid3 = new Cuboid(5,5,5);
    Shapes shapes;

    @Test
    public void Constructor() {
        shapes = new Cuboid(2, 2, 2);

        assertTrue(shapes instanceof Cuboid);
    }


    @Test
    public void getWidth() {
        assertEquals(2.0, cuboid1.getWidth(), 0.0);
    }

    @Test
    public void getHeight() {
        assertEquals(2.0, cuboid1.getHeight(), 0.0);
    }

    @Test
    public void getLength() {
        assertEquals(2.0, cuboid1.getLength(), 0.0);

    }

    @Test
    public void surfaceArea() {
        assertEquals(24.0, cuboid1.surfaceArea(), 0.01);
        assertEquals(6.0, cuboid2.surfaceArea(), 0.01);
        assertEquals(150.0, cuboid3.surfaceArea(), 0.01);

    }

    @Test
    public void volume() {
        assertEquals(8.0, cuboid1.volume(), 0.01);
        assertEquals(1.0, cuboid2.volume(), 0.01);
        assertEquals(125.0, cuboid3.volume(), 0.01);
    }

}
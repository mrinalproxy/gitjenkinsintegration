package com.example;

import static org.junit.Assert.*;   // For assertEquals etc.
import org.junit.Test;

public class UtilityTest {

    @Test
    public void testAdd() {
        assertEquals(60, UtilityClass.add(50, 10));
    }

    @Test
    public void testSub() {
        assertEquals(40, UtilityClass.sub(50, 10));
    }

    @Test
    public void testMul() {
        assertEquals(500, UtilityClass.mul(50, 10));
    }

    @Test
    public void testDiv() {
        assertEquals(5, UtilityClass.div(50, 10));
    }
}
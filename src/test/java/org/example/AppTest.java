package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.example.App.*;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    public void testFibonacciFor() {
        assertTrue(0 == fibonacciFor(0));
        assertTrue(1 == fibonacciFor(1));
        assertTrue(1 == fibonacciFor(2));
        assertTrue(2 == fibonacciFor(3));
    }

    public void testFibonacciRecursive() {
        assertTrue(0 == fibonacciRecursive(0));
        assertTrue(1 == fibonacciRecursive(1));
        assertTrue(1 == fibonacciRecursive(2));
        assertTrue(2 == fibonacciRecursive(3));
    }


    public void testFibonacciDynamic() {
        assertTrue(0 == fibonacciDynamic(0));
        assertTrue(1 == fibonacciDynamic(1));
        assertTrue(1 == fibonacciDynamic(2));
        assertTrue(2 == fibonacciDynamic(3));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ok
 */
public class ComplexTest {
    
    public ComplexTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of eq method, of class Complex.
     */
    @Ignore
    @Test
    public void testEquals() {
        System.out.println("eq");
        Complex other = null;
        Complex instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Complex.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        Complex instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abs method, of class Complex.
     */
    @Ignore
    @Test
    public void testAbs() {
        System.out.println("abs");
        Complex instance = null;
        double expResult = 0.0;
        double result = instance.abs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of phase method, of class Complex.
     */
    @Ignore
    @Test
    public void testPhase() {
        System.out.println("phase");
        Complex instance = null;
        double expResult = 0.0;
        double result = instance.phase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class Complex.
     */
//    @Ignore
    @Test
    public void testPlus_Complex() {
        System.out.println("plus");
        Complex b = new Complex(1, 2);
        Complex instance = new Complex(3, 4);
        Complex expResult = new Complex(4, 6);
        Complex result = instance.plus(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class Complex.
     */
//    @Ignore
    @Test
    public void testMinus() {
        System.out.println("minus");
        Complex b = new Complex(3, 4);
        Complex instance = new Complex(4, 6);
        Complex expResult = new Complex(1, 2);
        Complex result = instance.minus(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class Complex.
     */
//    @Ignore
    @Test
    public void testTimes_Complex() {
        System.out.println("times");
        Complex b = new Complex(3, 4);
        Complex instance = new Complex(1, 2);
        Complex expResult = new Complex(-5, 10);
        Complex result = instance.times(b);
//        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class Complex.
     */
    @Ignore
    @Test
    public void testTimes_double() {
        System.out.println("times");
        double alpha = 0.0;
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.times(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conjugate method, of class Complex.
     */
    @Ignore
    @Test
    public void testConjugate() {
        System.out.println("conjugate");
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.conjugate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reciprocal method, of class Complex.
     */
    @Ignore
    @Test
    public void testReciprocal() {
        System.out.println("reciprocal");
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.reciprocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of re method, of class Complex.
     */
    @Ignore
    @Test
    public void testRe() {
        System.out.println("re");
        Complex instance = null;
        double expResult = 0.0;
        double result = instance.re();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of im method, of class Complex.
     */
    @Ignore
    @Test
    public void testIm() {
        System.out.println("im");
        Complex instance = null;
        double expResult = 0.0;
        double result = instance.im();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divides method, of class Complex.
     */
    @Ignore
    @Test
    public void testDivides() {
        System.out.println("divides");
        Complex b = null;
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.divides(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exp method, of class Complex.
     */
    @Ignore
    @Test
    public void testExp() {
        System.out.println("exp");
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.exp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sin method, of class Complex.
     */
    @Ignore
    @Test
    public void testSin() {
        System.out.println("sin");
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.sin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class Complex.
     */
    @Ignore
    @Test
    public void testCos() {
        System.out.println("cos");
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.cos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tan method, of class Complex.
     */
    @Ignore
    @Test
    public void testTan() {
        System.out.println("tan");
        Complex instance = null;
        Complex expResult = null;
        Complex result = instance.tan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class Complex.
     */
    @Ignore
    @Test
    public void testPlus_Complex_Complex() {
        System.out.println("plus");
        Complex a = null;
        Complex b = null;
        Complex expResult = null;
        Complex result = Complex.plus(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Complex.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Complex.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

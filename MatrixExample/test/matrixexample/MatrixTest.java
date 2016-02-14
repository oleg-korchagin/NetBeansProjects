/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixexample;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author ok
 */
public class MatrixTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of random method, of class Matrix.
     */
//    @Ignore
//    @Test
//    public void testRandom() {
//        System.out.println("random");
//        int M = 0;
//        int N = 0;
//        Matrix expResult = null;
//        Matrix result = Matrix.random(M, N);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of swap method, of class Matrix.
     */
//    @Ignore
    @Test
    public void testSwap() {
        System.out.println("swap");
        int i = 1;
        int j = 2;
        double[][] d1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] d2 = {{1.0, 2.0, 3.0}, {7.0, 8.0, 9.0}, {4.0, 5.0, 6.0}};
        Matrix instance = new Matrix(d1);
        Matrix expResult = new Matrix(d2);
        instance.swap(i, j);
//        instance.show();
        assertEquals(instance, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of identity method, of class Matrix.
     */
    @Test
    public void testIdentity() {
        System.out.println("identity");
        int N = 3;
        double[][] d = {{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        Matrix expResult = new Matrix(d);
        Matrix result = Matrix.identity(N);
        assertEquals(result, expResult);
    }

    /**
     * Test of eq method, of class Matrix.
     */
    @Test
    public void testEquals() {
        System.out.println("eq");
        double[][] d = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        Matrix B = new Matrix(d);
        Matrix instance = new Matrix(d);
        boolean expResult = true;
        boolean result = instance.equals(B);
        assertEquals(expResult, result);
    }

    /**
     * Test of transpose method, of class Matrix.
     */
    @Test
    public void testTranspose() {
        System.out.println("transpose");
        double[][] d1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] d2 = {{1.0, 4.0, 7.0}, {2.0, 5.0, 8.0}, {3.0, 6.0, 9.0}};
        Matrix instance = new Matrix(d1);
        Matrix expResult = new Matrix(d2);
        Matrix result = instance.transpose();
        assertEquals(result, expResult);
    }

    /**
     * Test of plus method, of class Matrix.
     */
//    @Ignore
    @Test
    public void testPlus() {
        System.out.println("plus");
        double[][] d1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] d2 = {{2.0, 4.0, 7.0}, {2.0, 5.0, 8.0}, {3.0, 6.0, 9.0}};
        double[][] d3 = {{3.0, 6.0, 10.0}, {6.0, 10.0, 14.0}, {10.0, 14.0, 18.0}};
        Matrix B = new Matrix(d1);
        Matrix instance = new Matrix(d2);
        Matrix expResult = new Matrix(d3);
        Matrix result = instance.plus(B);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class Matrix.
     */
//    @Ignore
    @Test
    public void testMinus() {
        System.out.println("minus");
        double[][] d1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] d2 = {{2.0, 4.0, 7.0}, {2.0, 5.0, 8.0}, {3.0, 6.0, 9.0}};
        double[][] d3 = {{3.0, 6.0, 10.0}, {6.0, 10.0, 14.0}, {10.0, 14.0, 18.0}};
        Matrix B = new Matrix(d2);
        Matrix instance = new Matrix(d3);
        Matrix expResult = new Matrix(d1);
        Matrix result = instance.minus(B);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class Matrix.
     */
//    @Ignore
    @Test
    public void testTimes() {
        System.out.println("times");
        double[][] d1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] d2 = {{2.0, 4.0, 7.0}, {2.0, 5.0, 8.0}, {3.0, 6.0, 9.0}};
        double[][] d3 = {{21.0, 42.0, 63.0}, {24.0, 48.0, 72.0}, {27.0, 54.0, 81.0}};
        Matrix B = new Matrix(d1);
        Matrix instance = new Matrix(d2);

        Matrix expResult = new Matrix(d3);
        Matrix result = instance.times(B);
//        result.show();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class Matrix.
     */
//    @Ignore
//    @Test
//    public void testShow() {
//        System.out.println("show");
//        Matrix instance = null;
//        instance.show();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

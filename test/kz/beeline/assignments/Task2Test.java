/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.beeline.assignments;

import kz.beeline.assignments.Task2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASSET
 */
public class Task2Test {
    
    public Task2Test() {
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
     * Test of main method, of class Task2.
     */
    //@Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Task2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SumUp method, of class Task2.
     */
    @Test
    public void testSumUp() {
        System.out.println("SumUp");
        int n = 5798;
        int expResult = 29;
        int result = Task2.SumUp(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test status: successful");
        //fail("The test case is a prototype.");
    }
    
}

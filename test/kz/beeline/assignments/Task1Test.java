/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.beeline.assignments;

import kz.beeline.assignments.Task1;
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
public class Task1Test {
    
    public Task1Test() {
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
     * Test of main method, of class Task1.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        String[] args = null;
        //Task1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addTwoNumbers method, of class Task1.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        String num1 = "789789";
        String num2 = "8948941321321657980";
        String expResult = "8948941321322447769";
        String result = Task1.addTwoNumbers(num1, num2);
        assertEquals(expResult, result);
        
        System.out.println("Test status: successful");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

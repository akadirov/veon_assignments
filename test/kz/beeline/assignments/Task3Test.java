/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.beeline.assignments;

import kz.beeline.assignments.Task3;
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
public class Task3Test {
    
    public Task3Test() {
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
     * Test of main method, of class Task3.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Task3.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initFieldWithDots method, of class Task3.
     */
    @Test
    public void testInitFieldWithDots() {
        System.out.println("initFieldWithDots");
        Task3.initFieldWithDots();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initSample1 method, of class Task3.
     */
    @Test
    public void testInitSample1() {
        System.out.println("initSample1");
        Task3.initSample1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initSample2 method, of class Task3.
     */
    //@Test
    public void testInitSample2() {
        System.out.println("initSample2");
        Task3.initSample2();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initSample3 method, of class Task3.
     */
    //@Test
    public void testInitSample3() {
        System.out.println("initSample3");
        Task3.initSample3();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initSample4 method, of class Task3.
     */
    //@Test
    public void testInitSample4() {
        System.out.println("initSample4");
        Task3.initSample4();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showMatrix method, of class Task3.
     */
    @Test
    public void testShowMatrix() {
        System.out.println("showMatrix");
        Task3.showMatrix();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Scan method, of class Task3.
     */
    @Test
    public void testScan() {
        System.out.println("Scan");
        
        
        String expResult = "NO";
        String result = Task3.Scan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test status: successful");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ScanX method, of class Task3.
     */
    //@Test
    public void testScanX() {
        System.out.println("ScanX");
        int x = 0;
        int y = 0;
        Task3.ScanX(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ScanY method, of class Task3.
     */
    //@Test
    public void testScanY() {
        System.out.println("ScanY");
        int x = 0;
        int y = 0;
        Task3.ScanY(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ScanD method, of class Task3.
     */
    //@Test
    public void testScanD() {
        System.out.println("ScanD");
        int x = 0;
        int y = 0;
        Task3.ScanD(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countSymbols method, of class Task3.
     */
    //@Test
    public void testCountSymbols() {
        System.out.println("countSymbols");
        String item = "";
        Task3.countSymbols(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkYESorNO method, of class Task3.
     */
    //@Test
    public void testCheckYESorNO() {
        System.out.println("checkYESorNO");
        Task3.checkYESorNO();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

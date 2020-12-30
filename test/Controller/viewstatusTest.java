/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class viewstatusTest {
    
    public viewstatusTest() {
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
     * Test of view method, of class viewstatus.
     */
    @Test
    public void testView() {
        System.out.println("view");
        String id = "10";
        viewstatus instance = new viewstatus();
        boolean expResult = false;
        boolean result = instance.view(id);
        assertEquals(expResult, result);
        
    }
    
}

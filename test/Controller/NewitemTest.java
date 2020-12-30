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
public class NewitemTest {
   
    public NewitemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of item method, of class Newitem.
     * @throws java.lang.Exception
     */
    @Test
    public void testItem() throws Exception {
        System.out.println("item");
        String name = "Cheese";
        String price = "20";
        String id = "14";
        Newitem instance = new Newitem();
        boolean expResult = false;
        boolean result = instance.item(name, price, id);
        assertEquals(expResult, result);
        
    }
    
}

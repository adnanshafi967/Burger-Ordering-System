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
public class adminTest {
    
    public adminTest() {
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
     * Test of login method, of class admin.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String email = "adnan@gmail.com";
        String pass = "1234";
        admin instance = new admin();
        boolean expResult = true;
        boolean result = instance.login(email, pass);
        assertEquals(expResult, result);
    }
    
}

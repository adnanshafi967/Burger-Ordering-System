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
public class userTest {
    
    public userTest() {
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
     * Test of signIn method, of class user.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String userID = "18301049";
        String pass = "1234";
        user instance = new user();
        boolean expResult = false;
        boolean result = instance.signIn(userID, pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of signup method, of class user.
     */
    @Test
    public void testSignup() {
        System.out.println("signup");
        String UserId = "1567";
        String fName = "Nahian";
        String lName = "GT";
        String email = "GT@inbox.in";
        String address = "Mohammadpur";
        String pass = "1234";
        String conpass = "1234";
        user instance = new user();
        boolean expResult = false;
        boolean result = instance.signup(UserId, fName, lName, email, address, pass, conpass);
        assertEquals(expResult, result);
    }
    
}

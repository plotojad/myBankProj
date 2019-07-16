/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author plotojad
 */
public class CheckingAccountTest {
    
    public CheckingAccountTest() {
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
     * Test of withdraw method, of class CheckingAccount.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        double amt = 0.0;
        CheckingAccount instance = null;
        boolean expResult = false;
        boolean result = instance.withdraw(amt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOverdraftAmount method, of class CheckingAccount.
     */
    @Test
    public void testGetOverdraftAmount() {
        System.out.println("getOverdraftAmount");
        CheckingAccount instance = null;
        double expResult = 0.0;
        double result = instance.getOverdraftAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

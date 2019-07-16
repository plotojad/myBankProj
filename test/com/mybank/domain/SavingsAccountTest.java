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
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
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
     * Test of addInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testAddInterestRate() {
        System.out.println("addInterestRate");
        SavingsAccount instance = null;
        instance.addInterestRate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        SavingsAccount instance = null;
        double expResult = 0.0;
        double result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

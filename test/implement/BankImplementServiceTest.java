/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entities.Bank;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcela
 */
public class BankImplementServiceTest {
    
    public BankImplementServiceTest() {
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


    @Test
    public void testCreateAccountOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer dni = 4;
        Integer numAccount = 1;
        
        Bank expResult = new Bank(numAccount, currentBalance, dni);
        Bank result = instance.createAccount(currentBalance, dni, numAccount);
        assertEquals(expResult.toString(), result.toString());
        
        if(!expResult.toString().equals(result.toString())){
            fail("The test CreateAccountOK failed.");
        }
    }
    
    @Test
    public void testCreateAccountNotOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer dni = 4;
        Integer numAccount = 1;
        
        Bank expResult = new Bank(numAccount, 1, dni);
        Bank result = instance.createAccount(currentBalance, dni, numAccount);
        
        assertNotEquals(expResult.toString(), result.toString());
        
        if(expResult.toString().equals(result.toString())){
            fail("The test CreateAccountNotOK failed.");
        }
    }



    @Test
    public void testIncomeMoneyOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer money = 100;
        
        Integer expResult = 200;
        Integer result = instance.incomeMoney(currentBalance, money);
        
        assertEquals(expResult, result);
        
        if(!expResult.equals(result)){
            fail("The test IncomeMoneyOK failed.");
        }
        
    }
    
    @Test
    public void testIncomeMoneyNotOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer money = 100;
        
        Integer expResult = 300;
        Integer result = instance.incomeMoney(currentBalance, money);
        
        assertNotEquals(expResult, result);
        
        if(expResult.equals(result)){
            fail("The test IncomeMoneyNotOK failed.");
        }
        
    }


    @Test
    public void testWithdrawMoneyOK() { 
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 200;
        Integer money = 100;
       
        Integer expResult = 100;
        Integer result = instance.withdrawMoney(currentBalance, money);
        assertEquals(expResult, result);
        if(!expResult.equals(result)){
            fail("The test WithdrawMoneyOK failed.");
        }
    }
    
    @Test
    public void testWithdrawMoneyNotOK() { 
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 200;
        Integer money = 100;
       
        Integer expResult = 300;
        Integer result = instance.withdrawMoney(currentBalance, money);
        
        assertNotEquals(expResult, result);
        
        if(expResult.equals(result)){
            fail("The test WithdrawMoneyNotOK failed.");
        }
    }

    @Test
    public void testFastWithdrawMoneyIfOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer money = 20;
        
        Integer expResult = 80;
        Integer result = instance.fastWithdrawMoney(currentBalance, money);
        
        assertEquals(expResult, result);
        
        if(!expResult.equals(result)){
            fail("The test FastWithdrawMoneyIfOK failed.");
        }        
    }
    
    @Test
    public void testFastWithdrawMoneyIfNotOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer money = 20;
        
        Integer expResult = 200;
        Integer result = instance.fastWithdrawMoney(currentBalance, money);
        
        assertNotEquals(expResult, result);
        
        if(expResult.equals(result)){
            fail("The test FastWithdrawMoneyIfNotOK failed.");
        }        
    }
    
    @Test
    public void testFastWithdrawMoneyOK() {
        BankImplementService instance = new BankImplementService();
        
        Integer currentBalance = 100;
        Integer money = 25;
        
        Integer expResult = 100;
        Integer result = instance.fastWithdrawMoney(currentBalance, money);
        
        assertEquals(expResult, result);
        
        if(!expResult.equals(result)){
            fail("The test FastWithdrawMoneyOK failed.");
        }        
    }


    @Test
    public void testShowDataOK() {
        BankImplementService instance = new BankImplementService();
        
        Bank bank = new Bank(100, 4, 1);
        
        String expResult = bank.toString();
        String result = instance.showData(bank);
        
        assertEquals(expResult, result);
        
        if(!expResult.equals(result)){
            fail("The test ShowDataOK failed.");
        }
    }
    
    @Test
    public void testShowDataNotOK() {
        BankImplementService instance = new BankImplementService();
        
        Bank bank = new Bank(100, 4, 1);
        
        String expResult = "Un string genérico";
        String result = instance.showData(bank);
        
        assertNotEquals(expResult, result);
        
        if(expResult.equals(result)){
            fail("The test ShowDataNotOK failed.");
        }
    }
    
}

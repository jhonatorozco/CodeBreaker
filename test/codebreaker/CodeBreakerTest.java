/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codebreaker;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frank.castrillon
 */
public class CodeBreakerTest {
    
    private CodeBreaker codeBreaker;
    
    public CodeBreakerTest() {
        codeBreaker = new CodeBreaker("8931");
    }

    @Test
    public void test_every_number_match() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("8931");
        String number = "XXXX";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_two_number_match_but_not_position() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("9685");
        String number = "--";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_no_one_number_match() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("7520");
        String number = "";
        assertEquals(result, number);
    }
    
    @Test
    public void test_two_number_match() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("8900");
        String number = "XX";
        assertEquals(result, number);
    }
    
    @Test
    public void test_two_number_match_but_only_one_position() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("1037");
        String number = "X-";
        assertEquals(number, result);
    }
    
    @Test
    public void test_three_number_match() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("7931");
        String number = "XXX";
        assertEquals(number, result);
    }
    
    @Test(expected = NumberFormatException.class)
    public void test_number_with_letter() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("793p");
    }
    
    @Test(expected = CodeBreakerException.class)
    public void test_with_plus_symbol() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("+793");
    }
    
    @Test
    public void test_with_zero_at_the_begginig() throws CodeBreakerException {
        String result = codeBreaker.verifyNumber("0793");
        String number = "--";
        assertEquals(number, result);
    }
    

    
    
}

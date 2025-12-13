package com.hit.lab4;

import org.junit.Test;
import static org.junit.Assert.*;

public class L2023111445_10_Test {
    private final Solution10 solution = new Solution10();
    
    @Test

    public void testOppositeFractionsSumToZero() {
        String result = solution.fractionAddition("-1/2+1/2");
        assertEquals("0/1", result);
    }
    
    @Test
    public void testMultipleFractionsAddition() {
        String result = solution.fractionAddition("-1/2+1/2+1/3");
        assertEquals("1/3", result);
    }
    
    @Test
    public void testFractionSubtraction() {
        String result = solution.fractionAddition("1/3-1/2");
        assertEquals("-1/6", result);
    }
    
    @Test
    public void testIntegerAsFraction() {
        String result = solution.fractionAddition("5/1");
        assertEquals("5/1", result);
    }
}
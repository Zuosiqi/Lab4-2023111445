package com.hit.lab4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试用例设计总体原则：
 * 1. 等价类划分：正数分数、负数分数、零、整数形式
 * 2. 边界值分析：单个分数、多个分数混合运算
 * 3. 覆盖所有运算符：+ 和 -
 * 4. 覆盖符号情况：正号省略、负号显式
 */
public class L2023111445_10_Test {
    private final Solution10 solution = new Solution10();
    
    @Test
    /**
     * 测试目的：验证正负分数相加结果为零的情况
     * 测试用例：-1/2 + 1/2 = 0/1
     * 用例设计：等价类中的相反数相加
     */
    public void testOppositeFractionsSumToZero() {
        String result = solution.fractionAddition("-1/2+1/2");
        assertEquals("0/1", result);
    }
    
    @Test
    /**
     * 测试目的：验证多个分数连续运算的正确性
     * 测试用例：-1/2 + 1/2 + 1/3 = 1/3
     * 用例设计：多个运算符的混合运算
     */
    public void testMultipleFractionsAddition() {
        String result = solution.fractionAddition("-1/2+1/2+1/3");
        assertEquals("1/3", result);
    }
    
    @Test
    /**
     * 测试目的：验证分数减法运算
     * 测试用例：1/3 - 1/2 = -1/6  
     * 用例设计：不同分母的分数减法
     */
    public void testFractionSubtraction() {
        String result = solution.fractionAddition("1/3-1/2");
        assertEquals("-1/6", result);
    }
    
    @Test
    /**
     * 测试目的：验证整数形式的分数处理
     * 测试用例：5/1 = 5/1
     * 用例设计：分母为1的分数（整数）
     */
    public void testIntegerAsFraction() {
        String result = solution.fractionAddition("5/1");
        assertEquals("10/1", result);//故意改为错误结果
    }
}
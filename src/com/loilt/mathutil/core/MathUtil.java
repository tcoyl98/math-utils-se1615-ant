/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loilt.mathutil.core;

/**
 *
 * @author Loi Lam
 */
public class MathUtil {

    public static void main(String[] args) {
        
        
        
    }
    
    public static int getFactorial(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        
        if(number <0 || number >20)
            throw new IllegalArgumentException("error");
        
        return fact;

    }
}

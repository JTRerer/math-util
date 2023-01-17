/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author trong
 */
public class MathUtilMain {

    public static void main(String[] args) {

        long result = MathUtil.getFactorial(5); //ham tinh di coi la may

        System.out.println("expected: 5! = 120; actual: " + result);

        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));

        //MathUtil.getFactorial(-5); nem ngoai le that roi
        
        //THEM CODE SAU FIRST COMMIT - CODE LEN SERVER 6:36PM 1/17/2023
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));

        //ky thuat kiem thu phan mem: uoc luong gia tri tra ve cua ham la gi
        //expected value: 5! = 120
        //may/ham ai do viet khi chay thuc te la may - actual, gia su 120
        //if expected == actual, ham ngon trong tinh huong nay
    }
}

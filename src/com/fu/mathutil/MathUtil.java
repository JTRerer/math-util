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
//TA VIET CAI CLASS DE CUNG CAP TIEN ICH CHO NOI KHAC XAI
//KHI TA CUNG CAP TIEN ICH CHO NOI KHAC XAI, DO LA LUC TA KHONG CAN NHO CAI GI
//CHO RIENG TA, HAM STATIC GIUP LAM DIEU NAY
public class MathUtil {

    //n! = 1.2.3.4.5.6....n
    //Quy uoc: 0!= 1!= 1
    //Khong tinh giai thua cho so am
    //20! la vua khop kieu long, kieu long toi da 18 so 0
    //21! la lo kieu long
    //neu dua vao am, 21!, tra ve ngoai le, khong tinh duoc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        //ham dung lien ko can return

        //xuong day la n= 0..20
        if (n == 0 || n == 1) {
            return 1; //dung ngay khi n dac biet
        }
        //xuong den day, n= 2..20
        //choi for hoac de quy - recursion
        //ki thuat nhoi con heo dat, oc bu don thit
        //i=2, i=3, i=4, i=5, i=n nhoi lien tuc i vao tich
        long product = 1; //tich khoi dau = 1 , nhoi 2 3 4 5...n
        for (int i = 2; i <= n; i++) {
            product *= i; //product  = product dang co nhan con i, dap nguoc tro lai
            //product = product *i; //nhoi lien tuc product
            //nhan tu 2 den
        }
        return product;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao so x :");
        int x = sc.nextInt();
        System.out.println("Nhap vao so y :");
        int y = sc.nextInt();
        
        int tong = x+y;
        System.out.println("x +y =" + tong );
        int hieu = x-y;
        System.out.println("x - y = " + hieu );
        int tich = x*y;
        System.out.println("x * y =" + tich );
        float thuong = (float)x/y ;
        System.out.println("x /y =" + thuong );
    }

    
}

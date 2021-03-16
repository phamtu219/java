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
public class bai6 {
        public  static Scanner Scanner = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Nhap n :");
        int n = Scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon n la : ");
        if(n>=2){
            System.out.print(2);
        }for(int i=3 ;i<n ; i+=2){
            if(check(i)){
                System.out.print(" " +i);
            }
        }
    }
    public static boolean check(int n){
        if(n<2) return false;
        int snt = (int) Math.sqrt(n);
        for(int i=2; i<= snt ;i++){
            if(n%i==0)
                return false;
        }return true;
    }
    
}

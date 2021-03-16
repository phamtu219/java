/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class bai5 {
    public  static Scanner Scanner = new Scanner(System.in);
    
    public static void main (String[] args){
        System.out.println("Nhap vao x :");
        int x = Scanner.nextInt();
        System.out.println("Nhap vao y :");
        int y = Scanner.nextInt();
        System.out.println("UCLN = " +UCLN(x,y));
        System.out.println("BCNN = " +BCNN(x,y));
    }
    public static int UCLN(int x , int y){
        if(y==0) return x;
        return UCLN(y,x%y);
    }
    public static int BCNN(int x , int y){
        return (x*y)/UCLN(x,y);
    }
    
}

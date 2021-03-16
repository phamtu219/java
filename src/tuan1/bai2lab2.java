/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai2lab2 {
    public static void NhapMang(int[]a,int n){
        Random rand = new Random();
        for(int i=0;i<n;i++)
            a[i]=rand.nextInt(50); 
    }
    public static void XuatMang(int[]a,int n){ for(int i=0;i<n;i++)
        System.out.print("\t"+a[i]); 
    }
    public static boolean check(int n){
        if(n<=1)
            return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true; 
    }
    public static void main(String [] args)
    { Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số phần tử:");
    int n=scanner.nextInt();
    int[]a=new int[n];
    NhapMang(a,n);
    System.out.print("Mảng:");
    XuatMang(a,n);
    System.out.print("Cac so nguyen to la: ");
    for (int i=0;i<n;i++)
    { if (check(a[i]) )
        System.out.print(a[i] + " ");
    } 
    }
    
}

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
public class bai3lab2 {
    public static void NhapMaTran(int b[][],int d,int c){ 
        Random rand=new Random();
        for(int i=0;i<d;i++)
            for(int j=0;j<c;j++)
                b[i][j]=rand.nextInt(50); } 
    public static void XuatMaTran(int b[][],int d,int c){
        for(int i=0;i<d;i++){ 
            System.out.println(); for(int j=0;j<c;j++)
            System.out.print("\t"+b[i][j]+"\t"); }
    } 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n Nhập số dòng, số cột:");
        int d =scanner.nextInt();
        int c= scanner.nextInt();
        int b[][]=new int[d][c];
        NhapMaTran(b,d,c);
        System.out.print("Ma Trận:");
        XuatMaTran(b,d,c); }
    
}

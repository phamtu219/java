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
public class bai1lab2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        System.out.print("Nhập hệ số bậc 2:");
        float a =bai1lab2.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1:");
        float b =bai1lab2.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 0:");
        float c =bai1lab2.scanner.nextFloat();
        bai1lab2.giai(a,b,c); 
    }
    public static void giai(float a, float b, float c){
        if(a==0){ if(b==0){
            System.out.println("Phương trình vô nghiệm"); 
        }
        else{ 
            System.out.println("Phương trình có một nghiệm:"+"x = "+(-c/b));
        } 
        return; 
        } 
        float delta=b*b-4*a*c; float x1; float x2; if(delta>0){
            x1=(float)((-b+Math.sqrt(delta))/(2*a));
            x2=(float)((-b-Math.sqrt(delta))/(2*a));
            System.out.println("Phương trình có hai nghiệm:"+"x1 = "+x1 +"và x2 ="+x2); 
        }
        else if(delta ==0){ x1=(-b/(2*a));
        System.out.println("Phương trình có nghiệm kép:"+"x1 = x2 = "+x1); 
        }else{
            System.out.println("Phương trình vô nghiệm"); 
        } 
    } 
}
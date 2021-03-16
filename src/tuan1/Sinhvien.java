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
public class Sinhvien {

    public Sinhvien() {
    }

    public Sinhvien(String masv, String hoten, String tuoi, String namsinh, Float DTB) {
        this.masv = masv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.namsinh = namsinh;
        this.DTB = DTB;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public Float getDTB() {
        return DTB;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public void setDTB(Float DTB) {
        this.DTB = DTB;
    }
    private String masv , hoten , tuoi ,namsinh ;
    private Float DTB;
    
    public String toString(){
        return masv  + hoten  + tuoi + namsinh + DTB  ;
    }
    
    public void inSV(){
        System.out.printf("%6s %10s %6.5s %7s %14f \n " ,masv , hoten , tuoi, namsinh , DTB );
    }
    
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien :");
        sv1.setMasv(sc.nextLine());
        System.out.println("Nhap ho ten : ");
        sv1.setHoten(sc.nextLine());
        System.out.println("Nhap tuoi : ");
        sv1.setTuoi(sc.nextLine());
        System.out.println("Nhap nam sinh");
        sv1.setNamsinh(sc.nextLine());
        System.out.println("Nhap diem TB");
        sv1.setDTB(sc.nextFloat());
        
       
        System.out.printf("%6s %6s %6s %6s %10s \n " ," Ma Sinh vien"," Ho ten " , "Tuoi " , " Nam sinh" ," diem TB");
        sv1.inSV();
        
    }   

}

  


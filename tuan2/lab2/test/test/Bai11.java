package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class Bai11 {
    
    public Bai11() throws FileNotFoundException, IOException {
    
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        try(
            //tao moi 1 file abc.txt de ghi du lieu (output)
            FileOutputStream os = new FileOutputStream("data.txt")){
            //file duoc tao luu cung vi tri file chuong trinh
            Random rd = new Random();
            int n = rd.nextInt(50);
            float[] a = new float[n];
            random(a,rd);
            for (int i=0;i<a.length;i++){
                String s = a[1]+" ";
                for(int j=0;j<s.length();j++)
                    os.write(s.charAt(j));
            }

        }
        try ( // mo 1 file abc.txt de doc vao chuong trinh (input)
                FileInputStream is = new FileInputStream("data.txt")){
                int ibyts = is.available();
                byte ibuf[]=new byte[ibyts];
                int byrd = is.read(ibuf,0,ibyts);
                //tinh tong 
                StringTokenizer strToken= new StringTokenizer(new String(ibuf)," ,\t,\r");
                float Tong=0,TBC=0;
                int d=0;
                while(strToken.hasMoreTokens()){
//                    System.out.println(strToken.nextToken());
                    String c = strToken.nextToken();
                    float i = Float.parseFloat(c);
                    Tong += i;
                    d++;
                }
                TBC=Tong/d;
                System.out.println("Gia tri tong: "+Tong);
                System.out.println("Trung binh cong: "+TBC);
        }
        //xoa file neu co
//        File fl = new File("data.txt");
//        fl.delete();
    }
    static void random(float a[], Random rd){
        for (int i=0;i<a.length;i++)
            a[i] = rd.nextFloat();
 
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

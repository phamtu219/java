/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import com.sun.corba.se.impl.logging.POASystemException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 *
 * @author ADM
 */
public class BT8 {
    public static void main(String args[]) throws IOException {
        StringWriter ost = new StringWriter();
        String s = "Xin chao day la chuong trinh doc xuat chuoi";
        for (int i = 0; i < s.length(); i++) {
            ost.write(s.charAt(i));
        }
        System.out.println("Xuất chuỗi: " + ost);
        StringReader inst;
        inst = new StringReader(ost.toString());
        int a = 0;
        @SuppressWarnings("StringBufferMayBeStringBuiler")
        StringBuffer sb1 = new StringBuffer("");
        while ((a = inst.read()) != -1)
            sb1.append((char)a);
        s = sb1.toString();
        System.out.println("Chiều dài chuỗi đọc được: " + s.length());
        System.out.println("Đây là chuỗi đọc được: " + s);
    }
}

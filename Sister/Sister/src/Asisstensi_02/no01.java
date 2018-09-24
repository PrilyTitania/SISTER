/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asisstensi_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//membaca
import java.io.InputStream;
//menulis
import java.io.OutputStream;
/**
 *
 * @author TITANIA
 */
public class no01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inputloc= "D:/coba.txt";
        String outputloc="D:/coba1.txt";
        //membuat file input baru
        InputStream fileInput= new FileInputStream(inputloc);
        //menampilkan file baru yang telah di buat di input
        OutputStream fileOutput= new FileOutputStream(outputloc);
        //mengolah data input
        int data= fileInput.read();
        String word ="";
        
        //tidak kosong
        while (data !=-1) {            
            char z=(char) data;
            System.out.print(z);
            data=fileInput.read();
            //menambah hingga z
            word+=(z);
        }
        
        //looping pembacaan huruf
        for (int i = 0; i < word.length(); i++) {
            fileOutput.write((byte)word.charAt(i));
        }
        
        fileInput.close();
        fileOutput.close();
    }
}

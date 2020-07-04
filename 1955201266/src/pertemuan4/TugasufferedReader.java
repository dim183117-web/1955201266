/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Toshiba
 */

//tema
//pekerjaan
public class TugasufferedReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int kodePOS, istirahat;
        double Gaji;
        String nama, pekerjaan, alamat, bagian;
      
        
        // object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        //object bufferedReaser
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan bufferedReader
        System.out.println("siapa nama anda");
        nama = br.readLine();
        
        System.out.println("anda kerja apa");
        pekerjaan = br.readLine();
        
        System.out.println("alamat pekerjaan anda dimana");
        alamat = br.readLine();
        
        System.out.println("kode pos alamat pekerjaan anda ");
        kodePOS = Integer.parseInt(br.readLine());
        
        System.out.println("kerjanya bagian apa disana");
        bagian = br.readLine();
        
        System.out.println("berapa Gaji anda");
        Gaji = Double.parseDouble(br.readLine());
        
        System.out.println("istirahat anda berapa jam");
        istirahat = Integer.parseInt(br.readLine());
        
        // menampilkan nama
        System.out.println("nama anda adalah  " + nama);
        System.out.println("kerja anda adalah  " + pekerjaan);
        System.out.println("alamat pekerjaan anda ada di  " + alamat);
        System.out.println("kodePOS alamat kerja anda adalah  " + kodePOS);
        System.out.println("saya kerja bagian  " + bagian);
        System.out.println("Gaji anda adalah " + Gaji + " juta");
        System.out.println("istirahat anda adalah  " + istirahat);
        
        
        
        
    }

        
    
}

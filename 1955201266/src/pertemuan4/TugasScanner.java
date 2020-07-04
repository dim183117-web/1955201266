/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */

//tema
//perkuliahan
class TugasScanner {
    public static void main(String[] args) throws IOException {
        //variabel
        String nama, kuliah, fakultas;
        int NIM, SKS;
        double UKT;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //input
        System.out.println("siapa nama anda");
        Scanner inputUser = new Scanner(System.in);
        nama = br.readLine();
        
        System.out.println("dimana kuliah anda");
        Scanner User = new Scanner (System.in);
        kuliah = br.readLine();
        
        System.out.println("anda mengambil fakultas apa");
        inputUser = new Scanner (System.in);
        fakultas = br.readLine();
        
        System.out.println("berapa SKS diperkuliahan anda");
        inputUser = new Scanner (System.in);
        SKS = Integer.parseInt(br.readLine());
        
        System.out.println("berapa NIM anda");
        inputUser = new Scanner (System.in);
        NIM = Integer.parseInt(br.readLine());
        
        System.out.println("berapa UKT anda persemester");
        inputUser = new Scanner (System.in);
        UKT = Double.parseDouble(br.readLine());
        
        //output
        System.out.println("nama anda adalah  " + nama);
        System.out.println("anda kuliah di  " + kuliah);
        System.out.println("fakultas anda adalah  " +fakultas);
        System.out.println("jumlah SKS adalah  " + SKS);
        System.out.println("NIM anda adalah  " + NIM);
        System.out.println("ukt anda persemester adalah  " + UKT + " per rrsemester");
                }
 
}

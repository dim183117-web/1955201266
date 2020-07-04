/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1955201266;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Uts1955201266 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Beli buku");
        System.out.println("baca buku");
        System.out.println("Apakan ingin membeli buku (true/false) ");
        Scanner s = new Scanner(System.in);
        boolean kerudung = s.nextBoolean(); 
        if (kerudung == true){
            System.out.println("pilih buku");
            System.out.println("beli buku");
            
        }
        System.out.println("bayar");
        System.out.println("Selesai");    
        
        
        // BAGIAN PERULANGAN
        for(int i=0; i <= 10; i++){
          
            
        // BAGIAN INPUTOUTPUT
    System.out.println("beli buku");
    Scanner br = new Scanner(System.in);
            String belibuku = br.nextLine();
    }
    
}
}
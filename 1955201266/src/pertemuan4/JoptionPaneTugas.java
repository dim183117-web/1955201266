/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */

//tema
//pemesanan kaos
public class JoptionPaneTugas {
    public static void main(String[] args) {
          
        String nama = JOptionPane.showInputDialog("dengan atas nama siapa?");
        System.out.println("nama : " + nama);
        
        String kaos = JOptionPane.showInputDialog("pesan kaos apa?");
        System.out.println("pesan kaos : " + kaos);
        
        String ukuran = JOptionPane.showInputDialog("apa ukuran kaos yang anda pesan?");
        System.out.println("ukuran kaos yang anda pesan : " + ukuran);
        
        String jumlah = JOptionPane.showInputDialog("berapa jumlah kaos yang anda pesan ?");
        System.out.println("jumlah kaos yang anda pesan : " + jumlah);
        
        String alamat = JOptionPane.showInputDialog("masukan alamat anda untuk pengiriman?");
        System.out.println("pesanan akan dikirim ke alamat : " + alamat );
     
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      huruf besar kecil
 */
public class IF110119026Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan kalimat: ");
        kalimat = scan.next();
        
        System.out.println("===Hasil Formating===");
        System.out.println("Huruf Besar: ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil: ".concat(kalimat.toLowerCase()));
        
        System.out.println("Developed by : Muhammad Khatami");
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18111167_irvan_maulana_tugassesi03_Galon;
import java.util.Scanner;
/**
 *
 * @author Seishuu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double galon;
        double liter;
        
        Scanner jumlah = new Scanner(System.in);
        
        System.out.println(" Program Konversi Galon Ke Liter ");
        System.out.printf(" Masukkan Jumlah Galon = ");
        galon = jumlah.nextDouble();
        liter = galon*19.7854118;
        //isi
        System.out.println(" Nilai dalam Liter = " + liter);
        
    }
    
}

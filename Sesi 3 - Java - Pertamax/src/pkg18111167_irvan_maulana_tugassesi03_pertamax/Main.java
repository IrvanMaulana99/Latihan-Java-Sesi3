/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18111167_irvan_maulana_tugassesi03_pertamax;
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
        double pertamax;
        double liter;
        
        Scanner jumlah = new Scanner(System.in);
        //tampilan
        System.out.println(" Konversi BBM ");
        System.out.printf(" masukkan jumlah rupiah = ");
        pertamax = jumlah.nextDouble();
        
        liter = pertamax/10400;
        //keluaran
        System.out.println("Nilai dalam liter = " + liter);
    }
    
}

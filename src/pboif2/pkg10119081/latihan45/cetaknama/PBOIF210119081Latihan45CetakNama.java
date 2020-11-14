/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Program ini berisi program untuk menampilkan cetak nama
 */
public class PBOIF210119081Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.println("===Aplikasi Pencetak Nama");
        System.out.println("Masukkan nama anda : ");
        printer.setNama(keyboard.nextLine());
        System.out.print("Mau Cetak Nama Berapa Kali? : ");
        printer.setJmlCetak(keyboard.nextInt());
        
        printer.cetak(printer.getNama());
        
        printer.cetak(printer.getJmlCetak(), printer.getNama());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi7Driver;

import java.util.Scanner;

/**
 *
 * @author XCZ
 */
public class PomBonsen {
public static void main(String[] args){
  Scanner in =new Scanner (System.in);
        // TODO code application logic here
        int pilihan; 
        double liter,harga,diskon;
        for(String Ulang="Y"; Ulang.equalsIgnoreCase("Y");){
        System.out.println("Selamat Datang di POM SANTUY");
        System.out.println("Silahkan Gas Mana Yang Diinginkan (1-3)");
        System.out.println("1. BENSIN PREMIUM      = Rp. 1100/L");
        System.out.println("2. BENSIN PERTAMAX     = Rp. 1600/L");
        System.out.println("3. BENSIN SOLAR        = Rp. 2000/L");
        System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\//\\//");
        System.out.print("Mau Yang Mana (1-3): ");
        pilihan = in.nextInt();
        System.out.println("|||||||||||||||||||||||||||||||||||||||");
        switch (pilihan){
            case 1: System.out.println("Terima Kasih Telah Memilih PREMIUM");
                    System.out.print("Ingin Mengisi Berapa Ribu ? ");
                    harga = in.nextDouble();
                    System.out.println("----------------------------");
                    liter = harga/1100;
                    if (harga > 11000){
                      diskon = harga*2/100;
                      harga = harga-diskon;
                      System.out.println("Pembelian anda > 21000, Anda mendapat SUBSIDI  5% = Rp. "+diskon);
                    }
                    System.out.println("Jumlah Gas yang didapat = "+String.format("%.3f,",liter)+" Liter");
                    System.out.println("Total Pembayaran Adalah "+harga+" untuk "+String.format("%.3f,",liter)+" Liter PREMIUM");
                    break;
            case 2: System.out.println("Terima Kasih Telah Memilih PERTAMAX");
                    System.out.print("Ingin Mengisi Berapa Ribu ? ");
                    harga = in.nextDouble();
                    System.out.println("----------------------------");
                    liter = harga/1600;
                    if (harga > 13000){
                      diskon = harga*2/100;
                      harga = harga-diskon;
                      System.out.println("Pembelian anda > 23000, Anda mendapat SUBSIDI  5% = Rp. "+diskon);
                    }
                    System.out.println("Jumlah Gas yang didapat = "+String.format("%.3f,",liter)+" Liter");
                    System.out.println("Total Pembayaran Adalah "+harga+" untuk "+String.format("%.3f,",liter)+" Liter PERTAMAX");
                    break;
            case 3: System.out.println("Terima Kasih Telah Memilih SOLAR");
                    System.out.print("Ingin Mengisi Berapa Ribu ? ");
                    harga = in.nextDouble();
                    System.out.println("----------------------------");
                    liter = harga/2000;
                    if (harga > 15000){
                      diskon = harga*2/100;
                      harga = harga-diskon;
                      System.out.println("Pembelian anda > 25000, Anda mendapat SUBSIDI  5% = Rp. "+diskon);
                    }
                    System.out.println("Jumlah Gas yang didapat = "+String.format("%.3f,",liter)+" Liter");
                    System.out.println("Total Pembayaran Adalah "+harga+" untuk "+String.format("%.3f,",liter)+" Liter SOLAR");        
                   break;
             }
        System.out.println("Apakah Anda Ingin Mengisi Kembali ? (Y/N)");
        Ulang=in.next();
        }
    }
}

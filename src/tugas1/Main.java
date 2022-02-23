/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */

import java.util.Scanner; //untuk menghubungkan dengan scanner input
import tugas1.Konversi; //untuk menghubungkan dengan class konversi

public class Main {
    public static void main(String[] args) {
      
      boolean menu = false;
      int suhu, pilih;
      Scanner input = new Scanner(System.in);
      System.out.println("+-------------------------+");
      System.out.println("|PROGRAM KONVERSI SUHU AIR|");
      System.out.println("+-------------------------+");
      System.out.println("Input Data");
      System.out.println("----------");
      System.out.print("Suhu Dalam Celcius    : ");
      suhu = input.nextInt();
      Konversi data = new Konversi(suhu); //instansiasi objek
      do{
      System.out.println("\nOpsi");
      System.out.println("----");
      System.out.println("1. Lihat Data Konversi");
      System.out.println("2. Edit Data Konversi");
      System.out.println("3. Exit");
      System.out.print("Pilih : ");
      pilih = input.nextInt();
      if(pilih==1){
          data.lihat();
      }
      else if(pilih==2){
          System.out.print("\nSuhu Dalam Celcius  : ");
          data.suhu = input.nextInt();
      }
      else if(pilih==3){
          System.exit(0);
      }
      else{
          System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
          menu = true;
      }
      }while(menu=true);
    }
}

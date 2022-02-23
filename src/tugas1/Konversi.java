/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */
public class Konversi {
        int suhu;
        
        public Konversi(int suhu){ //constructor
            this.suhu = suhu;   
        }
        
        void lihat() //menampilkan data hasil konversi
        {
         System.out.println("\nSuhu Dalam Celcius    : " + suhu +"°C");   
         System.out.println("Dalam Fahrenheit      : " + fahrenheit() +"°F");
         System.out.println("Dalam Reamur          : " + reamur() +"°R");
         System.out.println("Dalam Kelvin          : " + kelvin() +"°K");
         
         if(suhu<=0) //conditional statement
             System.out.println("Kondisi Air Beku");
         else if(suhu>0 && suhu<100)
             System.out.println("Kondisi Air Normal");
         if(suhu>=100)
             System.out.println("Kondisi Air Mendidih");
        }
        
        double fahrenheit() //method perhitungan konversi
        {
            return (9 * suhu)/5 + 32;
        }
        
        double reamur()
        {
            return (4 * suhu)/5;
        }
        
        double kelvin()
        {
            return suhu + 273.15;
        }
        
        
    }

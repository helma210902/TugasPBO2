/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pbo.pkg2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil, loop=0;
        double pjg,lbr,tggi,jari_jari;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");

            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print(" Pilih = "); pil=input.nextInt();

            if(pil== 1) {
                System.out.print("Input Panjang = ");pjg=input.nextDouble();
                System.out.print("Input Lebar = ");lbr=input.nextDouble();
                System.out.print("Iput tinggi = ");tggi=input.nextDouble();
                Balok balok=new Balok( tggi,  pjg,  lbr);

                System.out.println("Luas Persegi Panjang = " + balok.luas());
                System.out.println("Keliling-keliling Panjang = " + balok.keliling());
                System.out.println("Volume Balok = " + balok.volume());
                System.out.println("Luas Permukaan Balok = " + balok.luaspermukaan());

                
                System.out.print("Ulangi? (Ya : 1 || Tidak : 0) : ");
                loop=input.nextInt();
            }
            else if (pil== 2) {
                System.out.println("Input jari-jari = "); jari_jari=input.nextDouble();
                System.out.println("Input Tinggi = "); tggi=input.nextDouble();
                Tabung tabung=new Tabung( tggi,  jari_jari);

                System.out.println("Luas Lingkaran = " + tabung.luas());
                System.out.println("Keliling Lingkaran = " + tabung.keliling());
                System.out.println("Volume Tabung = " + tabung.volume());
                System.out.println("Luas Permukaan = " + tabung.luaspermukaan());
                
                System.out.print("Ulangi? (Ya : 1 || Tidak : 0 ) : ");
                loop=input.nextInt();

            }
                    
            
        }while (loop!=0 && pil!=0 );
    }
    
}

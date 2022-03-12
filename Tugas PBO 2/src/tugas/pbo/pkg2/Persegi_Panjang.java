/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pbo.pkg2;

/**
 *
 * @author LENOVO
 */
public class Persegi_Panjang implements MenghitungBidang {
double panjang,lebar;

    public Persegi_Panjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling() { 
        return 2*(panjang + lebar);
        
    }

    @Override
    public double luas() {
        return panjang * lebar ;
  
        
    }
    public double luas (double x, double y) {
        return x * y;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
}

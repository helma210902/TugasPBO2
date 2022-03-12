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
public class Balok extends Persegi_Panjang implements MenghitungRuang {

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
double tinggi;

    @Override
    public double volume() {
        return super.luas()* tinggi;
    }

    @Override
    public double luaspermukaan() {
        return 2 * (super.luas() + super.luas(super.getPanjang(), tinggi) + super.luas(super.getLebar(), tinggi));
        
    }
    
    
}

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
public class Lingkaran implements MenghitungBidang {

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    double jarijari, phi=3.14;

    @Override
    public double keliling() {
        return 2 * phi * jarijari;
       
    }

    @Override
    public double luas() {
        return phi * jarijari * jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    public double getPhi() {
        return phi;
    }
    
}

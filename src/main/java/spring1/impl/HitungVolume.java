/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1.impl;

import spring1.service.HitungService;
import spring1.service.HitungVol;

/**
 *
 * @author iqbal
 */

public  class HitungVolume implements HitungVol {
      private HitungService lingkaran;

    @Override
    public double hitungLuas(int lebar, int tinggi) {
        return lingkaran.hitungLuas(lebar)*tinggi;
    }
    public void setLingkaran(HitungService lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void okey(){
        int i=5;
          double luas = i*1000000000;
          System.out.println("Luasnya adalah"+luas);
    }
}
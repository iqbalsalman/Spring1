/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1.impl;

import spring1.service.HitungVol;
import spring1.service.HitungVolumeService;

/**
 *
 * @author iqbal
 */
public  class HitungVolume implements HitungVol {
    
private HitungVolumeService lingkaran;

    @Override
    public double hitungLuas(double lebar, double tinggi) {
        return lingkaran.hitungLuas(lebar)*tinggi;
    }
    public void setLingkaran(HitungVolumeService lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void oke(){
        System.out.println("Saya oke");
    }
        
}

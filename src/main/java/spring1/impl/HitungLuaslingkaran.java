/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1.impl;

import spring1.service.HitungService;

/**
 *
 * @author iqbal
 */
public class HitungLuaslingkaran implements HitungService {

    public double hitungLuas(int parm) {
       return Math.PI*parm*parm;
    }
    
}

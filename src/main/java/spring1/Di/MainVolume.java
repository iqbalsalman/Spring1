/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1.Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.notasi.Notasi;
import spring1.impl.HitungVolume;
import spring1.service.HitungVol;

/**
 *
 * @author iqbal
 */
public class MainVolume {
    public static void main(String[] args) {
      ApplicationContext context = 
         new AnnotationConfigApplicationContext(Notasi.class);
       	HitungVolume te = (HitungVolume)context.getBean("hitungvolume");
        te.oke();
//       System.out.println(te.hitungLuas(10, 45));
    }
}

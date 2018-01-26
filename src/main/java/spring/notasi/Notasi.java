/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.notasi;

import org.springframework.context.annotation.*;
import spring1.impl.HitungVolume;


/**
 *
 * @author iqbal
 */
@Configuration
public class Notasi {
   @Bean 
   public HitungVolume hitungvolume(){
      return new HitungVolume();
   }
   
}

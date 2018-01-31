/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1.Di;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring1.service.HitungVol;

/**
 *
 * @author iqbal
 */
public class MainVolume {
    public static void main(String[] args) {
//       ApplicationContext ctx = 
//         new AnnotationConfigApplicationContext(Notasi.class);
//
//      HitungVol te = ctx.getBean(HitungVol.class);
//        System.out.println(te.hitungLuas(10, 45));
        
//        te.okey();
   XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("appconfig2.xml"));
        HitungVol d1 = (HitungVol)factory.getBean("hitungVol");
        System.out.println(d1.hitungLuas(10, 100));
   } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1.Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring1.impl.HitungLuaspersegi;

/**
 *
 * @author iqbal
 */
public class Main {
    
    public static void main(String[] args) {
//      ApplicationContext context =
//    	  new AnnotationConfigApplicationContext(HitungLuaspersegi.class);
//
//    	HitungLuaspersegi cust = (HitungLuaspersegi)context.getBean(HitungLuaspersegi.class);
//    	System.out.println(cust.hitungLuas(100));

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HitungLuaspersegi cust = (HitungLuaspersegi) context.getBean("lingkaran");
        System.out.println(cust.hitungLuas(100));
        
    }
}

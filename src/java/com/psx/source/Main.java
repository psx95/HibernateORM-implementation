/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psx.source;

import helper.HibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.psx.source.SurveyInfo;

/**
 *
 * @author Pranav
 */
public class Main {
    
    public static void main (String Args[]){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try {
            transaction = session.beginTransaction();
//            Student student = new Student();
//            student.setAddress("ABC");
//            student.setName("NAME 1");
//            session.save(student);
 SimpleDateFormat dateformat2 = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            try{
                date = dateformat2.parse("01/09/1995");
            } catch (ParseException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }           
            Person person = new Person ();           
            person.setBirthdate("01/09/1995");
            person.setCountry("India");
            person.setEmail("pranav.ps95@hotmail.com");
            person.setName("pranav");
            person.setPhonenumber(8376003776l);
            person.setTitle("PSX");
            SurveyInfo info = new SurveyInfo();
                        info.addQuestionAndAnswer("age", "22");
                        info.addQuestionAndAnswer("married", "Yes");
                        info.addQuestionAndAnswer("citizenship", "Norwegian");
            
            transaction.commit();
            System.out.println ("\n Successfully submitted");
        }
        catch (HibernateException exception){
            System.err.print(exception.getMessage());
            exception.printStackTrace();
        }
    }
}

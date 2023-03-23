package com.anudip.OnetoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Subject s=new Subject();
    	s.setCid(01);
    	s.setSubjectname("Java Programming");
    	
    	Subject s2=new Subject();
    	s2.setCid(02);
    	s2.setSubjectname("Python Programming");
    	
    	Subject s3=new Subject();
    	s3.setCid(03);
    	s3.setSubjectname("Angular Programming");
    	
    	Teacher teacher=new Teacher();
    	teacher.setId(101);
    	teacher.setName("Mrunali");
    	teacher.getList1().add(s);
    	teacher.getList1().add(s2);
    	teacher.getList1().add(s3);
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class).addAnnotatedClass(Subject.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session ss=sf.openSession();
    	Transaction t=ss.beginTransaction();
    	ss.save(s);
    	ss.save(s2);
    	ss.save(s3);
    	ss.save(teacher);
    	ss.getTransaction().commit();
        System.out.println( "Hello World!" );
    }
}
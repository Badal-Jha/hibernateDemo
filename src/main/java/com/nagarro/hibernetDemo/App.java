package com.nagarro.hibernetDemo;
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
        StudentName sn=new StudentName();
        sn.setFname("Badal");
        sn.setLname("jha");
        sn.setMname("kumar");
    	
        Student st=new Student(103,sn,"delhi");
        
    	Configuration cfg= new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory);
    	
    	//Student st=new Student(105,"bikal","mumbai");
    	
    	Session session=factory.openSession();
    	
    	//session.beginTransaction();
    	Transaction tx=session.beginTransaction();
    	
    	
    	//to save data
    	session.save(st);
    	
    	//to get data
    	
//    	Student st=(Student)session.get(Student.class, 105);
//    	
//    	System.out.println(st.getId()+" "+st.getName());
    //	session.getTransaction().commit();
    	tx.commit();
    	
    	session.close();
    	
    }
}

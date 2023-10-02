package com.nagarro.hibernetDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StudentName sn = new StudentName();
		sn.setFname("amit");
		sn.setLname("jain");

		Student st = new Student(109, sn, "delhi");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory);

		// Student st=new Student(105,"bikal","mumbai");

		Session session = factory.openSession();

		// session.beginTransaction();
		Transaction tx = session.beginTransaction();

//		Laptop laptop = new Laptop("lenovo", 123);
//
//		st.setLaptop(laptop);
//
//		laptop.setStudent(st);
//
//		Sim sim1 = new Sim();
//		sim1.setSim("voda");
//		sim1.setStudent(st);
//		Sim sim2 = new Sim();
//		sim2.setSim("voda");
//		sim2.setStudent(st);
////
//		List<Sim> simList = List.of(sim1, sim2);
//
//		st.setSim(simList);

		// we can mannually save aslo laptop but we are using cascade property
		//
		// to save data
		// session.save(st); //save data to the session

		// to get data

		Student st1 = (Student) session.get(Student.class, 103);

		System.out.println(st1.getName());
		st1.setCity("mumba");
		st1.setCity("mumbaiya");
		Student st2 = (Student) session.get(Student.class, 103);
		System.out.println(st1.getCity());
		// System.out.println(st1.getSim());
		// session.getTransaction().commit();
		tx.commit(); // data will commit to db at this point

		session.close();

	}
}

package hibernateSample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMyHibernateClass {

	public static void main(String args[]) {
		
		 

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Student s=session.load(Student.class, 120);
		System.out.println("id"+s.getSid());
		session.close();
		
		
		
	}
		 
	 
}


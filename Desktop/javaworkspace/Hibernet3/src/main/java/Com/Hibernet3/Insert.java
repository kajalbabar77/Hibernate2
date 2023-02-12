package Com.Hibernet3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Insert {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");  //configuration file
		//using session factory  to get the object of session
				SessionFactory sessionFactory = configuration.buildSessionFactory();
				Session session = sessionFactory.openSession(); // sesstion  insert update delete  using 
				session.beginTransaction();
				Emplooy employ1 = new Emplooy();
				
				employ1.setFullname("pritesh");
				employ1.setAddress("nagapur");
//				employ1.setSalary("pune");
				Emplooy employ2= new Emplooy();
				
				employ2.setFullname("jiya");
				employ2.setAddress("sagali");
				
				session.save(employ1);
				
				session.save(employ2);
				session.getTransaction().commit();// close transaction
				
				session.close(); 
//				transaction.commit();
				
				System.out.println("data is save....");
			}


	}



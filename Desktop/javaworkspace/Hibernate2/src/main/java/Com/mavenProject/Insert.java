package Com.mavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Insert {

	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); //configuration file
		//using session factory to open the sesstion
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee employee1 = new Employee();
		
		employee1.setFullname("shivnya");
		employee1.setAddress("satara");
//		employee.setSalary("pune");
Employee employee2 = new Employee();
		
		employee2.setFullname("sweta");
		employee2.setAddress("karad");
		
		session.save(employee1);
		
		session.save(employee2);
		session.getTransaction().commit();// close transaction
		
		session.close(); 
//		transaction.commit();
		
		System.out.println("data is save....");
	}

}

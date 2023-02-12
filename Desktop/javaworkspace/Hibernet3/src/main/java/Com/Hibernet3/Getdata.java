package Com.Hibernet3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Getdata {

	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Emplooy Emplooy1 =(Emplooy)session.get(Emplooy.class,1);
		System.out.println("first data of emplooy is:"+Emplooy1);
		
		Emplooy Emplooy2 =(Emplooy)session.get(Emplooy.class,1);
		System.out.println("first data of emplooy is:"+Emplooy2);
		
		
		
	
}
}
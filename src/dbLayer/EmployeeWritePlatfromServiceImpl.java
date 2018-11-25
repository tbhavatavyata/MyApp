package dbLayer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Data.Employee;
import Utils.HibernateUtil;

public class EmployeeWritePlatfromServiceImpl {



	public void createEmployee() {
		SessionFactory	 sessionFactory = HibernateUtil.getSessionFactoryInstance();
		Session session = sessionFactory.openSession();
		Transaction trx= session.beginTransaction();

		Employee emp  = new Employee();
		emp.setAddressId(2345);
		emp.setAge(31);
		emp.setName("suneeta");
		emp.setEmployeeCode("WER2I313");
		
		session.save(emp);
		
		trx.commit();
		session.close();
		
		
		
	} 

}

package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dbLayer.EmployeeWritePlatfromServiceImpl;

public class ServerApplication {
	
	public static void main(String[] args) {
		EmployeeWritePlatfromServiceImpl employeeWritePlatfromServiceImpl = new EmployeeWritePlatfromServiceImpl();
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    //  EmployeeWritePlatfromServiceImpl employeeWritePlatfromServiceImpl = (EmployeeWritePlatfromServiceImpl) context.getBean("helloWorld");
	     // obj.getMessage();

		employeeWritePlatfromServiceImpl.createEmployee();
	}

}

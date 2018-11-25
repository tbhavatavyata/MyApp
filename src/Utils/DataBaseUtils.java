package Utils;

import java.sql.*;


public class DataBaseUtils {
	
	static Connection con = null;
	
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  

	
    	
	public static Connection getConnection() {
		try {
		Class.forName(JDBC_DRIVER);
		
		 con =  DriverManager.getConnection("jdbc:mysql://localhost/myProfile","root","root");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

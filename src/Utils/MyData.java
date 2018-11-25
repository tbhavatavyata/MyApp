package Utils;
import java.sql.*;

public class MyData {
	static Connection con=null;
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			con=DriverManager.getConnection("jdbc:mysql://localhost//myprofile","root","root");
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return con;
	}
	

}

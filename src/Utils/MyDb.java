package Utils;

import java.sql.*;

public class MyDb {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/myprofile","root","boot");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select*from data");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.print(rs.getString(2));
			    System.out.println(rs.getString(3));
				System.out.println("===============");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}

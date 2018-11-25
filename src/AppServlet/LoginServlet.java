package AppServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Utils.DataBaseUtils;
import java.sql.*;

	
	public class LoginServlet extends HttpServlet {
	       

		 private String message ="My first servlet in FIFA18";
         
		 private String loginName  = "bhaved";
		 private String password = "tiwari";
		  

		   public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
			   try {
			      PrintWriter out = response.getWriter();

		      // Set response content type
			   String userName = request.getParameter("username");
			   
			   String password =request.getParameter("userpass");
			   
			   Connection con = DataBaseUtils.getConnection();
			   Statement stmt =con.createStatement();
			   			       String sql;
			      sql = "SELECT city,Profession  FROM home";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			      while(rs.next()){
			          //Retrieve by column name
			          String city = rs.getString("city");
                      String prof = rs.getString("Profession"); 
					   out.println("<h1> "+city+" "+prof+ " </h1>"); 

			       }
			      
			/*  RequestDispatcher rds = request.getRequestDispatcher("welcome");
		      
			   if(loginName.equals(userName) && this.password.equals(password))
			   {
				   rds.forward(request, response);
			   }else {
				   out.println("<h1>Login failed</h1>"); 
			   }*/
			   response.setContentType("text/html");
		      
		      
			   } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		       
		   }

}



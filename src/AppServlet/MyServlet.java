package AppServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Profile;
import Utils.DataBaseUtils;
import Utils.MyDb;

public class MyServlet extends HttpServlet {
	private String loginName  = "bhaved";
	 private String password = "tiwari";
	  


public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		   try {
		      PrintWriter out = response.getWriter();

	      // Set response content type
		   
		   
		   Connection con = DataBaseUtils.getConnection();
		   Statement st =con.createStatement();
		   			       String sql;
		      sql = "SELECT * FROM data";
		      ResultSet rs = st.executeQuery(sql);
		      
		      ArrayList<Profile> list = new ArrayList<>();
		      
		      while(rs.next()) {
		    	  Profile pf = new Profile();
		    	  
		    	  pf.setId(rs.getInt("id"));
		    	  pf.setAddress(rs.getString("address"));
		    	  pf.setAge(rs.getInt("age"));
		    	  pf.setName(rs.getString("name"));
		    	  
		    	  list.add(pf);
		      }
		      
		      request.setAttribute("list",list);
		 
		      RequestDispatcher rds = request.getRequestDispatcher("myProfile.jsp");
	      
		       rds.include(request, response);
	      
	      
		   } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	   }

}



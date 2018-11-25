package AppServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Data.LoginDetail;
import Utils.HibernateUtil;

public class LoginServletHb extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	      PrintWriter out = response.getWriter();

		
		Session session = HibernateUtil.openSession();
		
		Criteria criteria = session.createCriteria(LoginDetail.class);
		criteria.add(Restrictions.eqOrIsNull("userName",request.getParameter("username")));
		criteria.add(Restrictions.eqOrIsNull("password",request.getParameter("userpass")));
		
		List<LoginDetail>  obj = criteria.list();
		
		if(obj != null && obj.size() >0) {
			   out.println("<h1>Successfully Logged in </h1>"); 

		}else {
			   out.println("<h1> Invalid Credentail </h1>"); 

		}

		
		
	}
	
}

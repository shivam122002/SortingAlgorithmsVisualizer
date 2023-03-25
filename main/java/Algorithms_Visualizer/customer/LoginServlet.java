package Algorithms_Visualizer.customer;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	
    //Getting information form Login page
    	
	 String name=request.getParameter("user_name");
	 String password=request.getParameter("user_password");
	 
	 // sending user_name password to the validation class's isValid() to check is given user name or
	 //password is present in database or not 
	 
	 boolean check=Validation.isValid(name,password); 
	 
	 if(check==true) {
		    HttpSession session = request.getSession();
		    session.setAttribute("user_name", name);
		    response.sendRedirect("loginHome.jsp");
		  
	  }
	  // if data wrong
	  else {  
		  response.sendRedirect("login.jsp");
	  }
 }
}

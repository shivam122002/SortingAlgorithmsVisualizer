package Algorithms_Visualizer.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Algorithms_Visualizer.DBHandler.DataInjector;

@WebServlet("/Register")
public class RegistrationServlet extends HttpServlet{
     public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	
    	 PrintWriter out=response.getWriter();
    	 //getting information from registration page
    	 String user_name=request.getParameter("user_name");
    	 String email=request.getParameter("user_email");
    	 String password=request.getParameter("user_password");
    	 String c_password=request.getParameter("user_cpassword");
    	 
    	 boolean status=DataInjector.addUser(user_name,email,password,c_password);
    	 
    	 //Sending Response to the login page
    	 if(status) {
    	 response.sendRedirect("login.jsp"); }
    	 else {
    		 response.sendRedirect("Registration.jsp");
    	 }
     }
}

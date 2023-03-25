package Algorithms_Visualizer.DBHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataFetcher {

	public static String fetchPassword(String user_name) {
		
		// getting all  value into different variable 
		
		    String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/Algorithms_Visualizer";
			String user="root";
			String pass="root";
			String  query="SELECT password FROM user_info WHERE user_name=?";
			String dbPass="";
			
			
			try {
				// driver loading 
				Class.forName(driver);
		      
				// getting conncection to the database 
				Connection con=DriverManager.getConnection(url,user,pass);
				
				// Preparing a statment to send our query to the database
				PreparedStatement ps=con.prepareStatement(query);
				
				// it will send our name in the place of " ? " in our query 
				ps.setString(1,user_name);
				
				ResultSet rs=ps.executeQuery();
				rs.next();
				dbPass=rs.getString(1);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Login Issue");
				e.printStackTrace();
			}
			return dbPass;
	}
}

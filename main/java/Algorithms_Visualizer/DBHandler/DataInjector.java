package Algorithms_Visualizer.DBHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInjector {

	 public static boolean addUser(String user_name,String email,String password ,String c_password) {
		 
// making all varrable which will use in the task of dataInjection
		 String driver="com.mysql.cj.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/Algorithms_Visualizer";
		 String user="root";
		 String localHostPass="root";
		 String query="INSERT INTO user_info values (?,?,?,?)";
		 boolean status = false;

// Loading ,statement preparing and Query executing for Algorithms_Visualizer database's user_info table 	
		
		 try {
			 
	// loading driver 
			Class.forName(driver);
			
			
	// connection creation
			Connection con=DriverManager.getConnection(url,user,localHostPass);
			
	//Preparing Statement
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Getting Error to PreparedStatement");
			ps.setString(1, user_name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, c_password);
			
			
	// Executing Updating values;
			ps.executeUpdate();
			status=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		 finally {
				return status;
			}
	 }
}

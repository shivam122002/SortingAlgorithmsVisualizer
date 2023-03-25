package Algorithms_Visualizer.customer;

import Algorithms_Visualizer.DBHandler.DataFetcher;

public class Validation {
 public static  boolean isValid(String user_name,String password) {
	 // variable to check is given password is match or not 
	
	
	// sending user_name to the fetchePassword() which is present inside the Datafetcher class
	
    String dbPass=DataFetcher.fetchPassword(user_name);	
    
    // if password matching with the given name then return true;
    if(password.equals(dbPass)) {
    	return true;
    }
    else {
	 return false; }
 } 
}

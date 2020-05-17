package ual.hmis.sesion07.ejercicio2;

public class Ejercicio2 {

	public boolean login(String username, String password) {
		if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
			return false;
		}
		
		

		if (username.length() >= 30 || password.length() >= 30) {
			return false;
		}
		
		if (!checkString(password)) {
			return false;
		}
		

		return compruebaLoginEnBD(username, password);
	}
	
	private static boolean checkString(String str) {
	    char ch;
	    boolean capitalFlag = false;
	    boolean lowerCaseFlag = false;
	    boolean numberFlag = false;
	    for(int i=0;i < str.length();i++) {
	        ch = str.charAt(i);
	        
	        if( Character.isDigit(ch)) {
	            numberFlag = true;
	        }
	        
	        if (Character.isUpperCase(ch)) {
	            capitalFlag = true;
	        } 
	        
	        if (Character.isLowerCase(ch)) {
	            lowerCaseFlag = true;
	        }
	        
	        
	    }
	    
	   
	    
	    return numberFlag && capitalFlag && lowerCaseFlag;
	}


	public boolean compruebaLoginEnBD(String username, String password) {
		
		
		
		return username.equals("user") && password.equals("pasS1");
	}
}

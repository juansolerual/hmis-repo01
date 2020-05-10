package ual.hmis.sesion06.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio2.Ejercicio2;

class Ejercicio2Test {

	@ParameterizedTest 
	@CsvSource({"true,user,pasS1","false, user2,pass2","false,,pass,","false,user, ,", "false, useruseruseruseruseruseruseruseruseruser, pass"})
 
	void login(boolean esperado, String user, String pass) {
		
		Ejercicio2 e = new Ejercicio2();
		assertEquals(esperado, e.login(user, pass));

	}
	
	
	

}

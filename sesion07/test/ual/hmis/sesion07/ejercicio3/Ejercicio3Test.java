package ual.hmis.sesion07.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion07.ejercicio3.Ejercicio3;

class Ejercicio3Test {

	@ParameterizedTest 
	@CsvSource({"*****,4","******,6","************,13","número  erróneo,-7"})
	void test(String asteriscos, int numero) {
		
		Ejercicio3 e = new Ejercicio3();
		
		assertEquals(asteriscos,e.asteriscos(numero));
	}

}

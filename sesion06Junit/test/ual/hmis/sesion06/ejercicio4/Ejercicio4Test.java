package ual.hmis.sesion06.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio4.Ejercicio4;

class Ejercicio4Test {

	@CsvSource({"juano, juanito, juanazo" , "bio, biofrutas, biologico"})
	@ParameterizedTest
	void test(String esperado, String p1, String p2) {
		Ejercicio4 e = new Ejercicio4();
		
		assertEquals( esperado , e.checkContains(p1,p2));
		
	}

}

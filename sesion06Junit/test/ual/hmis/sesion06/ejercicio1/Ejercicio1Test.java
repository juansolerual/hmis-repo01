package ual.hmis.sesion06.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio1.Ejercicio1;

class Ejercicio1Test {

	@ParameterizedTest 
	@CsvSource({"1,1","2,1","6,1","15,1","25,1","97,97"})
	void testTransformar(int num, int esperado) {
		Ejercicio1 e = new Ejercicio1();
		assertTrue(Integer.class.isInstance(num));
		assertTrue(Integer.class.isInstance(esperado));

		assertEquals(esperado, e.transformar(num));
	}

}
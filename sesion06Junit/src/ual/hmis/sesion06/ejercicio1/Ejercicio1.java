package ual.hmis.sesion06.ejercicio1;


public class Ejercicio1 {

	
	public Integer transformar(int x) {
		
		
		
		Integer resultado = x;

		if (x % 2 == 0) {
			resultado = transformar(x / 2);
		} else if (x % 3 == 0) {
			resultado = transformar(x / 3);
		} else if (x % 5 == 0) {
			resultado = transformar(x / 5);
		}

		return resultado;
	}
}

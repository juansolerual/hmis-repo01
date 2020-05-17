package ual.hmis.sesion07.ejercicio3;


public class Ejercicio3 {

	
	
	
	public String asteriscos(int num) {

		
		int numeroSalida = num;
		
		if (num < 5) {
			numeroSalida = 5;
		}
		
		if (num > 12) {
			numeroSalida = 12;
		} 
		
		if (num < 0 ) {
			return "número  erróneo";
		}

		String st = "";

		for (int i = 0; i < numeroSalida; i++) {
			st += "*"; 
		}

		return st;
	}

}

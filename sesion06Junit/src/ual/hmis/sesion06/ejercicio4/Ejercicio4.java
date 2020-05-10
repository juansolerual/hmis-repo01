package ual.hmis.sesion06.ejercicio4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ejercicio4 {


	
	public String checkContains(String p1, String p2) {

		char[] cadena1 = p1.toCharArray();
				
		StringBuilder str = new StringBuilder();
		

		for (int i = 0; i < cadena1.length; i++) {
			
			if (p2.indexOf(cadena1[i]) != -1) {
				if (str.toString().indexOf(cadena1[i]) == -1) {
					str.append(cadena1[i]);
				}
			}

		}
		
		
		return str.toString();
	}
}

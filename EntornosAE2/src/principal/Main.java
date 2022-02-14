package principal;

import calculadora.*;

public class Main {

	public static void main(String[] args) {
		//Prueba Suma
		
		//Prueba Resta
		
		//Prueba Producto
		
		//Prueba del Cociente
		Cociente divisiones = new Cociente();
		System.out.println("Vamos a dividir dos reales, el 53.9832 entre el 4.3232");
		System.out.println("El resultado es: " + divisiones.dosReales(53.9832f, 4.3232f));
		System.out.println("Ahora dividiremos dos enteros: el 86 entre el 24");
		System.out.println("El resultado es: " + divisiones.dosEnteros(86, 24));
		System.out.println("Ahora obtendremos el número inverso de 395.57: " + divisiones.inversoReal(395.57f));
		System.out.println("Por último vamos a obtener la raíz cuadrada de 85.2");
		System.out.println("El resultado es: " + divisiones.raiz(85.2));
		

	}

}

package principal;

import calculadora.*;

public class Main {

	public static void main(String[] args) {
		//Prueba Suma
		
		//Prueba Resta
		
		//Prueba Producto
		Producto productos = new Producto();
		System.out.println("Vamos a multiplicar dos reales, el 23.65 entre el 8.36");
		System.out.println("El resultado es: " + productos.dosReales(23.65f, 8.36f));
		System.out.println("Ahora multiplicaremos dos enteros: el 20 por el 9");
		System.out.println("El resultado es: " + productos.dosEnteros(20, 9));
		System.out.println("También hay que multiplicar tres reales: 23.21, 89.74 y 61.285");
		System.out.println("El resultado es: " + productos.tresReales(23.21f, 89.74f, 61.285f));
		System.out.println("Por último probaremos a hacer la potencia al cubo de 36 : " + productos.potencia(36, 3));
		
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

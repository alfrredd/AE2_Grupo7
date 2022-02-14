/*Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Producto de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Producto de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
Potencia, tendrá dos parámetro de entrada (base y exponente) y uno de salida que será la solución.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los métodos de la multiplicación en la calculadora
 * @see calculadora
 * @author Julio Fernández
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Producto {

	//Métodos
	/**
	 * Multiplica dos números reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @return Resultado de la multiplicación
	 */
	public float dosReales(float a, float b) {
		return a*b;
	}
	/**
	 * Multiplica dos números enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @return Resultado de la multiplicación
	 */
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	/**
	 * Multiplica tres números reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @param c Tercer valor de la operación
	 * @return Resultado de la multiplicación
	 */
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	/**
	 * Realiza la potencia dados los parámetros de base y exponente
	 * @param base Valor <b>positivo</b> que será la base de la potencia
	 * @param exponente Valor <b>positivo</b> que será el exponente de la potencia
	 * @return Resultado de la potencia <br>
	 * <ul><li>Para números extremadamente grandes, el resultado será "Infinity"</li></ul>
	 */
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}

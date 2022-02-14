/*Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Divisi�n de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los m�todos de la divisi�n en la calculadora
 * @see calculadora
 * @author Afredo Hern�ndez
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Cociente {

	//M�todos
	/**
	 * Divide dos n�meros reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Dividendo de la operaci�n
	 * @param b Divisor de la operaci�n<br>
	 * <ul><li>Si el divisor es 0 el resultado ser� error pues no se puede dividir entre cero</li></ul>
	 * @return Resultado de la divisi�n<br>
	 * <ul><li>Puede dar resultado con decimales</li></ul>
	 */
	public float dosReales(float a, float b) {
		return a/b;
	}
	/**
	 * Divide dos n�meros enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Dividendo de la operaci�n
	 * @param b Divisor de la operaci�n <br>
	 * <ul><li>Si el divisor es 0 el resultado ser� error pues no se puede dividir entre cero</li></ul>
	 * @return Resultado de la divisi�n <br>
	 * <ul><li>Si el divisor es mayor al dividendo, el resultado ser� cero. Para ver los decimales usa dosReales()</li></ul>
	 * @see dosReales(float, float)
	 */
	public int dosEnteros(int a, int b) {
		return a/b;
	}
	/**
	 * Realiza el inverso del n�mero real dado: cambia un n�mero negativo a positivo y el positivo a negativo.
	 * @param a N�mero del que se quiere obtener su inverso
	 * @return N�mero inverso
	 */
	public float inversoReal(float a) {
		return a - (a * 2);
	}
	/**
	 * Ra�z cuadrada de un n�mero
	 * @param a Valor del cual se quiere obtener la ra�z cuadrada <br>
	 * <ul><li>Solo acepta n�meros <b>positivos</b>. No podemos obtener la ra�z cuadrada de un n�mero negativo</li></ul>
	 * @return Resultado de la ra�z cuadrada <br>
	 * <ul><li>Puede dar resultado con decimales</li></ul>
	 */
	public double raiz (double a) {
		return Math.sqrt(a);
	}
}

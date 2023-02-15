package com.generation.primerproyectojava;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PrimerproyectojavaApplication {

	//esto es un comentario
	/*esto es 
	 * un 
	 * bloque
	 * de 
	 * comentario
	 */

	 /* como se escribian las funciones en JS
	 	function nomFuncion (parámetros){
			contenido de la funcion
			en caso de ser necesario un return
		}
	  * 
	  */
	  /*como se definian variables en JS
	   * var nomVar = contenido;
	   * let nomVar = contenido;
	   * const nomConst = contenido;
	   */

	   //definición de variables en JAVA
	   /*tipos de variables que existen en JAVA
		* String -> son las cadenas de carcteres (se escriben con comillas doble)
			int -> son los número enteros
			double -> son los número decimales
			boolean -> son los true o false
			char -> caracteres pero de un solo valor ('A', 'D', 'm') (se escribe con comilla simple)
	    */

		/*Operadores matematicos en JS
		 * +,-,/,*,%,** 
		 * en Java son exactamente igual
		 */

		 /*Operadores logicos en JS
		  * &&(AND), || (OR), !(negación de)
		  en JAVA son exactamente iguales!!!
		  */

		  /*Operadores de comparación (o de asignación)JS
		  	>(Mayor que), <(Menor que), == (igual que), != (distinto de), ===(igual estricti)
		   * !==(distinto estricto)
		   * En JAVA el igual estricto y el distinto estricto no existen, 
		   * solo se compran y por defecto es una comparación estricta
		   */
		  /*
		   * Como pedir por teclado datos al usuario
		   * en JS -> prompt("mensaje")
		   * en JAVA -> Primero debemo IMPORTAR la librería que nos permite ocupar la 
		   * funcionalidad de pedirle un dato al usuario (import java.util.Scanner;)
		   * Luego de importarla debesmo incializarla (Scanner teclado = new Scanner (System.in);)
		   * Finalmente pata utilizar este scaner debemos llamarlo (datoTeclado = teclado.nextLine ();)
		   */


		//definición de funciones en JAVA
		//puede ser private o public
		//existen dos tipos de funciones las que retornan y las que no
		//ejemplo de funcion que retorna
		public static int suma (int numero1, int numero2){
			int sumaNumero = numero1 + numero2;
			return sumaNumero;
		}
		public static String tuEdad(int edad, char newChar){
			return "tu edad es de: " + edad + ", y tu chart seleccionado es: "+ newChar;
		}
		//ejemplo de funcion que NO retorna
		public static void mostrarTuNombre (String nombre){
			//este es el simil de Java con el console.log()
			System.out.println("Tu nombre es: " + nombre);
		}

	public static void main(String[] args) {
		//distintas formas de definir variables en JAVA
		int newInt = 5;
		String newString = "Esto es un string :D";
		double newDouble = 2.5;
		boolean newBoolean = true;
		char newChar = 'A';	
		mostrarTuNombre("Pamela");
		System.out.println(tuEdad(25, 'N'));
		//declaración de la variable de scanner
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese algo en la consola: esto ");
		String datoTeclado = teclado.nextLine();
		System.out.println("el dato ingresado por el usuario fue: "+ datoTeclado);
		//dato freak el teclado se puede cerrar :D
		teclado.close();
	}

}

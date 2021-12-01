package scanner;

import java.util.*;

public class UsoScanner {

	public static void main(String[] args) {

		// Creamos un objeto de la clase Scanner e importamos Java.util

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un texto

		System.out.println("Introduce un texto");

		// Utilizamos la instancia del Scanner para leer el texto introducido por el
		// usuario
		// Leeremos lo que el usuario escriba en la siguiente l�nea en formato String
		// Guardamos el texto en una variable tipo String.

		String escritura = sc.nextLine();

		// imprimimos por consola la String

		System.out.println(escritura);

		/*
		 * 
		 * Ahora pediremos que escriba un n�mero de tipo int para ello, vamos a declarar
		 * una variable de tipo boolean que cambiar� en funci�n de si se cumple la
		 * condici�n de introducir el dato correctamente Vamos a envolver la
		 * funcionalidad en un do-while para que HAGAMOS LA PETICI�N DE N�MERO INT
		 * MIENTRAS LA VARIABLE --CAMBIO-- INDIQUE VERDADERO A LA CONDICI�N DEL WHILE
		 * Cuando se cumple la condici�n y el usuario introduce un int por consola,
		 * cambio pasa a ser --true-- y la condici�n del While es !cambio, o lo que es
		 * lo mismo, lo contrario de true, por lo que se sale del bucle.
		 * 
		 */

		boolean cambio = false;
		do {

			System.out.println("Escribe un n�mero de tipo int");
			if (sc.hasNextInt()) {
				int num = sc.nextInt();

				System.out.println(num);
				cambio = true;

			} else {
				sc.nextLine();
				System.out.println("Introduce un n�mero v�lido, por favor");
			}
		} while (!cambio);

		/*
		 * La clase Scanner tiene m�todos para varios tipos de datos num�ricos puedes
		 * observar que hemos utilizado para el siguiente ejemplo una variable para
		 * guardar el double que tiene el mismo nombre que la variable que guarda el int
		 * en el bloque anterior. Esto es debido a que --num-- es una VARIABLE LOCAL, al
		 * estar declarada dentro de un bloque de c�digo { } Sin embargo, la variable
		 * booleana --cambio--est� declarada fuera de los bloques de c�digo, dentro del
		 * m�todo Main, por lo que ser� una variable que funcionar� dentro de todo el
		 * m�todo, as� que la declaramos una vez y le podemos cambiar el valor dentro de
		 * los bloques que utilicemos. de igual forma lo estamos haciendo con la clase
		 * Scanner
		 */

		cambio = false;
		do {

			System.out.println("Escribe un n�mero de tipo double");
			if (sc.hasNextDouble()) {
				double num = sc.nextDouble();

				System.out.println(num);
				cambio = true;

			} else {
				sc.nextLine();
				sc.nextLine();
				System.out.println("Introduce un n�mero v�lido, por favor");
				sc.close();
			}
		} while (!cambio);

	}

}

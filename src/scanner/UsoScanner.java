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
		// Leeremos lo que el usuario escriba en la siguiente línea en formato String
		// Guardamos el texto en una variable tipo String.

		String escritura = sc.nextLine();

		// imprimimos por consola la String

		System.out.println(escritura);

		/*
		 * 
		 * Ahora pediremos que escriba un número de tipo int para ello, vamos a declarar
		 * una variable de tipo boolean que cambiará en función de si se cumple la
		 * condición de introducir el dato correctamente Vamos a envolver la
		 * funcionalidad en un do-while para que HAGAMOS LA PETICIÓN DE NÚMERO INT
		 * MIENTRAS LA VARIABLE --CAMBIO-- INDIQUE VERDADERO A LA CONDICIÓN DEL WHILE
		 * Cuando se cumple la condición y el usuario introduce un int por consola,
		 * cambio pasa a ser --true-- y la condición del While es !cambio, o lo que es
		 * lo mismo, lo contrario de true, por lo que se sale del bucle.
		 * 
		 */

		boolean cambio = false;
		do {

			System.out.println("Escribe un número de tipo int");
			if (sc.hasNextInt()) {
				int num = sc.nextInt();

				System.out.println(num);
				cambio = true;

			} else {
				sc.nextLine();
				System.out.println("Introduce un número válido, por favor");
			}
		} while (!cambio);

		/*
		 * La clase Scanner tiene métodos para varios tipos de datos numéricos puedes
		 * observar que hemos utilizado para el siguiente ejemplo una variable para
		 * guardar el double que tiene el mismo nombre que la variable que guarda el int
		 * en el bloque anterior. Esto es debido a que --num-- es una VARIABLE LOCAL, al
		 * estar declarada dentro de un bloque de código { } Sin embargo, la variable
		 * booleana --cambio--está declarada fuera de los bloques de código, dentro del
		 * método Main, por lo que será una variable que funcionará dentro de todo el
		 * método, así que la declaramos una vez y le podemos cambiar el valor dentro de
		 * los bloques que utilicemos. de igual forma lo estamos haciendo con la clase
		 * Scanner
		 */

		cambio = false;
		do {

			System.out.println("Escribe un número de tipo double");
			if (sc.hasNextDouble()) {
				double num = sc.nextDouble();

				System.out.println(num);
				cambio = true;

			} else {
				sc.nextLine();
				sc.nextLine();
				System.out.println("Introduce un número válido, por favor");
				sc.close();
			}
		} while (!cambio);

	}

}

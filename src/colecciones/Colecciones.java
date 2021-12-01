package colecciones;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {

		// TreeSet con elementos ordenados
		
		System.out.println();
		System.out.println("******************   TREE SET   *************************");
		System.out.println();
		
		Set<String> canciones = new TreeSet<String>();

		canciones.add("Maldito duende");
		canciones.add("Deshacer el mundo");
		canciones.add("Entre dos tierras");
		canciones.add("No m�s lagrimas");
		canciones.add("19 d�as y 500 noches");
		canciones.add("Maldito duende");

		System.out.println(canciones.size());
		
		System.out.println(canciones);

		// podemos comprobar si existe un elemento concreto en el TreeSet

		System.out.println(canciones.contains("Maldito duende"));

		// imprimimos los elementos a trav�s de un Iterator

		Iterator<String> iterador = canciones.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());

		}
		
		// Veremos como el TreeSet evita que los elementos se repitan

		canciones.add("Vivir al este del Ed�n");
		canciones.add("Vivir al este del Ed�n");

		System.out.println(canciones);
		
		System.out.println();
		System.out.println("******************   NAVIGABLE SET   *************************");
		System.out.println();
		
		// Pasamos el TreeSet a un navigableSet para acceder a sus m�todos
		
		NavigableSet<String> cancionesNavegable = (NavigableSet<String>) canciones;
		
		//Imprimimos el NavigableSet desde el �ltimo elemento hasta el primero

		System.out.println(cancionesNavegable.descendingSet());

		// headSet devuelve los elementos hasta el elemento pasado por par�metro
		
		System.out.println(cancionesNavegable.headSet("Entre dos tierras"));

		// Si pasamos true, devuelve los elementos hasta el elemento pasado inclu�do
		
		System.out.println(cancionesNavegable.headSet("Entre dos tierras", true));

		cancionesNavegable.add("Lobo-Hombre en Par�s");

		/*
		 * Imprimimos un sub conjunto de elementos del Set True indica que el elemento
		 * aparecer� en el subSet Por defecto est�n activados true-false
		 */

		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", "Vivir al este del Ed�n"));
		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", false, "Vivir al este del Ed�n", true));
		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", false, "Vivir al este del Ed�n", false));
		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", true, "Vivir al este del Ed�n", true));
		
		//tailSet devuelve la porci�n del Set cuyos elementos son mayores o iguales al proporcionado.
		//True es valor por defecto, en ese caso devuelve el valor igual al proporcionado
		
		System.out.println(cancionesNavegable.tailSet("Lobo-Hombre en Par�s"));
		System.out.println(cancionesNavegable.tailSet("Lobo-Hombre en Par�s", false));
		

		System.out.println(cancionesNavegable);
		
		/*
		 * Creamos un Array de Strings con las canciones del TreeSet Este nuevo Array
		 * tendr� una longitud fija y no podr� ser ampliado
		 */

		String[] lasCanciones = canciones.toArray(new String[0]);

		// Imprimimos uno de los Strings del Array lasCanciones
		
		System.out.println();
		System.out.println("******************   ARRAY ACCEDEMOS A UN VALOR   *************************");
		System.out.println();
		
		System.out.println(lasCanciones[4]);
		
		System.out.println();
		System.out.println("******************  ARRAY  LIST  *************************");
		System.out.println();
		
		/*
		 * Ahora crearemos un ArrayList con las canciones del Array lasCanciones, as� la
		 * longitud del array ser� variable
		 */

		List<String> cancionesLista = new ArrayList<String>();

		for (int i = 0; i < lasCanciones.length; i++) {

			System.out.println(lasCanciones[i]);
			cancionesLista.add(lasCanciones[i]);

		}

		cancionesLista.add("Wish you were here");
		cancionesLista.add("Wish you were here");
		
		/*
		 * Comprobamos como un ArrayList permite colocar elementos repetidos
		 */
		
		System.out.println();
		System.out.println("******************   ARRAY LIST    *************************");
		System.out.println();
		
		System.out.println(cancionesLista);
		
		System.out.println();
		System.out.println("******************   ARRAY LIST  REVERSE *************************");
		System.out.println();
		
		Collections.reverse(cancionesLista);
		System.out.println(cancionesLista);

	}

}

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
		canciones.add("No más lagrimas");
		canciones.add("19 días y 500 noches");
		canciones.add("Maldito duende");

		System.out.println(canciones.size());
		
		System.out.println(canciones);

		// podemos comprobar si existe un elemento concreto en el TreeSet

		System.out.println(canciones.contains("Maldito duende"));

		// imprimimos los elementos a través de un Iterator

		Iterator<String> iterador = canciones.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());

		}
		
		// Veremos como el TreeSet evita que los elementos se repitan

		canciones.add("Vivir al este del Edén");
		canciones.add("Vivir al este del Edén");

		System.out.println(canciones);
		
		System.out.println();
		System.out.println("******************   NAVIGABLE SET   *************************");
		System.out.println();
		
		// Pasamos el TreeSet a un navigableSet para acceder a sus métodos
		
		NavigableSet<String> cancionesNavegable = (NavigableSet<String>) canciones;
		
		//Imprimimos el NavigableSet desde el último elemento hasta el primero

		System.out.println(cancionesNavegable.descendingSet());

		// headSet devuelve los elementos hasta el elemento pasado por parámetro
		
		System.out.println(cancionesNavegable.headSet("Entre dos tierras"));

		// Si pasamos true, devuelve los elementos hasta el elemento pasado incluído
		
		System.out.println(cancionesNavegable.headSet("Entre dos tierras", true));

		cancionesNavegable.add("Lobo-Hombre en París");

		/*
		 * Imprimimos un sub conjunto de elementos del Set True indica que el elemento
		 * aparecerá en el subSet Por defecto están activados true-false
		 */

		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", "Vivir al este del Edén"));
		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", false, "Vivir al este del Edén", true));
		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", false, "Vivir al este del Edén", false));
		System.out.println(cancionesNavegable.subSet("Deshacer el mundo", true, "Vivir al este del Edén", true));
		
		//tailSet devuelve la porción del Set cuyos elementos son mayores o iguales al proporcionado.
		//True es valor por defecto, en ese caso devuelve el valor igual al proporcionado
		
		System.out.println(cancionesNavegable.tailSet("Lobo-Hombre en París"));
		System.out.println(cancionesNavegable.tailSet("Lobo-Hombre en París", false));
		

		System.out.println(cancionesNavegable);
		
		/*
		 * Creamos un Array de Strings con las canciones del TreeSet Este nuevo Array
		 * tendrá una longitud fija y no podrá ser ampliado
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
		 * Ahora crearemos un ArrayList con las canciones del Array lasCanciones, así la
		 * longitud del array será variable
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

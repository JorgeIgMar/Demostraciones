package estructurasDeControl;

public class estudiandoIf {

	public static void main(String[] args) {
		boolean bandera = true;
		boolean bandera2 = true;
		boolean bandera3 = true;
		boolean bandera4 = true;
		// El primer bloque es un if simple
		if (bandera) {

			System.out.println("IF(TRUE)-->Bandera es verdadero, así que me estás leyendo, pero pienso cambiarlo");
			bandera = false;
		}
		// Segundo bloque: un if-else

		if (bandera) {

			System.out.println("A mi no me vas a leer porque bandera ahora es falso");
		} else {
			System.out.println("IF(FALSE)-->ELSE-->Hemos saltado la primera condición porque su valor era falso y estás viendo el else");
			bandera = true;
		}
		// Tercer bloque: if-else if con diferentes resultados

		if (!bandera) {

			System.out.println("Ahora bandera es true, pero se evalúa lo contrario, así que la condición es false");
		} else if (bandera2) {
			System.out.println("IF(FALSE)-->ELSE IF(TRUE)-->Como la bandera es false, vemos si bandera2 es true y aparezco yo");
			bandera = false;
			bandera2 = false;
		} else
			System.out.println("Si las dos anteriores son falsas al momento de evaluarlas, aquí estoy yo");

		if (bandera) {

			System.out.println("Ahora bandera es true, pero se evalúa lo contrario, así que la condición es false");
		} else if (bandera2) {
			System.out.println("Como la bandera es false, vemos si bandera2 es true y aparezco yo");
		} else
			System.out.println("IF(FALSE)-->ELSE IF(FALSE)-->ELSE-->Si las dos anteriores son falsas al momento de evaluarlas, aquí estoy yo");

		bandera2 = true;

		// if-else con operador OR

		if (bandera == true || bandera2 == true) {

			System.out.println(
					"IF(FALSE||TRUE)-->bandera es false, pero como bandera2 es true, se evalúa la expresión como verdadera gracias al OR, por eso me ves");

		} else
			System.out.println("A mi no me verás");

		if (bandera == true && bandera2 == true) {

			System.out.println(
					"bandera es false, pero como bandera2 es true, se evalúa la expresión como verdadera gracias al OR, por eso me ves");

		} else
			System.out.println("IF(FALSE&&TRUE)-->ELSE-->A mi no me verás(pero como has cambiado el || por el &&, sí que me estás viendo)");

	}
}

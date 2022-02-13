/**
 * 
 */

/**
 * @author andreseiro
 *
 */


public class TiposDeDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipos de datos enteros
		byte edad = 43;
		short year = 1990;
		int id_user = 1001;
		long id_twitter = 1233345345345345343L;
		
		System.out.println("La edad es: " + edad);
		System.out.println("El año es: " + year);
		System.out.println("El usuario es: " + id_user);
		System.out.println("El id de twitter es: " + id_twitter);
		System.out.println();
		
		//Tipos de dato decimal. punto flotante
		float diametro = 34.2F;
		double precio = 23412.243432433;
		System.out.println("El diametro es: " + diametro);
		System.out.println("El precio es: " + precio);
		System.out.println();
		
		
		//tipos de datos texto
		char genero = 'M';
		System.out.println("El genero es: " + genero + "\n");
		
		
		//tipos de datos logicos
		boolean isVisible = true;
		boolean funciona = false;
		System.out.println("Es visible es igual a: " + isVisible + 
				" y funciona es igual a: " + funciona);
		System.out.println();	

	}

}

package tema1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// Creamos una variable para recoger el número de la base de nuestra figura
		int base = -1, inicial;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el número comprombando que está en el rango correcto
		do {
			try {
				// Pedimos un número y lo recogemos
				System.out.println("Dame un número positivo, y será la base de nuestro cuadrado");
				base = sc.nextInt();
				// Nos aseguramos que el número recogido es de algún tipo valido
			} catch (InputMismatchException e) {
				System.out.println("No es valido el tipo de valor introducido");
				sc.nextLine();
			}
		} while (base <= 0);
		
		//Hacemos un for que recorras las filas que hemos introducido
		for (int i=1;i<=base;i++) {
			for (int j=i; j>1 ; j--) {
				System.out.print(j + " ");
			}
			for (int j=1; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		// Cerramos el escaner
		sc.close();

	}

}

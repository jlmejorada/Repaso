package tema1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		// Creamos una variable para recoger el número de la base de nuestra figura
		int base=-1, inicial;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número comprombando que está en el rango correcto
		do {
			try {
				//Pedimos un número y lo recogemos
				System.out.println("Dame un número positivo, y será la base de nuestro cuadrado");
				base=sc.nextInt();
			//Nos aseguramos que el número recogido es de algún tipo valido	
			}catch(InputMismatchException e) {
				System.out.println("No es valido el tipo de valor introducido");
				sc.nextLine();
			}
		} while(base<=0);

		if((base%2)!=0) {
			inicial=(base/2)+1;
		} else inicial=base/2;
		
		//Creamos un bucle que recorrera las distintas lineas de nuestro cuadrado
		for(int i=1;i<=base;i++) {
			// y un for dentro de este que dibujará dentro de cada fila
			if(base%2==0) {
				for(int j=inicial;j>=1;j--) {
					System.out.print(j + " ");
				}
				for(int j=1;j<=inicial;j++) {
					System.out.print(j + " ");
				}	
			} else {
				for(int j=inicial;j>1;j--) {
					System.out.print(j + " ");
				}
				for(int j=1;j<=inicial;j++) {
					System.out.print(j + " ");
				}	
			}
			System.out.println();
		}
		
		// Cerramos el escaner
		sc.close();

	}

}

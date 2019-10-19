import java.util.Scanner;
public class Practica14U2{
	public static void main(String [] args){

		Scanner tecalado = new Scanner(System.in);

		int numero;

		do {
			System.out.print("Dime un número entero: ");

			while (tecalado.hasNextInt() == false){
				System.out.print("ERROR. Dime un numero entero: ");
				tecalado.next();

			}

			numero = tecalado.nextInt();


			} while (numero < 0 || numero > 10);

			System.out.println("Numero correcto = " + numero);
		
	}
}
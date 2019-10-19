import java.util.Scanner;
public class U2Actividad4IES{
	public static void main(String [] args){

		Scanner teclado = new Scanner(System.in);

		int intentos = 1;
		double adivinar = Math.random();
		double adivinarx100 = adivinar * 100;
		int adivinarReal = (int)adivinarx100;
		int i = 1;
		int numero = 0;
		boolean victoria = false;
		boolean bucle = true;

		System.out.println(adivinarReal);
		System.out.println("BIENVENIDO AL JUEGO: ADIVINA EL NÉMURO SECRETO");
		System.out.println("----------------------------------------------\n");

		System.out.print("¿De cúantos intentos quieres disponer?: ");

		while (intentos <= 0 || bucle == true || intentos > 10){

			if(intentos <= 0 || intentos > 10){
			System.out.print("ERROR. Tiene que ser un número del 1 al 10: \n");
			
		}

		while (!teclado.hasNextInt()){

			System.out.println("ERROR. Tiene que ser un número del 1 al 10: \n");
			teclado.nextLine();

		
		}

		intentos = teclado.nextInt();
		bucle = false;

		}

		bucle = true;
		while(i <= intentos && victoria == false){
			bucle = true;
			

		System.out.print("Intento " + i + ": ");

		while(numero < 0 || bucle == true){
			if(numero < 0){
				System.out.println("ERROR. Intennto " + i + ": ");
			}

			while(!teclado.hasNextInt()){
				System.out.println("ERROR. Intento " + i + ": ");
				teclado.next();
			}

			numero = teclado.nextInt();
			bucle = false;

		}

		if(numero == adivinarReal){
			System.out.println("Enhorabuena, has hacertado el número");
			victoria = true;
		}

		else if(numero < adivinarReal){
			System.out.print("El número introducido es mayor ");
		

		if(numero - adivinarReal < -29){
			System.out.println("(Frío)");
		}

		else if(numero - adivinarReal >= -30 && numero - adivinarReal < -10){
			System.out.println("(Templado)");
		}

		else if(numero - adivinarReal >= -10){
			System.out.println("(Caliente)");
		}

	}

		else if(numero > adivinarReal){
			System.out.print("El número introducido es menor");

			if(numero - adivinarReal > 29){
				System.out.println("(Frío)");
			}

			else if(numero - adivinarReal < 30 && numero - adivinarReal > 10){
				System.out.println("(Temlpado)");
			}

			else if(numero - adivinarReal <= 10){
				System.out.println("(Caliente)");
			}
		}
		i++;
		}

			if(victoria == false){
				System.out.println("Fin.");
			}

	}
}


import java.util.Scanner;
public class Practica6{
	public static void main(String [] args){
		int numero1;
		int numero2;
		int elegir;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime un número");
		numero1 = teclado.nextInt();
		System.out.println("Dime otro número");
		numero2 = teclado.nextInt();

		System.out.println("Elige una de estas 4 opciones:
			1- Para que los números se sumen
			2- Para que los números se resten
			3- Para que los números se multipliquen
			4- Para que los números se dividen");
		elegir = teclado.nextInt();


		Switch(elegir){
			case 1:
				System.out.println(numero1 + numero2);
				break;

			case 2:
				System.out.println(numero1 - numero2);
				break;

			case 3:
				System.out.println(numero1 * numero2);
				break;

			case 4:
				System.out.println(numero1 / numero2);
				break;

			default;
				System.out.println("ERROR");
		} 

	}
}

import java.util.Scanner;
public class Prueba{
	public static void main(String [] args){

		Scanner teclado = new Scanner(System.in);
int intentos=1;
		double numeroDecimal=Math.random();
		double numeroDecimalx100=numeroDecimal*100;
		int numeroReal=(int)numeroDecimalx100;
		int i=1;
		int input=0;
		boolean victoria=false;
		boolean bucle=true;

	


		System.out.println(numeroReal);
		System.out.println("BIENVENIDO AL JUEGO: ADIVINA EL NÚMERO SECRETO");
		System.out.println("---------------------------------------------------\n");

		System.out.print("¿De cuantos intentos quieres disponer para adivinar el juego?: ");

		
			// bucle para recojer nº de intentos  válido
			
			while(intentos<=0 || bucle==true || intentos>10){

				if(intentos<=0 || intentos>10){

					System.out.println("Error");
					System.out.println("¿De cuantos intentos quieres disponer para adivinar el juego?: ");

				}

				while(!teclado.hasNextInt()){
					

				
					System.out.println("Error");
					System.out.println("¿De cuantos intentos quieres disponer para adivinar el juego?: ");
					teclado.nextLine();
					
			}
				
				intentos=teclado.nextInt();
				bucle=false;
			}

			// bucle para recojer una respuesta válida del usuario


				bucle=true;
			while(i<=intentos && victoria==false){
				bucle=true;

				
				System.out.print("Intento "+i+": ");

			while(input<0 || bucle==true){
				if(input<0){
					System.out.println("Error");
					System.out.print("Intento "+i+": ");
				}

				while(!teclado.hasNextInt()){

					System.out.println("Error");

					System.out.println("Intento "+i+": ");
					teclado.next();

			}
			

				input=teclado.nextInt();
				bucle=false;
				
			}

			//Comprobación de la respuesta y bucle mientras haya intentos

				if(input==numeroReal){
					System.out.println("Enhorabuena, has acertado el número");
					victoria=true;
				}

				else if(input<numeroReal){

					System.out.print("El número introducido es menor ");

					if(input-numeroReal<-29){
						System.out.println("(Frío)");
					}
					else if(input-numeroReal>-30 && input-numeroReal<-10){

						System.out.println("(Templado)");

					}
					else if(input-numeroReal>=-10){
						System.out.println("(Caliente)");
					}

				}
				else if(input>numeroReal){

					System.out.print("El número introducido es mayor ");

					if(input-numeroReal>29){
						System.out.println("(Frío)");
					}
					else if(input-numeroReal<30 && input-numeroReal>10){

						System.out.println("(Templado)");

					}
					else if(input-numeroReal<=10){
						System.out.println("(Caliente)");
					}
				}
				i++;
					}

					if(victoria==false){
						System.out.println("Fin");
					}









			}


	}




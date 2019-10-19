/*
*@author Nacho Esteve Santo
*/
import java.util.Scanner;
public class U1Actividad1{
	public static void main(String [] args){
		double radio;
		double base;
		double altura;
		double perimetro;
		double area;
		double rectangulo;
		double cateto1;
		double cateto2;
		double hipotenusa2;
		double hipotenusa;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime el valor del \'radio\' de un círculo: ");
		radio = teclado.nextDouble();
		System.out.print("\nAhora dime el valor de la \'base\' de un rectángulo: ");
		base = teclado.nextDouble();
		System.out.print("\nNo olvides decirme también el valor de la \'altura\' del rectángulo: ");
		altura = teclado.nextDouble();
		perimetro = ((2 * 3.1416) * radio);
		area = (3.1416 * (radio * radio));
		rectangulo = base * altura;
		System.out.printf("\nDe momento tenemos un círculo de perímetro %.2f y área %.2f y un rectángulo de área %.2f", perimetro, area, rectangulo);
		System.out.print("\n \nMe gusta el teorema de Pitágoras, dime el valor del \'cateto 1\' : ");
		cateto1 = teclado.nextDouble();
		System.out.print("\nY también del \'cateto2\' :");
		cateto2 = teclado.nextDouble();
		hipotenusa2 = (cateto1 * cateto1) + (cateto2 * cateto2);
		hipotenusa = Math.sqrt(hipotenusa2);
		System.out.printf("\nVale, pues el valor de la hipotenusa al cuadrado es %.2f, por lo tanto el valor de la hipotenusa es %.2f", hipotenusa2, hipotenusa );


	}
}
/*
@author Nacho Esteve Santo
*/

public class U1Actividad2{
	public static void main(String [] args){
		double actual = 312032486;
		double año1;
		double año2;
		double año3;
		double año4;
		double año5;
		double nacimientoAno;
		double muerteAno;
		double inmigranteAno;

		nacimientoAno = 31536000 / 7;
		muerteAno = 31536000 / 13;
		inmigranteAno = 31536000 / 45;
		System.out.println("PROYECCIÓN DE LA POBLACIÓN EN EEUU");
		System.out.println("\n\tAño actual: " + actual + " personas");
		System.out.println("\tAño 2020: " + (actual + nacimientoAno - muerteAno + inmigranteAno) + " personas" );
		año1 = (actual + nacimientoAno - muerteAno + inmigranteAno);
		System.out.println("\tAño 2021: " + (año1 + nacimientoAno - muerteAno + inmigranteAno) + " personas" );
		año2 = (año1 + nacimientoAno - muerteAno + inmigranteAno);
		System.out.println("\tAño 2022: " + (año2 + nacimientoAno - muerteAno + inmigranteAno) + " personas" );
		año3 = (año2 + nacimientoAno - muerteAno + inmigranteAno);
		System.out.println("\tAño 2023: " + (año3 + nacimientoAno - muerteAno + inmigranteAno) + " personas" );
		año4 = (año3 + nacimientoAno - muerteAno + inmigranteAno);
		System.out.println("\tAño 2024: " + (año4 + nacimientoAno - muerteAno + inmigranteAno) + " personas" );
		año5 = (año4 + nacimientoAno - muerteAno + inmigranteAno);
		System.out.println("\tAño 2025: " + (año5 + nacimientoAno - muerteAno + inmigranteAno) + " personas" );






	}
}
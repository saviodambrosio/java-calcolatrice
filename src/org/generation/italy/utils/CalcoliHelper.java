package org.generation.italy.utils;

public class CalcoliHelper {

	//costruttore private in modo da non poter creare istanze
	private CalcoliHelper() {
		
	}
	
	//metodo addizione tra due numeri interi
	public static int Sommaint (int x,int y) {
		return x + y;	
	}
	
	//metodo addizione tra due numeri double
	public static double Sommadouble (double x,double y) {
		return x + y;
	}
	
	//metodo sottrazione tra due numeri interi
	public static int Sottrazioneint (int x,int y) {
		return x - y;
	}
	
	//metodo sottrazione tra due numeri double
	public static double Sottrazionedouble (double x,double y) {
		return x - y;
	}
	
	//metodo moltiplicazione tra due numeri interi
	public static int Moltiplicazioneint (int x, int y) {
		return x * y;
	}
	
	//metodo moltiplicazione tra due numeri double
		public static double Moltiplicazionedouble (double x, double y) {
			return x * y;
	}
		
	//valore assoluto numero intero
	public static int Valoreassolutoint (int x) {
		if (x >= 0) {
			return x;
		}
		else {
			return x * -1;
		}
	}
	
	//valore assoluto double
	public static double Valoreassolutodouble (double x) {
		if (x >= 0) {
			return x;
		}
		else {
			return x * -1;
		}
	}

	//Massimo e minimo intero
	public static int Massimoint(int x, int y) {
		if (x > y ) {
			return x;
		}
		else {
			return y;
		}	
	}
	public static int Minimoint(int x, int y) {
		if (x < y ) {
			return x;
		}
		else {
			return y;
		}	
	}
	
	//Massimo e minimo double 
	public static double Massimodouble(double x, double y) {
		if (x > y ) {
			return x;
		}
		else {
			return y;
		}	
	}
	public static double Minimodouble(double x, double y) {
		if (x < y ) {
			return x;
		}
		else {
			return y;
		}	
	}
	//elevamento a potenza con base x ed esponente y (positivi e maggiori di zero)
	static int Elevamentoapotenza(int x,int y) {
		int c = x;
		for(int i=0; i<y; i++);{
			x=x*c;				
		}
		return x;
	}


	//Il fatto di dover scrivere lo stesso metodo per tipi di parametro diversi applica nella pratica il polimorfismo.
	//In questo caso ho comunque specificato int e double al posto di scrivere per esempio solo somma semplicemente per avere un ordine mentale nella scrittura del programma.



}

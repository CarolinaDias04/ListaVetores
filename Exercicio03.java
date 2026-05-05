package pctexercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		int [] numeros = new int[6];
		int numero = 0;
		
		for(int i = 0; i <numeros.length; i++) {
			System.out.println("digite um numero inteiro");
			numeros[i]=receba.nextInt();
		}
		for(int i = 0; i <numeros.length; i++) {
			System.out.println("O maior valor é:" );
			
			if(numero<numeros[i]) {
				numero=numeros[i];
				System.out.println("Esse número é maior");
			} else {
				System.out.println("Esse número não é maior que numero");
			}
			
		}

	}

}

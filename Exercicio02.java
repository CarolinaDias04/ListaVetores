package pctexercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		int [] numeros = new int[5];
		
		for(int i = 0; i <numeros.length; i++) {
			System.out.println("digite um numero inteiro");
			numeros[i]=receba.nextInt();
		}
		for(int i=0; i<numeros.length;i++) {
			System.out.println("a soma é: "+i+ "=" + numeros[i]);
		}

	}

}

package pctexercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		int [] numeros = new int[5];
		
		for(int i = 0; i <numeros.length; i++) {
			System.out.println("digite um numero inteiro");
			numeros[i]=receba.nextInt();
		}
		

	}

}

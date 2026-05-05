package pctexercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		int [] numeros = {1,2,3,4,5,6,7,8};
		int par = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				par++;
			}
			System.out.println("quantidade de numeros pares:" + par);
			
		
				
				
			}
			
		}

	}


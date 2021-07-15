package br.com.atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double peso;
		double altura;
		double imc;
		
		System.out.print("DIGITE SEU NOME: ");
		nome = sc.nextLine();
		System.out.print("DIGITE SUA IDADE: ");
		idade = sc.nextInt();
		System.out.print("DIGITE SEU PESO: ");
		peso = sc.nextDouble();
		System.out.print("DIGITE SUA ALTURA: ");
		altura = sc.nextDouble();
		System.out.println();
		
		if(idade > 18) {
			System.out.println(nome+ " VOÇÊ É MAIOR DE IDADE ");
		}
		else {
			System.out.println(nome + "VOÇÊ É MENOR DE IADDE ");
		}
		
		imc = peso /(altura * altura);
		if(imc == 24.69) {
			System.out.println(nome +" VOÇÊ ESTA NO PESO IDEAL");
		}
		else
			if(imc > 24.69) {
				System.out.println(nome +" VOÇÊ ESTAR ACIMA DO PESO ");
			}
			else {
				System.out.println(nome + "VOÇÊ ESTAR ABAIXO DO PESO ");
			}
		  
	}

}

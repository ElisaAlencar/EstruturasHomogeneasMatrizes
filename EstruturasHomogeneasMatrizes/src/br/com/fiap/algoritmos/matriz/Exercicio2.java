package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		String nomesLojas[] = new String[3];
		String nomesProdutos[] = new String[4];
		
		// CARREGA LOJAS
		nomesLojas[0] = "Loja 1";
		nomesLojas[1] = "Loja 2";
		nomesLojas[2] = "Loja 3";
//		nomesLojas[3] = "Loja 4";
//		nomesLojas[4] = "Loja 5";
//		nomesLojas[5] = "Loja 6";
//		nomesLojas[6] = "Loja 7";
//		nomesLojas[7] = "Loja 8";
		
		// CARREGA PRODUTOS
		nomesProdutos[0] = "Produto 1";
		nomesProdutos[1] = "Produto 2";
		nomesProdutos[2] = "Produto 3";
		nomesProdutos[3] = "Produto 4";
		
		double precosLojasProdutos[][] = new double[3][4];
		
		Scanner entrada = new Scanner(System.in);
		
		// CARREGA PRECOS DOS PRODUTOS
		for(int lojas = 0; lojas < precosLojasProdutos.length; lojas ++) {
		
			for(int produtos = 0; produtos < precosLojasProdutos[lojas].length; produtos++) {
				
				System.out.println("Insira o preço do produto " + 
				                   nomesProdutos[produtos] +
				                   " referente a loja " + 
				                   nomesLojas[lojas] + ":");
				
				precosLojasProdutos[lojas][produtos] = entrada.nextDouble();
			}
		}
		
		// EXIBE PRODUTOS CUJO PRECO NAO ULTRAPASSE R$ 120,00
		for(int lojas = 0; lojas < precosLojasProdutos.length; lojas ++) {
			
			for(int produtos = 0; produtos < precosLojasProdutos[lojas].length; produtos++) {
				
				if(precosLojasProdutos[lojas][produtos] <= 120.0) {
					System.out.println("Produto " + 
							nomesProdutos[produtos] +
							" referente a loja " + 
							nomesLojas[lojas]);
				}
			}
		}
		
		entrada.close();
	}
}

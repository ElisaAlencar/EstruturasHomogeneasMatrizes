package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;


public class Exercicio3 {
	public static void main(String[]args){
		
	String produtos[] = new String[5];
	double precosProdutosLojas [][] = new double[5] [4];
	double custosTransportes [] = new double[5];
	int impostosProdutos[][] = new int [5][4];
	
	
	produtos[0] = "produto1";
	produtos[1] = "produto2";
	produtos[2] = "produto3";
	produtos[3] = "produto4";
	produtos[4] = "produto5";
	
	
	
	custosTransportes[0] = 10;
	custosTransportes[1] = 20;
	custosTransportes[2] = 30;
	custosTransportes[3] = 40;
	custosTransportes[4] = 50;
	
		Scanner entrada = new Scanner(System.in);
	
	for(int NomesProdutos=0; NomesProdutos< precosProdutosLojas.length; NomesProdutos++){
		for(int NomesLojas=0; NomesLojas<precosProdutosLojas.length; NomesLojas++){
			
			System.out.println("Insira o preço do produto" + produtos[NomesProdutos] + "da" + ":" );
			precosProdutosLojas[NomesLojas][nomesProdutos]
			
			
			
			}
		
		}
	entrada.close();
	
	}
	
}

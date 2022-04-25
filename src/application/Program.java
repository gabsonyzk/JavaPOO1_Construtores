package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre produto dados: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade Estoque: ");
		int quantidade = sc.nextInt();
		
		Product produtos = new Product(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Dados Produtos: "+produtos.toString());
		System.out.println();
		
		System.out.print("Entre com o número de produtos adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização de dados: "+produtos);
		System.out.println();
		
		System.out.print("Entre com o número de produtos removidos do estoque");
		quantidade = sc.nextInt();
		produtos.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização de dados: "+produtos);
		
		sc.close();
	}

}

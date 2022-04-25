package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Product() {
		
	}
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Product (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+", $ "
				+ String.format("%.2f",preco)
				+", "
				+quantidade 
				+" unidades, Total: $ "
				+ String.format("%.2f",totalValorEstoque());
	}
	
}

package br.edu.fatecpg.Encapsulamento.model;

	public class Produto {
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	// Getters
	public String getNome() {
	    return nome;
	}
	
	public double getPreco() {
	    return preco;
	}
	
	public int getQuantidadeEstoque() {
	    return quantidadeEstoque;
	}
	
	// Setters
	public void setNome(String nome) {
	    this.nome = nome;
	}
	
	public void setPreco(double preco) {
	    if (preco >= 0) {
	        this.preco = preco;
	    } else {
	        System.out.println("O preço não pode ser negativo.");
	    }
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
	    if (quantidadeEstoque >= 0) {
	        this.quantidadeEstoque = quantidadeEstoque;
	    } else {
	        System.out.println("A quantidade em estoque não pode ser negativa.");
	    }
	}

}

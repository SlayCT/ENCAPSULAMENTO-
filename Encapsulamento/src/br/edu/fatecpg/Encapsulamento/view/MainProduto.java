package br.edu.fatecpg.Encapsulamento.view;
import br.edu.fatecpg.Encapsulamento.model.Produto;

public class MainProduto {

	public static void main(String[] args) {
	
	    Produto produto = new Produto();
	
	    produto.setNome("Notebook");
	    produto.setPreco(2500);
	    produto.setQuantidadeEstoque(10);
	
	    System.out.println("===== PRODUTO =====");
	    System.out.println("Nome: " + produto.getNome());
	    System.out.println("Preço: R$ " + produto.getPreco());
	    System.out.println("Estoque: " + produto.getQuantidadeEstoque());
	
	    // Testando preço negativo
	    produto.setPreco(-500);
	
	    // Testando estoque negativo
	    produto.setQuantidadeEstoque(-5);
	
	    // Conferindo se os valores continuam corretos
	    System.out.println("\n===== APÓS TESTES =====");
	    System.out.println("Preço: R$ " + produto.getPreco());
	    System.out.println("Estoque: " + produto.getQuantidadeEstoque());
	}

}


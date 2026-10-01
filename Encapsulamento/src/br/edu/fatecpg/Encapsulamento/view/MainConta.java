package br.edu.fatecpg.Encapsulamento.view;
import br.edu.fatecpg.Encapsulamento.model.ContaBancaria;

public class MainConta {

	public static void main(String[] args) {
	
	    ContaBancaria conta = new ContaBancaria("Cicera", 1000);
	
	    System.out.println("Titular: " + conta.getTitular());
	    System.out.println("Saldo inicial: R$ " + conta.getSaldo());
	
	    conta.depositar(500);
	    System.out.println("Saldo após depósito: R$ " + conta.getSaldo());
	
	    conta.sacar(200);
	    System.out.println("Saldo após saque: R$ " + conta.getSaldo());
	
	    // Testando valor inválido
	    conta.depositar(-100);
	
	    // Testando saque maior que o saldo
	    conta.sacar(5000);
	}

}

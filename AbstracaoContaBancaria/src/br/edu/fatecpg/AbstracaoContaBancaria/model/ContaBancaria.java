package br.edu.fatecpg.AbstracaoContaBancaria.model;

public class ContaBancaria {

	private double saldo;
	private String titular;
	
	// Construtor
	public ContaBancaria(String titular, double saldo) {
	    this.titular = titular;
	    this.saldo = saldo;
	}
	
	// Getter do titular
	public String getTitular() {
	    return titular;
	}
	
	// Setter do titular
	public void setTitular(String titular) {
	    this.titular = titular;
	}
	
	// Getter do saldo
	public double getSaldo() {
	    return saldo;
	}
	
	// Depositar
	public void depositar(double valor) {
	    if (valor > 0) {
	        saldo += valor;
	        System.out.println("Depósito realizado!");
	    } else {
	        System.out.println("O valor do depósito deve ser positivo.");
	    }
	}
	
	// Sacar
	public void sacar(double valor) {
	    if (valor > 0 && valor <= saldo) {
	        saldo -= valor;
	        System.out.println("Saque realizado!");
	    } else {
	        System.out.println("Saque não permitido.");
	    }
	}
}

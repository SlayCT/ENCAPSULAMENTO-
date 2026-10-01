package br.edu.fatecpg.AbstracaoCarroFinal.model;

public class Carro {
	// Atributos privados
	private String cor;
	private String modelo;
	private double capacidadeTanque;

	// Construtor
	public Carro(String cor, String modelo, double capacidadeTanque) {
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
	}

	// Getters e Setters
	public String getCor() {
	    return cor;
	}

	public void setCor(String cor) {
	    this.cor = cor;
	}
	
	public String getModelo() {
	    return modelo;
	}
	
	public void setModelo(String modelo) {
	    this.modelo = modelo;
	}
	
	public double getCapacidadeTanque() {
	    return capacidadeTanque;
	}
	
	public void setCapacidadeTanque(double capacidadeTanque) {
	    this.capacidadeTanque = capacidadeTanque;
	}
	
	// Método para calcular o valor para encher o tanque
	public double calcularValorTanque(double valorGasolina) {
	    return capacidadeTanque * valorGasolina;
	}
	

}

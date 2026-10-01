package br.edu.fatecpg.Encapsulamento.view;
import java.util.Scanner;
import br.edu.fatecpg.Encapsulamento.model.Carro;

public class MainCarro {

	public static void main(String[] args) {
	
	    Scanner entrada = new Scanner(System.in);
	
	    System.out.print("Digite a cor do carro: ");
	    String cor = entrada.nextLine();
	
	    System.out.print("Digite o modelo do carro: ");
	    String modelo = entrada.nextLine();
	
	    System.out.print("Digite a capacidade do tanque (litros): ");
	    double capacidadeTanque = entrada.nextDouble();
	
	    System.out.print("Digite o valor da gasolina: ");
	    double valorGasolina = entrada.nextDouble();
	
	    Carro carro = new Carro(cor, modelo, capacidadeTanque);
	
	    double valorTotal = carro.calcularValorTanque(valorGasolina);
	
	    System.out.println("\n===== CARRO =====");
	    System.out.println("Modelo: " + carro.getModelo());
	    System.out.println("Cor: " + carro.getCor());
	    System.out.println("Capacidade do tanque: "
	            + carro.getCapacidadeTanque() + " litros");
	
	    System.out.printf("Valor para encher o tanque: R$ %.2f%n", valorTotal);
	
	    entrada.close();
	}

}

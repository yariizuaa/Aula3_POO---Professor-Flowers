package main.java;

public class Main {

	public static void main(String[] args) {

		
		System.out.println("Hello World");
		
		
		Carro carro1 = new Carro("Honda Civic","Preto", 2020);
		System.out.println("A marca do carro é " + carro1.getMarca());
		
		Trator trator1 = new Trator("Volvo", "Preto", 1988, "Super Green", "TR450");
		System.out.println("A marca do Trator é " + trator1.getMarca());
		System.out.println("O motor do Trator é " + trator1.getMotor());
		System.out.println("O modelo do Trator é " + trator1.getModelo());
		System.out.println("A cor do Trator é " + trator1.getCor());
		System.out.println("O ano do Trator é " + trator1.getAno());
		
		
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
		System.out.println (carro1.buzina());
	}
}

package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		
		Carro carro1 = new Carro("Honda Civic","Preto", 2020);
		System.out.println("A marca do carro é" + carro1.getMarca());
		
		Trator trator1 = new Trator("Volvo", "Preto", 1988);
		System.out.println("A marca do Trator é" + trator1.getMarca());

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

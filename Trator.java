package main.java;

public class Trator extends Carro {
	
	private String motor;
	private String modelo;

	public Trator(String marca, String cor, int ano, String motor, String modelo) {
		super(marca, cor, ano);
		// TODO Auto-generated constructor stub
		
		this.motor=motor;
		this.modelo=modelo;
	}
	
	public String getMotor() {
		return	motor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	@Override
	public String buzina() {
		
		return ("FOOOOONFOOOON");
	}
	

}

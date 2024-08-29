package br.com.edmar;

public abstract class Car {
	
	private int horsePower;
	private String fuelSource;
	private String color;
	
	public Car(int horsePower, String fuelSource, String color) {
			this.horsePower = horsePower;
			this.fuelSource = fuelSource;
			this.color = color;
	}
	
	public void startEngine() {
		System.out.println(getClass().getSimpleName());
		System.out.println("O moto " + fuelSource + " foi ligado, e está pronto para sair. Ele está pronto para usar seus " + horsePower + " cavalor de poder.");
	}
	
	public void clean() {
		System.out.println("O carro foi limpo, e a cor " + color.toLowerCase() + " está brilhando");
	}
	
	public void mechanicCheck() {
		System.out.println("O carro foi checado pelo mecânico, tudo parece bom.");
	}
	
	public void fuelCar() {
		System.out.println("O nível do tanque do carro está " + fuelSource.toLowerCase());
	}
}


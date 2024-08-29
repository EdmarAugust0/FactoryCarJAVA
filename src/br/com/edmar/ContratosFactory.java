package br.com.edmar;

public class ContratosFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		if("A".equals(requestedGrade)) {
			return new MercedesCar(100, "cheio", "preto");
		}else {
			return new BmwCar(250, "meia bomba", "branco");
		}
	}

}

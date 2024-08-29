package br.com.edmar;

public class SemContratosFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		if("B".equals(requestedGrade)) {
			return new BmwCar(250, "meia bomba", "branco");
		}else {
			return new LancerCar(700, "quase vazio", "cinza");
		}
	}

}

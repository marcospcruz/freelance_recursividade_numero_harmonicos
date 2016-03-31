package freelance_recursividade_numero_harmonicos;

public class NumeroHarmonico {

	private double inicio = 1;

	public static void main(String args[]) {

		double i = new NumeroHarmonico().calculaNumeroHarmonico(10000);
		System.out.println("Numero harmonico: " + i);

	}

	/**
	 * 
	 * @param i
	 * @return
	 */
	private double calculaNumeroHarmonico(double i) {

		if (i == 1.0) {
			return 1.0;

		} else {

			return (1 / i) + calculaNumeroHarmonico(i - 1);

		}

	}

}

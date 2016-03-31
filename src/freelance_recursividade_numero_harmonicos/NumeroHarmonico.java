package freelance_recursividade_numero_harmonicos;

/**
 * Execução: java NumeroHarmonico <número inteiro>
 * 
 * @author
 *
 */
public class NumeroHarmonico {

	public static void main(String args[]) {

		try {

			double i = new NumeroHarmonico().calculaNumeroHarmonico(new Double(
					args[0]));

			System.out.println("Numero harmonico: " + i);
		
		} catch (Exception e) {
			System.out
					.println("Erro!\nExemplo: \"java NumeroHarmonico <número inteiro>\"");
		}

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

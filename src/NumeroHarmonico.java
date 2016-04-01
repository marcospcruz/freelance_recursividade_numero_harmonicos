/**
 * Resultados comparados com o site
 * http://www.math.utah.edu/~carlson/teaching/calculus/harmonic.html
 * 
 * Execução: java NumeroHarmonico <número inteiro>
 * 
 * @author
 *
 */
public class NumeroHarmonico {

	public static void main(String args[]) {

		try {

			double hn = new NumeroHarmonico().calculaNumeroHarmonico(Double
					.parseDouble(args[0]));

			System.out.println("Numero harmonico para o numero natural"
					+ args[0] + ": " + hn);

		} catch (Exception e) {
			System.out
					.println("Erro!\nExemplo: \"java NumeroHarmonico <numero inteiro>\"");
		}

	}

	/**
	 * Função responsável por calcular o número harmônico de um número natural.
	 * 
	 * @param numeroNatural
	 * @return
	 */
	private double calculaNumeroHarmonico(double numeroNatural) {

		if (numeroNatural == 1.0) {
			return 1.0;

		} else {

			return (1 / numeroNatural)
					+ calculaNumeroHarmonico(numeroNatural - 1);

		}

	}

}

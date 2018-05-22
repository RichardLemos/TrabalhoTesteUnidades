package control;

public class CalculadoraImc {
	public String calcularImc(double altura, double peso, String sexo, int idade) {

		double imc = peso / (altura * altura);
		
		// testeIdosoHomemBaixoPeso
		if (imc < 21.9 && sexo.equals("masculino") && idade > 65) {
			return "Baixo peso";
		}
		
		// testeIdosoHomemPesoNormal
		else if (imc >= 22 && imc <= 27 && sexo.equals("masculino") && idade > 65) {
			return "Peso normal";
		}
		
		// testeIdosoHomemSobrepeso
		else if (imc >= 27.1 && imc <= 32 && sexo.equals("masculino") && idade > 65) {

			return "Sobrepeso";
		}
		
		// testeIdosoHomemObesidadePrimeiroGrau
		else if (imc >= 30.1 && imc <= 35 && sexo.equals("masculino") && idade > 65) {

			return "Obesidade grau I";
		}
		
		else

			return null;

	}
}

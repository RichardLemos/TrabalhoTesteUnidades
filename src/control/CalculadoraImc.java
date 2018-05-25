package control;

public class CalculadoraImc {
	public String calcularImc(double altura, double peso, String sexo, int idade) {

		double imc = peso / (altura * altura);
		
		// Testes para Idosos homens acima de 65 anos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// testeIdosoHomemBaixoPeso
		if (imc < 21.9 && sexo.equals("masculino") && idade > 65) 
		{
			return "Baixo peso";
		}
		
		// testeIdosoHomemPesoNormal
		else if (imc >= 22 && imc <= 27 && sexo.equals("masculino") && idade > 65) 
		{
			return "Peso normal";
		}
		
		// testeIdosoHomemSobrepeso
		else if (imc >= 27.1 && imc <= 32 && sexo.equals("masculino") && idade > 65) 
		{

			return "Sobrepeso";
		}
		
		// testeIdosoHomemObesidadePrimeiroGrau
		else if (imc >= 30.1 && imc <= 35 && sexo.equals("masculino") && idade > 65) 
		{

			return "Obesidade grau I";
		}
		
		// testeIdosoHomemObesidadeSegundoGrau
		else if (imc >= 35.1 && imc <= 39 && sexo.equals("masculino") && idade > 65)
		{
			
			return "Obesidade grau II";
		}
		
		// testeIdosoHomemObesidadeTerceiroGrau
		else if (imc >= 40 && sexo.equals("masculino") && idade > 65)
		{
			
			return "Obesidade grau III (obesidade mórbida)";
		}
		
		// Testes para Idosas mulheres acima de 65 anos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// testeIdosaMulherBaixoPeso
		else if (imc <= 21.9 && sexo.equals("feminino") && idade > 65)
		{
			
			return "Baixo peso";
		}
		
		// testeIdosaMulherPesoNormal
		else if (imc >= 22 && imc <= 27 && sexo.equals("feminino") && idade > 65)
		{
			
			return "Peso normal"; 
		}
		
		// testeIdosaMulherSobrepeso
		else if (imc >= 27.1 && imc <= 32 && sexo.equals("feminino") && idade > 65)
		{
			
			return "Sobrepeso";
		}
		
		// testeIdosaMulherObesidadePrimeiroGrau
		else if (imc >= 32.1 && imc <= 37 && sexo.equals("feminino") && idade > 65)
		{
			
			return "Obesidade grau I";
		}
		
		// testeIdosaMulherObesidadeSegundoGrau
		else if (imc >= 37.1 && imc <= 41.9 && sexo.equals("feminino") && idade > 65)
		{
			
			return "Obesidade grau II";
		}
		
		// testeIdosaMulherObesidadeTerceiroGrau
		else if (imc >= 42 && sexo.equals("feminino") && idade > 65)
		{
			
			return "Obesidade grau III (obesidade mórbida)";
		}
		
		// Índice de massa corporal para adultos entre 20 e 65 anos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// testeAdultoBaixoPesoMuitoGrave
		else if (imc < 16 &&   idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Baixo peso muito grave";
		}
		
		// testeAdultoBaixoPesoGrave
		else if (imc >= 16 && imc <= 16.99 && idade >= 20 && idade <= 65 &&  (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Baixo peso grave";
		}
		
		// testeAdultoBaixoPeso
		else if (imc >= 17 && imc <= 18.49 && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Baixo peso";
		}
		
		// testeAdultoPesoNormal
		else if (imc >= 18.50 && imc <= 24.99 && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Peso normal";
		}
		
		// testeAdultoSobrepeso
		else if (imc >= 25 && imc <= 29.99  && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Sobrepeso";
		}
		
		// testeAdultoObesidadePrimeiroGrau
		else if (imc >= 30 && imc <= 34.99 && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Obesidade grau I";
		}
		 // testeAdultoObesidadeSegundoGrau
		else if (imc >= 35 && imc <= 39.99  && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Obesidade grau II";
		}
		
		// testeAdultoObesidadeTerceiroGrau
		else if (imc >= 40 && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino")))
		{
			
			return "Obesidade grau III (obesidade mórbida)";
		}
		
		// testeMeninoBaixoPeso
		else if (imc < 14 && sexo.equals("masculino") && idade >= 2 && idade <= 20) // Dados de acordo com o gráfico do site
		{
			
			return "Baixo peso";
		}
		
		// Condição de saída
		else

			return "ERROR 404 - NOT FOUND";

	}
}

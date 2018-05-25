package control;

public class CalculadoraImc {
	public String calcularImc(double altura, double peso, String sexo, int idade) {

		double imc = peso / (altura * altura);

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Testes para Idosos homens acima de 65 anos

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

		// testeIdosoHomemObesidadeSegundoGrau
		else if (imc >= 35.1 && imc <= 39 && sexo.equals("masculino") && idade > 65) {

			return "Obesidade grau II";
		}

		// testeIdosoHomemObesidadeTerceiroGrau
		else if (imc >= 40 && sexo.equals("masculino") && idade > 65) {

			return "Obesidade grau III (obesidade mórbida)";
		}

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Testes para Idosas mulheres acima de 65 anos

		// testeIdosaMulherBaixoPeso
		else if (imc <= 21.9 && sexo.equals("feminino") && idade > 65) {

			return "Baixo peso";
		}

		// testeIdosaMulherPesoNormal
		else if (imc >= 22 && imc <= 27 && sexo.equals("feminino") && idade > 65) {

			return "Peso normal";
		}

		// testeIdosaMulherSobrepeso
		else if (imc >= 27.1 && imc <= 32 && sexo.equals("feminino") && idade > 65) {

			return "Sobrepeso";
		}

		// testeIdosaMulherObesidadePrimeiroGrau
		else if (imc >= 32.1 && imc <= 37 && sexo.equals("feminino") && idade > 65) {

			return "Obesidade grau I";
		}

		// testeIdosaMulherObesidadeSegundoGrau
		else if (imc >= 37.1 && imc <= 41.9 && sexo.equals("feminino") && idade > 65) {

			return "Obesidade grau II";
		}

		// testeIdosaMulherObesidadeTerceiroGrau
		else if (imc >= 42 && sexo.equals("feminino") && idade > 65) {

			return "Obesidade grau III (obesidade mórbida)";
		}

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Índice de massa corporal para adultos entre 20 e 65 anos

		// testeAdultoBaixoPesoMuitoGrave
		else if (imc < 16 && idade > 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Baixo peso muito grave";
		}

		// testeAdultoBaixoPesoGrave
		else if (imc >= 16 && imc <= 16.99 && idade > 20 && idade <= 65
				&& (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Baixo peso grave";
		}

		// testeAdultoBaixoPeso
		else if (imc >= 17 && imc <= 18.49 && idade > 20 && idade <= 65
				&& (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Baixo peso";
		}

		// testeAdultoPesoNormal
		else if (imc >= 18.50 && imc <= 24.99 && idade > 20 && idade <= 65
				&& (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Peso normal";
		}

		// testeAdultoSobrepeso
		else if (imc >= 25 && imc <= 29.99 && idade > 20 && idade <= 65
				&& (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Sobrepeso";
		}

		// testeAdultoObesidadePrimeiroGrau
		else if (imc >= 30 && imc <= 34.99 && idade >= 20 && idade <= 65
				&& (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Obesidade grau I";
		}
		// testeAdultoObesidadeSegundoGrau
		else if (imc >= 35 && imc <= 39.99 && idade >= 20 && idade <= 65
				&& (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Obesidade grau II";
		}

		// testeAdultoObesidadeTerceiroGrau
		else if (imc >= 40 && idade >= 20 && idade <= 65 && (sexo.equals("masculino") || sexo.equals("feminino"))) {

			return "Obesidade grau III (obesidade mórbida)";
		}
		
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Índice de massa corporal para Meninos
		
		// testeMeninoBaixoPeso
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 2){

			return "Baixo peso";
		}
		// testeMeninoIdadeDoisImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 2){
			return "Peso normal";
		}
		// testeMeninoIdadeDoisImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 2){

			return "Sobrepeso";
		}

		// testeMeninoIdadeDoisImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 2)

		{

			return "Obesidade";
		}
		// testeMeninoIdadeQuatroImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 4){

			return "Baixo peso";
		}

		// testeMeninoIdadeQuatroImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 4){

			return "Peso normal";
		}

		// testeMeninoIdadeQuatroImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 4){

			return "Sobrepeso";
		}

		// testeMeninoIdadeQuatroImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 4) {
			return "Obesidade";
		}

		// testeMeninoIdadeSeisImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 6) {
			return "Baixo peso";
		}

		// testeMeninoIdadeSeisImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 6) {
			return "Peso normal";
		}
		// testeMeninoIdadeSeisImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 6) {
			return "Sobrepeso";
		}

		// testeMeninoIdadeSeisImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 6) {
			return "Obesidade";
		}

		// testeMeninoIdadeOitoImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 8) {
			return "Baixo peso";
		}

		// testeMeninoIdadeOitoImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 8) {
			return "Peso normal";
		}

		// testeMeninoIdadeOitoImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 8) {
			return "Sobrepeso";
		}

		// testeMeninoIdadeOitoImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 8) {
			return "Obesidade";
		}
		// testeMeninoIdadeDezImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 10) {
			return "Baixo peso";
		}
		// testeMeninoIdadeDezImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 10) {
			return "Peso normal";
		}

		// testeMeninoIdadeDezImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 10) {
			return "Sobrepeso";
		}

		// testeMeninoIdadeDezImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 10) {
			return "Obesidade";
		}

		// testeMeninoIdadeDouzeImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 12) {
			return "Baixo peso";
		}

		// testeMeninoIdadeDouzeImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 12) {
			return "Peso normal";
		}
		// testeMeninoIdadeDouzeImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 12) {
			return "Sobrepeso";
		}

		// testeMeninoIdadeDouzeImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 12) {
			return "Obesidade";
		}

		// testeMeninoIdadeQuatorzeImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 14) {
			return "Baixo peso";
		}
		// testeMeninoIdadeQuatorzeImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 14) {
			return "Peso normal";
		}

		// testeMeninoIdadeQuatorzeImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 14) {
			return "Sobrepeso";
		}

		// testeMeninoIdadeQuatorzeImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 14) {
			return "Obesidade";
		}

		// testeMeninoIdadeDezesseisImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 16) {
			return "Baixo peso";
		}
		// testeMeninoIdadeDezesseisImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 16) {
			return "Baixo peso";
		}
		// testeMeninoIdadeDezesseisImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 16) {
			return "Sobrepeso";
		}

		// testeMeninoIdadeDezesseisImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 16) {
			return "Obesidade";
		}

		// testeMeninoIdadeDezoitoImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 18) {
			return "Baixo peso";
		}
		// testeMeninoIdadeDezoitoImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 18) {
			return "Peso normal";
		}
		// testeMeninoIdadeDezoitoImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 18) {
			return "Sobrepeso";
		}
		// testeMeninoIdadeDezoitoImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 18) {
			return "Obesidade";
		}
		// testeMeninoIdadeVinteImcQuatorze
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("masculino") && idade == 20) {
			return "Baixo peso";
		}

		// testeMeninoIdadeVinteImcDezesseis
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("masculino") && idade == 20) {
			return "Peso normal";
		}
		// testeMeninoIdadeVinteImcDezoito
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("masculino") && idade == 20) {
			return "Sobrepeso";
		}
		// testeMeninoIdadeVinteImcVinte
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("masculino") && idade == 20) {
			return "Obesidade";
		}

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Índice de massa corporal para Meninas
		
		// testeMeninaBaixoPeso
		// Idade 2
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 2) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 2) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 2) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 2) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 4
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 4) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 4) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 4) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 4) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 6
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 6) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 6) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 6) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 6) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 8
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 8) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 8) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 8) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 8) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 10
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 10) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 10) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 10) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 10) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 12
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 12) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 12) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 12) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 12) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 14
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 14) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 14) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 14) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 14) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 16
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 16) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 16) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 16) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 16) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 18
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 18) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 18) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 18) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 18) {

			return "Obesidade";
		}

		// testeMeninaBaixoPeso
		// Idade 20
		else if (imc >= 14 && imc <= 14.1 && sexo.equals("feminino") && idade == 20) {

			return "Baixo peso";
		}

		// testeMeninaPesoNormal
		else if (imc >= 16 && imc <= 16.1 && sexo.equals("feminino") && idade == 20) {

			return "Peso normal";
		}

		// testeMeninaSobrepeso
		else if (imc >= 18 && imc <= 18.1 && sexo.equals("feminino") && idade == 20) {

			return "Sobrepeso";
		}

		// testeMeninaObesidade
		else if (imc >= 20 && imc <= 20.1 && sexo.equals("feminino") && idade == 20) {

			return "Obesidade";
		}

		// Condição de saída
		else

			return "ERROR 404 - NOT FOUND";

	}
}

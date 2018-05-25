package tests;

import org.junit.Before;
import org.junit.Test;

import control.CalculadoraImc;
import junit.framework.Assert;

public class CalcImcTests {

	CalculadoraImc calc;

	// @Before - Anotação que indica o método que será executado toda vez antes
	// de
	// qualquer caso de teste ser executado.
	@Before
	public void setup() {

		// Objeto da classe Calculadora IMC
		calc = new CalculadoraImc();
	}

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// Índice de massa corporal para homens acima de 65 anos

	// @Test - Anotação JUnit que indica os métodos que serão testados nos casos
	// de
	// teste.
	@Test
	public void testeIdosoHomemBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(2.10, 50.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemPesoNormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 75.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.90, 100.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadePrimeiroGrau() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.90, 120.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeSegundoGrau() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.77, 121.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeTerceiroGrau() {
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.70, 119.00, "masculino", 66));
	}

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// Índice de massa corporal para mulheres acima de 65 anos

	@Test
	public void testeIdosaMulherBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.60, 53.00, "feminino", 67));
	}

	@Test
	public void testeIdosaMulherPesoNormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.60, 60.00, "feminino", 68));
	}

	@Test
	public void testeIdosaMulherSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 84.00, "feminino", 66));
	}

	@Test
	public void testeIdosaMulherObesidadePrimeiroGrau() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 93.00, "feminino", 66));
	}

	@Test
	public void testeIdosaMulherObesidadeSegundoGrau() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.62, 98.00, "feminino", 66));
	}

	@Test
	public void testeIdosaMulherObesidadeTerceiroGrau() {
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.65, 115.00, "feminino", 66));
	}

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// Índice de massa corporal para adultos entre 20 e 65 anos

	@Test
	public void testeAdultoBaixoPesoMuitoGrave() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.75, 48.00, "feminino", 35));
	}

	@Test
	public void testeAdultoBaixoPesoGrave() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.75, 50.00, "masculino", 35));
	}

	@Test
	public void testeAdultoBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 50.00, "feminino", 36));
	}

	@Test
	public void testeAdultoPesoNormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 55.00, "masculino", 36));
	}

	@Test
	public void testeAdultoSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.73, 77.00, "feminino", 36));
	}

	@Test
	public void testeAdultoObesidadePrimeiroGrau() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.67, 87.00, "masculino", 36));
	}

	@Test
	public void testeAdultoObesidadeSegundoGrau() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.80, 115.00, "feminino", 36));
	}

	@Test
	public void testeAdultoObesidadeTerceiroGrau() {
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.60, 110.00, "masculino", 36));
	}

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// Índice de massa corporal para meninos
	
	// Idade 2
	@Test
	public void testeMeninoIdadeDoisImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 2));
	}

	@Test
	public void testeMeninoIdadeDoisImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 2));
	}

	@Test
	public void testeMeninoIdadeDoisImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "masculino", 2));
	}

	@Test
	public void testeMeninoIdadeDoisImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 2));
	}
	
	// Idade 4
	@Test
	public void testeMeninoIdadeQuatroImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 4));
	}

	@Test
	public void testeMeninoIdadeQuatroImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 4));
	}

	@Test
	public void testeMeninoIdadeQuatroImcDezoito() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 4));
	}
	
	// Idade 6
	@Test
	public void testeMeninoIdadeSeisImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 6));
	}

	@Test
	public void testeMeninoIdadeSeisImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 6));
	}

	@Test
	public void testeMeninoIdadeSeisImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 6));
	}

	@Test
	public void testeMeninoIdadeSeisImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 6));
	}
	
	// Idade 8
	@Test
	public void testeMeninoIdadeOitoImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 8));
	}

	@Test
	public void testeMeninoIdadeOitoImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 8));
	}

	@Test
	public void testeMeninoIdadeOitoImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 8));
	}

	@Test
	public void testeMeninoIdadeOitoImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 8));
	}
	
	// Idade 10
	@Test
	public void testeMeninoIdadeDezImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 10));
	}

	@Test
	public void testeMeninoIdadeDezImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 10));
	}

	@Test
	public void testeMeninoIdadeDezImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 10));
	}

	@Test
	public void testeMeninoIdadeDezImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 10));
	}
	
	// Idade 12
	@Test
	public void testeMeninoIdadeDouzeImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 12));
	}

	@Test
	public void testeMeninoIdadeDouzeImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 12));
	}

	@Test
	public void testeMeninoIdadeDouzeImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 12));
	}

	@Test
	public void testeMeninoIdadeDouzeImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 12));
	}
	
	// Idade 14
	@Test
	public void testeMeninoIdadeQuatorzeImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 14));
	}

	@Test
	public void testeMeninoIdadeQuatorzeImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 14));
	}

	@Test
	public void testeMeninoIdadeQuatorzeImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 14));
	}

	@Test
	public void testeMeninoIdadeQuatorzeImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 14));
	}
	
	// Idade 16
	@Test
	public void testeMeninoIdadeDezesseisImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 16));
	}

	@Test
	public void testeMeninoIdadeDezesseisImcDezesseis() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.14, 20.82, "masculino", 16));
	}

	@Test
	public void testeMeninoIdadeDezesseisImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 16));
	}

	@Test
	public void testeMeninoIdadeDezesseisImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 16));
	}
	
	// Idade 18
	@Test
	public void testeMeninoIdadeDezoitoImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 18));
	}

	@Test
	public void testeMeninoIdadeDezoitoImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 18));
	}

	@Test
	public void testeMeninoIdadeDezoitoImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 18));
	}

	@Test
	public void testeMeninoIdadeDezoitoImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 18));
	}
	
	// Idade 20
	@Test
	public void testeMeninoIdadeVinteImcQuatorze() {

		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "masculino", 20));
	}

	@Test
	public void testeMeninoIdadeVinteImcDezesseis() {

		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "masculino", 20));
	}

	@Test
	public void testeMeninoIdadeVinteImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 23.82, "masculino", 20));
	}

	@Test
	public void testeMeninoIdadeVinteImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "masculino", 20));
	}

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// Índice de massa corporal para meninas
	
	// Idade 2
	@Test
	public void testeMeninaIdadeDoisImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 2));
	}

	@Test
	public void testeMeninaIdadeDoisImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 2));
	}

	@Test
	public void testeMeninaIdadeDoisImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 2));
	}

	@Test
	public void testeMeninaIdadeDoisImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 2));
	}
	
	// Idade 4
	@Test
	public void testeMeninaIdadeQuatroImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 4));
	}

	@Test
	public void testeMeninaIdadeQuatroImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 4));
	}

	@Test
	public void testeMeninaIdadeQuatroImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 4));
	}

	@Test
	public void testeMeninaIdadeQuatroImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 4));
	}
	
	// Idade 6
	@Test
	public void testeMeninaIdadeSeisImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 6));
	}

	@Test
	public void testeMeninaIdadeSeisImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 6));
	}

	@Test
	public void testeMeninaIdadeSeisImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 6));
	}

	@Test
	public void testeMeninaIdadeSeisImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 6));
	}
	
	// Idade 8
	@Test
	public void testeMeninaIdadeOitoImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 8));
	}

	@Test
	public void testeMeninaIdadeOitoImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 8));
	}

	@Test
	public void testeMeninaIdadeOitoImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 8));
	}

	@Test
	public void testeMeninaIdadeOitoImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 8));
	}
	
	// Idade 10
	@Test
	public void testeMeninaIdadeDezImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 10));
	}

	@Test
	public void testeMeninaIdadeDezImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 10));
	}

	@Test
	public void testeMeninaIdadeDezImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 10));
	}

	@Test
	public void testeMeninaIdadeDezImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 10));
	}
	
	// Idade 12
	@Test
	public void testeMeninaIdadeDozeImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 12));
	}

	@Test
	public void testeMeninaIdadeDozeImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 12));
	}

	@Test
	public void testeMeninaIdadeDozeImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 12));
	}

	@Test
	public void testeMeninaIdadeDozeImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 12));
	}
	
	// Idade 14
	@Test
	public void testeMeninaIdadeQuatorzeImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 14));
	}

	@Test
	public void testeMeninaIdadeQuatorzeImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 14));
	}

	@Test
	public void testeMeninaIdadeQuatorzeImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 14));
	}

	@Test
	public void testeMeninaIdadeQuatorzeImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 14));
	}
	
	// Idade 16
	@Test
	public void testeMeninaIdadeDezesseisImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 16));
	}

	@Test
	public void testeMeninaIdadeDezesseisImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 16));
	}

	@Test
	public void testeMeninaIdadeDezesseisImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 16));
	}

	@Test
	public void testeMeninaIdadeDezesseisImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 16));
	}
	
	// Idade 18
	@Test
	public void testeMeninaIdadeDezoitoImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 18));
	}

	@Test
	public void testeMeninaIdadeDezoitoImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 18));
	}

	@Test
	public void testeMeninaIdadeDezoitoImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 18));
	}

	@Test
	public void testeMeninaIdadeDezoitoImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 18));
	}
	
	// Idade 20
	@Test
	public void testeMeninaIdadeVinteImcQuatorze() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.110, 17.25, "feminino", 20));
	}

	@Test
	public void testeMeninaIdadeVinteImcDezesseis() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.14, 20.82, "feminino", 20));
	}

	@Test
	public void testeMeninaIdadeVinteImcDezoito() {

		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.79, "feminino", 20));
	}

	@Test
	public void testeMeninaIdadeVinteImcVinte() {

		Assert.assertEquals("Obesidade", calc.calcularImc(1.13, 25.55, "feminino", 20));
	}
}

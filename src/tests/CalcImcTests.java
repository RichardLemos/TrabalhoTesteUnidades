package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import control.CalculadoraImc;
import junit.framework.Assert;

public class CalcImcTests {

	CalculadoraImc calc;
	
	// @Before - Anota��o que indica o m�todo que ser� executado toda vez antes de qualquer caso de teste ser executado.
	@Before
	public void setup() {
		
		// Objeto da classe Calculadora IMC
		calc = new CalculadoraImc();
	}
	
	//  �ndice de massa corporal para homens acima de 65 anos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// @Test - Anota��o JUnit que indica os m�todos que ser�o testados nos casos de teste.
	@Test
	public void testeIdosoHomemBaixoPeso() 
	{
		Assert.assertEquals("Baixo peso", calc.calcularImc(2.10, 50.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemPesoNormal() 
	{
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 75.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemSobrepeso() 
	{
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.90, 100.00, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadePrimeiroGrau()
	{
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.90, 120.00, "masculino", 66));
	}
	
	@Test
	public void testeIdosoHomemObesidadeSegundoGrau()
	{
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.77, 121.00, "masculino", 66));
	}
	
	@Test
	public void testeIdosoHomemObesidadeTerceiroGrau()
	{
		Assert.assertEquals("Obesidade grau III (obesidade m�rbida)", calc.calcularImc(1.70, 119.00, "masculino", 66));
	}
	
	// �ndice de massa corporal para mulheres acima de 65 anos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test
	public void testeIdosaMulherBaixoPeso() 
	{
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.60, 53.00, "feminino", 67));
	}
	
	@Test
	public void testeIdosaMulherPesoNormal() 
	{
		Assert.assertEquals("Peso normal", calc.calcularImc(1.60, 60.00, "feminino", 68));
	}
	
	@Test
	public void testeIdosaMulherSobrepeso() 
	{
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 84.00, "feminino", 66));
	}
	
	@Test
	public void testeIdosaMulherObesidadePrimeiroGrau() 
	{
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 93.00, "feminino", 66));
	}
	
	@Test
	public void testeIdosaMulherObesidadeSegundoGrau() 
	{
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.62, 98.00, "feminino", 66));
	}
	
	@Test
	public void testeIdosaMulherObesidadeTerceiroGrau() 
	{
		Assert.assertEquals("Obesidade grau III (obesidade m�rbida)", calc.calcularImc(1.65, 115.00, "feminino", 66));
	}
	
	// �ndice de massa corporal para adultos entre 20 e 65 anos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test
	public void testeAdultoBaixoPesoMuitoGrave() 
	{
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.75, 48.00, "masculino", 35));
	}
	
	@Test
	public void testeAdultoBaixoPesoGrave() 
	{
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.75, 50.00, "masculino", 35));
	}
	
	@Test
	public void testeAdultoBaixoPeso() 
	{
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 50.00, "masculino", 36));
	}
	
	@Test
	public void testeAdultoPesoNormal() 
	{
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 55.00, "masculino", 36));
	}
	
	@Test
	public void testeAdultoSobrepeso() 
	{
		// Observa��o: Apresenta erro quando executado com o sexo "feminino", por�m, a condi��o possui sexo feminino e masculino como v�lido.
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.73, 77.00, "masculino", 36));
	}
	
	@Test
	public void testeAdultoObesidadePrimeiroGrau() 
	{
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.67, 87.00, "masculino", 36));
	}
	
	@Test
	public void testeAdultoObesidadeSegundoGrau() 
	{
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.80, 115.00, "masculino", 36));
	}
	
	@Test
	public void testeAdultoObesidadeTerceiroGrau() 
	{
		Assert.assertEquals("Obesidade grau III (obesidade m�rbida)", calc.calcularImc(1.60, 110.00, "masculino", 36));
	}
	
	// �ndice de massa corporal para meninos ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test
	public void testeMeninoBaixoPeso() 
	{
		// Observa��o: Apresenta erro, por�m, o c�digo est� correto e os dados de entrada se encaixam corretamente com o resultado esperado.
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.77, 43.00, "masculino", 19));
	}
}

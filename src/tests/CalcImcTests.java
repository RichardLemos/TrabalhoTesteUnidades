package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import control.CalculadoraImc;
import junit.framework.Assert;

public class CalcImcTests {

	CalculadoraImc calc;

	@Before
	public void setup() {

		calc = new CalculadoraImc();
	}

	// /* @Test Exemplo
	// public void testeAdultoBaixoPesoMuitoGraveLimiteMaximo() {
	// Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(2.10, 70.49,
	// "masculino", 65));
	// } */

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

}

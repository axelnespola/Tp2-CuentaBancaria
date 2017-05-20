package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void devolverElSaldoCorrectamente() {
		CuentaSueldo miCuenta = new CuentaSueldo();
		Double resultadoEsperado = 4000.00;
		
		miCuenta.setDepositar(4000.00);
		
		assertEquals(resultadoEsperado, miCuenta.getSaldo());
	}
	
	@Test
	public void extraerSaldoCorrectamente(){
		
		CuentaSueldo miCuenta = new CuentaSueldo();
		Double resultadoEsperado = 500.00;
		
		miCuenta.setDepositar(4000.00);
		miCuenta.getExtraerDinero(3500.00);
		
		assertEquals(resultadoEsperado, miCuenta.getSaldo());
	}

}

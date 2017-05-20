package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	
	@Test
	public void depositarConNormalidad() {
		CuentaCorriente miCuenta = new CuentaCorriente();
		Double resultadoEsperado = 20.00;
			
		miCuenta.setDepositar(20.00);
			
		assertEquals(resultadoEsperado, miCuenta.getSaldo());
	}

	@Test
	public void extraerConNormalidad(){
		CuentaCorriente miCuenta = new CuentaCorriente();
		Double resultadoEsperado = 10.00;
		
		miCuenta.setDepositar(30.00);
		miCuenta.getExtraerDinero(20.00);
		
		assertEquals(resultadoEsperado, miCuenta.getSaldo());
	}
	
	
	@Test
	public void extraerMasDeLoQueTengoYNoMasDeLoPermitido() {
		
	CuentaCorriente miCuenta = new CuentaCorriente();
	Double resultadoEsperado = -10.5;
	
	miCuenta.setDepositar(30.00);
	miCuenta.getExtraerDinero(40.00);
	assertEquals(resultadoEsperado, miCuenta.getSaldo());
	}

}



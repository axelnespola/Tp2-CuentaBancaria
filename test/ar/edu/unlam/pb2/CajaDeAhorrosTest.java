package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorrosTest {

	@Test
	
	public void cargarSaldoCorrectamente() {
		CajaDeAhorro miCaja = new CajaDeAhorro();
		Double resultadoEsperado = 300.00;
		
		miCaja.setDepositar(300.00);
		
		assertEquals(resultadoEsperado, miCaja.getSaldo());
	}
	
	@Test
	public void extraerCorrectamente() {
		CajaDeAhorro miCaja = new CajaDeAhorro();
		Double resultadoEsperado = 200.00;
		
		miCaja.setDepositar(300.00);
		miCaja.setExtraerDinero(100.00);
		
		assertEquals(resultadoEsperado, miCaja.getSaldo());
	}
	
	@Test
	public void recargarSeisLuegoDeLaQuitaExtraccion() {
		CajaDeAhorro miCaja = new CajaDeAhorro();
		Double resultadoEsperado = 200.00;
		
		miCaja.setDepositar(500.00);
		System.out.println(miCaja.getSaldo());
		miCaja.setExtraerDinero(45.00);
		System.out.println(miCaja.getSaldo());
		miCaja.setExtraerDinero(15.00);
		System.out.println(miCaja.getSaldo());
		miCaja.setExtraerDinero(35.00);
		System.out.println(miCaja.getSaldo());
		miCaja.setExtraerDinero(85.00);
		System.out.println(miCaja.getSaldo());
		miCaja.setExtraerDinero(22.00);
		System.out.println(miCaja.getSaldo());
		miCaja.setExtraerDinero(92.00);
		System.out.println(miCaja.getSaldo());
		assertEquals(resultadoEsperado, miCaja.getSaldo());
	}

}
	
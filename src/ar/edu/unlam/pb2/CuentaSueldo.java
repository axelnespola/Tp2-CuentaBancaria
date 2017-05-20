package ar.edu.unlam.pb2;

public class CuentaSueldo extends CuentaBancaria{

	public CuentaSueldo(){
		super();
	}
	
	public Double getExtraerDinero(Double importeQueSeVaARetirar){
		if(importeQueSeVaARetirar<=this.saldo){
			this.saldo -= importeQueSeVaARetirar;
			return importeQueSeVaARetirar;
		}
		else{
			return 0.0;
		}
	}
}

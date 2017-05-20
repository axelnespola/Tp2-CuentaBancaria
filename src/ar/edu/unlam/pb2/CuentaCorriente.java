package ar.edu.unlam.pb2;

public class CuentaCorriente extends CuentaBancaria {

	private final Double porcentajeComision = 1.05D;
	private final Double sobregiro = 150D;
	
	public CuentaCorriente(){
		super();
	}
	
	public Double getPorcentajeComision(){
		return porcentajeComision;
	}
	
	public Double getSobregiro() {
		return sobregiro;
	}
	
	public Double getExtraerDinero(Double importeARetirar){
		Double importeRetirado = 0.0;
		
		if(importeARetirar<=super.getSaldo()){
			this.setSaldo(this.getSaldo() - importeARetirar);
			
		}
		
		else if(importeARetirar<=(super.getSaldo() + this.sobregiro)){
			this.setSaldo((this.getSaldo() - importeARetirar) * porcentajeComision);
		}
		
		return importeRetirado;
	}
}
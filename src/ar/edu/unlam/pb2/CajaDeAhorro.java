package ar.edu.unlam.pb2;

public class CajaDeAhorro extends CuentaBancaria {

	private final Double comisionExtraccion = 6D;
	
	public CajaDeAhorro(){
		super();
	}
	
	public void setExtraerDinero(Double importe){
		
		if(this.getCantidadDeExtracciones() > 4){
			this.setSaldo(this.getSaldo() - (importe+comisionExtraccion));
		}
		
		else if(this.getSaldo() >= importe){
			this.setSaldo(this.getSaldo() - importe);
			this.setCantidadDeExtracciones(1);
		}
		
	}
	
}


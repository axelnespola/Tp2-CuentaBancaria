package ar.edu.unlam.pb2;

public class CuentaBancaria {
	
		protected Double saldo;
		protected Integer cantidadDeExtracciones;
		
		public CuentaBancaria(){
			this.saldo = 0D;
			this.cantidadDeExtracciones = 0;
		}
		
		public void setDepositar(Double importe){
			this.saldo+=importe;
		}
		
		public Double getSaldo(){
			return saldo;
		}
		
		public void setSaldo(Double saldo){
			this.saldo = saldo;
		}
		
		public Integer getCantidadDeExtracciones(){
			return cantidadDeExtracciones;	
		}
		
		public void setCantidadDeExtracciones(Integer cantidadDeExtracciones){
			this.cantidadDeExtracciones += cantidadDeExtracciones;
		}
	}

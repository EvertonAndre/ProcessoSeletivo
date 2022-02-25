package questao3;

public class Faturamento {
	
	
	private int dia;
	private Double valor;

	Faturamento[] faturamento;
	
	
	public Faturamento() {
		
	}
	
	public Faturamento(int dia, Double valor) {
		this.dia = dia;
		this.valor = valor;
	}
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Faturamento [dia:" + dia + ", valor=" + valor + "]";
	}
	
	public  double maiorFaturamentoDoMes(Faturamento[] faturamento) {
		double maior =0.0;
		for(int i=0; i<faturamento.length; i++) {
			if(faturamento[i].getValor()>maior) {
				maior = faturamento[i].getValor();
			}
		} return maior;
		
	}
	
	public  double menorFaturamentoNoMes(Faturamento[] faturamento, double maior) {
		double menor = maior;
		for(int i=0; i<faturamento.length; i++) {
			
			if(faturamento[i].getValor()< menor && faturamento[i].getValor()!= 0.0) {
				menor = faturamento[i].getValor();
			}
			
		} 
		
		return  menor;
	}
	
	public  double mediaTotalDoMes(Faturamento[] faturamento) {
		double media=0.0;
		double total= 0.0;
		int contador= 0;
		
		for(int i=0; i<faturamento.length; i++) {
			
			total = total + faturamento[i].getValor();
			if(faturamento[i].getValor() != 0.0){
			contador= contador +1;
			}
		}
		media = total/contador;
		
		return   media;
	}
	
	public  int diasEmQueOFaturamentoUltrapassouAMediaDoMes(Faturamento[] faturamento, double mediaTotalDoMes) {
		int contador=0;
		for(int i=0; i<faturamento.length; i++) {
			if(mediaTotalDoMes>faturamento[i].getValor() && faturamento[i].getValor() !=0.0) {
				contador = contador +1;
			}
		}
		return contador;
		
	} 
	
	

}

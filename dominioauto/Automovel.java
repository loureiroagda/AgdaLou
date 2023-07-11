package dominioauto;

public class Automovel {
	
	private int  ano, km, renavam, qntPorta;
	private String placa, chassi, combustivel, cor;
	private double valorLoc;
	
	public Automovel(String chassi, int ano, int km, int qntPorta, String placa, 
			int renavam, String combustivel, String cor, double valorLoc) 	
	{
		this.setChassi(chassi);
		this.setAno(ano);
		this.setKm(km);
		this.setQntPorta(qntPorta);
		this.setPlaca(placa);
		this.setRenavam(renavam);
		this.setCombustivel(combustivel);
		this.setCor(cor);
		this.setValorLoc(valorLoc);
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getQntPorta() {
		return qntPorta;
	}

	public void setQntPorta(int qntPorta) {
		this.qntPorta = qntPorta;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValorLoc() {
		return valorLoc;
	}

	public void setValorLoc(double valorLoc) {
		this.valorLoc = valorLoc;
	}
	
	
}

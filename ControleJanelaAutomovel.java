package controleauto;

import dominioauto.Automovel;
import dominioauto.DaoAutomovel;

public class ControleJanelaAutomovel {
	
	private Automovel auto = new Automovel(null, 0, 0, 0, null, 0, null, null, 0.0);
	private DaoAutomovel daoAuto = new DaoAutomovel();
	
	public void incluirAuto(int renavam, String chassi, String placa, int ano, String combustivel, int km, int qntPorta, String cor, double valorLoc)
	{
		
		auto.setChassi(chassi);
		auto.setAno(ano);
		auto.setKm(km);
		auto.setQntPorta(qntPorta);
		auto.setPlaca(placa);
		auto.setRenavam(renavam);
		auto.setCombustivel(combustivel);
		auto.setCor(cor);
		auto.setValorLoc(valorLoc);
		
		daoAuto.inserir(renavam, chassi, placa,  ano, combustivel, km, qntPorta, cor, valorLoc);
	}

}

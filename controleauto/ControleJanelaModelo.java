package controleauto;

import dominioauto.Modelo;
import dominioauto.DaoModelo;

public class ControleJanelaModelo {
	
	private Modelo mod = new Modelo(null);
	private DaoModelo daoMod = new DaoModelo();
	
	public void incluirModelo(String modelo)
	{
		mod.setModelo(modelo);
		
		daoMod.inserir(modelo);
	}

}

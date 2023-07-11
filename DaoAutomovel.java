package dominioauto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoAutomovel {
	
	static final String url = "jdbc:postgresql://localhost:5432/Locadora";
	   
    public void inserir(int renavam, String chassi, String placa,  int ano, String combustivel, int km, int porta, String cor, double valor) 
    {
        String sql = "INSERT INTO automovel(renavam, chassi, placa, ano, combustivel, km, porta, cor, valor) VALUES"
        		+ " ('" + renavam + "', '" + chassi + "', '" + placa + "', '" + ano + "', '"+ combustivel + "', '" + km + "',"
        				+ " '" + porta + "', '" + cor + "', " + valor + ")";
   
        try {
            Connection conexao = DriverManager.getConnection(url, "postgres", "12345");
            PreparedStatement inclusao = conexao.prepareStatement(sql);
            inclusao.execute();
        }
        catch (SQLException e) {
            System.out.println("Nao foi possivel acessar o BD");
            System.out.println(e);
        }
    }

}

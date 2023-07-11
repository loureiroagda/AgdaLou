package dominioauto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoModelo {
	
	static final String url = "jdbc:postgresql://localhost:5432/Locadora";
	   
    public void inserir(String modelo) 
    {
        String sql = "INSERT INTO modelo(modelo) VALUES"
        		+ " ('" + modelo + "')";
   
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

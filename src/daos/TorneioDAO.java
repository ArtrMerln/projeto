package daos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


import models.Torneio;

public class TorneioDAO {

	private Connection connection;
	
	
	
	public TorneioDAO () {
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean inserir (Torneio torneio) {
		
		
		String sql = "insert into Torneio ( nome, qtdRodadas, qtdJogadores) values (?,?,?)";
		
		
		
		try { 
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			
					
			stmt.setString(1, torneio.getNome());
			stmt.setInt(2, torneio.getQtdRodadas());
			stmt.setInt(3, torneio.getQtdRodadas());
			
			stmt.execute();
			stmt.close();
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

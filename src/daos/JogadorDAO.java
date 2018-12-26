package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




import java.sql.PreparedStatement;
import models.Jogador;
import models.Torneio;

public class JogadorDAO {

	private Connection connection;

	public JogadorDAO() {
		connection = ConnectionFactory.getConnection();

	}

	public boolean inserir(Jogador jogador) {

		String sql = "insert into Jogador (nome) values (?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			TorneioDAO tdao = new TorneioDAO();
			Torneio tn = new Torneio();

			for (int i = 0; i < tn.getQtdJogadores(); i++) {

				stmt.setString(1, jogador.getNome());

				stmt.execute();
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public List<Jogador> getListaNome() {

		try {
			List<Jogador> jogadores = new ArrayList<Jogador>();
			PreparedStatement stmt = connection.prepareStatement("select * from Jogador");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Jogador jogador = new Jogador();
				jogador.setNome(rs.getString("nome"));
				jogadores.add(jogador);

			}
			rs.close();
			stmt.close();
			return jogadores;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}

package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Usuario;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	public void adiciona(Usuario usuario) {
		String sql = "insert into usuario(nome, email, telefone, senha) values (?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getTelefone());
			stmt.setString(4, usuario.getSenha());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

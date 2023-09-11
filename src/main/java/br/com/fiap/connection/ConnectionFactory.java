package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String ORACLE = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

	public Connection conectar() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(ORACLE, "rm93360", "100903");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}

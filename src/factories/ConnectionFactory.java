package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection obterConexao() {
		
		try {
	
			var host = "jdbc:postgresql://localhost:5432/bdprojetocliente";
			var user = "postgres";
			var pass = "coti";

			return DriverManager.getConnection(host, user, pass);
		}
		
		catch(Exception e) {
			System.out.println("\nFalha ao conectar com o PostgreeSQL: " + e.getMessage());
			return null; 
		
		
	}
		
	}
}
	
		

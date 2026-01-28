package repositories;


import entities.Cliente;
import factories.ConnectionFactory;

public class ClienteRepository {
	
	public void inserir(Cliente cliente) {
		
		try {
			
			var factory = new ConnectionFactory();
			var connection = factory.obterConexao();
			
			var sql = """
						INSERT INTO clientes (nome, email, telefone)
						VALUES(?, ?, ?)
					""";

			var statement = connection.prepareStatement(sql);
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getEmail());
			statement.setString(3, cliente.getTelefone());
			statement.execute(); 
			
			connection.close(); 
			
			System.out.println("\nCliente cadastrado com sucesso!");
		}
		
		catch(Exception e) {
			System.out.println("\nFalha ao inserir cliente: " + e.getMessage());
		}
		
	}
		
	public void atualizar(Cliente cliente) {
		
		try {
			var factory = new ConnectionFactory();
			var connection = factory.obterConexao();
			
			var sql = """
					  UPDATE clientes SET nome = ?, email = ?, telefone = ?
					  WHERE id = ?
					""";
			var statement = connection.prepareStatement(sql);
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getEmail());
			statement.setString(3, cliente.getTelefone());
			statement.setInt(4, cliente.getId());
			var rowsAffected = statement.executeUpdate(); 
			
			connection.close();
			
			if(rowsAffected == 1) { 
				System.out.println("\nCliente atualizado com sucesso!");
				
			} 
			
			else {
				System.out.println("\nAtualização não foi concluída. Verifique o ID informado.");
				
			}
			
		}
		
		catch (Exception e) {
			System.out.println("\nFalha ao atualizar cliente: " + e.getMessage());
		}
	}
		
	public void excluir(Integer id) {
		
		try {
			
			var factory = new ConnectionFactory();
			var connection = factory.obterConexao();
			
			var sql = """
						DELETE FROM clientes WHERE id = ?
					""";
			
			var statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			
			var rowsAffected = statement.executeUpdate(); 
			
			connection.close();
			
			if(rowsAffected == 1) {
				System.out.println("\nCliente excluído com sucesso!");
			}
			
			else {
				System.out.println("\nExclusão não concluída. Verifique o ID informado.");
			}
		}
		
		catch(Exception e) {
			System.out.println("\nFalha ao excluir cliente: " + e.getMessage());
		}
	}
	
	public void consultar() {
		
		try {
			
			var factory = new ConnectionFactory();
			var connection = factory.obterConexao();
			
			var sql = """
					   SELECT * FROM clientes
					   ORDER BY id
					""";
			
			var statement = connection.prepareStatement(sql);
			var result = statement.executeQuery();
			
			while(result.next()) {
				System.out.println("ID.........: " + result.getInt("id"));
				System.out.println("NOME.......: " + result.getString("nome"));
				System.out.println("EMAIL......: " + result.getString("email"));
				System.out.println("TELEFONE...: " + result.getString("telefone"));
				System.out.println("...");
			}
			
			connection.close();		}
	
		catch(Exception e) {
			System.out.println("\nFalha ao consultar clientes: " + e.getMessage());
	}
	
}
}

package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {

	/*
	 * cadastrar, atualizar, excluir e consultar clientes.
	 */
	
	private Scanner scanner = new Scanner (System.in);
	
	public void gerenciarClientes() {
		System.out.println("*** PROJETO CLIENTE ***");
		System.out.println("(1) CADASTRAR CLIENTE ");
		System.out.println("(2) ATUALIZAR CLIENTE ");
		System.out.println("(3) EXCLUIR CLIENTE ");
		System.out.println("(4) CONSULTAR CLIENTES ");
		
		System.out.print("\nINFORME A OPÇÃO DESEJADA: ");
		var opcao = scanner.nextLine();
		
		switch(opcao) {
		
		case "1":
			cadastrarCliente();
			break;
		
		case "2":
			atualizarCliente();
			break;
			
		case "3":
			excluirCliente();
		    break;	
		    
		case "4":
		    consultarClientes();
		    break;

			
			default:
				System.out.println("\nOPÇÃO INVÁLIDA!");
				break;
					
		}
		
	}
	
	private void cadastrarCliente() {
		
		System.out.println("\nCADASTRO DE CLIENTE: ");
		
	    var cliente = new Cliente();
	    
	    System.out.print("NOME........: ");
	    cliente.setNome(scanner.nextLine());
	    System.out.print("EMAIL.......: ");
	    cliente.setEmail(scanner.nextLine());
	    System.out.print("TELEFONE....: ");
	    cliente.setTelefone(scanner.nextLine());
	    
	    var clienteRepository = new ClienteRepository();
	    
	    clienteRepository.inserir(cliente);
	}
	
private void atualizarCliente() {
		
		System.out.println("\nATUALIZAÇÃO DE CLIENTE: ");
		
	    var cliente = new Cliente();
	    
	    System.out.print("ID DO CLIENTE....: ");
	    cliente.setId(Integer.parseInt(scanner.nextLine()));
	    System.out.print("NOME.............: ");
	    cliente.setNome(scanner.nextLine());
	    System.out.print("EMAIL............: ");
	    cliente.setEmail(scanner.nextLine());
	    System.out.print("TELEFONE.........: ");
	    cliente.setTelefone(scanner.nextLine());
	    
	    var clienteRepository = new ClienteRepository();
	    
	    clienteRepository.atualizar(cliente);
	}

private void excluirCliente() {
	
	System.out.println("\nEXCLUSÃO DE CLIENTE: ");
	
    
    System.out.print("ID DO CLIENTE....: ");
	var id = (Integer.parseInt(scanner.nextLine()));
    
    var clienteRepository = new ClienteRepository();
    
    clienteRepository.excluir(id);
}

private void consultarClientes() {
	
	System.out.println("\nCONSULTA DE CLIENTES: \n");
	
	var clienteRepository = new ClienteRepository();
	
	clienteRepository.consultar();
}


}

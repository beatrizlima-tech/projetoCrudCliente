package entities;

public class Cliente {

	/*
	 * Id (Númerico inteiro) Nome (Texto) Email (Texto) Telefone (Texto)
	 */

	private Integer id;
	private String nome;
	private String email;
	private String telefone;

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

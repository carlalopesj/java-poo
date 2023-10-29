package trabalhofinal.crud;

public class User {
	private String nome;
	private String email;
	private int idUser = 0;
	
	public User(String nome, String email, int idUser) {
		this.nome = nome;
		this.email = email;
		idUser++;
		this.idUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
}

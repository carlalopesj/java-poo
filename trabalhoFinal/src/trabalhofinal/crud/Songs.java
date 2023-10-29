package trabalhofinal.crud;

public class Songs {
	
	private String nome;
	private String artista;
	private int anoLancamento;
	private String genero;
	private String codSong; //Resolver depois.
	
	public String getCodSong() {
		return codSong;
	}

	public void setCodSong(String codSong) {
		this.codSong = codSong;
	}

	public Songs (String nome, String artista, int anoLancamento, String genero) {
		this.nome = nome;
		this.artista = artista;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}

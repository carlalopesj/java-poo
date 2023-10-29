package trabalhofinal.crud;

public class Playlist {
	
	private User user;
	private Songs song;
	private String nomePlaylist;
	private String userPlaylist;
	
	
	public Playlist (String nomePlaylist,  User user) {
		this.nomePlaylist = nomePlaylist;
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Songs getSong() {
		return song;
	}

	public void setSong(Songs song) {
		this.song = song;
	}

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public void mostrarPlaylist() {
		System.out.println("=== Playlist ===");
		System.out.println("Título: " + this.nomePlaylist);
		System.out.println("Dono da Playlist: " + this.user);
		System.out.println("Músicas: " + this.song);
	}
	
}

package trabalhofinal.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Music {
	
	private static List<User> users;
	private static List<Songs> songs;
	private static List<Playlist> playlists;
	
	public Music() {
		users = new ArrayList<>();
		songs = new ArrayList<>();
		playlists = new ArrayList<>();
	}
	
	public static void adicionarMusica(Songs song) {
		songs.add(song);
	}
	public static void adicionarUser(User user) {
		users.add(user);
	}
	public static void adicionarPlaylist(Playlist playlist) {
		playlists.add(playlist);
	}
	
	public void listarMusicas() {
        System.out.println("***** Lista de Músicas: *****");
        for (Songs song : songs) {
            System.out.println("Nome: " + song.getNome() + ", Artista: " + song.getArtista() + ", Ano de Lançamento: " + song.getAnoLancamento() + ", Gênero: " + song.getGenero());
        }
    }

    public void listarUsers() {
        System.out.println("***** Lista de Usuários: *****");
        for (User user : users) {
            System.out.println("Nome: " + user.getNome() + ", E-mail: " + user.getEmail() + ", ID: " + user.getIdUser());
        }
    }
    
    public void listarPlaylists() {
        System.out.println("***** Lista de Playlists: *****");
        for (Playlist playlist : playlists) {
            System.out.println("Nome: " + playlist.getNomePlaylist() + ", User: " + playlist.getUser() + ", Músicas: " + playlist.getSong());
        }
    }
    
    
    
    private static void cadastrarUser() {
    	int idUser = 0;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nome do User: ");
    	String nome = scanner.nextLine();
    	System.out.println("E-mail: ");
    	String email = scanner.nextLine();
    	User user2 = new User(nome, email, idUser);
    	adicionarUser(user2);
    	System.out.println("Usuário cadastrado!");
    }
    
    private static void adicionarNovaMusica() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nome da Música: ");
    	String nomeMusica = scanner.nextLine();
    	System.out.println("Nome do(a) Artista: ");
    	String nomeArtista = scanner.nextLine();
    	System.out.println("Ano de lançamento: ");
    	int anoLancamento = scanner.nextInt();
    	System.out.println("Gênero da Música: ");
    	String generoMusica = scanner.nextLine();
    	Songs song2 = new Songs(nomeMusica, nomeArtista, anoLancamento, generoMusica);
    	adicionarMusica(song2);
    	System.out.println("Música adicionada!");
    }
    
    private static void criarPlaylist() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Qual o nome da playlist?");
    	String nomeDaPlaylist = scanner.nextLine();
    	System.out.println("Qual o nome do usuário?");
    	String userPlaylist = scanner.nextLine();
    	//Playlist playlist1 = new Playlist(nomeDaPlaylist, userPlaylist);
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Music sistema = new Music();
		
		int opcao = 0, sair = 0;
		
		User user1 = new User("Carla", "carla@email.com", 1);
		Songs song1 = new Songs("Perfect", "Ed Sheeran", 2017, "Pop");
		Playlist playlist = new Playlist("Sertanejo", user1);
		
		sistema.adicionarUser(user1);
		sistema.adicionarMusica(song1); 
		sistema.adicionarPlaylist(playlist);
		
		while (sair == 0) {
			System.out.println("---------------------------------------------------------\n< < < < < MENU > > > > >");
			System.out.println("1- Listar todas as músicas\n2- Listar todos os usuários: \n3- Cadastrar Usuário\n4- Adicionar música\n5- Listar Playlists\n6- Sair");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				sistema.listarMusicas();
				break;
				
			case 2:
				sistema.listarUsers();
				break;
						
			case 3:
				cadastrarUser();
				break;
				
			case 4:
				adicionarNovaMusica();
				break;
				
			case 5: 
				sistema.listarPlaylists();
				break;
				
			case 6:
				sair = 1;
				break;
				
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
			
		}

	}

}

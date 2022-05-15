package newInsta;
import java.util.*;

public abstract class Conta {
	
	protected String usuario;
	protected String login;
	protected String senha;
	protected String email;
	protected String biografia;
	protected ArrayList<String> seguidores = new ArrayList<String>();
	protected ArrayList<Post> publicacao = new ArrayList<Post>();
	protected ArrayList<String> seguindo = new ArrayList<String>();
	
	public Conta(String usuario, String login, String senha, String email, String biografia) {
		super();
		this.usuario = usuario;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.biografia = biografia;
		/*this.seguidores = seguidores;
		this.publicacao = publicacao;
		this.seguindo = seguindo;*/
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public ArrayList<String> getSeguidores() {
		return seguidores;
	}
	public void setSeguidores(ArrayList<String> seguidores) {
		this.seguidores = seguidores;
	}
	public ArrayList<Post> getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(ArrayList<Post> publicacao) {
		this.publicacao = publicacao;
	}
	public ArrayList<String> getSeguindo() {
		return seguindo;
	}
	public void setSeguindo(ArrayList<String> seguindo) {
		this.seguindo = seguindo;
	}
	
	public abstract String toString();
	
}

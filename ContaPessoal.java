package newInsta;

public class ContaPessoal extends Conta {

	public ContaPessoal(String usuario, String login, String senha, String email, String biografia) {
		super(usuario, login, senha, email, biografia);
	}
	
	@Override
	public String toString() {
		return ("Usuário: " + getUsuario() + ". Login: " + getLogin() + ". Senha: " + getSenha() + ". Email: "+ getEmail() + ". Email: " + getBiografia());
	}

}

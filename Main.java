package newInsta;

public class Main {
	public static void main(String[] agrs) {
		System.out.println("Bem vindo ao novo Instagram");
		outerloop:
		while(true) {
			System.out.println("Informe o dígito do comando:");
			System.out.println("1 - Entrar na conta");
			System.out.println("2 - Cadastrar a conta");
			System.out.println("3 - Sair do app");
			
			int comando = Util.readInt();
		
			switch(comando) {
				case 1:
					System.out.println("Informe o login");
					String login = Util.readStr();
					
					System.out.println("Informe a senha de acesso");
					String password = Util.readStr();
					
				case 2:
					System.out.println("Informe o nome completo");
					String nome = Util.readStr();
					
					System.out.println("Informe o nome de login");
					String user = Util.readStr();
					
					System.out.println("Informe a senha de acesso");
					String senha = Util.readStr();
					
					System.out.println("Digite o email");
					String email = Util.readStr();
					
					System.out.println("Digite a biografia");
					String biografia = Util.readStr();
					
					System.out.println("Conta criada com sucesso!");
					Conta conta = new ContaPessoal(nome, user, senha, email, biografia);
					System.out.println(conta);
				case 3:
					System.out.println("Tem certeza que deseja sair:");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					
					int comandoOut = Util.readInt();
					
					if(comandoOut == 1) {
						System.out.println("Tenha um bom dia!");
						break outerloop;
					}
					else if(comandoOut == 2) {
						System.out.println("Ok.");
					}
					else {
						System.out.println("ERRO. Comando inválido.");
					}
			}
		}
	}
}

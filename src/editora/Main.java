package editora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Utilidades ut = new Utilidades();
		
		Scanner scan = new Scanner(System.in);

		ListaLivros ll = new ListaLivros();
		ListaEditoras le = new ListaEditoras();

		int opcao = 0;

		while (opcao >= 0) {
			System.out.println("| Cadastro de Livros e Editoras |");
			System.out.println("1 - Cadastrar Editora");
			System.out.println("2 - Visualizar Editoras");
			System.out.println("3 - Cadastrar Livro");
			System.out.println("4 - Visualizar Livros");
			System.out.println("5 - Ver quantidade de Livros");
			System.out.println("6 - Ver quantidade de Editoras");
			System.out.println("7 - Apagar todos os Livros");
			System.out.println("8 - Apagar todas as Editoras");
			System.out.println("9 - Sair");

			opcao = scan.nextInt();

			switch (opcao) {
				case 1:
					ut.limparTela();
					Editora ed = new Editora();
					ut.limparTela();
					System.out.println("Digite o nome da editora: ");
					scan.nextLine();
					String nome = scan.nextLine();
					ed.setNome(nome);
					ut.limparTela();
					System.out.println("Digite o e-mail da editora: ");
					String email = scan.nextLine();
					ed.setEmail(email);
					ut.limparTela();
					System.out.println("Gerando ID...");
					ed.setId();
					le.adicionarEditora(ed);
					ut.limparTela();
					System.out.println("Editora cadastrada com sucesso!");
					ut.aguardaInput();
					break;
				case 2:
					if (le.getEditoras().isEmpty()) {
						ut.limparTela();
						System.out.println("Não há editoras cadastradas.");
						ut.aguardaInput();
					} else {
						ut.limparTela();
						System.out.println(le);
						ut.aguardaInput();
					}
					break;
				case 3:
					ut.limparTela();
					Livro li = new Livro();
					System.out.println("Digite o título da obra: ");
					scan.nextLine();
					String titulo = scan.nextLine();
					li.setTitulo(titulo);
					ut.limparTela();
					System.out.println("Digite o autor da obra: ");
					String autor = scan.nextLine();
					li.setAutor(autor);
					ut.limparTela();
					System.out.println("Digite o ano da obra: ");
					int ano = scan.nextInt();
					li.setAno(ano);
					ut.limparTela();
					System.out.println("Digite o ID da Editora:");
					System.out.println(le);
					int idEditora = scan.nextInt();
					li.setIdEditora(idEditora);
					ll.adicionarLivro(li);
					ut.limparTela();
					System.out.println("Livro cadastrado com sucesso!");
					ut.aguardaInput();
					break;
				case 4:
					if (ll.getLivros().isEmpty()) {
						ut.limparTela();
						System.out.println("Não há livros cadastrados.");
						ut.aguardaInput();
					} else {
						ut.limparTela();
						System.out.println(ll);
						ut.aguardaInput();
					}
					break;
				case 5:
					ut.limparTela();
					System.out.println("Existe(m) " + ll.obterQuantidadeDeLivros() + " livro(s) cadastrado(s).");
					ut.aguardaInput();
					break;
				case 6:
					ut.limparTela();
					System.out.println("Existe(m) " + le.obterQuantidadeDeEditoras() + " editora(s) cadastrada(s).");
					ut.aguardaInput();
					break;
				case 7:
					if (ll.getLivros().isEmpty()) {
						ut.limparTela();
						System.out.println("Não há livros para excluir.");
						ut.aguardaInput();
					} else {
						ut.limparTela();
						System.out.println(
								"ATENÇÃO!\nConfirma a remoção de todos os LIVROS do sistema?\n1 - Sim\n2 - Não");
						int exclusao = scan.nextInt();
						if (exclusao == 1) {
							ll.apagarTudo();
							System.out.println("Livros excluídos com sucesso!");
							ut.aguardaInput();
						} else {
							ut.limparTela();
							System.out.println("Operação cancelada.");
							ut.aguardaInput();
						}
					}
					break;
				case 8:
					if (le.getEditoras().isEmpty()) {
						ut.limparTela();
						System.out.println("Não há editoras para excluir.");
						ut.aguardaInput();
					} else {
						ut.limparTela();
						System.out.println(
								"ATENÇÃO!\nConfirma a remoção de todas as EDITORAS do sistema?\n1 - Sim\n2 - Não");
						int exclusao = scan.nextInt();
						if (exclusao == 1) {
							le.apagarTudo();
							System.out.println("Editoras excluídas com sucesso!");
							ut.aguardaInput();
						} else {
							ut.limparTela();
							System.out.println("Operação cancelada.");
							ut.aguardaInput();
						}
					}
					break;
				case 9:
					ut.limparTela();
					System.out.println("Sistema encerrado.");
					opcao = -1;
					ut.aguardaInput();
					break;
				default:
					ut.limparTela();
					System.out.println("Opção inválida.");
					ut.aguardaInput();
			}
		}
		scan.close();
	}
}

package editora;

import java.util.ArrayList;

public class ListaLivros {

    private ArrayList<Livro> livros;

	// construtor que inicializa o atributo(vari�vel)
	public ListaLivros() {
		livros = new ArrayList<Livro>();
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Lista de Livros:" + livros;
	}

	public void adicionarLivro(Livro liv) {
		this.livros.add(liv);
	}

	public void apagarTudo() {
		this.livros.clear();
	}

	public int obterQuantidadeDeLivros() {
		return this.livros.size();
	}
    
}

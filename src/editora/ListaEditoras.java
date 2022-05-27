package editora;

import java.util.ArrayList;

public class ListaEditoras {

    private ArrayList<Editora> editoras;

	public ListaEditoras() {
		editoras = new ArrayList<Editora>();
	}

	public ArrayList<Editora> getEditoras() {
		return editoras;
	}

	public void setEditoras(ArrayList<Editora> editoras) {
		this.editoras = editoras;
	}

	@Override
	public String toString() {
		return "Lista de Editoras:" + editoras;
	}

	public void adicionarEditora(Editora ed) {
		this.editoras.add(ed);
	}

	public void apagarTudo() {
		this.editoras.clear();
	}

	public int obterQuantidadeDeEditoras() {
		return this.editoras.size();
	}
    
}

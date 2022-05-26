package editora;

import java.util.Random;

public class Editora {

    private Long id;
    private String nome;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId() {
        Random rand = new Random();
        int limite = 1000;
        long novoId = rand.nextLong(limite);
        this.id = novoId;
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

    @Override
    public String toString() {
        return "\n\n|Nome: " + this.nome + "\n|ID: " + this.id + "\n|Email: " + this.email + "";
    }
}

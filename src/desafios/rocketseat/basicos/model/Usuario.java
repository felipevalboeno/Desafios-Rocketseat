package desafios.rocketseat.basicos.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> historicoEmprestimos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void adicionarHistorico(Livro livro) {
        historicoEmprestimos.add(livro);
    }

    public String getNome() {
        return nome;
    }

    public void mostrarHistorico() {
        System.out.println(" Histórico de " + nome + ":");
        for (Livro livro : historicoEmprestimos) {
            System.out.println("- " + livro.getNome());
        }
    }
}
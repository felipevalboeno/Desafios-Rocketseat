package desafios.rocketseat.basicos.estrutura.base;

import java.util.ArrayList;
import java.util.List;

import desafios.rocketseat.basicos.model.Livro;
import desafios.rocketseat.basicos.model.Usuario;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String nome, String autor, String isbn) {
        livros.add(new Livro(nome, autor, isbn));
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }
 
    public void listarTodosLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public boolean emprestarLivro(String isbn, Usuario usuario) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn) && livro.isDisponivel()) {
                livro.emprestar();
                usuario.adicionarHistorico(livro);
                System.out.println(" Empr�stimo realizado: " + livro.getNome());
                return true;
            }
        }
        System.out.println(" Livro n�o encontrado ou j� emprestado.");
        return false;
    }

    public boolean devolverLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn) && !livro.isDisponivel()) {
                livro.devolver();
                System.out.println(" Devolu��o realizada: " + livro.getNome());
                return true;
            }
        }
        System.out.println(" Livro n�o est� emprestado ou n�o encontrado.");
        return false;
    }
}

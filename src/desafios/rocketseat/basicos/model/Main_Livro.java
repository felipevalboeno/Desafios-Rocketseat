package desafios.rocketseat.basicos.model;

import java.util.Scanner;

import desafios.rocketseat.basicos.estrutura.base.Biblioteca;

public class Main_Livro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro("1984", "George Orwell", "001");
        biblioteca.adicionarLivro("A Revolução dos Bichos", "George Orwell", "002");
        biblioteca.adicionarLivro("O Hobbit", "J.R.R. Tolkien", "003");

        System.out.print("Informe seu nome: ");
        String nomeUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nomeUsuario);

        int opcao;
        do {
            System.out.println("\n=== MENU BIBLIOTECA ===");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Listar livros disponíveis");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Ver histórico de empréstimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    biblioteca.listarTodosLivros();
                    break;
                case 2:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 3:
                    System.out.print("Digite o ISBN do livro a emprestar: ");
                    String isbnEmprestar = scanner.nextLine();
                    biblioteca.emprestarLivro(isbnEmprestar, usuario);
                    break;
                case 4:
                    System.out.print("Digite o ISBN do livro a devolver: ");
                    String isbnDevolver = scanner.nextLine();
                    biblioteca.devolverLivro(isbnDevolver);
                    break;
                case 5:
                    usuario.mostrarHistorico();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}


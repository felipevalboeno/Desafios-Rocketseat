package desafios.rocketseat.basicos.model;

public class Livro {
    private String nome;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String nome, String autor, String isbn) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public boolean isDisponivel() {
        return !emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", status=" + (emprestado ? "Emprestado" : "Disponível") +
                '}';
    }
}
	
	
	
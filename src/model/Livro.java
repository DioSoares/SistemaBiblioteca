package model;

public class Livro {
    private Long id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public Livro(Long id, String titulo, String autor, int anoPublicacao){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }
}

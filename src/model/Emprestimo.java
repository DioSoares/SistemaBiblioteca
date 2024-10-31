package model;

import java.time.LocalDate;

public class Emprestimo {
    private Long id;
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestismo;
    private LocalDate dataDevolucao;

    public Emprestimo(Long id, Livro livro, Usuario usuario, LocalDate dataEmprestismo){
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestismo = dataEmprestismo;
    }
}

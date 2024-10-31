package model;

public class Usuario {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Usuario(Long id, String nome, String endereco, String telefone, String email){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}

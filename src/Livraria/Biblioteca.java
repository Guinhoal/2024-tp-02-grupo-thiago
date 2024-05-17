package Livraria;

public class Biblioteca {
    private Livros[] livros;
    private Usuario[] usuarios;
    private static String nome;
    private int maxLivros;
    private int qtdLivros;

    Biblioteca(String nome){
        Biblioteca.nome = nome;
        this.maxLivros = 1000;
        this.qtdLivros = 0;
        this.livros = new Livros[maxLivros];
        this.usuarios = new Usuario[100];
    }

    public Livros[] getLivros() {
        return livros;
    }

    public void setLivros(Livros[] livros) {
        this.livros = livros;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Biblioteca.nome = nome;
    }

    public int getMaxLivros() {
        return maxLivros;
    }

    public void setMaxLivros(int maxLivros) {
        this.maxLivros = maxLivros;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }
}


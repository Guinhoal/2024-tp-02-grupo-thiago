package Livraria;

public class Livros {

    private int id; //privando todas as variaveis
    private String titulo;
    private String autor;
    private int anoDePublicidade = 0;
    private String editora;
    private String categoria;
    private boolean disponivel = true;
    private int quantidade = 0;

    Livros(int id, String titulo, String autor, int anoDePublicidade, String editora, String categoria, int quantidade) {
        this.id = id;//metodos construtores
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicidade = anoDePublicidade;
        this.editora = editora;
        this.categoria = categoria;
        this.disponivel = true;
        this.quantidade = quantidade;

    }
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoDePublicidade(){
        return anoDePublicidade;
    }
    public String getEditora(){
        return editora;
    }
    public String getCategoria(){
        return categoria;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAnoDePublicidade(int anoDePublicidade){
        this.anoDePublicidade = anoDePublicidade;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

public void imprimir() {
    System.out.println("ID: " + this.id);
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Ano de Publicidade: " + this.anoDePublicidade);
    System.out.println("Editora: " + this.editora);
    System.out.println("Categoria: " + this.categoria);
    System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
    System.out.println("Quantidade: " + this.quantidade);
}
}
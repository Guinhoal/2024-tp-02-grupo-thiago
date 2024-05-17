package Livraria;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static String nomeBiblioteca = "Biblioteca da UFABC";
    Scanner scan = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca(nomeBiblioteca);
    public static void main(String[] args){
        bemVindoABiblioteca();
        executarMenu();
    }

    public static void bemVindoABiblioteca(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Seja Bem - Vindo ao Sistema da Livraria!");
        System.out.println("Este é um serviço oferecido pela " + nomeBiblioteca);
        System.out.println("----------------------------------------------------------------");
    }

    public static int escolhaOpcao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Cadastrar Livro");
        System.out.println("3 - Exibir Livros Disponíveis");
        System.out.println("4 - Empréstimo de Livro");
        System.out.println("5 - Devolver Livro");
        System.out.println("6 - Sair");
        return scan.nextInt();
    }

    public static void executarMenu(){
        int opcao = 0;
        while(opcao != 6){
            opcao = escolhaOpcao();
            switch(opcao){
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    cadastrarLivro();
                    break;
                case 3:

                    break;
                case 4:
                    emprestimoDeLivros();
                    break;
                case 5:
                    devolverLivro();
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar o sistema da Livraria!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void cadastrarUsuario(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o tipo de usuário:");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Morador");
        int tipo = scan.nextInt();
        switch(tipo){
            case 1:
                Aluno aluno = Aluno.cadastrar();
                break;
            case 2:
                Professor professor = Professor.cadastrar();
                break;
            case 3:
                Morador morador = Morador.cadastrar();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void cadastrarLivro(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ID do livro:");
        int id = scan.nextInt();
        System.out.println("Digite o título do livro:");
        String titulo = scan.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scan.nextLine();
        System.out.println("Digite o ano de publicação do livro:");
        int ano = scan.nextInt();
        System.out.println("Digite a Editora do livro:");
        String editora = scan.nextLine();
        System.out.println("Digite a categoria do livro:");
        String categoria = scan.nextLine();
        System.out.println("Digite a quantidade do livro:");
        int quantidade = scan.nextInt();
        Livros livro = new Livros(id, titulo, autor, ano, editora, categoria, quantidade);
    }

    public static void exibirLivrosDisponiveis(){
        System.out.println("Livros disponíveis:");
        for(Livros livro : biblioteca.getLivros()){
            if(livro.isDisponivel()){
                livro.imprimir();
            }
        }
    }

    public static void emprestimoDeLivros(){

    }

    public static void devolverLivro(){

    }

}
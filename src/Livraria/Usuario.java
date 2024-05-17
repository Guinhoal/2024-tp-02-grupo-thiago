package Livraria;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

    public class Usuario {
        private String nome, cpf;
        private Date data;
        private int id, maxLivros;
        //private Livro[] livrosAlugados;

        Usuario(String nome, String cpf, Date data, int id, int maxLivros) {
            this.nome = nome;
            this.cpf = cpf;
            this.data = data;
            this.id = id;
            this.maxLivros = maxLivros;
        }

        Usuario(){}

        public Date getData() {
            return data;
        }

        public int getId() {
            return id;
        }

        public String getCpf() {
            return cpf;
        }

        public String getNome() {
            return nome;
        }

    /*public Livro getLivro(int index){
        if(index<livros.length){
            return livros[index];
        }else{
            return null;
        }
    }*/
    }


package Livraria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Aluno extends Usuario{
    private String escola;

    Aluno(String nome, String cpf, Date data, int id, String escola){
        super(nome, cpf, data, id, 5);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public static Aluno cadastrar(){
        try {
            Scanner scan = new Scanner(System.in);
            String nome, cpf, dataTemp, escola;
            int id;

            System.out.println("Nome: ");
            nome = scan.nextLine();

            System.out.println("CPF: ");
            cpf = scan.nextLine();

            System.out.println("Data (dd/MM/yyyy): ");
            dataTemp = scan.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(dataTemp);

            System.out.println("ID: ");
            id = scan.nextInt();
            scan.nextLine();

            System.out.println("Escola: ");
            escola = scan.nextLine();

            return new Aluno(nome, cpf, data, id, escola);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}


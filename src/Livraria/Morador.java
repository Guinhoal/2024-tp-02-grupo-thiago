package Livraria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

    public class Morador extends Usuario{

        Morador(String nome, String cpf, Date data, int id){
            super(nome, cpf, data, id, 2);
        }

        public static Morador cadastrar(){
            try {
                Scanner scan = new Scanner(System.in);
                String nome, cpf, dataTemp;
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

                return new Morador(nome, cpf, data, id);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }




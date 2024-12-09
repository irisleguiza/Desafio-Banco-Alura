import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Raul Perez";
        String tipoConta ="Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite sua opcao**
                1- Consultar saldo
                2- Tranferir valor
                3- Receber valor
                4- Sair
                
                """;
            Scanner leitura = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(" O saldo atualizado é  " + saldo);
            }else if (opcao == 2) {
                System.out.println("Qual é o valor que deseja transferir  ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Nao há saldo para realizar a transferencia  ");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Novo saldo  " + saldo);
                }
            }
            else if (opcao == 3) {
                System.out.println("Valor recebido:  ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Novo saldo:  " + saldo);
                } else if (opcao!=4) {
                System.out.println("Opcao invalida");
            }
            }
        }
    }


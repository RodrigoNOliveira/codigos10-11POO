package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private Scanner scanner = new Scanner(System.in);
    private List<Conta> ListaConta;



    public Banco() {
        ListaConta = new ArrayList<>();
    }




    private void cadastrarConta() {
        System.out.println("Tipo de Conta: ");
        System.out.println("1- Conta poupança");
        System.out.println("2- Conta Empresarial");
        System.out.print("Escolha uma opção: ");
        int valor = scanner.nextInt();
        System.out.println();
        System.out.println("Cadastrar Conta");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        Conta c = new Conta();
        if (valor == 1) {
            System.out.print("Taxa de rendimento(%): ");
            double rendimento = scanner.nextDouble();
            c = new ContaPoupanca(numero, nome, saldo, rendimento);

        } else {
            System.out.print("Limite de emprestimo: ");
            double limite = scanner.nextDouble();
            c = new ContaEmpresarial(numero, nome, saldo, limite);
        }
        ListaConta.add(c);
    }





    public void iniciar() {
        int opc = 0;

        do {
            System.out.println("Menu");
            System.out.println("1- Cadastro conta");
            System.out.println("2- Buscar conta");
            System.out.println("3- Imprimir conta");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    cadastrarConta();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Fechando Aplicativo.");
                    break;

                default:
                    System.out.println("Opção invalida.");
                    break;
            }

        } while (opc != 4);
    }

}

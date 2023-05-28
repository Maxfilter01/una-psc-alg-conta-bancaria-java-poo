import java.util.Scanner;
public class ContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Informacoes informacoes = new Informacoes();

        System.out.println("Conta Bancaria");

        System.out.println("Informe seu nome: ");
        informacoes.setNome(scanner.next());

        System.out.println("Informe o número da conta: ");
        informacoes.setNumeroConta(scanner.nextInt());

        System.out.println("Informe o saldo inicial: ");
        informacoes.setSaldoInicial(scanner.nextDouble());

        System.out.println("Conta bancaria criada com sucesso.");

        System.out.println("---------------------------------");

        System.out.println("Qual serviço deseja efetuar? \n(1)Depositar \n(2)Sacar\n(3)Mostrar Saldo");
        int opcao = scanner.nextInt();

        if(opcao == 3){
            System.out.println("O seu saldo é " + informacoes.getSaldoInicial());
        }

        if(opcao == 1){
            System.out.println("Digite o valor que deseja depositar: ");
            double deposito = scanner.nextDouble();
            informacoes.setSaldoInicial(informacoes.getSaldoInicial() + deposito);
        System.out.println("O Saldo atual após o deposito é: R$" + informacoes.getSaldoInicial());

        }
        if(opcao == 2){
            System.out.println("Digite o valor que deseja sacar:");
            double saque = scanner.nextDouble();
            if(saque > informacoes.getSaldoInicial()){
                System.out.println("Saldo insulficiente para realizar a operação");
            }
            else if(saque > 5000){
                System.out.println("Valor do saque acima do permitido");
            }
            else{
                informacoes.setSaldoInicial(informacoes.getSaldoInicial() - saque);
                System.out.println("Saldo após o saque é " + informacoes.getSaldoInicial());
            }
            
        }
        scanner.close();
        
    }
}
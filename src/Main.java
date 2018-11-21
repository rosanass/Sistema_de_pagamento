import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int aux = 1;
        while (aux != 0)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Escolha a opção desejada:");
            System.out.println("[0] Sair");
            System.out.println("[1] Cadastrar novo empregado");
            System.out.println("[2] Remover empregado");
            System.out.println("[3] Lançar um Cartão de Ponto");
            System.out.println("[4] Lançar um Resultado Venda");
            System.out.println("[5] Lançar uma taxa de serviço");
            System.out.println("[6] Alterar detalhes de um empregado");
            System.out.println("[7] Rodar a folha de pagamento para hoje");
            System.out.println("[8] Undo/redo");
            System.out.println("[9] Agenda de Pagamento");
            System.out.println("[10] Criação de Novas Agendas de Pagamento");
            int opcao = input.nextInt();
            aux = opcao;

            switch(opcao)
            {
                case 1:
                    System.out.println("CADASTRO DE EMPREGADO:");
                    System.out.println("Digite o nome completo do empregado:");
                    String nome = input.nextLine();
                    input.nextLine();
                    System.out.println("Digite o CPF:");
                    String cpf = input.nextLine();
                    System.out.println("Digite o endereço:");
                    String endereco = input.nextLine();
                    System.out.println("Tipo de emprego:");
                    String emprego = input.nextLine();

                    Empregado novoEmpregado = new Empregado(nome, cpf, endereco, emprego);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;

            }
        }

    }

}

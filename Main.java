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
                case 0;
                case 1;
                case 2;
                case 3;
                case 4;
                case 5;
                case 6;
                case 7;
                case 8;
                case 9;
                case 10;

            }
        }

    }

}

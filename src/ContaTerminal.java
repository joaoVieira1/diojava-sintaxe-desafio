//importação da biblioteca para utilização do Scanner
import java.util.Scanner;

/**
 * @author João Pedro da Silva Vieira
 * @since  06/05/2024
 * @version 1.0
 */

public class ContaTerminal {

    public static void main(String[] args) {
        //declaração de variáveis
        String nomeCliente;
        String agencia;
        double saldoCliente;
        int numeroConta;
        Scanner leitor; //variável de referência

        //criando objeto leitor
        leitor = new Scanner(System.in);

        //interação com possíveis usuários e leitura de dados
        System.out.println("Por favor, digite seu nome completo!");
        nomeCliente = leitor.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        agencia = leitor.next();

        //validação de formato da agencia
        while(!validarAgencia(agencia)){
            System.out.println("Formato de agência inválido, por favor, digite o número da agência!");
            agencia = leitor.next();
        }

        System.out.println("Por favor, digite o número da conta!");
        numeroConta = leitor.nextInt();

        System.out.println("Por favor, digite seu saldo!");
        saldoCliente = leitor.nextDouble();

        //impressão da mensagem final do programa
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +
                            numeroConta + " e seu saldo R$" + saldoCliente + " já está disponível para saque.");
    }

    /**
     * @param agencia paramêtro String referente à agencia do cliente
     * @return retorna o resultado da expressão regular referente ao formato de número da agência
     * */

    //método para validar o formato da agencia
    public static boolean validarAgencia(String agencia){
        boolean resultado;

        resultado = agencia.matches("\\d{3}-\\d{1}");

        return resultado;
    }

}

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception{
		//TODO: Conhecer e importar a classe Scanner
		
		//Exibir as mensagens para o nosso usuário
		
		//Obter pela scaner os valores digitados no terminal
		
		//exibir a mensagem "Conta criada!"
		
		Scanner sc = new Scanner(System.in);

        // Solicita os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = sc.nextDouble();

        // Exibe a mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        sc.close();
	}

}

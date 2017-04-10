import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {

		Banco Banco1 = new Banco();
		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual seu nome ?");
		Banco1.nome = leitor.next();

		System.out.println("Qual é a sua agencia ? ");
		Banco1.Agencia = leitor.next();

		System.out.println("Qual é o numero da conta ? ");
		Banco1.Nconta = leitor.nextInt();

		System.out.println("Qual é o seu CPF ? ");
		Banco1.cpf = leitor.next();

		System.out.println("Digite 1 para adicionar dinehiro e 2 para retirar dinheiro");
		Banco1.adc = leitor.nextDouble();

		System.out.println("Quanto ? ");
		Banco1.dinheiro = leitor.nextDouble();

		Banco1.InfoBanco();

		System.out.println("Nome da pessoa : " + Banco1.nome);
		System.out.println("A sua Agencia é : " + Banco1.Agencia);
		System.out.println("Seu Saldo é : " + Banco1.saldo);
		System.out.println("Seu CPF é : " + Banco1.cpf);
		System.out.println("O numero da conta é : " + Banco1.Nconta);

	}

}

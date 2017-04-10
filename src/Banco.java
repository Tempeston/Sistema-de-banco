
public class Banco {

	String nome;
	String Agencia;
	int Nconta;
	double saldo = 0;
	String cpf;
	double adc;
	double dinheiro;

	void InfoBanco() {
		if (adc <= 1) {
			saldo = saldo + dinheiro;

		} 
		
		else if(saldo == 0) 
		{
			System.out.println("Você não pode retirar dinheiro pois você nao possui saldo. ");

		}
		
		else
		{
			saldo = saldo - dinheiro;
		}

	}

}

package programa;

import java.util.Locale;
import java.util.Scanner;
import entidade.Conta;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("nome dona da conta: ");
		sc.nextLine();
		String nome = sc.next();
		
		System.out.print("sera feito deposito inicial (s/n)?");
		char resposta = sc.next().charAt(0);
		
		if (resposta=='s') {
			System.out.print("valor do deposito inicial ?");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta,nome,depositoInicial);
		}
		else {
			conta = new Conta(numeroConta,nome);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println();
		
		System.out.println("Conta atualizada: ");
		System.out.print(conta);
		
	
		System.out.println();
		System.out.print("Valor de saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println();

		System.out.println("Conta atualizada: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}

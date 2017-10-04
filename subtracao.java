import java.util.Scanner;

public class subtracao{
	public static void main (String args[]){
	Scanner entrada = new Scanner(System.in);

	int parcela1, parcela2, subtracao;

	parcela1 = entrada.nextInt();
	parcela2 = entrada.nextInt();

	subtracao = parcela1 - parcela2;
	System.out.println(subtracao);

	}
}
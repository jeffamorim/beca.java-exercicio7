import java.util.Scanner;
public class Arrays {
	
	
	public int [] numeros = new int[10];
	public int [] inverter = new int [10];
	public int i = 0;
	public int j = 9;
	
	public void receberArray() {
		while(i < 10) {
			System.out.println("Digite uma sequencias de 10 numero: ");
			numeros[i] = new Scanner(System.in).nextInt();
			i++;
		}
	}
	
	public void inverterOrdem() {
		System.out.println("A ordem dos numeros digitados inverdida é: ");
		while (j > -1) {
			System.out.println(numeros[j]);
			j--;
		}
	}
	
}

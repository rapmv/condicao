import java.util.Scanner;

public class horas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horas = sc.nextInt();
		
		if (horas <12) {
			System.out.println("bom dia");
		}
		else {
			if (horas<18) {
				System.out.println("boa tarde");
			}
			else {
				System.out.println("boa noite");
			}
		}

		System.out.println("oi");
		System.out.println("oi2");
		sc.close();
	}

}

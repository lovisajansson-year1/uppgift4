package uppgift4;
import java.util.Scanner;
public class konto extends Bankkonto{

	public static void main(String[] args) {
	
		Bankkonto skandia = new Bankkonto();
		skandia.setBalance(0);
		skandia.setNbr("lovisa");
		
		Scanner bank = new Scanner(System.in); //ny Scanner
		boolean start = true; //sant startvärde så att while loop ska köras
		while (start) {
			System.out.println("\n" + "Insättning eller uttag (0-insättning, 1-uttag): ");
			int input = bank.nextInt(); //läser in input
			
			if (input==0) { //om input är 0
				System.out.print("Ange belopp: "); 	
				skandia.credit(bank.nextDouble()); 
			}else if (input==1) { //om input är 1
				System.out.print("Ange belopp: ");
				skandia.withdraw(bank.nextDouble()); 
			}else if(input!=1 || input!=0) continue; //om input varken är 0 eller 1 startas while loop om	
			
			System.out.print("Saldo: " + skandia.getBalance()); //skriver saldo
			System.out.print("\n" + "Vill du avsluta? "); 
			String x = bank.next(); //läser in input
			if (!x.equals("J")) { //om input är "J"
			start= false; //whileloopens startvärde blir falskt och den slutar loopa
			System.out.print("saldo: " + skandia.getBalance());
			}else { //vid all annan input än "J" förblir start sant och whileloopen fortsätter
			}
			}
		System.out.print("process avslutas..."); //hejdå meddelande om "J" angetts och whileloopen avslutats
		bank.close();
	}
}

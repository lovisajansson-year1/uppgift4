package uppgift4;

public class test extends Bankkonto{

	public static void main(String[] args) {
	//testköra metoder hos klassen bankkonto
		Bankkonto account = new Bankkonto();
		account.setBalance(0);
		account.setNbr("123");
		account.credit(10);
		account.withdraw(5);
		System.out.print("konto:" + account.getNbr()+ " saldo:" + account.getBalance());
		
		
		
	}
}

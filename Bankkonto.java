package uppgift4;

public class Bankkonto {

	private String nbr;
	private double balance;
	private double credit;
	private double withdraw;

	public String getNbr() {
		return nbr;
	}
	public void setNbr(String newNbr) {
		nbr=newNbr;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void credit(double amount) {
		balance += amount;
	}
		
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}

package uppgift4;

public class Bankkonto {

	private String nbr;
	private double balance;
	
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
	public void credit(double amount) { //metoden ökar värdet på balance
		balance += amount; 
	}
		
	public void withdraw(double amount) { //metoden minskar värdet på balance
		balance -= amount;
	}
	
}

public class ContaCorrente {
	private int numDaConta;
	private double saldo;

	public ContaCorrente(int n, double s) {
		this.numDaConta = n;
		this.saldo = s;
		
	}
	
	public int getNumDaConta() {
		return numDaConta;
	}
	
	public double getSaldo() {
		return saldo;
		
	}
	public void setnumDaConta(int i) {
		this.numDaConta = i;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
	public double depositar (double qDeposito) {
		return this.saldo += qDeposito;
	}
	public double sacar (double qSacar) {
		return this.saldo -= qSacar;
	}
}

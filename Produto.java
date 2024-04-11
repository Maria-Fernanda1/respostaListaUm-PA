public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	private boolean validade;
	
	public Produto (String n, double p, int q, boolean v) {
		this.nome = n;
		this.preco = p;
		this.quantidade = q;
		this.validade = v;
		
	}
	public String getNome() {
		return nome;
		
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade; 
	}
	public boolean getValidade() {
		return validade;
	}
	public void setNome(String n) {
		this.nome = n;
	}	
	public void setPreco(double p) {
		this.preco = p;
	}
	public void setQuantidade(int q) {
		this.quantidade = q;
	}
	public void setValidade(boolean v) {
		this.validade = v;
	}
	public String toString() {
		return "Nome: " + nome +  "\nPreco:" + preco + "\nQuantidade: " + quantidade + "\nValidade: " + validade; 
				}
	public double calcularTotal() {
		return (this.preco* this.quantidade);
	}
}
	


public class Produto {
	
	private String nome;
	private double preco;
	private String fornecedor;
	private int codigoProduto;
	private int validade;
	private int estoque;
	
	public Produto(String nome, double preco, String fornecedor, int codigoProduto, int validade, int estoque) {
		
		this.nome = nome;
		this.preco = preco;
		this.fornecedor = fornecedor;
		this.codigoProduto = codigoProduto;
		this.validade = validade;
		this.estoque = estoque;
		
		
	}
	

	public void VenderProduto (int vendas) {
		this.estoque = estoque-vendas;
		
	}
	

	@Override
	public String toString() {
		return "nome: " + nome  + "\n" + "preco: " + preco + "\n" + "fornecedor: " + fornecedor + "\n" +  "codigoProduto: "
				+ codigoProduto + "\n"+ "validade: " + validade + "\n" + "estoque: " + estoque + "\n";
	}
	
	
	
	

}

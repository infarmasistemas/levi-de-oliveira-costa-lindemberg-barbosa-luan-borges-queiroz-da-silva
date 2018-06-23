
public class Cosmeticos extends Produto {
	
	private String tipoCosmetico; //ex: perfumaria, banho
	private String genero; //masculino ou feminino
	
	public Cosmeticos (String nome, double preco, String fornecedor, int codigoProduto, int validade, int estoque,String tipoCosmetico, String genero) {
		super(nome,preco, fornecedor, codigoProduto, validade,estoque);
		
		this.tipoCosmetico = tipoCosmetico;
		this.genero = genero;
		
		
	}

	@Override
	public String toString() {
		return super.toString() + "TipoCosmetico " +  this.tipoCosmetico + "\n"+ "Genero: " + genero+ "\n";
	}
	
	
	

}

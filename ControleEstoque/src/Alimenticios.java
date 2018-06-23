
public class Alimenticios extends Produto {
	
	private String tipoAlimenticio; //bebida,comida
	
	public Alimenticios (String nome, double preco, String fornecedor, int codigoProduto, int validade, int estoque, String tipoAlimenticio) {
		super(nome,preco, fornecedor, codigoProduto, validade, estoque);
		
		this.tipoAlimenticio = tipoAlimenticio;
		
		
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo Alimenticio: " + tipoAlimenticio + "\n";
	}

	
	

}

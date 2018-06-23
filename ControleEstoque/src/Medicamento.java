
public class Medicamento extends Produto {
	
	private String tipoMedicamento; //ex: antibiotico, antinflamatorio, analgesico...
	private String controlado; //precisa de receita?
	
	public Medicamento (String nome, double preco, String fornecedor, int codigoProduto, int validade, int estoque, String tipoMedicamento, String controlado) {
		super(nome,preco, fornecedor, codigoProduto,validade,estoque);
		
		this.tipoMedicamento = tipoMedicamento;
		this.controlado = controlado;	
	}
	

	@Override
	public String toString() {
		return super.toString() + "Tipo Medicamento: " + tipoMedicamento  + "\n" + "Remedio controlado?: " + controlado+ "\n" ;
	}
	
	

}

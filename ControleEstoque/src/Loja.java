
public class Loja {
	
	private int cnpj;
	private Produto vetor[];
	private int tamanho;
	private int i;
	private int vendas;
	
	//criando vetor com os objetos
	public Loja(int tamanho) {
		this.tamanho = tamanho;
		vetor = new Produto[tamanho];
		
	
	}

	public void CadastrarProduto(Produto p) {
		vetor[i] = p;
		i++;
	
	}
	

	
	public void ListarProdutos() {
		for(int j=0;j<tamanho;j++) {
			vetor[j].VenderProduto(10);
			System.out.println(vetor[j].toString());
		}	
		
	}
	

}
	
	



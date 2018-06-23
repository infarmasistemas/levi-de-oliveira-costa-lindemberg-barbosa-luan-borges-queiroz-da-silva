import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		
		Scanner  scanf = new Scanner(System.in);
		Loja cariri = new Loja(5);
		
		
		Produto A = new Produto ("sacola", 0.55, "Embalatudo", 1, 0, 1000) ;
		cariri.CadastrarProduto(A);
		
		Produto B = new Produto ("Tictac", 2, "Nestle", 2, 12, 50);
		cariri.CadastrarProduto(B);
		
		Produto C =  new Medicamento("Dipirona", 1.5, "NeoGeo", 3, 12,120, "analgesico", "não") ;
		cariri.CadastrarProduto(C);

		Cosmeticos F = new Cosmeticos ("Acetona", 3.5, "Aline", 4, 24, 20, "Beleza", "unisex" ) ;
		cariri.CadastrarProduto(F);
		
		Alimenticios G = new Alimenticios ("Coca Cola", 4.0, "Coca Cola", 5, 12, 50, "Bebida") ;
		cariri.CadastrarProduto(G);
		
		
		cariri.ListarProdutos();
		
		
		
		
		
		

		
		
		
		

		

		

		

	}

}

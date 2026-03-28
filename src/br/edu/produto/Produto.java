package br.edu.produto;

public class Produto {

	String nome;
	double preco;
	static int quantidadeTotal = 0 ;
	
	// construtor padrao 
	public Produto() {
	this.nome = "produto padrao ";
	this.preco = 10.0;
	quantidadeTotal ++; }
	
	// construtor com parametros (sobrecarga)
	public Produto (String nome, double preco  ) {
		this.nome= nome;
		this.preco= preco;
		quantidadeTotal ++; }
	
	// metodo para exibir dados 
	public void exibirDados() {
		System.out.println("nome:" + nome);
		System.out.println("preco:" + preco);
		System.out.println("......."); }
	
	// metodo estatico 
	public static void exibirQuantidadeTotal() {
	System.out.println("total de Produtos Cadastrados:" + quantidadeTotal );	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

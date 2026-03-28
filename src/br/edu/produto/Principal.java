package br.edu.produto;

public class Principal {
public static void main(String[] args) {
	
	// criando produtos
	Produto p1 = new Produto ( "celular", 4000.0);
	Produto p2 = new Produto( " geladeia", 5400.0);
	Produto p3 = new Produto(); // construtor padrao 
	 
	
    // exibir dados
	p1.exibirDados ();
	p2.exibirDados();
	p3.exibirDados();
	
	
	// exibir total 
	Produto.exibirQuantidadeTotal();
	
	
	
	
}
	
	
	
	
	
	
	
}

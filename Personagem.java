public class Personagem {
	String nome;
	String classe;
	int nivel;
	int vida;
	double poderBase;
	
//	METÓDO DE EXIBIÇÃO DE STATUS DE PERSONAGEM
	public void exibirStatus() {
		System.out.println("Nome: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + 
				"\nVida: " + vida + "\nPoder Base: " + poderBase);
	}
	
//	CRIAÇÃO DO CONSTRUTOR DA CLASSE PERSONAGEM
	public Personagem(String nome, String classe, int nivel, int vida, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel; 
		this.vida = vida;
		this.poderBase = poderBase;
	}
}

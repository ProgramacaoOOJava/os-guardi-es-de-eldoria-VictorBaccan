public abstract class Personagem {
	String nome;
	String classe;
	int nivel;
	int vida;
	double poderBase;
	
//	CRIAÇÃO DO CONSTRUTOR DA CLASSE PERSONAGEM
	public Personagem(String nome, String classe, int nivel, int vida, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel; 
		this.vida = vida;
		this.poderBase = poderBase;
	}
	
	public String exibirStatus() {
		return "Nome: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + 
				"\nVida: " + vida + "\nPoder Base: " + poderBase;
	}
	
	//	METODO ABSTRATO
	public abstract void usarHabilidadeEspecial();
}

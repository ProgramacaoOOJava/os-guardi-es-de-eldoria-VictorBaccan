public class Main {

	public static void main(String[] args) {
//		INSTANCIAS DE CLASSES E EXIBIÇÃO DE STATUS
		Personagem p1 = new Personagem("Akira", "Guerreiro", 15, 100, 137.8);
		p1.exibirStatus();
		
		System.out.println();
		
		Personagem p2 = new Personagem("Satsuki", "Mago", 37, 78, 163.2);
		p2.exibirStatus();
	}
}

//	IMPORTAÇÃO DAS BIBLIOTECAS
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//	INSTANCIAÇÃO DE OBJETOS E PRINT DE MÉTODOS
		Mago Gandalf = new Mago("Gandalf", 99, 100, 99, 8000);
		System.out.println(Gandalf.exibirStatus());
		Gandalf.usarHabilidadeEspecial();
		
		Guerreiro Guts = new Guerreiro("Guts", 99, 999, 8000, 8000);
		System.out.println(Guts.exibirStatus());
		Guts.usarHabilidadeEspecial();
		
		//	CRIAÇÃO DE ARRAY
		List<Personagem> herois = new ArrayList<>();
		herois.add(Gandalf);
		herois.add(Guts);
		
		herois.add(new Mago("Melina", 52, 307, 186, 520));
		
		//	LOOP FOR COM PRINT DE METODOS

		System.out.println("\nDemonstração de loop For/Polimorfismo.\n");
		for(Personagem p : herois) {
			System.out.println(p.exibirStatus());
			p.usarHabilidadeEspecial();
		}
	}
}

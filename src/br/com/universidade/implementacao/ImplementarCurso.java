package br.com.universidade.implementacao;
import br.com.universidade.modelo.Curso;
import br.com.universidade.tela.Magica;

public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso(
		Magica.t("Digite a descri��o:"), 
		Magica.t("Digite o n�vel:"), 
		Magica.i("Digite a dura��o:"), 
		Magica.t("Digite o per�odo:"), 
		Magica.f("Digite a mensalidade:"));
			
		System.out.println(curso.getAll());

	}

}

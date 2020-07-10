package br.com.universidade.implementacao;
import br.com.universidade.modelo.Curso;
import br.com.universidade.tela.Magica;

public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso(
		Magica.t("Digite a descrição:"), 
		Magica.t("Digite o nível:"), 
		Magica.i("Digite a duração:"), 
		Magica.t("Digite o período:"), 
		Magica.f("Digite a mensalidade:"));
			
		System.out.println(curso.getAll());

	}

}

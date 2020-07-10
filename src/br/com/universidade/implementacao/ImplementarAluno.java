package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.tela.Magica;

public class ImplementarAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(
		Magica.i("Digite o rm:"), 
		Magica.t("Digite o nome:").toUpperCase(), 
		Magica.t("Digite o e-mail:").toLowerCase(), 
		Magica.t("Digite o telefone:"), 
		Magica.t("Digite a Data de Matrícula:"));
			
		System.out.println(aluno.getAll());

	}

}

package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Turma;
import br.com.universidade.tela.Magica;

public class ImplementarTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.i("Código:"), 
				Magica.t("Nome da turma:").toUpperCase(), 
				new Curso(
						Magica.t("Nome do curso:"),
						Magica.t("Nível:"),
						Magica.i("Duração:"),
						Magica.t("Período:"),
						Magica.f("Valor da mensalidade:")), 
				Magica.t("Sala:"),
				new Aluno(
						Magica.i("RM:"), 
						Magica.t("Nome do aluno:").toUpperCase(), 
						Magica.t("E-mail:").toLowerCase(), 
						Magica.t("Telefone:"), 
						Magica.t("Data de Matrícula:"),
						new Endereco(
								Magica.t("Logradouro"),
								Magica.t("Bairro"),
								Magica.t("Cidade"),
								Magica.t("CEP"),
								Magica.t("Número"),
								Magica.t("UF"),
								Magica.t("Complemento")
								)
						)				
				);
		System.out.println(turma.getAll());

	}

}

package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Turma;
import br.com.universidade.tela.Magica;

public class ImplementarTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.i("C�digo:"), 
				Magica.t("Nome da turma:").toUpperCase(), 
				new Curso(
						Magica.t("Nome do curso:"),
						Magica.t("N�vel:"),
						Magica.i("Dura��o:"),
						Magica.t("Per�odo:"),
						Magica.f("Valor da mensalidade:")), 
				Magica.t("Sala:"),
				new Aluno(
						Magica.i("RM:"), 
						Magica.t("Nome do aluno:").toUpperCase(), 
						Magica.t("E-mail:").toLowerCase(), 
						Magica.t("Telefone:"), 
						Magica.t("Data de Matr�cula:"),
						new Endereco(
								Magica.t("Logradouro"),
								Magica.t("Bairro"),
								Magica.t("Cidade"),
								Magica.t("CEP"),
								Magica.t("N�mero"),
								Magica.t("UF"),
								Magica.t("Complemento")
								)
						)				
				);
		System.out.println(turma.getAll());

	}

}

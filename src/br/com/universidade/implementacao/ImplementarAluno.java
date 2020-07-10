package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.tela.Magica;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		//Endereco endereco = new Endereco();
		//endereco.setLogradouro(...
		Aluno aluno = new Aluno(
				Magica.i("Digite o rm:"), 
				Magica.t("Digite o nome:").toUpperCase(), 
				Magica.t("Digite o e-mail:").toLowerCase(), 
				Magica.t("Digite o telefone:"), 
				Magica.t("Digite a Data de Matrícula:"),
				new Endereco(
						Magica.t("Logradouro"),
						Magica.t("Bairro"),
						Magica.t("Cidade"),
						Magica.t("CEP"),
						Magica.t("Número"),
						Magica.t("UF"),
						Magica.t("Complemento")
						)
				);
			
		System.out.println(aluno.getAll());

	}

}

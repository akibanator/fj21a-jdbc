package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		FuncionarioDao dao = new FuncionarioDao();

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Func teste");
		funcionario.setUsuario("User teste");
		funcionario.setSenha("senhateste");
		
		dao.adiciona(funcionario);

	}

}

package br.com.caelum.jdbc.teste;

import java.sql.Date;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setNome("Nome teste");
		contato.setEmail("teste@teste.br");
		contato.setEndereco("Rua Teste");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 1);
		
		dao.altera(contato);
		

	}

}

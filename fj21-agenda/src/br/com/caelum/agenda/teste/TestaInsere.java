package br.com.caelum.agenda.teste;

import java.util.Calendar;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class TestaInsere {
		public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Eliandra Mota Vieira");
		contato.setEmail("eliandra.mota@gmail.com");
		contato.setEndereco("Quadra 310 Conjunto 13 Lote 05 - Recanto das Emas");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");
	}

}

package br.usp.each.ach2077.laboratorio3.sistema;


import java.sql.Connection;

import br.usp.each.ach2077.laboratorio3.repositorios.PontoGeograficoDAO;
import br.usp.each.ach2077.laboratorio3.utils.ConnectionFactory;

public class Laboratorio2 {

	public static void main(final String[] args) {

		
		final Connection connection = new ConnectionFactory().getConnection();
		final PontoGeograficoDAO pontoGeograficoDAO = new PontoGeograficoDAO(connection);
//		ContratoDAO contratoDAO = new ContratoDAO(connection);
//	
//		
//		final List<Contrato> contratos = contratoDAO.obterContratosDoProfissionalDeNumero(12);
//		for (final Contrato contrato: contratos){
//			System.out.println(contrato);
//		}
	}

}

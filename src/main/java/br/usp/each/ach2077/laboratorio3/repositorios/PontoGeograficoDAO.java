package br.usp.each.ach2077.laboratorio3.repositorios;

import java.sql.Connection;
import java.util.List;

import br.usp.each.ach2077.laboratorio3.representacoes.PontoGeografico;

public class PontoGeograficoDAO {

	private final Connection connection;

	public PontoGeograficoDAO(final Connection connection) {
		this.connection = connection;
	}
	
	public List<PontoGeografico> lista(){
		return null;
	}
	
	public void grava(final PontoGeografico pontoGeografico){
		
	}
	
	public void remove(final PontoGeografico pontoGeografico){
		
	}

}

package br.usp.each.ach2077.laboratorio3.modelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

	void executa(HttpServletRequest request, HttpServletResponse response) throws Exception;

}

package br.usp.each.ach2077.laboratorio3.logicas;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usp.each.ach2077.laboratorio3.modelo.Logica;

public class PrimeiraLogica implements Logica {

	@Override
	public void executa(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		System.out.println("Executando lógica e redirecionando...");
		final RequestDispatcher requestDispatcher = request.getRequestDispatcher("/primeira-logica.jsp");
		requestDispatcher.forward(request, response);
	}

}

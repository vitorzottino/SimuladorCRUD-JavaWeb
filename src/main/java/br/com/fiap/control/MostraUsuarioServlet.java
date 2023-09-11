package br.com.fiap.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.DAO.Database;
import br.com.fiap.model.*;

@WebServlet("/mostraUsuario")
public class MostraUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		Usuario usuario = Database.buscaUsuarioID(id);
		request.setAttribute("usuario", usuario);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraUsuario.jsp");
		rd.forward(request, response);

	}

}

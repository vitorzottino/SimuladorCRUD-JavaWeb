package br.com.fiap.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.model.Usuario;
import br.com.fiap.repository.Database;


@WebServlet("/novoUsuario")
public class NovoUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public NovoUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("formNovoUsuario.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("nome");
		String emailUsuario = request.getParameter("email");
		String telefoneUsuario = request.getParameter("telefone");
		String senhaUsuarioString = request.getParameter("senha");
		
		Usuario usuario = new Usuario(nomeUsuario, emailUsuario, telefoneUsuario, senhaUsuarioString);
		Database.adiciona(usuario);
		request.setAttribute("usuario", usuario);
		response.sendRedirect("listausuarios");
	}

}

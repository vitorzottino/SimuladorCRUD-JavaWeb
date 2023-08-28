package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.fiap.model.Usuario;

public class Database {

	private static List<Usuario> listaUsuario = new ArrayList<>();
	private static int id = 1;

	public static void adiciona(Usuario usuario) {
		usuario.setId(id++);
		listaUsuario.add(usuario);
	}

	public static void remove(int id) {
		Iterator<Usuario> it = listaUsuario.iterator();
		while (it.hasNext()) {
			Usuario usuario = it.next();
			if (usuario.getId() == id) {
				it.remove();

			}

		}

	}

	public static List<Usuario> buscarTodos() {
		return listaUsuario;

	}

	/*public static Usuario buscarPorID(int id) {
		for (Usuario usuario : listaUsuario) {
			if (usuario.getId() == id)
				return usuario;

			else
				return null;

		}
	}*/
}

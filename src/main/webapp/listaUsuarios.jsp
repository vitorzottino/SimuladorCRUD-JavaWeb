<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fiap.control.*, java.util.List "%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Usuarios</title>
</head>
<body>

	Lista de usuarios cadastrados:

	<ol>
		<c:forEach items="${usuarios}" var="usuario">
			<li>${usuario.nome}- ${usuario.email} - ${usuario.telefone} - <fmt:formatDate
					value="${usuario.dataCadastro }" />
			</li>
		</c:forEach>
	</ol>

	<a href="/simuladorCRUD/formNovoUsuario.jsp">Voltar</a>

</body>
</html>
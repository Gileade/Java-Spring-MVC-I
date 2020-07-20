<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro de Java, Android, PHP, Ruby e muito mais - Casa do
	Código</title>
</head>
<body>
	
	<h1>Lista de Produtos</h1>
	
	<table>
		<tr>
			<td>Título</td>
			<td>Descrição</td>
			<td>Páginas</td>
		</tr>
		<c:forEach items="${produtos}" var="produto">
			<tr>
				<td>${produto.titulo}</td>
				<td>${produto.descricao}</td>
				<td>${produto.paginas}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
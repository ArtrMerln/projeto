<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/projeto/jogador" method="post">
		
		

			<c:forEach var="torneio" items="${torneio}">


				<div>
			<label>nome: </label> <input type="text" name="nome">
		</div>
	

			</c:forEach>
			<div>
			<button type="submit">Adicionar</button>
		</div>

		
	</form>

</body>
</html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix ="caelum" %>

	<head>
		<link href="css/jquery.css" rel ="stylesheet">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-ui.js"></script>
	</head>
	<body>	
		<c:import url="cabecalho.jsp"/>
		<h1>Altera Contato</h1>
		<hr />
		<form action="alteraContato" var="contato">
			Nome: ${contato.nome} <input type="text" name="nome"/><br/>
			Email:${contato.email}<input type="text" name="email"/><br/>
			Endere�o: ${contato.endereco}<input type="text" name="endereco"/><br/>
			Data Nascimento: <fmt:formatDate value = "${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/> <caelum:campoData id="dataNascimento" /><br/>
		
		<input type="submit" value="Gravar">
		</form>	
		<c:import url="rodape.jsp"/>
	</body>

</html>
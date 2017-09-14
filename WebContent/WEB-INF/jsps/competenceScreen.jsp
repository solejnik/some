<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Competence Screen</title>
</head>
<body>

	<form>
		<table border="1">
			<tr>
				<td><b>Skills group : </b></td>
			</tr>
			<c:forEach var="group" items="${groups}">
				<tr>
					<td><c:out value="${group.name}"></c:out></td>
					<td><a href="<c:url value='/showDetails/${group.name}' />">
							Show details </a></td>
				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>
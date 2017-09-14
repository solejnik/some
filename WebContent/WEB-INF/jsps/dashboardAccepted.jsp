<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBoard</title>
</head>
<body>

	<form>


		<table border="1">
			<tr>
				<td><b>Skills details : </b></td>
			</tr>
			<c:forEach var="skill" items="${skills}">
				<tr>
					<td>${skill.id}</td>
					<td>${skill.grade}</td>
					<td>${skill.status}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
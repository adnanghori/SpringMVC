<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><% String name = (String)request.getAttribute("name");
	%></h1>
	<%= name %>
	${addObject}
	
	<c:forEach var="variable" items="${list}">
	<h1> ${variable}</h1>
	</c:forEach>
</body>
</html>
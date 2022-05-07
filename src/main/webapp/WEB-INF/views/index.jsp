<%@page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" >
</head>
<html>
<body>
<h2>Home Page</h2>
<h2>Called by /home</h2>
<h2>My Name is adnan</h2>

<%
	
	String name = (String)request.getAttribute("name");
%>
<h1>from http <%= name %> </h1>
</body>
</html>

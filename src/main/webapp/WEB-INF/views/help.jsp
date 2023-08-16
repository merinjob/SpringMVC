<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

	<%
	String name = (String) request.getAttribute("name");
	Integer rno = (Integer) request.getAttribute("rno");
	LocalDateTime time=(LocalDateTime) request.getAttribute("time");
	%>

	<h1>
		Hello... My name is
		<%=name%>
	</h1>
	<h1>This is Help Page</h1>
	<h1>
		My roll number is
		<%=rno%>
	</h1>
	
	<h1>
		Date and Time is
		<%=time.toString()%>
	</h1>
</body>
</html>
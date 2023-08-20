<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>   <!-- For Expression language -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>			<!-- for loop -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

	<%
	/* String name = (String) request.getAttribute("name");
	Integer rno = (Integer) request.getAttribute("rno");
	LocalDateTime time=(LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>
		Hello... My name is
		<%-- <%=name%> --%>
		${name }
	</h1>
	<h1>This is Help Page</h1>

	<h1>
		My roll number is
		<%-- <%=rno%> --%>
		${rno }
	</h1>

	<h1>
		Date and Time is
		<%-- <%=time.toString()%> --%>
		${time }
	</h1>

	<hr>
	<!-- Gives horizontal line -->

	${marks }
	<!-- output-- [39,43,49,45] -->

	<hr>

	<c:forEach var="item" items="${marks }">
		<%-- <h1>${item }</h1> --%>

		<h1>
			<c:out value="${item }"> </c:out>
		</h1>
	</c:forEach>

</body>
</html>
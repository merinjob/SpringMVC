<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Insert title here</title>
</head>
<body>
	<!-- 		(1)		 -->
	<%-- 
	<h1>Welcome , ${uname }</h1>
	<h1>Your email is ${uemail }</h1>
	<h1>Your password is ${upassword }</h1>
 --%>

	<!-- 		(2)		 -->
	<%-- 	 
	<h1>Welcome , ${user.name }</h1>
	<h1>Your email is ${user.email }</h1>
	<h1>Your password is ${user.password }</h1>
 --%>

	<!-- 		(3)		 -->
	<h1 >${Header }</h1>
	<p >${desc }</p>

	<h1 style="color:green">${msg }</h1>


	<h1>Welcome , ${user.name }</h1>
	<h1>Your email is ${user.email }</h1>
	<h1>Your password is ${user.password }</h1>

	
		
</body>
</html>
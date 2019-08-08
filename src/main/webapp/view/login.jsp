<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Click Here to login</title>
</head>
<body>
	<form method="post" action="/users/login">
	Username	<input type="text"  name="username">
	Password   <input type="password" name="password">
	
	<a href="/users/register">Click Here to register</a>
	</form>
</body>
</html>
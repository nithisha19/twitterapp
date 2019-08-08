<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>User Registration</title>
<style>
.error {
	color: red;
	font-size: 15px;
	padding: 10px;
}
</style>
</head>
<body>

	<form:form action="/users/register" method="POST"
		modelAttribute="employee">
		<div class="form-group">
			<label>Name:</label>
			<form:input path="username" size="30" cssClass="form-control"
				placeholder="Enter name" />
			<small><form:errors path="username" cssClass="error" /></small>
		</div>
		<div class="form-group">
			<label>Email :</label>
			<form:input path="email" cssClass="form-control"
				placeholder="Enter email" />
			<small><form:errors path="email" cssClass="error" /></small>
		</div>


		<div class="form-group">
			<label>Password :</label>
			<form:password path="password" cssClass="form-control"
				placeholder="Enter password" />
			<small><form:errors path="password" cssClass="error" /></small>
		</div>
		<div class="form-group">
			<label>City:</label>
			<form:input path="city" size="30" cssClass="form-control"
				placeholder="Enter city" />
			<small><form:errors path="city" cssClass="error" /></small>
		</div>
		<div class="form-group">
			<label>Street:</label>
			<form:input path="street" size="30" cssClass="form-control"
				placeholder="Enter street" />
			<small><form:errors path="street" cssClass="error" /></small>
		</div>
		<div class="form-group">
			<label>State:</label>
			<form:input path="state" size="30" cssClass="form-control"
				placeholder="Enter state" />
			<small><form:errors path="state" cssClass="error" /></small>
		</div>
		<div class="form-group">
			<label>ZipCode:</label>
			<form:input path="zipcode" size="30" cssClass="form-control"
				placeholder="ZipCode" />
			<small><form:errors path="zipcode" cssClass="error" /></small>
		</div>


		<div class="form-group">
			<button type="submit">Submit</button>
		</div>
	</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<!-- <link rel="stylesheet" href="/css/login.css"> -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/scripts/login.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body class="bodyStyle">
 <header>
	<h2>Login to continue</h2>
   <header>
	<c:if test="${not empty msg }">
		
			<p id="error">${msg}</p>
	</c:if>
	<div id="container">
		<form:form action="/userlogin" method="post" modelAttribute="user1"
			align="center">
			<div>
				<form:label class="field" path="userName">User Name<span
						class="mandatory">*</span>
				</form:label>
				<br>
				<form:input class="value" path="userName" name="username" id="username" required="required" placeholder="Enter a Username" />
				<br>
				<form:label path="password" class="field">Password<span
						class="mandatory">*</span>
				</form:label>
				<br>
				<form:password class="value" path="password" name="password" id="password" required="required" placeholder="Enter a Password" />
				<br>
				<input type="submit" value="Login" id="button1" name="login"
					class="btn btn-success"  />
			</div>
		</form:form>
	</div>
	<div id="container2">
		<a id="extlink" href="/forgot">Forgot Password</a><br> <a id="extlink" href="/register">SignUp</a>
	</div>

</body>
</html>
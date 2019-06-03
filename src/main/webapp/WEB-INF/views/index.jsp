<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${pagetitle}</title>
</head>
<body>
	Hello World

	<a href="counter">Counter</a>
	<br>
	<a href="cookie-test">Cookie Test</a>

	<form action="user-details" onsubmit="return validateInfo();">
		First Name: <input type="text" id="firstname" name="firstname">
		Last Name: <input type="text" name="lastname"> 
		Address: <input type="text" name="address"> 
		<input type="submit" value="submit">
	</form>

	<script src="script.js"></script>


</body>
</html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Todo Login Page</title>
</head>
<body>
	<div class="container">
	<p><font color="red">${errorMessage}</font></p>
	<form action="/login" method="POST">
		Name  : <input name="name" type="text" /> Password  : <input name="password" type="password" /> <input type="submit" />
	</form>
	</div>
</body>
</html>
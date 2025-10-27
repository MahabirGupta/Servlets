<%@page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!! From JSP</title>
</head>

<body>
<%-- <%
getServletContext().log("Dummy log from JSP");
/*  out.println("Dummy<br>");*/
out.println(request.getParameter("name"));
/*  System.out.println("Hello");*/
Date date = new Date();
%>
<div>Current date is <%=date%></div> --%>
My name is ${name} and password is ${password}
</body>
</html>

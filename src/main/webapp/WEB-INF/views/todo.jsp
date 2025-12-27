<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h1>Add a Todo</h1>
<!-- Using  a spring tag for form -->
    <form:form action="/add-todo" method="POST" commandName="todo">
    <!-- Add hidden path for variable id -->
    <!-- Hidden variables are variables that you do not want to show on the screen but is still available -->
    <form:hidden path="id"/>
    <%-- <form:hidden path="user"/> --%>
    <fieldset class="form-group">
       <form:label path="desc">Description :</form:label>  
       <form:input path="desc" type="text" class="form-control" required="required"/>
       <!-- To display error message -->
       <form:errors path="desc" cssClass="text-warning"/>
       
       <form:label path="targetDate">Target Date</form:label>
    	<form:input path="targetDate" type="date"/>
    	<form:errors path="targetDate" cssClass="error"/>
       </fieldset> 
        <input class="btn btn-success" type="submit" value="Submit" />
        
    </form:form>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
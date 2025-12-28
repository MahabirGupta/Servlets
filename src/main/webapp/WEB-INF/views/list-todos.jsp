<%-- Hi ${name}!<br> --%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
	<div class="container">
		<table class="table table-striped">
			<caption>Your Todos are</caption>

			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Completed?</th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy"
									value="${todo.targetDate}" /></td>
						<!--  ${todo.targetDate}</td>-->
						<td>${todo.done}</td>
						
						<td>
						<!--Add a update button for every todo and passing the parameter-->
						<a type="button" class="btn btn-primary" href="/update-todo?id=${todo.id}">Update</a>
						<!--Add a delete button for every todo and passing the parameter-->
						<a class="btn btn-danger" href="/delete-todo?id=${todo.id}">Delete</a>
						</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
	<div>
	<a class="btn btn-success" href="/add-todo">Add</a>
	</div>
	</div>
	<%@ include file="common/footer.jspf"%>
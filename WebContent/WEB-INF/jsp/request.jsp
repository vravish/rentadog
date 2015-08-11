<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Request Information</h2>
	<form:form method="POST" action="/submitRequest">
		<table>
			<!-- temporary until we add login information -->
			<tr>
				<td><form:label path="userid">Customer Username</form:label></td>
				<td><form:input path="userid" /></td>
			</tr>
			<tr>
				<td><form:label path="breed">Dog Type</form:label></td>
				<td><form:input path="breed" /></td>
			</tr>
			<tr>
				<td><form:label path="start">Start Date/Time (ex: 05/25/2015 13:47:00)</form:label></td>
				<td><form:input path="start" /></td>
			</tr>
			<tr>
				<td><form:label path="end">End Date/Time</form:label></td>
				<td><form:input path="end" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
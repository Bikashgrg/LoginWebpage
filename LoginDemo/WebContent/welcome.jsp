<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	// to remove the cache data
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");	// works on HTTP 1.1
	response.setHeader("Pragma","no-cache"); // for HTTP 1.0
	response.setHeader("Expires","0"); // for proxy

	if(session.getAttribute("username")==null){
		response.sendRedirect("Login.jsp");
	}
%>
	Welcome ${username} to the new world

<form action="logout">
	<input type="submit" value="Logout">
</form>

</body>
</html>
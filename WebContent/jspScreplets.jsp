<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello from JSP
	<br>
	<jsp:declaration>String s2 = "jsp:declaration";</jsp:declaration>
	<%!String s = "% declaration";

	private int sum(int a, int b) {
		return a + b;
	}%>

	<%
		int i = 1;
		int j = 2;
		out.println(i+j);
		out.println(s);
	%>
	<br>
	<jsp:scriptlet>
		out.println(sum(2, 5));
		out.println(s2);
	</jsp:scriptlet>
	<br>
	<%=Arrays.asList(1,2,3,4,5,6) %>
	<br>
	<jsp:expression>
	Arrays.asList(1,2,3,4,5,6)
	</jsp:expression>
	
</body>
</html>
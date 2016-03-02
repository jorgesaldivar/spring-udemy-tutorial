<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><a href="offers">offers</a></p>
<p><a href="createoffer">create offer</a></p>
	
	<sql:query var="rs" dataSource="jdbc/TestDB">
		select id, name, email from offers;
	</sql:query>

	 <h2>Results</h2>

	<c:forEach var="row" items="${rs.rows}">
    	ID ${row.id}<br/>
   		Name ${row.name}<br/>
	</c:forEach>
	
	Hi There! Request:
	<%=request.getAttribute("name")%>
	<p>
		Request EL : ${name}

		<c:out value="${name}"></c:out>
	</p>
	
	
	<p>
	<c:forEach var="offer" items="${offers}">
		<c:out value="${offer.email}"></c:out>
	</c:forEach>
	</p>
</body>
</html>
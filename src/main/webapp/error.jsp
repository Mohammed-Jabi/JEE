<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
    <h1>An error occurred:</h1>
    <%-- <p>Error message: <%= exception.getMessage() %></p> --%>
    <p>Stack trace: <%= exception.getStackTrace() %></p>
</body>
</html>
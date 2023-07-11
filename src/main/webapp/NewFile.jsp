<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate,java.time.LocalDateTime"%> 
<%@ page import="com.jee.logic.Hellow" %>
<%@ page errorPage="error.jsp" %>

	<%-- %@:Directive(used hedders and the import statements in the java code)
		%!Declarative(Variable declaration)
		%Script(Java code)
		%=Expression	
	 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	

<h3>Date:<%= LocalDate.now() %></h3>
<h3>Time:<%= LocalDateTime.now().getHour()%>:<%=LocalDateTime.now().getMinute()%></h3>
<br>
<br>
<%int n = Integer.parseInt(request.getParameter("n")); %>
<%String type=request.getParameter("s"); %>
<h3>Printing Shapes</h3>
<%-- <h3><%out.print(n); %></h3>
<h3><%out.print(type); %></h3> --%>
<h3><%
//int value = Integer.parseInt(request.getParameter("J"));
if(type.equals("J")){
for(int i=0; i<n; i++){
	for(int j=0; j<=n; j++){
		out.print("* ");
		}
		out.println("<br>");
		}
}

else if(type.equals("JS")){
for(int i=0; i<n; i++){
	for(int j=i; j<=n; j++){
		out.print("* ");
		}
		out.println("<br>");
		}
}
%></h3>
<h3>
<%
Hellow h=new Hellow();
h.method();

%>
</h3>


		

		
		
</body>
</html>


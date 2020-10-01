<%@page import="java.util.Date"%>
<%@page import="jspdemo.Student"%>
<%@page import="jspdemo.StudentsList"%>

<html>

<body>

<h3>Hello World of Java!</h3>

The time on the server is <%= new Date() %>

<ul> 
<% for (Student s : StudentsList.getStudentsList()) { %>
<li>
<%= s.getFirstName() %>
<%= s.getLastName() %>
<%= s.getEMail() %>
</li>
<%} %>
</ul>

</body>


</html>
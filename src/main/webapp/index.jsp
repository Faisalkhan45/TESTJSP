<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello, World!</h1>
    <p>Welcome to my JSP page!</p>

    <%
        // Java code to get the current date and time
        java.util.Date date = new java.util.Date();
        out.println("<p>Current date and time: " + date.toString() + "</p>");
    %>

    <p>This is a simple JSP example to show dynamic content.</p>
</body>
</html>

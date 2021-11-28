<%@ page import="java.sql.Connection" %>
<%@ page import="com.supmti.database.DatabaseConnection" %><%--
  Created by IntelliJ IDEA.
  User: jouad
  Date: 21/11/2021
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TEST</title>
    <%
        Connection connection = DatabaseConnection.getConnection();
        System.out.println("<h1>"+connection+"</h1>");
        System.out.print(connection);
    %>
</head>
<body>

</body>
</html>

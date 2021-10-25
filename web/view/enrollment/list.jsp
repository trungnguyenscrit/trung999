<%-- 
    Document   : list
    Created on : Sep 24, 2021, 11:35:30 AM
    Author     : Trung
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Enrollment"%>
<%@page import="model.Enrollment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% 
        ArrayList<Enrollment> enrollments = (ArrayList<Enrollment>) request.getAttribute("enrollments");
        %>
    </head>
    <body>
        <table border = "1px" >
            <tr>
                <td>from</td>
                <td>to</td>
                <td>cid</td>
                <td>eid</td>
                <td>active</td>
                <td>note</td>
            </tr>
            <% for (Enrollment e : enrollments) {
            %>
            <tr>
                <td><%=e.getFrom()%></td>
                <td><%=e.getTo()%></td>
                <td><%=e.getCour().getId()%></td>
                <td><%=e.getEmploy().getId()%></td>
                <td><%=e.isActive() %></td>
                <td><%=e.getNote()%></td>
            </tr>
            <%  }%>
        </table>
        <a href="insert">Insert</a>
    </body>
</html>

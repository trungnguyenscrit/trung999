<%-- 
    Document   : insert
    Created on : Sep 25, 2021, 10:52:08 AM
    Author     : Trung
--%>

<%@page import="model.Course"%>
<%@page import="model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <% 
            ArrayList<Employee> emps = (ArrayList<Employee>) request.getAttribute("emps");
            ArrayList<Course> cours = (ArrayList<Course>) request.getAttribute("cours");
        %>
    </head>
    <body>
        <form action="insert" method="POST">
            Employee: <select name="id">
                <% for (Employee e : emps) {
                %>
                <option value="<%=e.getId() %>"><%=e.getName() %></option>
                <% } %>
                </select>
                </br>
            Course: <select name="id">
                <% for (Course c : cours) {
                %>
                <option value="<%=c.getId() %>"><%=c.getName() %></option>
                <% } %>
                </select>
                </br>
            from: <input type="date" name="from" /> </br>
            to: <input type="date" name="to" /> </br>
            active: <input type="radio" checked="checked" name="active" value="learning" />learning
            <input type="radio" checked="checked" name="active" value="notlearning" />notlearning </br>
            note: <input type="text" name="note" /> </br>
            <input type="submit" value="save" />
        </form>
    </body>
</html>

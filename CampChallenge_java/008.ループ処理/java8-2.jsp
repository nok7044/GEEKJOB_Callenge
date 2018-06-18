<%-- 
    Document   : java8-2
    Created on : 2018/06/18, 17:30:35
    Author     : satou.pecotan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            double i=1000;
            while(i>100) {
                i=i/2;
            }
            
            out.print(i);
        %>
    </body>
</html>

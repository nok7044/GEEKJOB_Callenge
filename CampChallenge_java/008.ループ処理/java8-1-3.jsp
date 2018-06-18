<%-- 
    Document   : java8-1-3
    Created on : 2018/06/18, 16:29:05
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
            int total =0;
            for(int i=1;i<=100;i++) {
                total=total+i;
            }
            
            out.print(total);
            
        %>
    </body>
</html>

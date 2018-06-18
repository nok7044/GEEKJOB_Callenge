<%-- 
    Document   : java8-1-2
    Created on : 2018/06/18, 15:49:14
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
            String str = "A";
            
            for(int i=1;i<=29;i++) {
                str=str+"A";
            }
            
            out.print(str);
            
        %>
    </body>
</html>

<%-- 
    Document   : java7-2
    Created on : 2018/06/15, 17:23:28
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
        <%@ page import="java.util.HashMap"%>
        
        <%
            HashMap <String,String> angou 
                    = new HashMap <String,String>();
            
            angou.put("1","AAA");
            angou.put("hello","world");
            angou.put("soeda","33");
            angou.put("20","20");
           
        %>
        
    </body>
</html>

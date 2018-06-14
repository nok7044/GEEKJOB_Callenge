<%-- 
    Document   : java5-4
    Created on : 2018/06/14, 23:02:46
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
            char c = 'あ';
             
             switch (c){
                case 'A' :
                     out.print("英語");
                     break;
                case 'あ':
                     out.print("日本語");
                     break;
                default:
                    break;
                 
             }
             
        %>     
    </body>
</html>

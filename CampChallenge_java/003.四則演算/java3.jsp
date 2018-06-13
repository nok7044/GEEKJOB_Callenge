<%-- 
    Document   : java3
    Created on : 2018/06/13, 14:51:41
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
          final int BASE=100;
          int num=5;
          
          int tasu =BASE + num;           //足し算
          int hiku =BASE - num;           //引き算
          int kake =BASE * num;          //掛け算
          int wari =BASE / num;          //割り算
          int wariamari =BASE % num;     //剰余算
          
          out.print(tasu);
          out.print(hiku);
          out.print(kake);
          out.print(wari);
          out.print(wariamari);
         
        %>
    </body>
</html>

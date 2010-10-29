<%-- 
    Document   : logout
    Created on : 24/09/2010, 10:22:16 AM
    Author     : Belian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                  HttpSession objSesion = request.getSession(true);
                  objSesion.setAttribute("log", "true");
                  objSesion.setAttribute("user", null);
                  objSesion.setAttribute("usuario", null);
                  RequestDispatcher view = request.getRequestDispatcher("index.jsp");
                  view.forward(request, response);

        %>
    </body>
</html>

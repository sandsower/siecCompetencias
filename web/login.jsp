<%--
    Document   : index
    Created on : Oct 6, 2010, 5:49:16 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
       HttpSession objSesion = request.getSession(true);
       String s = (String)objSesion.getAttribute("log");
       if((String)objSesion.getAttribute("log") == null || s.equals("false"))
       {}else
       {
            objSesion.setAttribute("usuario", null);
            objSesion.setAttribute("user", null);
       }
       //Redireciona en caso de que el usuario este registrado.
       String redireccion = "registro.jsp";
       if(objSesion.getAttribute("usuario")!= null)
       {
            RequestDispatcher view = request.getRequestDispatcher(redireccion);
            view.forward(request, response);
       }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Evaluacion de Competencias SIEC</title>
        <link rel="stylesheet" type="text/css" href="css/siec.css" media="screen" />
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/siec.js"></script>
    </head>
    <body>
        <div class="h1login"><h1>Sistema de Evaluacion de Competencias SIEC</h1></div>
       <div id="login">
        <% //Imprime mensaje de error en caso de que el usuario no sea correcto
            if(request.getAttribute("message") != null)
            {
                out.print(request.getAttribute("message"));

            }
        %>
        <form name="loginform" id="loginform" action="ServLogin.do" method="post">

            <div>
                        <label>Nombre de usuario</label>
                        <input type="text" name="user" id="user_login" class="input" value="" size="20" tabindex="10" />
                </div>
                <div>
                        <label>Contraseña</label>
                        <input type="password" name="password" id="user_pass" class="input" value="" size="20" tabindex="20" />
                </div>
                <div class="submit subform"><input type="submit" value="Iniciar Sesión" /></div>
        </form>
        <p id="nav">
            <a href="#" title="Recupera tu contraseña perdida">¿Has perdido tu contraseña?</a>
        </p>
      </div>
</body>
</html>
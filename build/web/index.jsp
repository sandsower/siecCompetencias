<%--
    Document   : systemIndex
    Created on : 25/09/2010, 05:13:48 PM
    Author     : lugubrenator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Registro de estrategias</title>
<link rel="stylesheet" type="text/css" href="css/siec.css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/siec.js"></script>
</head>
<body>
<div id="top"><a name="top"></a></div>

<div id="wrapper">
   <div id="header">

       <div id="desktopTitlebarWrapper">
			<div id="desktopTitlebar">
				<h1 class="hidden">SIEC</h1>
				<div class="fr topbar">
					<ul>
						<li><a href="logout.jsp">Desconectarse</a></li>
                                                <li>Bienvenido <span class="nameuser">Usuario</span></li>
					</ul>
				</div>
			</div>
           <div id="mprincipal">
   
	</div>
           <div id="mtopctrl">
              <ul>
                  <li><a id="btnhidecols" class="btnhidecolsnp" href="#">Ocultar Columnas</a></li>
             </ul>
           </div>
	</div>
   </div>

    <div id="menul"><!-- Menu izquierdo -->
    <div class="cuadro">
	<div class="theader">Navegación</div>
	<div class="cuadcont">
            <ul>
                <li><a href="./systemIndex.jsp">Inicio de Sistema</a></li>
            </ul>
	</div>
    </div>
   </div><!-- Menu izquierdo -->
   <div id="mitte"><!-- Contenido -->

       <h1>Este es un encabezado H1</h1>
    <p>Este es un parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus. Nunc condimentum erat a dui laoreet placerat. Quisque nisl elit, auctor id ultricies vel, molestie et sem. Cras id nibh augue, non semper diam. Fusce non odio vitae ipsum sagittis mollis. Praesent pharetra sollicitudin sollicitudin. Aliquam aliquet, urna mollis eleifend placerat, enim nisi aliquet lacus, a convallis nibh sem sed sem. Etiam et ultrices odio. Suspendisse potenti. Cras odio leo, laoreet sed vulputate ac, viverra a velit. Suspendisse vel mauris at magna sagittis faucibus. Pellentesque semper congue velit. Fusce condimentum nibh malesuada risus vestibulum sit amet aliquet velit varius. Duis eget urna enim, eget elementum magna. Sed malesuada sollicitudin malesuada.</p>
    <p>Este es otro parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus. Nunc condimentum erat a dui laoreet placerat. Quisque nisl elit, auctor id ultricies vel, molestie et sem. Cras id nibh augue, non semper diam. Fusce non odio vitae ipsum sagittis mollis. Praesent pharetra sollicitudin sollicitudin. Aliquam aliquet, urna mollis eleifend placerat, enim nisi aliquet lacus, a convallis nibh sem sed sem. Etiam et ultrices odio. Suspendisse potenti. Cras odio leo, laoreet sed vulputate ac, viverra a velit. Suspendisse vel mauris at magna sagittis faucibus. Pellentesque semper congue velit. Fusce condimentum nibh malesuada risus vestibulum sit amet aliquet velit varius. Duis eget urna enim, eget elementum magna. Sed malesuada sollicitudin malesuada. </p>

        
    
        
   </div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
            <ul>
		<li><a href="competencias/competencias.jsp">Competencias</a></li>
                 <ul>
                        <li><a href="competencias/crear.jsp">Crear Criterio</a></li>
                    </ul>
                <li><a href="criterios/criterios.jsp">Criterios</a>
                    <ul>
                        <li><a href="criterios/crear.jsp">Crear Criterio</a></li>
                    </ul>
                </li>
            </ul>
	</div>
    </div>
   </div><!-- Menu derecho -->
   <div id="footerbox"></div>
</div>
<div id="footer"><!-- Pie de página -->
    <hr>
    <p>&copy; 2010 <a href="#">ISEI UPA</a> -  <a href="#">SIEC</a></p>
</div><!-- Pie de página -->
</body>
</html>
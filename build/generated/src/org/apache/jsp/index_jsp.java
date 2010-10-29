package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=iso-8859-1\">\n");
      out.write("\t<title>SIEC &bull; Registro de estrategias</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/siec.css\" media=\"all\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/siec.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"top\"><a name=\"top\"></a></div>\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("   <div id=\"header\">\n");
      out.write("\n");
      out.write("       <div id=\"desktopTitlebarWrapper\">\n");
      out.write("\t\t\t<div id=\"desktopTitlebar\">\n");
      out.write("\t\t\t\t<h1 class=\"hidden\">SIEC</h1>\n");
      out.write("\t\t\t\t<div class=\"fr topbar\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"logout.jsp\">Desconectarse</a></li>\n");
      out.write("                                                <li>Bienvenido <span class=\"nameuser\">Usuario</span></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("           <div id=\"mprincipal\">\n");
      out.write("   \n");
      out.write("\t</div>\n");
      out.write("           <div id=\"mtopctrl\">\n");
      out.write("              <ul>\n");
      out.write("                  <li><a id=\"btnhidecols\" class=\"btnhidecolsnp\" href=\"#\">Ocultar Columnas</a></li>\n");
      out.write("             </ul>\n");
      out.write("           </div>\n");
      out.write("\t</div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("    <div id=\"menul\"><!-- Menu izquierdo -->\n");
      out.write("    <div class=\"cuadro\">\n");
      out.write("\t<div class=\"theader\">Navegación</div>\n");
      out.write("\t<div class=\"cuadcont\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"./systemIndex.jsp\">Inicio de Sistema</a></li>\n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("   </div><!-- Menu izquierdo -->\n");
      out.write("   <div id=\"mitte\"><!-- Contenido -->\n");
      out.write("\n");
      out.write("       <h1>Este es un encabezado H1</h1>\n");
      out.write("    <p>Este es un parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus. Nunc condimentum erat a dui laoreet placerat. Quisque nisl elit, auctor id ultricies vel, molestie et sem. Cras id nibh augue, non semper diam. Fusce non odio vitae ipsum sagittis mollis. Praesent pharetra sollicitudin sollicitudin. Aliquam aliquet, urna mollis eleifend placerat, enim nisi aliquet lacus, a convallis nibh sem sed sem. Etiam et ultrices odio. Suspendisse potenti. Cras odio leo, laoreet sed vulputate ac, viverra a velit. Suspendisse vel mauris at magna sagittis faucibus. Pellentesque semper congue velit. Fusce condimentum nibh malesuada risus vestibulum sit amet aliquet velit varius. Duis eget urna enim, eget elementum magna. Sed malesuada sollicitudin malesuada.</p>\n");
      out.write("    <p>Este es otro parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus. Nunc condimentum erat a dui laoreet placerat. Quisque nisl elit, auctor id ultricies vel, molestie et sem. Cras id nibh augue, non semper diam. Fusce non odio vitae ipsum sagittis mollis. Praesent pharetra sollicitudin sollicitudin. Aliquam aliquet, urna mollis eleifend placerat, enim nisi aliquet lacus, a convallis nibh sem sed sem. Etiam et ultrices odio. Suspendisse potenti. Cras odio leo, laoreet sed vulputate ac, viverra a velit. Suspendisse vel mauris at magna sagittis faucibus. Pellentesque semper congue velit. Fusce condimentum nibh malesuada risus vestibulum sit amet aliquet velit varius. Duis eget urna enim, eget elementum magna. Sed malesuada sollicitudin malesuada. </p>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("   </div><!-- Contenido -->\n");
      out.write("   <div id=\"menur\"><!-- Menu derecho -->\n");
      out.write("   <div class=\"cuadro\">\n");
      out.write("\t<div class=\"theader\">Cuadro 2</div>\n");
      out.write("\t<div class=\"cuadcont\">\n");
      out.write("            <p>Info de cuadro 2</p>\n");
      out.write("            <ul>\n");
      out.write("\t\t<li><a href=\"competencias/competencias.jsp\">Competencias</a></li>\n");
      out.write("                 <ul>\n");
      out.write("                        <li><a href=\"competencias/crear.jsp\">Crear Criterio</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                <li><a href=\"criterios/criterios.jsp\">Criterios</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"criterios/crear.jsp\">Crear Criterio</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("   </div><!-- Menu derecho -->\n");
      out.write("   <div id=\"footerbox\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\"><!-- Pie de página -->\n");
      out.write("    <hr>\n");
      out.write("    <p>&copy; 2010 <a href=\"#\">ISEI UPA</a> -  <a href=\"#\">SIEC</a></p>\n");
      out.write("</div><!-- Pie de página -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

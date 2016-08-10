package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" \n");
      out.write("      integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" \n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" \n");
      out.write("      integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" \n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Principal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- NAV -->\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"agrega.jsp\">Registro Personal</a></li>\n");
      out.write("                    <li><a href=\"agregajugador.jsp\">Registro Jugadores</a></li>\n");
      out.write("                    <li><a href=\"agregaingreso.jsp\">Registro Ingresos</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("\t\t<center>\n");
      out.write("                    <h1>Software</h1>\n");
      out.write("\t\t</center>\n");
      out.write("            <br>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("                                El presente software está desarrollado con el fin de \n");
      out.write("                                aguilizar los registros en la PYME con nombre de <strong>\"Campo 93\"</strong>, fue\n");
      out.write("                                desarrollado para la materia <strong>\"Taller de Productividad Basada en Herramientas\n");
      out.write("                                Tecnologicas\"</strong> por el alumno <strong>Roberto Ayala Molina</strong> estudiante de \n");
      out.write("                                <strong>Ing. en Computación Administrativa</strong> con matricula <strong>02720612</strong> \n");
      out.write("                                de la <strong>Universidad Tec Milenio</strong>. \n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">   \n");
      out.write("            <center>\n");
      out.write("            <h2>REGISTROS</h2>    \n");
      out.write("                <a class=\"btn btn-default btn-lg\" href=\"Consulta\" role=\"button\">Personal</a>&emsp;\n");
      out.write("                <a class=\"btn btn-default btn-lg\" href=\"ConsultaJugador\" role=\"button\">Judadores</a>&emsp;\n");
      out.write("                <a class=\"btn btn-default btn-lg\" href=\"ConsultaIngreso\" role=\"button\">Ingresos</a>\n");
      out.write("            </center>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

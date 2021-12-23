package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.Date;
import models.Car;
import dao.CarDao;
import java.time.LocalDate;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\">\n");
      out.write("    </head>\n");
      out.write("  ");

            Map<String, String> errors = (Map)session.getAttribute("error");
            pageContext.setAttribute("error", errors);
            session.removeAttribute("error");
  
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header id=\"main-header\">\n");
      out.write("             <h3>Government Web Car Management</h3>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <nav id=\"navbar\">\n");
      out.write("            <ul class=\"myList\">\n");
      out.write("                <li><a href=\"#\">Home</a></li>\n");
      out.write("                <li><a href=\"#\">Services</a></li>\n");
      out.write("                <li><a href=\"#\">About</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"showcase\">\n");
      out.write("                <h1>Government Car Web Management</h1>\n");
      out.write("                <p> Government Car Web Application Where all Government  Cars are registered \n");
      out.write("                    We Maintain and Keep Track of National Institution.This Web is of Government \n");
      out.write("                    Level Use.\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form class=\"my-form\" action=\"register\" method=\"get\">\n");
      out.write("                    <h3>&spades;Car Register Form&spades;</h3>\n");
      out.write("                    <div class=\"my-input\">\n");
      out.write("                        <label class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error[\"generalError\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label><br>\n");
      out.write("                        <label>PlateNo</label>\n");
      out.write("                        <input type=\"text\" class=\"plateno \"  name=\"plateno\"  placeholder=\"GR###A|GP###Z\" required>\n");
      out.write("                               <br> <label class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error[\"plateNo\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"my-input\">\n");
      out.write("                        <label>Manufacturing Date</label>\n");
      out.write("                        <input type=\"date\" class=\"inputTag\"  name=\"manufacturedDate\"  required>\n");
      out.write("                               <br><label class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error[\"manufacturedDate\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"my-input\">\n");
      out.write("                        <label>Cost</label>\n");
      out.write("                        <input type=\"text\" class=\"cost\"  name=\"cost\"  required ><br>\n");
      out.write("                       <label class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error[\"cost\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    </div>\n");
      out.write("                        <label for=\"institution\">Choose an Institution:</label>\n");
      out.write("                        <select name=\"institution\"   class=\"selectionList\" required>\n");
      out.write("                        <option value=\"REB\">REB</option>\n");
      out.write("                        <option value=\"RAB\">RAB</option>\n");
      out.write("                        <option value=\"RBA\">RBA</option>\n");
      out.write("                        <option value=\"RBC\">RBC</option>\n");
      out.write("                        <option value=\"MINECOFIN\" >MINECOFIN</option>\n");
      out.write("                        <option value=\"BNR\">BNR</option>\n");
      out.write("                        <option value=\"HEC\" >HEC</option>\n");
      out.write("                        <option value=\"MINIJUSTE\">MINIJUSTE</option>\n");
      out.write("                        <option value=\"MINISANTE\" >MINISANTE</option>\n");
      out.write("                    </select>\n");
      out.write("                        <br>\n");
      out.write("                        <input class=\"registerBtn\" type=\"submit\" value=\"submit &RuleDelayed;\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </main>\n");
      out.write("        <footer id=\"main-footer\">\n");
      out.write("            <h4>Government Web Car Management </h4>\n");
      out.write("            <ul class=\"footerList\">\n");
      out.write("                <li><a class=\"aTagfooter\" href=\"#\">Facebook</a></li>\n");
      out.write("                <li><a class=\"aTagfooter\" href=\"#\">Twitter</a></li>\n");
      out.write("                <li><a class=\"aTagfooter\" href=\"#\">LinkedIn</a></li>\n");
      out.write("                <li><a class=\"aTagfooter\" href=\"#\">Instagram</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <p>Government Car Website &copy;2021 Kigali\n");
      out.write("        </footer>\n");
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

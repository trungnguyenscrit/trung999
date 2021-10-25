package org.apache.jsp.view.enrollment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Enrollment;
import model.Enrollment;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
 
        ArrayList<Enrollment> enrollments = (ArrayList<Enrollment>) request.getAttribute("enrollments");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border = \"1px\">\n");
      out.write("            <tr>\n");
      out.write("                <td>from</td>\n");
      out.write("                <td>to</td>\n");
      out.write("                <td>cid</td>\n");
      out.write("                <td>eid</td>\n");
      out.write("                <td>active</td>\n");
      out.write("                <td>note</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 for (Enrollment e : enrollments) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(e.getFrom());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(e.getTo());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(e.getCour().getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(e.getEmploy().getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(e.isActive() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(e.getNote());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href=\"insert\">Insert</a>\n");
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

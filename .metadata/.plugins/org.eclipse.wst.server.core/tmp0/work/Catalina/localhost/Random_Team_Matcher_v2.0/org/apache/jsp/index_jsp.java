/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-21 15:47:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/include/indexHeader.jsp", Long.valueOf(1674316025074L));
    _jspx_dependants.put("/include/indexFooter.jsp", Long.valueOf(1674234742172L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>");

    if(request.getAttribute("title")==null){
    	out.print("RTM-Home Page");
    }else{
    	out.print(request.getAttribute("title"));
    }
    
    
    
      out.write("</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/assets/indexStyle.css\"> \r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <header class=\"heading\">Random Team Matcher</header>\r\n");
      out.write("        <div class=\"myCard\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"myLeftCtn\">\r\n");
      out.write("                        <div class=\"box\">\r\n");
      out.write("                            <header class=\"boxHeader\">Random Matcher</header>\r\n");
      out.write("                            <p class=\"boxText\">\r\n");
      out.write("                            The random team matcher allows us to have random matches between two teams from a list of teams. <br/><br/>\r\n");
      out.write("                       	<b>	How to use? </b><br/>\r\n");
      out.write("                       	<ul class=\"list\">\r\n");
      out.write("                       	<li>	The number of teams for which we must find matches should be entered inside the team details</li>\r\n");
      out.write("                       	<li>	 	Enter each team name</li>\r\n");
      out.write("                       	<li>	Here you go !The answer is prompted to you</li>\r\n");
      out.write("                       	</ul>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"myRightCtn\">\r\n");
      out.write("                       <header>Team Details</header>\r\n");
      out.write("       					<!-- <form action=\"\" class=\"myForm text-center\">\r\n");
      out.write("                            <label for=\"teamNumber\" class=\"myInputLabel\" >Enter the number of teams in total</label>\r\n");
      out.write("                            <input type=\"text\" class=\"myInput\" name=\"teamNumber\" placeholder=\"Total Teams\" required>\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <input type=\"submit\" class=\"submitBtn\" value=\"Submit\">\r\n");
      out.write("                      </form>  -->\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/home\" method=\"get\" class=\"myForm text-center\">\r\n");
      out.write("<label for=\"totalTeams\" class=\"myInputLabel\" >Enter the number of teams in total</label>\r\n");
      out.write("<input type=\"number\" class=\"myInput\" name=\"totalTeams\" placeholder=\"Total Teams\" required min=\"2\">\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"enterTeamNames\">\r\n");
      out.write("<br/>\r\n");
      out.write("<input type=\"submit\" class=\"submitBtn\" value=\"Submit\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

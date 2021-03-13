package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html><!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- MATERIAL DESIGN ICONIC FONT -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-design-iconic-font/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("        <!-- STYLE CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styleRegister.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"wrapper\" style=\"background-image: url('images/background.jpg');\">\n");
      out.write("                <div class=\"inner\">\n");
      out.write("                    <div class=\"image-holder\">\n");
      out.write("                        <img src=\"images/Anderson Design Group.jpeg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"MainController\" method=\"POST\">\n");
      out.write("                        <h3>Registration Form</h3>\n");
      out.write("                        <div class=\"form-wrapper\">\n");
      out.write("                            <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getFullNameError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                        <input type=\"text\" name=\"txtFullName\" placeholder=\"Full name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getUserIDError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                        <input type=\"text\" name=\"txtUserID\" placeholder=\"User id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtUserID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                        <i class=\"zmdi zmdi-account\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getEmailError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                        <input type=\"text\" name=\"txtEmail\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getEmailError() == null ? \"Email Address\" : error.getEmailError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                        <i class=\"zmdi zmdi-email\"></i>                       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getGenderError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                        <select name=\"cmbGender\" id=\"\" class=\"form-control\">\n");
      out.write("                            <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cmbGender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Gender</option>\n");
      out.write("                            <option value=\"male\">Male</option>\n");
      out.write("                            <option value=\"female\">Female</option>\n");
      out.write("                        </select>\n");
      out.write("                        <i class=\"zmdi zmdi-caret-down\" style=\"font-size: 17px\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getPasswordError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                        <input type=\"password\" name=\"txtPassword\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("                        <i class=\"zmdi zmdi-lock\"></i>                       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.getConfirmError()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                        <input type=\"password\" name=\"txtConfirmPassword\" placeholder=\"Confirm Password\" class=\"form-control\">\n");
      out.write("                        <i class=\"zmdi zmdi-lock\"></i>\n");
      out.write("                    </div>      \n");
      out.write("                        <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ERROR_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                    <button name=\"btnAction\" value=\"Create\">Register\n");
      out.write("                        <i class=\"zmdi zmdi-arrow-right\"></i>                 \n");
      out.write("                    </button>\n");
      out.write("                    <button name=\"btnAction\" value=\"ViewLogin\">Login\n");
      out.write("                        <i class=\"zmdi zmdi-arrow-left\"></i>   \n");
      out.write("                    </button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>     \n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("error");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ERROR}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}

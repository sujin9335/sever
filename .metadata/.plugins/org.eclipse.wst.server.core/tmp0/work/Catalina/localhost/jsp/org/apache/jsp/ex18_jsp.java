/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-18 08:45:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.*;

public final class ex18_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.File");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	/*  
	
		이미지 뷰어
		- ex18.jsp		:메인, 목록보기(뷰어)
		- ex18_ok.jsp	:이미지 업로드 처리
		- ex18_del.jsp	:이미지 삭제
		
		webapp > "pic" 폴더 생성
	
	
	*/

	//디렉토리 탐색
	String path=application.getRealPath("/pic");
		
	File dir=new File(path);
	
	File[] list=dir.listFiles();
	
	//System.out.println(list[0].getName()); 이름 출력

	//Arrays 정령 방법
	/* Arrays.sort(list, new Comparator<File>() {
		public int compare(File o1, File o2) {
			return o2.getName().compareTo(o1.getName());
		}
	}); */
	
	Arrays.sort(list, (o1, o2) -> o2.getName().compareTo(o1.getName()));


      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://pinnpublic.dothome.co.kr/cdn/example-min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("	#list{\r\n");
      out.write("		display: grid;\r\n");
      out.write("		grid-template-columns: 1fr 1fr 1fr 1fr;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#list > .item{\r\n");
      out.write("		position: relative;\r\n");
      out.write("		left: 0;\r\n");
      out.write("		top: 0;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#list > .item > img {\r\n");
      out.write("		width: 180px;\r\n");
      out.write("		height: 180px;\r\n");
      out.write("		object-fit: cover;\r\n");
      out.write("		border: 1px solid gray;\r\n");
      out.write("		padding: 3px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#list > .item > div:last-child {\r\n");
      out.write("		position: absolute;\r\n");
      out.write("		left: 160px;\r\n");
      out.write("		top: 3px;\r\n");
      out.write("		font-size: 1.5rem;\r\n");
      out.write("		text-shadow: 0px 0px 1px #FFF;\r\n");
      out.write("		display: none;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#list > .item:hover > div:last-child {\r\n");
      out.write("		display: block;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>Image Viewer</h1>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"list\">\r\n");
      out.write("		<!-- <div class=\"item\">\r\n");
      out.write("			<img src=\"pic/placeimg_200_150_nature.jpg\">\r\n");
      out.write("			<div>&times;</div>\r\n");
      out.write("		</div> -->\r\n");
      out.write("		");
for(File file : list) { 
      out.write("\r\n");
      out.write("			<div class=\"item\">\r\n");
      out.write("			<img src=\"pic/");
      out.print( file.getName() );
      out.write("\">\r\n");
      out.write("			<div>&times;</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<form method=\"POST\" action=\"ex18_ok.jsp\" enctype=\"multipart/form-data\">\r\n");
      out.write("	<table class=\"vertical\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>이미지</th>\r\n");
      out.write("			<td><input type=\"file\" name=\"attach\" required></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	<div>\r\n");
      out.write("		<input type=\"submit\" value=\"이미지 업로드\">\r\n");
      out.write("	</div>	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("	<script src=\"http://pinnpublic.dothome.co.kr/cdn/example-min.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

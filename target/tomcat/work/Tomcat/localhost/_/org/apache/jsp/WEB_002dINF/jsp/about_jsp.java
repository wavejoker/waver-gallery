/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-23 12:12:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\r\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<title>Hydrogen &mdash; A free HTML5 Template </title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\r\n");
      out.write("\t<meta name=\"author\" content=\"FREEHTML5.CO\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- Facebook and Twitter integration -->\r\n");
      out.write("\t<meta property=\"og:title\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:image\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:url\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:site_name\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:description\" content=\"\"/>\r\n");
      out.write("\t<meta name=\"twitter:title\" content=\"\" />\r\n");
      out.write("\t<meta name=\"twitter:image\" content=\"\" />\r\n");
      out.write("\t<meta name=\"twitter:url\" content=\"\" />\r\n");
      out.write("\t<meta name=\"twitter:card\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Google Webfonts -->\r\n");
      out.write("\t<link href='http://fonts.useso.com/css?family=Roboto:400,300,100,500' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t<link href='http://fonts.useso.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Animate.css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\t<!-- Salvattore -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/salvattore.css\">\r\n");
      out.write("\t<!-- Theme Style -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t<!-- Modernizr JS -->\r\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("\t<!-- FOR IE9 below -->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id=\"fh5co-offcanvass\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"fh5co-offcanvass-close js-fh5co-offcanvass-close\">Menu <i class=\"icon-cross\"></i> </a>\r\n");
      out.write("\t\t<h1 class=\"fh5co-logo\"><a class=\"navbar-brand\" href=\"index.html\">Hydrogen</a></h1>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"about.html\">About</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"pricing.html\">Pricing</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h3 class=\"fh5co-lead\">Connect with us</h3>\r\n");
      out.write("\t\t<p class=\"fh5co-social-icons\">\r\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"icon-twitter\"></i></a>\r\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"icon-facebook\"></i></a>\r\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"icon-instagram\"></i></a>\r\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"icon-dribbble\"></i></a>\r\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"icon-youtube\"></i></a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<header id=\"fh5co-header\" role=\"banner\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"fh5co-menu-btn js-fh5co-menu-btn\">Menu <i class=\"icon-menu\"></i></a>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">Hydrogen</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- END .header -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"fh5co-main\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t<h2>Personal Bio</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"fh5co-spacer fh5co-spacer-sm\"></div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<img src=\"images/img_29_large.jpg\" alt=\"Free HTML5 template by FREEHTML5.co\" class=\"img-rounded img-responsive\"></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p> The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way. When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. </p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t</div>\r\n");
      out.write("       </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"fh5co-footer\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row row-padded\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t\t<p class=\"fh5co-social-icons\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon-twitter\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon-facebook\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon-instagram\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon-dribbble\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon-youtube\"></i></a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p><small>&copy; Hydrogen Free HTML5 Template. All Rights Reserved. </small> </p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery Easing -->\r\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- Waypoints -->\r\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t<!-- Salvattore -->\r\n");
      out.write("\t<script src=\"js/salvattore.min.js\"></script>\r\n");
      out.write("\t<!-- Main JS -->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
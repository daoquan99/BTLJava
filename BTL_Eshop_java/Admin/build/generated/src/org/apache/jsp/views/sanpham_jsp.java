package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/my-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_form_form_method_action.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"/Admin/views/assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Admin/views/assets/img/favicon.png\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <title>\n");
      out.write("            Admin Shop Quần Áo\n");
      out.write("        </title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"/Admin/views/assets/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("        <link href=\"/Admin/views/assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"\">\n");
      out.write("       \n");
      out.write("        <div class=\"wrapper \">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\n");
      out.write("                <div class=\"main-panel\">\n");
      out.write("                    <!-- Navbar -->\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <div class=\"navbar-wrapper\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"#\">Sản phẩm</a>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("                                <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("                                <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse justify-content-end\">\n");
      out.write("                            ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"material-icons\">notifications</i>\n");
      out.write("                                        <span class=\"notification\">5</span>\n");
      out.write("                                        <p class=\"d-lg-none d-md-block\">\n");
      out.write("                                            Some Actions\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Mike John responded to your email</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">You have 5 new tasks</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">You're now friend with Andrew</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Another Notification</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Another One</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\" id=\"navbarDropdownProfile\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"material-icons\">person</i>\n");
      out.write("                                        <p class=\"d-lg-none d-md-block\">\n");
      out.write("                                            Account\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownProfile\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Đăng nhập</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"Dangky.htm\">Đăng ký</a>\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"dangxuat.htm\" >Đăng xuất</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End Navbar -->\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <button class=\"btn btn-link\"><a href=\"taomoiSp.htm\">Thêm mới</a></button><br>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Tên sản phẩm</th>\n");
      out.write("                                <th>Ảnh sản phẩm</th>\n");
      out.write("                                <th>Giá</th>\n");
      out.write("                                <th>Nhóm sản phẩm</th>\n");
      out.write("                                <th>Nhà cung cấp</th>\n");
      out.write("                                <th>Chức năng</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\" style=\"text-align: right\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"keys\" style=\"display: none\" title=\"/shop\">\n");
      out.write("                        <span>2</span><span>3</span><span>4</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\" text-align: center ;padding-right: 20px\">\n");
      out.write("                        ");
      if (_jspx_meth_mytag_my_tag_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/core/jquery.min.js\"></script>\n");
      out.write("    <script src=\"/Admin/views/assets/js/core/popper.min.js\"></script>\n");
      out.write("    <script src=\"/Admin/views/assets/js/core/bootstrap-material-design.min.js\"></script>\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("    <!-- Plugin for the momentJs  -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/moment.min.js\"></script>\n");
      out.write("    <!--  Plugin for Sweet Alert -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/sweetalert2.js\"></script>\n");
      out.write("    <!-- Forms Validations Plugin -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/jquery.validate.min.js\"></script>\n");
      out.write("    <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/jquery.bootstrap-wizard.js\"></script>\n");
      out.write("    <!--\tPlugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/bootstrap-selectpicker.js\"></script>\n");
      out.write("    <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("    <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/jquery.dataTables.min.js\"></script>\n");
      out.write("    <!--\tPlugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/bootstrap-tagsinput.js\"></script>\n");
      out.write("    <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/jasny-bootstrap.min.js\"></script>\n");
      out.write("    <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/fullcalendar.min.js\"></script>\n");
      out.write("    <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/jquery-jvectormap.js\"></script>\n");
      out.write("    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/nouislider.min.js\"></script>\n");
      out.write("    <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js\"></script>\n");
      out.write("    <!-- Library for adding dinamically elements -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/arrive.min.js\"></script>\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/chartist.min.js\"></script>\n");
      out.write("    <script src=\"/Admin/views/assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("    <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("    <script src=\"/Admin/views/assets/js/material-dashboard.js?v=2.1.1\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- Material Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("    <script src=\"/Admin/views/assets/demo/demo.js\"></script>\n");
      out.write("    <script>\n");
      out.write("                                        $(document).ready(function () {\n");
      out.write("                                            $().ready(function () {\n");
      out.write("                                                $sidebar = $('.sidebar');\n");
      out.write("\n");
      out.write("                                                $sidebar_img_container = $sidebar.find('.sidebar-background');\n");
      out.write("\n");
      out.write("                                                $full_page = $('.full-page');\n");
      out.write("\n");
      out.write("                                                $sidebar_responsive = $('body > .navbar-collapse');\n");
      out.write("\n");
      out.write("                                                window_width = $(window).width();\n");
      out.write("\n");
      out.write("                                                fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();\n");
      out.write("\n");
      out.write("                                                if (window_width > 767 && fixed_plugin_open == 'Dashboard') {\n");
      out.write("                                                    if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {\n");
      out.write("                                                        $('.fixed-plugin .dropdown').addClass('open');\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                }\n");
      out.write("\n");
      out.write("                                                $('.fixed-plugin a').click(function (event) {\n");
      out.write("                                                    // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active\n");
      out.write("                                                    if ($(this).hasClass('switch-trigger')) {\n");
      out.write("                                                        if (event.stopPropagation) {\n");
      out.write("                                                            event.stopPropagation();\n");
      out.write("                                                        } else if (window.event) {\n");
      out.write("                                                            window.event.cancelBubble = true;\n");
      out.write("                                                        }\n");
      out.write("                                                    }\n");
      out.write("                                                });\n");
      out.write("\n");
      out.write("                                                $('.fixed-plugin .active-color span').click(function () {\n");
      out.write("                                                    $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("                                                    $(this).siblings().removeClass('active');\n");
      out.write("                                                    $(this).addClass('active');\n");
      out.write("\n");
      out.write("                                                    var new_color = $(this).data('color');\n");
      out.write("\n");
      out.write("                                                    if ($sidebar.length != 0) {\n");
      out.write("                                                        $sidebar.attr('data-color', new_color);\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    if ($full_page.length != 0) {\n");
      out.write("                                                        $full_page.attr('filter-color', new_color);\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    if ($sidebar_responsive.length != 0) {\n");
      out.write("                                                        $sidebar_responsive.attr('data-color', new_color);\n");
      out.write("                                                    }\n");
      out.write("                                                });\n");
      out.write("\n");
      out.write("                                                $('.fixed-plugin .background-color .badge').click(function () {\n");
      out.write("                                                    $(this).siblings().removeClass('active');\n");
      out.write("                                                    $(this).addClass('active');\n");
      out.write("\n");
      out.write("                                                    var new_color = $(this).data('background-color');\n");
      out.write("\n");
      out.write("                                                    if ($sidebar.length != 0) {\n");
      out.write("                                                        $sidebar.attr('data-background-color', new_color);\n");
      out.write("                                                    }\n");
      out.write("                                                });\n");
      out.write("\n");
      out.write("                                                $('.fixed-plugin .img-holder').click(function () {\n");
      out.write("                                                    $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("                                                    $(this).parent('li').siblings().removeClass('active');\n");
      out.write("                                                    $(this).parent('li').addClass('active');\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    var new_image = $(this).find(\"img\").attr('src');\n");
      out.write("\n");
      out.write("                                                    if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\n");
      out.write("                                                        $sidebar_img_container.fadeOut('fast', function () {\n");
      out.write("                                                            $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("                                                            $sidebar_img_container.fadeIn('fast');\n");
      out.write("                                                        });\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\n");
      out.write("                                                        var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\n");
      out.write("\n");
      out.write("                                                        $full_page_background.fadeOut('fast', function () {\n");
      out.write("                                                            $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\n");
      out.write("                                                            $full_page_background.fadeIn('fast');\n");
      out.write("                                                        });\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    if ($('.switch-sidebar-image input:checked').length == 0) {\n");
      out.write("                                                        var new_image = $('.fixed-plugin li.active .img-holder').find(\"img\").attr('src');\n");
      out.write("                                                        var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\n");
      out.write("\n");
      out.write("                                                        $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("                                                        $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    if ($sidebar_responsive.length != 0) {\n");
      out.write("                                                        $sidebar_responsive.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("                                                    }\n");
      out.write("                                                });\n");
      out.write("\n");
      out.write("                                                $('.switch-sidebar-image input').change(function () {\n");
      out.write("                                                    $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("                                                    $input = $(this);\n");
      out.write("\n");
      out.write("                                                    if ($input.is(':checked')) {\n");
      out.write("                                                        if ($sidebar_img_container.length != 0) {\n");
      out.write("                                                            $sidebar_img_container.fadeIn('fast');\n");
      out.write("                                                            $sidebar.attr('data-image', '#');\n");
      out.write("                                                        }\n");
      out.write("\n");
      out.write("                                                        if ($full_page_background.length != 0) {\n");
      out.write("                                                            $full_page_background.fadeIn('fast');\n");
      out.write("                                                            $full_page.attr('data-image', '#');\n");
      out.write("                                                        }\n");
      out.write("\n");
      out.write("                                                        background_image = true;\n");
      out.write("                                                    } else {\n");
      out.write("                                                        if ($sidebar_img_container.length != 0) {\n");
      out.write("                                                            $sidebar.removeAttr('data-image');\n");
      out.write("                                                            $sidebar_img_container.fadeOut('fast');\n");
      out.write("                                                        }\n");
      out.write("\n");
      out.write("                                                        if ($full_page_background.length != 0) {\n");
      out.write("                                                            $full_page.removeAttr('data-image', '#');\n");
      out.write("                                                            $full_page_background.fadeOut('fast');\n");
      out.write("                                                        }\n");
      out.write("\n");
      out.write("                                                        background_image = false;\n");
      out.write("                                                    }\n");
      out.write("                                                });\n");
      out.write("\n");
      out.write("                                                $('.switch-sidebar-mini input').change(function () {\n");
      out.write("                                                    $body = $('body');\n");
      out.write("\n");
      out.write("                                                    $input = $(this);\n");
      out.write("\n");
      out.write("                                                    if (md.misc.sidebar_mini_active == true) {\n");
      out.write("                                                        $('body').removeClass('sidebar-mini');\n");
      out.write("                                                        md.misc.sidebar_mini_active = false;\n");
      out.write("\n");
      out.write("                                                        $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();\n");
      out.write("\n");
      out.write("                                                    } else {\n");
      out.write("\n");
      out.write("                                                        $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');\n");
      out.write("\n");
      out.write("                                                        setTimeout(function () {\n");
      out.write("                                                            $('body').addClass('sidebar-mini');\n");
      out.write("\n");
      out.write("                                                            md.misc.sidebar_mini_active = true;\n");
      out.write("                                                        }, 300);\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    // we simulate the window Resize so the charts will get updated in realtime.\n");
      out.write("                                                    var simulateWindowResize = setInterval(function () {\n");
      out.write("                                                        window.dispatchEvent(new Event('resize'));\n");
      out.write("                                                    }, 180);\n");
      out.write("\n");
      out.write("                                                    // we stop the simulation of Window Resize after the animations are completed\n");
      out.write("                                                    setTimeout(function () {\n");
      out.write("                                                        clearInterval(simulateWindowResize);\n");
      out.write("                                                    }, 1000);\n");
      out.write("\n");
      out.write("                                                });\n");
      out.write("                                            });\n");
      out.write("                                        });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("            md.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setAction("timtensanpham.htm?name=tenSp");
    _jspx_th_form_form_0.setMethod("POST");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <input name=\"tenSp\" type=\"text\" value=\"\" class=\"form-control\" placeholder=\"Search...\">\n");
          out.write("                                <button type=\"submit\" class=\"btn btn-white btn-round btn-just-icon\">\n");
          out.write("                                    <i class=\"material-icons\">search</i>\n");
          out.write("                                    <div class=\"ripple-container\"></div>\n");
          out.write("                                </button>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_method_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${getAllsp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("sp");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.tenSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td><img src='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.anh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' width='100'/></td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.gia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maNhomSp.tenNhomSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maNcc.tenNcc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td><a href='updatesp.htm?maSp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'>Sửa</a>\n");
          out.write("                                    |<a href='xoasanpham.htm?maSp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&tenSp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.tenSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&anh=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.anh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&gia=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.gia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&mota=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.mota}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&maNcc=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maNcc.maNcc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&maNhomSp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maNhomSp.maNhomSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' onclick=\"return confirm('Bạn có muốn xóa sản phẩm này không?')\">Xóa</a>\n");
          out.write("                                    |<a href='chitietsp.htm?maSp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.maSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'>Chi tiết</a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_mytag_my_tag_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mytag:my_tag
    tag.MyTag _jspx_th_mytag_my_tag_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(tag.MyTag.class) : new tag.MyTag();
    _jspx_th_mytag_my_tag_0.setJspContext(_jspx_page_context);
    _jspx_th_mytag_my_tag_0.setSteps(4);
    _jspx_th_mytag_my_tag_0.setOffset(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offset}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_mytag_my_tag_0.setCount(((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberProductDetail}", java.lang.Long.class, (PageContext)_jspx_page_context, null)).longValue());
    _jspx_th_mytag_my_tag_0.setUri("SanPham.htm");
    _jspx_th_mytag_my_tag_0.setNext("&raquo;");
    _jspx_th_mytag_my_tag_0.setPrevious("&laquo;");
    _jspx_th_mytag_my_tag_0.doTag();
    return false;
  }
}

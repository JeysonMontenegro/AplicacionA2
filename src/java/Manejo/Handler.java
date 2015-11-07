package Manejo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jeyson
 */
public class Handler extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ClientRestful cr = new ClientRestful();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String pagina = "login.jsp";

        try {
            if (request.getParameter("accion").equals("ingreso")) {
                // ---------------------LOGIN--------------------------
                if (!request.getParameter("usuario").equals("") && !request.getParameter("contrasenia").equals("")) {
                    request.getSession().setAttribute("id", "admin");
                     JSONArray array=cr.Get("login","{\"correo\": \""+request.getParameter("usuario")+"\",\"pass\":\""+request.getParameter("contrasenia")+"\"}");
                  
          
                    JSONObject jo=(JSONObject) array.get(0);
                    if(!jo.get("id_usuario").equals("0")){
                    pagina = "Reporte.jsp";
                    String reporte="  <table class=\"table table-bordered\">\n" +
"    <thead>\n" +
"      <tr>\n" +
"        <th>Firstname</th>\n" +
"        <th>Lastname</th>\n" +
"        <th>Email</th>\n" +
"      </tr>\n" +
"    </thead>\n" +
"    <tbody>\n" +
"      <tr>\n" +
"        <td>John</td>\n" +
"        <td>Doe</td>\n" +
"        <td>john@example.com</td>\n" +
"      </tr>\n" +
"      <tr>\n" +
"        <td>Mary</td>\n" +
"        <td>Moe</td>\n" +
"        <td>mary@example.com</td>\n" +
"      </tr>\n" +
"      <tr>\n" +
"        <td>July</td>\n" +
"        <td>Dooley</td>\n" +
"        <td>july@example.com</td>\n" +
"      </tr>\n" +
"    </tbody>\n" +
"  </table>";
                     request.setAttribute("reporte",reporte);
                    }
                     else{
                     pagina = "login.jsp";
                      request.setAttribute("mensaje","error");
                     }
                    
                
                } else {
                    pagina = "login.jsp";
                    request.setAttribute("mensaje","user or password incorrect");
                }
            }
            
             request.getRequestDispatcher(pagina).forward(request, response);
        }
        finally {
            out.close();
           
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

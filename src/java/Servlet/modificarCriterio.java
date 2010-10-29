/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Clases.Competencias.Criterios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author RaiL
 */
public class modificarCriterio extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet modificarCriterio</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet modificarCriterio at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);

        String id = request.getParameter("id");
        Criterios cri = null;

        Criterios criterio = new Criterios();
         cri = criterio.obtenerCriterio(id);
         if(criterio != null){
            request.setAttribute("Persona", cri);
            RequestDispatcher view = request.getRequestDispatcher("/criterios/modificar.jsp");
            view.forward(request, response);
       }
       else{
           RequestDispatcher view = request.getRequestDispatcher("../error.jsp");
           view.forward(request, response);
       }


           
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        int id = Integer.parseInt(request.getParameter("id"));
        int ponderacion = Integer.parseInt(request.getParameter("ponderacion"));


        Criterios  nuevoCriterio = new Criterios(id,nombre,descripcion,ponderacion);


       try {
            int criterio = nuevoCriterio.crearCriterio(nuevoCriterio);
            request.setAttribute("filas", criterio);
       if(criterio > 0){
           RequestDispatcher view = request.getRequestDispatcher("http://localhost:8083/siecCompetencias/gracias.jsp");
           view.forward(request, response);
       }
       else{
           RequestDispatcher view = request.getRequestDispatcher("http://localhost:8083/siecCompetencias/error.jsp");
           view.forward(request, response);
       }


        } catch (SQLException ex) {
            Logger.getLogger(modificarCriterio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

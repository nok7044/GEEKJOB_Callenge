/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author satou.pecotan
 */
public class Method8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     String [] userProfile(String str){
        String [] data1 ={"1","技育太郎","東京","男","プログラマー"};
        String [] data2 ={"2","技育花子","北海道","女","システムエンジニア"};
        String [] data3 ={"3","技育三郎","大阪","男","Webエンジニア"};
                
        if(data1[0].equals(str)) {return data1;}
        if(data2[0].equals(str)) {return data2;}
        if(data3[0].equals(str)) {return data3;}
        else {return null;}
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String[] a = userProfile("1");
            String[] b = userProfile("2");
            String[] c = userProfile("3");
            
            for (int i=0;i<a.length;i++){
               if(i==0){continue;}
               out.print(a[i]);
            }
            
            for (int i=0;i<b.length;i++){
               if(i==0){continue;}
               out.print(b[i]);
            }
            
            for (int i=0;i<c.length;i++){
               if(i==0){continue;}
               out.print(c[i]);
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Method8</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Method8 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

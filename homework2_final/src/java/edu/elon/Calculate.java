/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon;

import edu.elon.data.Data;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ez2sp
 */
@WebServlet(name = "calculate", urlPatterns = {"/calculate"})
public class Calculate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        doPost(request, response);
        
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
      
      String url = "/index.jsp";
      
      // get current action
      String action = request.getParameter("action");
      if (action == null) {
        action = "error";
      }
      
      if (action.equals("error")) {      
        url = "/index.jsp";
      } else if (action.equals("complete")) {
        // get parameters
        double investmentAmount = Double.parseDouble(request.getParameter("investmentAmount"));
        double yearlyInterestRate = Double.parseDouble(request.getParameter("yearlyInterestRate"));
        double numberOfYears = Double.parseDouble(request.getParameter("numberOfYears"));
        
        Data d = new Data (investmentAmount, yearlyInterestRate, numberOfYears);
        
        url = "/output.jsp";
        request.setAttribute("data", d);
      }
      getServletContext()
        .getRequestDispatcher(url)
        .forward(request, response);
      
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

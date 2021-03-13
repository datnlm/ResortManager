/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.controller;

import dat.daos.RoomDAO;
import dat.dto.RoomDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author macbook
 */
@WebServlet(name = "AddRoomController", urlPatterns = {"/AddRoomController"})
public class AddRoomController extends HttpServlet {

    private static final String ERROR = "ManagerController";
    private static final String SUCCESS = "ManagerController";
    private static final Logger LOGGER = Logger.getLogger(AddRoomController.class);

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String roomID = request.getParameter("txtRoomID");
            String statusTMP = request.getParameter("chkStatus");
            String description = request.getParameter("txtDescription");
            String tmp = request.getParameter("txtPrice");
            if (!tmp.isEmpty() && !roomID.isEmpty() && roomID.length() > 5) {
                float price = Float.parseFloat(tmp);
                boolean status = true;

                if (statusTMP == null) {
                    status = false;
                }
                RoomDTO dto = new RoomDTO(roomID, price, description, status);
                RoomDAO dao = new RoomDAO();
                int result = dao.create(dto);
                if (result != -1) {
                    url = SUCCESS;
                    request.setAttribute("MESSAGE", "Add new room success!");
                } else {
                    request.setAttribute("ERROR", "RoomID already exists");
                }
            } else {
                request.setAttribute("ERROR", "RoomID or price can not empty and max size of roomID is 5");
            }
        } catch (Exception e) {
            LOGGER.error("Error at: ", e);
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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

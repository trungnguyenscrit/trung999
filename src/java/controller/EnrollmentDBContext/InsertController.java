/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.EnrollmentDBContext;

import dal.CourseDBContext;
import dal.EmployeeDBContext;
import dal.EnrollmentDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Course;
import model.Employee;
import model.Enrollment;

/**
 *
 * @author Trung
 */
public class InsertController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
        EmployeeDBContext edb = new EmployeeDBContext();
        ArrayList<Employee> emps = edb.getEmps();
        CourseDBContext ddb = new CourseDBContext();
        ArrayList<Course> cours = ddb.getCours();
        request.setAttribute("emps", emps);
        request.setAttribute("cours", cours);
        request.getRequestDispatcher("../view/enrollment/insert.jsp").forward(request, response);
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
        Enrollment e = new Enrollment();
        e.setFrom(Date.valueOf(request.getParameter("from")));
        e.setTo(Date.valueOf(request.getParameter("to")));
        Course c = new Course();
        c.setId(Integer.parseInt(request.getParameter("id")));
        e.setCour(c);
        Employee emp = new Employee();
        emp.setId(Integer.parseInt(request.getParameter("id")));
        e.setActive(request.getParameter("active").equals("learning"));
        e.setNote(request.getParameter("note"));
        e.setEmploy(emp);
        EnrollmentDBContext db = new EnrollmentDBContext();
        db.insert(e);
        response.sendRedirect("list");
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

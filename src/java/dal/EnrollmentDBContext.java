/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Employee;
import model.Enrollment;

/**
 *
 * @author Trung
 */
public class EnrollmentDBContext extends DBContext{
    public ArrayList<Enrollment> getEnrollment(){
        ArrayList<Enrollment> enrollments = new ArrayList<>();
        try {
            String sql = "select * from Enrollment";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Enrollment e = new Enrollment();
                e.setFrom(rs.getDate("from"));
                e.setTo(rs.getDate("to"));
                Course c = new Course();
                c.setId(rs.getInt("cid"));
                e.setCour(c);
                Employee emp = new Employee();
                emp.setId(rs.getInt("eid"));
                e.setEmploy(emp);
                e.setActive(rs.getBoolean("active"));
                e.setNote(rs.getString("note"));
                enrollments.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return enrollments;
    }
    public void insert(Enrollment e){
        
        try {
            String sql = "INSERT INTO [dbo].[Enrollment]\n" +
                    "           ([from]\n" +
                    "           ,[to]\n" +
                    "           ,[cid]\n" +
                    "           ,[eid]\n" +
                    "           ,[active]\n" +
                    "           ,[note])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setDate(1, e.getFrom());
            stm.setDate(2, e.getTo());
            stm.setInt(3, e.getCour().getId());
            stm.setInt(4, e.getEmploy().getId());
            stm.setBoolean(5, e.isActive());
            stm.setString(6, e.getNote());
            stm.executeUpdate();
                    } catch (SQLException ex) {
            Logger.getLogger(EnrollmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

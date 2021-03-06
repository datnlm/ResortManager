/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.daos;

import dat.dto.UserDTO;
import dat.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author macbook
 */
public class UserDAO {

    private static final Logger LOGGER = Logger.getLogger(UserDAO.class);

    public UserDTO checkLogin(String userID, String password) throws SQLException {
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        UserDTO user = new UserDTO();
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "select userID, password, fullName, gender, email, roleID"
                        + " from tblUsers"
                        + " where userID = ? and password = ?";
                pst = cn.prepareStatement(sql);
                pst.setString(1, userID);
                pst.setString(2, password);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String fullName = rs.getString("fullName");
                    String gender = rs.getString("gender");
                    String email = rs.getString("email");
                    String roleID = rs.getString("roleID");
                    user = new UserDTO(userID, password, fullName, gender, email, roleID);
                }
            }
        } catch (Exception e) {
            LOGGER.error("Error at: ", e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return user;
    }

    public int create(UserDTO dto) throws SQLException {
        Connection cn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "If Not Exists(select userID from tblUsers where userID = ?)\n"
                        + "Begin\n"
                        + "insert into tblUsers (userID, password, fullName, gender, email, roleID) values (? , ?, ?, ?, ?, 'user')\n"
                        + "End";
                pst = cn.prepareStatement(sql);
                pst.setString(1, dto.getUserID());
                pst.setString(2, dto.getUserID());
                pst.setString(3, dto.getPassword());
                pst.setString(4, dto.getFullName());
                pst.setString(5, dto.getGender());
                pst.setString(6, dto.getEmail());
                result = pst.executeUpdate();
            }
        } catch (Exception e) {
            LOGGER.error("Error at: ", e);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return result;
    }
}

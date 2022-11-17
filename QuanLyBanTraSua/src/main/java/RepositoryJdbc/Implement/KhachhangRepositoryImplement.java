package RepositoryJdbc.Implement;

import java.util.List;
import DomainModel.Khachhang;
import RepositoryJdbc.Interface.KhachhangRepositoryInterface;
import Utility.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachhangRepositoryImplement implements KhachhangRepositoryInterface {

    private Connection con;

    public KhachhangRepositoryImplement() {
        con = DBContext.getConnection();
    }

    @Override
    public List<Khachhang> getAllKH() {
        List<Khachhang> listkh = new ArrayList<>();
        String sql = " SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[HoTen]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[DiaChi]\n"
                + "      ,[SDT]\n"
                + "      ,[MoTa]\n"
                + "  FROM [dbo].[Khachhang]\n"
                + "\n"
                + "GO";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Khachhang kh = new Khachhang();
                listkh.add(new Khachhang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SizeRepositoryImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listkh;
    }

}

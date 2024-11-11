/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author USER
 */

import java.sql.*;

public class Entry {
    private String nama;
    private String alamat;
    private String kota;
    private String telepon;

    // Constructor untuk inisialisasi atribut entri
    public Entry(String nama, String alamat, String kota, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.telepon = telepon;
    }

    // Getter untuk atribut
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getKota() { return kota; }
    public String getTelepon() { return telepon; }

    // Menambahkan entri baru ke database
    public static void addEntry(Entry entry) {
        String query = "INSERT INTO bukuAlamat (nama, alamat, kota, telepon) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, entry.getNama());
            pstmt.setString(2, entry.getAlamat());
            pstmt.setString(3, entry.getKota());
            pstmt.setString(4, entry.getTelepon());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Mengambil semua entri dari database
    public static ResultSet getEntries() {
        try {
            Connection conn = DriverManager.getConnection(Database.DB_URL);
            Statement stmt = conn.createStatement();
            return stmt.executeQuery("SELECT * FROM bukuAlamat");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Memperbarui entri di database berdasarkan ID
    public static void updateEntry(int id, Entry entry) {
        String query = "UPDATE bukuAlamat SET nama = ?, alamat = ?, kota = ?, telepon = ? WHERE id = ?";
        try (Connection conn = Database.connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, entry.getNama());
            pstmt.setString(2, entry.getAlamat());
            pstmt.setString(3, entry.getKota());
            pstmt.setString(4, entry.getTelepon());
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Menghapus entri dari database berdasarkan ID
    public static void deleteEntry(int id) {
        String query = "DELETE FROM bukuAlamat WHERE id = ?";
        try (Connection conn = Database.connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Mencari entri berdasarkan keyword di salah satu kolom
    public static ResultSet searchEntries(String keyword) {
        try {
            Connection conn = Database.connect();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM bukuAlamat WHERE nama LIKE ? OR alamat LIKE ? OR kota LIKE ? OR telepon LIKE ?");
            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");
            pstmt.setString(3, "%" + keyword + "%");
            pstmt.setString(4, "%" + keyword + "%");
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

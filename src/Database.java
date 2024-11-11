/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */

public class Database {
    public static final String DB_URL = "jdbc:sqlite:alamat.db"; // URL koneksi untuk database SQLite bernama "buku_alamat.db"

    public static Connection connect() {
        try {
            // Menghubungkan ke database dan mengembalikan objek Connection
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            e.printStackTrace(); // Menangani kesalahan jika koneksi gagal
            return null; // Mengembalikan null jika terjadi kesalahan
        }
    }

    public static void createTable() {
        // Query SQL untuk membuat tabel 'bukuAlamat' jika belum ada
        String query = "CREATE TABLE IF NOT EXISTS bukuAlamat ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Kolom 'id' sebagai primary key dengan autoincrement
                + "nama TEXT, "
                + "alamat TEXT, "
                + "kota TEXT, "
                + "telepon TEXT)";

        // Menghubungkan ke database dan menjalankan query
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(query); // Menjalankan query untuk membuat tabel
        } catch (SQLException e) {
            e.printStackTrace(); // Menangani kesalahan jika query gagal dijalankan
        }
    }
}

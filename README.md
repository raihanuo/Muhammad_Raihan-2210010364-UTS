![10](https://github.com/user-attachments/assets/8b90da1e-31a6-4147-a05f-68cf0f02fcdb)# Aplikasi Buku Alamat
 
Aplikasi ini adalah program Java berbasis GUI yang memungkinkan pengguna untuk mengelola entri, memungkinkan pengguna untuk menambah, mengubah, menghapus, dan mencari entri dengan mudah. Selain itu aplikasi ini bisa mengekspor dan mengimpor entri.

## Identitas
- Nama  : Muhammad Raihan
- NPM   : 2210010364
- Kelas : 5B NonReg Banjarmasin

## Fitur
- **Menambah Entri**: Pengguna dapat menambah kontak baru dengan nama, nomor telepon, dan kategori.
- **Mengubah Entri**: Pengguna dapat mengubah informasi kontak yang sudah ada.
- **Menghapus Entri**: Pengguna dapat menghapus kontak dari daftar.
- **Mencari Entri**: Pengguna dapat mencari kontak berdasarkan nama.
- **Ekspor dan Impor**: Pengguna dapat mengekspor kontak ke file CSV dan mengimpor dari file CSV.
- **Validasi Input**: Memastikan bahwa nomor telepon yang dimasukkan valid (10-14 digit).

## Cara Menggunakan
1. Untuk menambah entri, isi nama, alamat, kota dan telepon, kemudian klik "Tambah".
2. Untuk mengubah entri, pilih entri dari list dan ubah informasi yang diinginkan, kemudian klik "Ubah".
3. Untuk menghapus entri, pilih entri dari list dan klik "Hapus".
4. Untuk mencari entri, masukkan kata kunci di kolom "Cari" dan klik "Cari".
5. Untuk mengekspor entri, klik "Ekspor ke File" dan untuk mengimpor, klik "Impor dari File".

## Teknologi yang Digunakan
- **Java**: Bahasa pemrograman yang digunakan untuk membangun aplikasi.
- **Swing**: Library Java untuk membuat antarmuka pengguna grafis (GUI).
- **SQL**: Digunakan untuk pengelolaan basis data kontak.
- **TXT**: Format file untuk ekspor dan impor data kontak.
- **Library SQLite**: sqlite-jdbc-3.47.0.0.jar untuk menyimpan data secara lokal.

## Keunggulan
- **User-Friendly**: Antarmuka pengguna yang intuitif dan mudah digunakan.
- **Fleksibilitas**: Memungkinkan pengguna untuk mengelola kontak dengan cara yang efisien.
- **Data Validasi**: Memastikan data yang dimasukkan valid untuk menghindari kesalahan.
- **Ekspor dan Impor**: Memudahkan pengguna dalam menyimpan dan memulihkan data entri.

## Screenshot
![10](https://github.com/user-attachments/assets/629a56e5-68b9-48d0-8b13-277600dfddf6)
![10_](https://github.com/user-attachments/assets/e0269fc1-cf54-4819-8230-bed9685ff304)

## Cara Menjalankan Program
1. Pastikan Anda memiliki **Java Development Kit (JDK)** terinstal di sistem Anda.
2. Clone repositori ini ke mesin lokal Anda.
   ```bash
   git clone https://github.com/raihanuo/Muhammad_Raihan-2210010364-UTS.git
3. Tambahkan sqlite-jdbc-3.47.0.0.jar dari folder lib ke Libary Anda.
4. Jalankan aplikasi dengan mengkompilasi dan mengeksekusi file `BukuAlamat.java`.

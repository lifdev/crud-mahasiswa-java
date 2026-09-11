# CRUD Data Mahasiswa - Java Swing + MySQL

Aplikasi desktop sederhana untuk mengelola data mahasiswa Fakultas Ilmu Komputer, dibuat menggunakan Java Swing dengan koneksi database MySQL.

## Fitur
- Tambah data mahasiswa (NIM, Nama, Jurusan, No HP, Jenis Kelamin, Alamat)
- Edit data mahasiswa
- Hapus data mahasiswa
- Cetak laporan data mahasiswa (JasperReport)
- Tabel data mahasiswa real-time

## Tech Stack
- Java (Swing untuk GUI)
- MySQL (database)
- JasperReport (untuk cetak laporan)
- Apache NetBeans IDE

## Cara Menjalankan
1. Buat database MySQL dengan nama `db_crud_java`
2. Sesuaikan koneksi database di `src/koneksi/koneksi.java` jika diperlukan (default: localhost, user root, tanpa password)
3. Buka project menggunakan Apache NetBeans
4. Jalankan project (Run > Run Project)

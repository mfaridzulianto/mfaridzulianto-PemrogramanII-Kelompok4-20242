/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

/**
 *
 * @author M Ari Fauzi
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Buat beberapa film
        Film film1 = new Film("Avengers: Endgame", 50000);
        Film film2 = new Film("Spiderman: No Way Home", 45000);
        Film film3 = new Film("Dilan 1991", 40000);

        // Input nama customer
        String nama = JOptionPane.showInputDialog("Masukkan nama Anda:");
        Customer customer = new Customer(nama);

        // Pilih film
        String[] pilihanFilm = {film1.getJudul(), film2.getJudul(), film3.getJudul()};
        String judulDipilih = (String) JOptionPane.showInputDialog(null, "Pilih Film:",
                "Daftar Film", JOptionPane.QUESTION_MESSAGE, null, pilihanFilm, pilihanFilm[0]);

        Film filmDipilih = null;
        if (judulDipilih.equals(film1.getJudul())) filmDipilih = film1;
        else if (judulDipilih.equals(film2.getJudul())) filmDipilih = film2;
        else filmDipilih = film3;

        // Pilih jam tayang
        String[] jam = {"12:00", "15:00", "18:00", "21:00"};
        String jamDipilih = (String) JOptionPane.showInputDialog(null, "Pilih Jam Tayang:",
                "Jadwal", JOptionPane.QUESTION_MESSAGE, null, jam, jam[0]);

        Jadwal jadwal = new Jadwal(filmDipilih, jamDipilih);

        // Pilih kursi
        String kursi = JOptionPane.showInputDialog("Masukkan nomor kursi (cth: A1):");

        // Proses Booking
        Booking booking = new Booking(customer, jadwal, kursi);
        booking.simpanStruk();

        // Tampilkan Ringkasan
        String ringkasan = "Pesanan atas nama " + customer.getNama()
                + "\nFilm: " + filmDipilih.getJudul()
                + "\nJam: " + jamDipilih
                + "\nKursi: " + kursi
                + "\nTotal Harga: Rp " + booking.getTotalHarga()
                + "\nStruk disimpan ke file.";

        JOptionPane.showMessageDialog(null, ringkasan);
    }
}

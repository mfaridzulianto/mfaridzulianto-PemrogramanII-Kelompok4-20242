/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

/**
 *
 * @author M Ari Fauzi
 */
import java.io.FileWriter;
import java.io.IOException;

public class Booking {
    private Customer customer;
    private Jadwal jadwal;
    private String kursi;
    private int totalHarga;

    public Booking(Customer customer, Jadwal jadwal, String kursi) {
        this.customer = customer;
        this.jadwal = jadwal;
        this.kursi = kursi;
        this.totalHarga = jadwal.getFilm().getHarga();
    }

    public void simpanStruk() {
        try {
            FileWriter writer = new FileWriter("struk_booking.txt");
            writer.write("=== STRUK PEMESANAN ===\n");
            writer.write("Nama: " + customer.getNama() + "\n");
            writer.write("Film: " + jadwal.getFilm().getJudul() + "\n");
            writer.write("Jam Tayang: " + jadwal.getJamTayang() + "\n");
            writer.write("Kursi: " + kursi + "\n");
            writer.write("Total Harga: Rp " + totalHarga + "\n");
            writer.write("=======================\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan struk!");
        }
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}

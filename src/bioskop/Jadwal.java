/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

/**
 *
 * @author M Ari Fauzi
 */
public class Jadwal {
    private Film film;
    private String jamTayang;

    public Jadwal(Film film, String jamTayang) {
        this.film = film;
        this.jamTayang = jamTayang;
    }

    public Film getFilm() {
        return film;
    }

    public String getJamTayang() {
        return jamTayang;
    }
}

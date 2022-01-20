package MojNovcanik;

import java.util.ArrayList;

public class Korisnik extends Osoba {
    private String username;
    private String password;
    private String email;
    private int brojRacuna;
    private double stanjeNaRacunu;
    private ArrayList<Proizvodi> placanja;

    public Korisnik(String ime, String prezime, int godinaRodjenja, String username, String password, String email, int brojRacuna, double stanjeNaRacunu, ArrayList<Proizvodi> placanja) {
        super(ime, prezime, godinaRodjenja);
        this.username = username;
        this.password = password;
        this.email = email;
        this.brojRacuna = brojRacuna;
        this.stanjeNaRacunu = stanjeNaRacunu;
        this.placanja = placanja;
    }

    public Korisnik(String ime, String prezime, int godinaRodjenja, String username, String password, String email, int brojRacuna, double stanjeNaRacunu) {
        super(ime, prezime, godinaRodjenja);
        this.username = username;
        this.password = password;
        this.email = email;
        this.brojRacuna = brojRacuna;
        this.stanjeNaRacunu = stanjeNaRacunu;
        this.placanja = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public ArrayList<Proizvodi> getPlacanja() {
        return placanja;
    }

    public void setPlacanja(ArrayList<Proizvodi> placanja) {
        this.placanja = placanja;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ");
        sb.append(username);
        sb.append("\n");

        sb.append("Lozinka: ");
        sb.append(password);
        sb.append("\n");

        sb.append("Email: ");
        sb.append(email);
        sb.append("\n");

        sb.append("Broj racuna: ");
        sb.append(brojRacuna);
        sb.append("\n");

        sb.append("Stanje na racunu: ");
        sb.append(stanjeNaRacunu);
        sb.append("\n");

        return sb.toString();
    }
}

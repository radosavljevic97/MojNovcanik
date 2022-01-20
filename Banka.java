package MojNovcanik;

import java.util.ArrayList;

public class Banka extends BazaKlijenata {
    private String imeBanke;
    private String ulica;
    private Osoba direktor;
    private ArrayList<BazaKlijenata> korisnici;

    public Banka(ArrayList<Korisnik> listaKorisnika, String imeBanke, String ulica, Osoba direktor, ArrayList<BazaKlijenata> korisnici) {
        super(listaKorisnika);
        this.imeBanke = imeBanke;
        this.ulica = ulica;
        this.direktor = direktor;
        this.korisnici = korisnici;
    }

    public String getImeBanke() {
        return imeBanke;
    }

    public void setImeBanke(String imeBanke) {
        this.imeBanke = imeBanke;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Osoba getDirektor() {
        return direktor;
    }

    public void setDirektor(Osoba direktor) {
        this.direktor = direktor;
    }

    public ArrayList<BazaKlijenata> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ArrayList<BazaKlijenata> korisnici) {
        this.korisnici = korisnici;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime banke: ");
        sb.append(imeBanke);
        sb.append("\n");

        sb.append("Adresa: ");
        sb.append(ulica);
        sb.append("\n");

        sb.append("Direktor banke: ");
        sb.append(direktor);
        sb.append("\n");

        sb.append("Broj korisnika: ");
        sb.append(korisnici.size());
        sb.append("\n");

        return sb.toString();
    }
}


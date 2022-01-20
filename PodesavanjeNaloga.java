package MojNovcanik;

import java.util.ArrayList;
import java.util.Objects;

public class PodesavanjeNaloga extends Korisnik {
    public PodesavanjeNaloga(String ime, String prezime, int godinaRodjenja, String username, String password, String email, int brojRacuna, double stanjeNaRacunu, ArrayList<Proizvodi> placanja) {
        super(ime, prezime, godinaRodjenja, username, password, email, brojRacuna, stanjeNaRacunu, placanja);
    }

    public PodesavanjeNaloga(String ime, String prezime, int godinaRodjenja, String username, String password, String email, int brojRacuna, double stanjeNaRacunu) {
        super(ime, prezime, godinaRodjenja, username, password, email, brojRacuna, stanjeNaRacunu);
    }

    public void promenaPina(Korisnik k, String s){
        k.setPassword(s);
    }

    public void stanjeUDevizama(Korisnik k, String v){
        if(Objects.equals(v, "Evro")){
            double stanjeEuro = k.getStanjeNaRacunu() / 117.5;
            System.out.println("Stanje u evrima je: " + stanjeEuro);
        }
        else if(Objects.equals(v, "Dolar")){
            double stanjeDolar = k.getStanjeNaRacunu() / 103.8;
            System.out.println("Stanje u dolarima je: " + stanjeDolar);
        }
        else if(v == "Franak"){
            double stanjeFranak = k.getStanjeNaRacunu() / 113.4;
            System.out.println("Stanje u francima je: " + stanjeFranak);
        }
        else{
            System.out.println("Valuta mora biti u evrima, dolarima ili francima.");
        }
    }

    public double promenaValute(Korisnik k, String v){
        if(v == "Evro"){
            k.setStanjeNaRacunu(k.getStanjeNaRacunu() / 117.5);
            System.out.println("Stanje na racunu u evrima je: ");
            return k.getStanjeNaRacunu();
        }
        else if(v == "Dolar"){
            k.setStanjeNaRacunu(k.getStanjeNaRacunu() / 103.8);
            System.out.println("Stanje na racunu u dolarima je: ");
            return k.getStanjeNaRacunu();
        }
        else if(v == "Franak"){
            k.setStanjeNaRacunu(k.getStanjeNaRacunu() / 113.4);
            System.out.println("Stanje na racunu u francima je:");
            return k.getStanjeNaRacunu();
        }
        else {
            System.out.println("Valuta mora biti u evrima, dolarima ili francima.");
            return k.getStanjeNaRacunu();
        }

    }



}

package MojNovcanik;

import java.util.ArrayList;

public class Transakcije extends Korisnik {


    public Transakcije(String ime, String prezime, int godinaRodjenja, String username, String password, String email, int brojRacuna, double stanjeNaRacunu) {
        super(ime, prezime, godinaRodjenja, username, password, email, brojRacuna, stanjeNaRacunu);
    }

    public void uplata(Korisnik k, double uplata){
        double stanje = k.getStanjeNaRacunu();
        k.setStanjeNaRacunu(stanje + uplata);
    }

    public void isplata(Korisnik k, double isplata){
        double stanje = k.getStanjeNaRacunu();
        if(stanje < isplata){
            System.out.println("Nemate dovoljno sredstava!");
        }
        else{
            k.setStanjeNaRacunu(stanje - isplata);
        }
    }

    public void proveraStanja(Korisnik k){
        System.out.println("Na stanju imate: " + k.getStanjeNaRacunu());
    }

    public double kupovina(Korisnik k, Proizvodi p, ArrayList<Proizvodi> placanja){
        if(p.getCena() > k.getStanjeNaRacunu()){
            System.out.println("Nemate dovoljno sredstava za kupovinu!");
        }
        else{
            k.setStanjeNaRacunu(k.getStanjeNaRacunu() - p.getCena());
            placanja.add(p);
        }
        return k.getStanjeNaRacunu();

    }


}


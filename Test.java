package MojNovcanik;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Korisnik k1 = new Korisnik("Stefan", "Radosavljevic", 1997, "stefan", "sifra1234", "stefanradosavljevic@gmail.com", 1400, 1500);
        Korisnik k2 = new Korisnik("Lazar", "Mijovic", 1999, "Lazarm", "1234567", "lazar@gmail.com", 1000, 5000);
        Korisnik k3 = new Korisnik("Marija", "Maric", 1978, "marijamaric", "sifra44", "marijamaric@gmail.com", 12300, 12400);

        ArrayList<Korisnik> listaKorisnika = new ArrayList<Korisnik>(){
            Korisnik k1 = new Korisnik("Stefan", "Radosavljevic", 1997, "stefan", "sifra1234", "stefanradosavljevic@gmail.com", 1400, 1500);
            Korisnik k2 = new Korisnik("Lazar", "Mijovic", 1999, "Lazarm", "1234567", "lazar@gmail.com", 1000, 5000);
            Korisnik k3 = new Korisnik("Marija", "Maric", 1978, "marijamaric", "sifra44", "marijamaric@gmail.com", 12300, 12400);};

        Proizvodi p1 = new Proizvodi("Sok", 120, 10);
        Proizvodi p2 = new Proizvodi("Kafa", 90, 5);
        Proizvodi p3 = new Proizvodi("Mleko", 100, 2);

        ArrayList<Proizvodi> listaProizvoda = new ArrayList<Proizvodi>(){
            Proizvodi p1; Proizvodi p2; Proizvodi p3;};
        ArrayList<Proizvodi> placanja = new ArrayList<Proizvodi>();

        Korisnik trenutniKorisnik = k1;
        System.out.println("Dobro dosli!");
        System.out.println("Za login unesite broj 1, za sign in unesite broj 2");
        BazaKlijenata bazaKlijenata = new BazaKlijenata(listaKorisnika);


        Scanner s = new Scanner(System.in);
        String a = s.next();
        while (a != "exit") {

            if (Objects.equals(a, "1")) {
                System.out.println("Unesite podatke :");
                String username = s.next();
                String password = s.next();
                //vracanje trazenog klijenta iz baze klijenata
                trenutniKorisnik = bazaKlijenata.daLiPostojiKorisnik(username, password);
            }

            if (Objects.equals(a, "2")) {
                //forma za popunjavanje Klijenta
                System.out.println("Popunite polja za sing in: ");
                String ime = s.next();
                String prezime = s.next();
                int godinaRodjenja = s.nextInt();
                String username = s.next();
                String password = s.next();
                String mail = s.next();
                int brojRacuna = s.nextInt();
                double stanjeNaRacunu = s.nextDouble();
                // Upisivanje korisnika u bazu klijenata;
                trenutniKorisnik = new Korisnik(ime, prezime, godinaRodjenja, username, password, mail, brojRacuna, stanjeNaRacunu);
                bazaKlijenata.dodajKorisnika(trenutniKorisnik);
            }
            else {
                System.out.println("Pokusajte ponovo!");
            }
        }

        Transakcije transakcije = new Transakcije(trenutniKorisnik.getIme(), trenutniKorisnik.getPrezime(), trenutniKorisnik.getGodinaRodjenja(),
                trenutniKorisnik.getUsername(), trenutniKorisnik.getPassword(), trenutniKorisnik.getEmail(),trenutniKorisnik.getBrojRacuna(),
                trenutniKorisnik.getStanjeNaRacunu());
        PodesavanjeNaloga podesavanjeNaloga = new PodesavanjeNaloga(trenutniKorisnik.getIme(), trenutniKorisnik.getPrezime(),
                trenutniKorisnik.getGodinaRodjenja(), trenutniKorisnik.getUsername(), trenutniKorisnik.getPassword(), trenutniKorisnik.getEmail(), trenutniKorisnik.getBrojRacuna(), trenutniKorisnik.getStanjeNaRacunu());


        System.out.println("Odaberite zeljenu opciju: ");
        String opcija = s.next();

        while(!Objects.equals(opcija, "exit")){
            if(Objects.equals(opcija, "1")){
                System.out.println("Upisite iznos koji zelite uplatiti: ");
                int u = s.nextInt();
                transakcije.uplata(trenutniKorisnik, u);
            }
            else if(Objects.equals(opcija, "2")){
                System.out.println("Unesite iznos za isplatu: ");
                int i = s.nextInt();
                transakcije.isplata(trenutniKorisnik, i);
            }
            else if(Objects.equals(opcija, "3")){
                transakcije.proveraStanja(trenutniKorisnik);
            }
            else if(opcija == "4"){
                System.out.println("Unesite valutu: ");
                String valuta = s.next();
                podesavanjeNaloga.stanjeUDevizama(trenutniKorisnik, valuta);
            }
            else if(opcija == "5"){
                transakcije.kupovina(trenutniKorisnik, p1, placanja);
            }
            else if(opcija == "6"){
                String noviPin = s.next();
                podesavanjeNaloga.promenaPina(trenutniKorisnik, noviPin);
            }
        }


    }
}

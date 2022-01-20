package MojNovcanik;

import java.util.ArrayList;

public class BazaKlijenata {
    private ArrayList<Korisnik> listaKorisnika;

    public BazaKlijenata(ArrayList<Korisnik> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }

    public ArrayList<Korisnik> getListaKorisnika() {
        return listaKorisnika;
    }

    public Korisnik daLiPostojiKorisnik(String username, String password){

        for(int i = 0; i < listaKorisnika.size(); i++){
            if(listaKorisnika.get(i).getUsername() == username && listaKorisnika.get(i).getPassword() == password){
                System.out.println("Korisnik je pronadjen");
                return listaKorisnika.get(i);
            }
            else
                System.out.println("Korisnik nije pronadjen u bazi");

        }
        return null;
    }

    public void dodajKorisnika(Korisnik k){
        listaKorisnika.add(k);
    }
    public void dodajKorisnika(Korisnik k, int redniBroj){
        listaKorisnika.add(redniBroj, k);
    }
    public void izbrisiKorisnika(Korisnik k){
        listaKorisnika.remove(k);
    }
    public void izbrisiKorisnika(int i){
        listaKorisnika.remove(i);
    }

    public String ispisiKorisnika(Korisnik k){
        StringBuilder sb = new StringBuilder();
        sb.append("Trazeni korisnik je: ");
        if(listaKorisnika.contains(k)){
            sb.append(k.getIme());
            sb.append(" ");
            sb.append(k.getPrezime());
            sb.append(" ");
            sb.append(k.getBrojRacuna());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String ispisiKorisnike(){
        StringBuilder sb = new StringBuilder();
        sb.append("Klijenti banke su: ");
        for(Korisnik k : listaKorisnika){
            sb.append(k.getIme());
            sb.append(" ");
            sb.append(k.getPrezime());
            sb.append(" ");
            sb.append(k.getBrojRacuna());
        }
        return sb.toString();
    }



}

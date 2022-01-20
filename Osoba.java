package MojNovcanik;

public class Osoba {
    protected String ime;
    protected String prezime;
    protected int godinaRodjenja;

    public Osoba(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        if(this.godinaRodjenja > 2022){
            System.out.println("Losa godina rodjenja!");
        }
        else{
            this.godinaRodjenja = godinaRodjenja;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Godina rodjenja: ");
        sb.append(godinaRodjenja);
        sb.append("\n");

        return sb.toString();
    }

}


package MojNovcanik;

public class Proizvodi {
    private String ime;
    private double cena;
    private int kolicina;

    public Proizvodi(String ime, double cena, int kolicina) {
        this.ime = ime;
        this.cena = cena;
        this.kolicina = kolicina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Cena: ");
        sb.append(cena);
        sb.append("\n");

        sb.append("Kolicina: ");
        sb.append(kolicina);
        sb.append("\n");

        return sb.toString();
    }
}


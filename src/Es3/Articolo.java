package Es3;

public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int numeroPezziDisponibili;

    public Articolo(String codiceArticolo, String descrizione, double prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    @Override
    public String toString() {
        return "Codice: " + codiceArticolo + ", Descrizione: " + descrizione + ", Prezzo: " + prezzo + ", Disponibili: " + numeroPezziDisponibili;
    }
}





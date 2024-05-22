package Es3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;
    private double totaleCosto;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totaleCosto = 0;
    }

    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("A001", "Articolo 1", 10.50, 100);
        Articolo articolo2 = new Articolo("A002", "Articolo 2", 20.75, 50);

        Cliente cliente1 = new Cliente("C001", "Mario", "Rossi", "mario.rossi@example.com", LocalDate.now());
        
        Carrello carrello = new Carrello(cliente1);

        carrello.aggiungiArticolo(articolo1, 2);
        carrello.aggiungiArticolo(articolo2, 1);

        carrello.stampaCarrello();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Articolo> getArticoli() {
        return articoli;
    }

    public double getTotaleCosto() {
        return totaleCosto;
    }

    public void aggiungiArticolo(Articolo articolo, int quantita) {
        if (quantita <= articolo.getNumeroPezziDisponibili()) {
            for (int i = 0; i < quantita; i++) {
                articoli.add(articolo);
            }
            totaleCosto += articolo.getPrezzo() * quantita;
            articolo.setNumeroPezziDisponibili(articolo.getNumeroPezziDisponibili() - quantita);
        } else {
            System.out.println("Quantità richiesta non disponibile in magazzino.");
        }
    }

    public void stampaCarrello() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : articoli) {
            System.out.println(articolo);
        }
        System.out.println("Totale costo: " + totaleCosto + " euro");
    }
}





package Es2;

import java.util.ArrayList;
import java.util.List;

class Chiamata {
    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    @Override
    public String toString() {
        return "Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti";
    }
}

class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> chiamateEffettuate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.chiamateEffettuate = new ArrayList<>();
    }

    public static void main(String[] args) {
        SIM miaSIM = new SIM("1234567890");

        miaSIM.ricarica(10);
        miaSIM.effettuaChiamata("0987654321", 3);
        miaSIM.effettuaChiamata("1122334455", 5);
        miaSIM.effettuaChiamata("6677889900", 2);
        miaSIM.effettuaChiamata("5566778899", 7);
        miaSIM.effettuaChiamata("3344556677", 4);
        miaSIM.effettuaChiamata("2233445566", 6);

        miaSIM.stampaDatiSIM();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void ricarica(double importo) {
        if (importo > 0) {
            this.creditoDisponibile += importo;
        }
    }

    public void effettuaChiamata(String numeroChiamato, int durata) {
        if (chiamateEffettuate.size() == 5) {
            chiamateEffettuate.remove(0);
        }
        chiamateEffettuate.add(new Chiamata(durata, numeroChiamato));
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
        System.out.println("Ultime 5 chiamate effettuate:");
        if (chiamateEffettuate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata chiamata : chiamateEffettuate) {
                System.out.println(chiamata);
            }
        }
    }
}

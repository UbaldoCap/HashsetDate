import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        Appuntamento appuntamento1 = new Appuntamento(OffsetDateTime.parse("2023-03-01T13:00:00Z"), "Marco", "tavolo da 2");
        Appuntamento appuntamento2 = new Appuntamento(OffsetDateTime.parse("2023-04-01T13:00:00Z"), "Mario", "tavolo da 3");
        Appuntamento appuntamento3 = new Appuntamento(OffsetDateTime.parse("2023-03-01T13:00:00Z"), "Vittoria", "tavolo da 2");
        Gestione gestione = new Gestione();
        gestione.aggiungiAppuntamento(appuntamento1);
        gestione.aggiungiAppuntamento(appuntamento2);
        gestione.aggiungiAppuntamento(appuntamento3);
        gestione.stampaAppuntamenti();
        gestione.rimuoviAppuntamento(appuntamento1);
        gestione.stampaAppuntamenti();

    }
}

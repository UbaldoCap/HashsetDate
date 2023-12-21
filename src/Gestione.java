import java.util.ArrayList;
import java.util.HashSet;

public class Gestione {
    private ArrayList<Appuntamento> appuntamenti;

    public Gestione() {
        this.appuntamenti = new ArrayList<>();
    }

    public ArrayList<Appuntamento> getAppuntamenti() {
        return appuntamenti;
    }

    public void aggiungiAppuntamento(Appuntamento appuntamento) {
        var dataLibera = isDataLibera(appuntamento);
        if (dataLibera) {
            appuntamenti.add(appuntamento);
            System.out.println("appuntamento aggiunto");
        } else {
            System.out.println("data non disponibile");
        }
    }
    /**
     * metodo che controlla se non ci sono date sovrapposte
     * @param appuntamento
     * @return true se le date sono differenti
     */
    private boolean isDataLibera(Appuntamento appuntamento) {
        boolean dataLibera = true;
        for (Appuntamento appuntamentoVar : appuntamenti) {
            if (appuntamentoVar.getData().equals(appuntamento.getData())) {
                dataLibera = false;
                break;
            }
        }
        return dataLibera;
    }

    public void rimuoviAppuntamento(Appuntamento appuntamento) {
        var appuntamentoEsistente = isAppuntamentoEsistente(appuntamento);
        if (appuntamentoEsistente) {
            System.out.println("Appuntamento rimosso");
            appuntamenti.remove(appuntamento);
        } else {
            System.out.println("Orario disponibile");
        }

    }

    private boolean isAppuntamentoEsistente(Appuntamento appuntamento) {
        boolean appuntamentoEsistente = false;
        for (Appuntamento appuntamento1 : appuntamenti) {
            if (appuntamento1.getData().equals(appuntamento.getData())) {
                appuntamentoEsistente = true;
                break;
            }
        }
        return appuntamentoEsistente;
    }

    public void stampaAppuntamenti() {
        System.out.println("Appuntamenti:");
        for (Appuntamento appuntamento : appuntamenti) {
            appuntamento.stampaAppuntamento();
        }
    }
}

import java.time.OffsetDateTime;
import java.util.Objects;

public class Appuntamento {
    private OffsetDateTime data;
    private String nome;
    private String note;

    public Appuntamento(OffsetDateTime data, String nome, String note) {
        this.data = data;
        this.nome = nome;
        this.note = note;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void stampaAppuntamento() {
        System.out.println("Appuntamento per il" + data + ", " + nome + " | note:" + note);
    }

    @Override
    public String toString() {
        return "Appuntamento{" +
                "data=" + data +
                ", nome='" + nome + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appuntamento that = (Appuntamento) o;
        return Objects.equals(data, that.data) && Objects.equals(nome, that.nome) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, nome, note);
    }
}

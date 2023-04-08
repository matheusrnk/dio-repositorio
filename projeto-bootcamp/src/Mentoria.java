import java.time.LocalDate;

public class Mentoria extends Estudo {

    private LocalDate dataMentoria;

    public Mentoria(){
        super();
    }

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super(titulo, descricao);
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dataMentoria == null) ? 0 : dataMentoria.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mentoria other = (Mentoria) obj;
        if (dataMentoria == null) {
            if (other.dataMentoria != null)
                return false;
        } else if (!dataMentoria.equals(other.dataMentoria))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Mentoria [" + super.toString() + ", dataMentoria=" + dataMentoria + "]";
    }
    
}

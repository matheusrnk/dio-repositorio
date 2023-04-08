public class Curso extends Estudo {

    private int cargaHoraria; // em horas

    public Curso() {
        super();
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + cargaHoraria;
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
        Curso other = (Curso) obj;
        if (cargaHoraria != other.cargaHoraria)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Curso [" + super.toString() + ", cargaHoraria=" + cargaHoraria + "h]";
    }
    
}

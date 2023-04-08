import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<Desenvolvedor> devs;
    private List<Estudo> estudos;

    public Bootcamp(){
        this.devs = new LinkedList<>();
        this.estudos  = new LinkedList<>();
    }

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.devs = new LinkedList<>();
        this.estudos  = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public List<Desenvolvedor> getDevs() {
        return devs;
    }

    public void setDevs(Desenvolvedor dev) {
        this.devs.add(dev);
    }

    public List<Estudo> getEstudos() {
        return estudos;
    }

    public void setEstudos(Estudo estudo) {
        this.estudos.add(estudo);
    }

    public List<Mentoria> getMentorias() {

        return this.estudos.stream()
                .filter(estudo -> estudo instanceof Mentoria)
                .map(estudo -> (Mentoria) estudo)
                .collect(Collectors.toList());
    }

    public List<Curso> exibirCursos() {

        return this.estudos.stream()
                .filter(estudo -> estudo instanceof Curso)
                .map(estudo -> (Curso) estudo)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Bootcamp [nome=" + nome + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", dataFinal="
                + dataFinal + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        return true;
    }
    

}

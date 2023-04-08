import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desenvolvedor {

    private String nome;
    private List<Estudo> estudosInscritos;
    private List<Estudo> estudosConcluidos;

    public Desenvolvedor() {
        this.estudosInscritos = new LinkedList<>();
        this.estudosConcluidos = new LinkedList<>();
    }

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.estudosInscritos = new LinkedList<>();
        this.estudosConcluidos = new LinkedList<>();
    }

    public void progredir(){
        Optional<Estudo> estudo = this.estudosInscritos.stream().findFirst();
        if(estudo.isPresent()) {
            this.estudosConcluidos.add(estudo.get());
            this.estudosInscritos.remove(estudo.get());
        } else {
            System.err.println("Você não está matriculado em algum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.estudosInscritos.stream()
                .map(x -> x.calcularXp())
                .reduce(0d, (a, b) -> a + b);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.estudosInscritos.addAll(bootcamp.getEstudos());
        bootcamp.setDevs(this);
    }

    public List<Estudo> getEstudosInscritos(){
        return this.estudosInscritos;
    }

    public List<Estudo> getEstudosConcluidos(){
        return this.estudosConcluidos;
    }

    public List<Mentoria> getMentorias() {

        return this.estudosInscritos.stream()
                .filter(estudo -> estudo instanceof Mentoria)
                .map(estudo -> (Mentoria) estudo)
                .collect(Collectors.toList());
    }

    public List<Curso> getCursos() {

        return this.estudosInscritos.stream()
                .filter(estudo -> estudo instanceof Curso)
                .map(estudo -> (Curso) estudo)
                .collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Desenvolvedor other = (Desenvolvedor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + nome + "]";
    }

}

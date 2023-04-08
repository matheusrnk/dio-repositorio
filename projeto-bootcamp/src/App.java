import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Estudo e1 = new Curso("Introdução ao Java", "Curso de apresentação ao básico da linguagem Java!", 30);
        Estudo e2 = new Curso("Introdução ao Git", "Curso de apresentação ao básico do sistema de versionamento Git!", 10);
        Estudo e3 = new Curso("Introdução ao Linux", "Curso de apresentação ao básico do sistema operacional Linux!", 20);
        Estudo e4 = new Mentoria("Apresentação do Bootcamp Java!", "Mentoria de apresentação do Bootcamp com João Zézinho!", LocalDate.now());

        Bootcamp b = new Bootcamp("Zero-to-Hero Java", "Bootcamp que te leverá do básico ao avançado em Java!", LocalDate.now(), LocalDate.of(2023, 6, 28));
        b.setEstudos(e1);
        b.setEstudos(e2);
        b.setEstudos(e3);
        b.setEstudos(e4);

        Desenvolvedor dev = new Desenvolvedor("Matheus");
        dev.setBootcamp(b);

        System.out.println("Cursos Inscritos Matheus:" + dev.getCursos());
        System.out.println("Mentorias Inscritas Matheus:" + dev.getMentorias());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Estudos Inscritos Matheus:" + dev.getEstudosInscritos());
        System.out.println("Estudos Concluídos Matheus:" + dev.getEstudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());
    }
}

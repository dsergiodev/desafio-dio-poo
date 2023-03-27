import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso básico de Java");
        curso1.setDescricao("Introdução à linguagem de programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso prático de JavaScript");
        curso2.setDescricao("Curso prático de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para auxiliar os alunos no aprendizado de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Imersão na linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        //devCamila.setNome();
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos atuais em que Camila está inscrita: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos em que Camila está inscrita: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos em que João está inscrito: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos em que João está inscrito: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos por João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main{
    static void main(String[] args) {
        Curso informatica = new Curso();
        Curso atendente = new Curso();
        Mentoria mentoria = new Mentoria();

        informatica.setTitulo("Curso Informatica");
        informatica.setDescricao("Informatica básica, Windows, Word e Excel");
        informatica.setCargaHoraria(190);

        atendente.setTitulo("Curso de Atendente de Farmacia");
        atendente.setDescricao("Atendimento ao cliente e Operação de Caixa");
        atendente.setCargaHoraria(180);

        mentoria.setTitulo("Mentoria de Informatica");
        mentoria.setDescricao("Ajuda em apps");
        mentoria.setData(LocalDate.now());



        /*System.out.println(informatica);
        System.out.println(atendente);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Backend com Java.");
        bootcamp.setDescricao("Descrição: OOP e Java!");
        bootcamp.getConteudos().add(informatica);
        bootcamp.getConteudos().add(atendente);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("------------------");
        Dev devLeakim = new Dev();
        devLeakim.setName("Leakim");
        devLeakim.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos por " + devLeakim.getName() + ": " + devLeakim.getConteudosInscritos());
        devLeakim.progredir();
        devLeakim.progredir();
        devLeakim.progredir();
        System.out.println("-----Após progredir-----");
        System.out.println("Conteúdos inscritos por " + devLeakim.getName() + ": " + devLeakim.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por " + devLeakim.getName() + ": " + devLeakim.getConteudosConcluidos());
        System.out.println("Toal de XP: " + devLeakim.calcularTotalXp());

        System.out.println("");
        System.out.println("------------------");
        System.out.println("");


        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos por " + devJoao.getName() + ": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-----Após progredir-----");
        System.out.println("Conteúdos inscritos por " + devJoao.getName() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por " + devJoao.getName() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("Toal de XP: " + devJoao.calcularTotalXp());


    }
}
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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



        System.out.println(informatica);
        System.out.println(atendente);
        System.out.println(mentoria);
    }
}
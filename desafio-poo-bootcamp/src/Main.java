

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHorario(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: "+dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Progredindo....");
        System.out.println("Conteúdos inscritos Camila: "+dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila: "+dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularTotalXp());

        System.out.println("-----------------------------------------");
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos João: "+dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Progredindo....");
        System.out.println("Conteúdos inscritos João: "+dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João: "+dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());




    }
}
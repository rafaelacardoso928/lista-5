
package main;

   public class Main {
    public static void main(String[] args) {
        // Criando o primeiro participante com o construtor que recebe apenas nomeCompleto
        Participante participante1 = new Participante("João Silva");
        participante1.setEmail("joao.silva@email.com"); // Definindo o email do participante1

        // Criando o segundo participante com o construtor completo
        Participante participante2 = new Participante("Maria Oliveira", "maria.oliveira@email.com", "15/02/2025");

        // Exibindo as informações dos participantes
        System.out.println("Participante 1:");
        System.out.println(participante1);
        System.out.println();

        System.out.println("Participante 2:");
        System.out.println(participante2);
    }
}

       
     
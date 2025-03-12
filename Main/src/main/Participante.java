
package main;

   import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Participante {
    private String nomeCompleto;
    private String email;
    private String dataInscricao;

    
    public Participante(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.dataInscricao = "12/03/2025"; 
    }

    // Construtor completo
    public Participante(String nomeCompleto, String email, String dataInscricao) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataInscricao = dataInscricao;
    }

    // Métodos getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email inválido. O email deve conter '@'.");
        }
    }

    private boolean isValidEmail(String email) {
   
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Nome Completo: " + nomeCompleto + "\n" +
               "Email: " + email + "\n" +
               "Data de Inscrição: " + dataInscricao;
    }
} 


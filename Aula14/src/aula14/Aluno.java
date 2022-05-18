package aula14;
public class Aluno extends Pessoa {
    private String login;
    private int totAssistido;

    public Aluno(String nome, int idade, String sexo, String login ) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "login=" + login 
                + ", totAssistido=" + totAssistido + '}';
    }
    
    
}

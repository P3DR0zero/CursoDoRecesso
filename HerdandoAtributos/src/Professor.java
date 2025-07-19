public class Professor extends Pessoa{
    public String disciplina;
    public Professor(String nome, String cpf, int idade,String disciplina) {
        super(nome, cpf, idade);
        this.disciplina=disciplina;
    }
    
}

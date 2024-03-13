//classe
public class Aluno {
    private String nome;
    private String cpf;
    private int ra;
    private String data_nascimento;
    private String sexo;

   //construtor não tem tipagem, possibilita a inserção de todos atributos
public Aluno (String nome, String cpf, int ra, String data_nascimento, String sexo){
    this.nome = nome;
    this.cpf = cpf;
    this.ra = ra;
    this.data_nascimento = data_nascimento;
    this.sexo = sexo;
    
}    
public Aluno (){

}
//metodos void (não tem retorno) utiliza set
    public void setNome (String entrada){ 
        this.nome = entrada;
    }
    public void setRA(int entrada){
        this.ra = entrada;
    }
    public String getNome (){
        return this.nome;
    }
    public int getRa (){
        return this.ra;
    }

}

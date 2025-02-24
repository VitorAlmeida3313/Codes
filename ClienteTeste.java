public class Cliente{
    private String cpf;
    private String nome;
    private int idade;
    private String cpf2;
    private String nome2;
    private int idade2;

    /////////////////////////////////////////////////////

    public void setCPF1(String cpf){
        this.cpf = cpf;
    }

    public String getCPF1(){
        return cpf;
    }

    public void setNOME1(String nome){
        this.nome = nome;
    }

    public String getNOME1(){
        return nome;
    }

    public void setIDADE1(int idade){
        this.idade = idade;
    }

    public int getIDADE1(){
        return idade;
    }

    public String imprimir1(){
        return "CPF: " + cpf + "\nNome: " + nome + "\nIdade: " + idade;
    }

    /////////////////////////////////////////////////////

    public void setCPF2(String cpf){
        this.cpf2 = cpf;
    }

    public String getCPF2(){
        return cpf2;
    }

    public void setNOME2(String nome){
        this.nome2 = nome;
    }

    public String getNOME2(){
        return nome;
    }

    public void setIDADE2(int idade){
        this.idade2 = idade;
    }

    public int getIDADE2(){
        return idade;
    }

    public String imprimir2(){
        return "CPF: " + cpf2 + "\nNome: " + nome2 + "\nIdade: " + idade2;
    }
    /////////////////////////////////////////////////////
}
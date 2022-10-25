public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String estadoCivil;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String retornaStatus(String nome, String cpf, Integer idade){
        String x = "O cliente de nome " + getNome() + ", CPF " + getCpf() + " e idade " +
                getIdade() + " está regularmente cadastrado!";
        if ((nome == null) || (cpf == null) || (idade == null)) {
            return "Não foi possível realizar sua consulta";
        }else {
            return x;
        }
    }
}

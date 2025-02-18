public class Dados {
    private String nome;
    private String cep;
    private int idade;

    public Dados() {

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void validarCep(){
        try {
            if (cep.length() != 8)
                throw new CepInvalidException("Cep invalido, digite os 8 digitos corretamente");
            System.out.println(toString());
        } catch (CepInvalidException e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Informações: " + nome + " " +
                idade + " anos " +
                " cep " + cep ;
    }
}


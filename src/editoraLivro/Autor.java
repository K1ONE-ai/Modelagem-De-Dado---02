package editoraLivro;

public class Autor {

    private String Nome;
    private String Sobrenome;
    private int idade;
    private String Genero_literario;
    private String Sexo;
    private String Pais;
    private String Cidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero_literario() {
        return Genero_literario;
    }

    public void setGenero_literario(String genero_literario) {
        Genero_literario = genero_literario;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String toString() {
        return "Autor{" +
                "Nome='" + Nome + '\'' +
                ", Sobrenome='" + Sobrenome + '\'' +
                ", idade=" + idade +
                ", Genero_Escrita='" + Genero_literario + '\'' +
                ", Sexo='" + Sexo + '\'' +
                ", Pais='" + Pais + '\'' +
                ", Cidade='" + Cidade + '\'' +
                '}';
    }

    public Autor(String nome, String sobrenome, int idade, String genero_Escrita, String sexo, String pais, String cidade) {
        Nome = nome;
        Sobrenome = sobrenome;
        this.idade = idade;
        Genero_literario = genero_Escrita;
        Sexo = sexo;
        Pais = pais;
        Cidade = cidade;

    }


}

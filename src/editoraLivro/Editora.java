package editoraLivro;

public class Editora {

    private String nomeEd;
    private int ano;
    private String Cnpj;
    private String endereco;
    private String pais;
    private String estado;

    public String getNomeEd() {
        return nomeEd;
    }

    public void setNomeEd(String nomeEd) {
        this.nomeEd = nomeEd;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String toString() {
        return "Editora{" +
                "nomeEd='" + nomeEd + '\'' +
                ", ano=" + ano +
                ", Cnpj='" + Cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public Editora(String nomeEd, int ano, String cnpj, String endereco, String pais, String estado) {
        this.nomeEd = nomeEd;
        this.ano = ano;
        Cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;


    }


}

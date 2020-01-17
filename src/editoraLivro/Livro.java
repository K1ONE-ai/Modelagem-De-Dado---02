package editoraLivro;

public class Livro {

    private String Titulo;
    private int TotalPag = 20;
    private boolean livroaberto;
    private String genero;
    private Autor nome;
    private Editora editora;
    private int PaginaAtual;
    private int AnoPublicacao;


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getTotalPag() {
        return TotalPag;
    }

    public void setTotalPag(int totalPag) {
        TotalPag = totalPag;
    }

    public boolean isLivroaberto() {
        return livroaberto;
    }

    public void setLivroaberto(boolean livroaberto) {
        this.livroaberto = livroaberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getNome() {
        return nome;
    }

    public void setNome(Autor nome) {
        this.nome = nome;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return PaginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        PaginaAtual = paginaAtual;
    }

    public int getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        AnoPublicacao = anoPublicacao;
    }

    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", Total_pag='" + TotalPag + '\'' +
                ", livroaberto='" + livroaberto + '\'' +
                ", genero='" + genero + '\'' +
                ", nome=" + nome +
                ", editora=" + editora +
                ", Pagina_atual='" + PaginaAtual + '\'' +
                ", Ano_publicacao=" + AnoPublicacao +
                '}';
    }

    public Livro(String titulo, int totalPag, String genero, Autor nome, Editora editora, int anoPublicacao) {
        Titulo = titulo;
        TotalPag = totalPag;
        this.livroaberto = livroaberto;
        this.genero = genero;
        this.nome = nome;
        this.editora = editora;
        PaginaAtual = 0;
        AnoPublicacao = anoPublicacao;
    }

    public boolean Folhar() {
        int folheando = 0;
        while (folheando <= TotalPag) {
            System.out.println(folheando);
            folheando++;
        }
        if (folheando == 0){
            System.out.println("Livro Fechado");
            return false;
        }
        System.out.println("Livro aberto");
        return true;
        }

    }


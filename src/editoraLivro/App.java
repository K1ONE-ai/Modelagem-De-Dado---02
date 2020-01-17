package editoraLivro;


public class App {
    public static void main(String[] args) {

        Autor autor1 = new Autor(
                "Kauan",
                "Victor",
                24,
                "Drama",
                "Masculino",
                "Japão",
                "Tokyo");


        Editora editor1 = new Editora(
                "Dia e Noite",
                2040,
                "123.123.123.45-87",
                "R. Dos Caras",
                "Chamito",
                "Chatuti");

        Livro livro1 = new Livro(
                "Samurai #",
                20,
                "Drama",
                autor1,
                editor1,
                2050);


        System.out.println(autor1.toString());
        System.out.println(livro1.toString());
        System.out.println(editor1.toString());




    }

}

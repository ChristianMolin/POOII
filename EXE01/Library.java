package exe01;

public class Library {
    
    private String name;
    private Book livros[] = new Book[100];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public Book[] getLivros() {
        return livros;
    }

    public void setLivros(Book[] livros) {
        this.livros = livros;
    }
}

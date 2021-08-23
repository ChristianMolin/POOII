package exe01;

public class Book {
    
    private String ISBN;
    private Author autor;
    private Library biblioteca;
    private Chapter capitulos[] = new Chapter[10];

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public Library getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Library biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Chapter[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Chapter[] capitulos) {
        this.capitulos = capitulos;
    }
    
}

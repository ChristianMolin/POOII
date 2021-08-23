package exe01;

public class EXE01 {

    public static void main(String[] args) {

        Library l1 = new Library();
        Author a1 = new Author();
        Chapter c1 = new Chapter();
        Book b1 = new Book();
        
        l1.setName("Escolar");
        a1.setName("Jose");
        b1.setISBN("111111");
        b1.setBiblioteca(l1);
        b1.setAutor(a1);
        c1.setNumber(2);

        System.out.println("Livro de ISBN " + b1.getISBN() + " da biblioteca "
                + b1.getBiblioteca().getName() + " do autor " + b1.getAutor().getName());
    }
    
}


package biblioteca;

/**
 *
 * @author vitor
 */
public class Livro {
    private String NomeLivro;
    private String ISBN;
    private String NomeAutor;
    private int estoque;

    public Livro() {
    }

    public Livro(String NomeLivro, String ISBN, String NomeAutor) {
        this.NomeLivro = NomeLivro;
        this.ISBN = ISBN;
        this.NomeAutor = NomeAutor;
       
    }

    public String getNomeLivro() {
        return NomeLivro;
    }

    public void setNomeLivro(String NomeLivro) {
        this.NomeLivro = NomeLivro;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNomeAutor() {
        return NomeAutor;
    }

    public void setNomeAutor(String NomeAutor) {
        this.NomeAutor = NomeAutor;
    }

    

   
    
    
}

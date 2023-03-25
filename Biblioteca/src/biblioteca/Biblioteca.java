
package biblioteca;

import java.util.Date;

/**
 *
 * @author vitor
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("nome1", 1, "nome1@gmail.com");
        Livro L1 = new Livro("Magnus Chase e o navio dos mortos", "9788551002476", "Rick Riordan");
        
        Emprestimo emprestimo1 = new Emprestimo(L1, pessoa1, new Date());
         emprestimo1.setDataDevolucao(new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 7)));
         
        System.out.println("Emprestimo:");
        System.out.println("Pessoa: " + emprestimo1.getIdPessoa().getNomeP());
        System.out.println("Livro: " + emprestimo1.getISBN().getNomeLivro());
        System.out.println("Data do empréstimo: " + emprestimo1.getDataEmprestimo());
        System.out.println("Data de devolução: " + emprestimo1.getDataDevolucao());
        
    }
    
}

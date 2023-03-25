
package biblioteca;

import java.util.Date;

/**
 *
 * @author vitor
 */
public class Emprestimo {
    private Livro ISBN;
    private Pessoa IdPessoa;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(Livro ISBN, Pessoa IdPessoa, Date dataEmprestimo) {
        this.ISBN = ISBN;
        this.IdPessoa = IdPessoa;
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getISBN() {
        return ISBN;
    }

    public Pessoa getIdPessoa() {
        return IdPessoa;
    }

   
    
    
    
    
}

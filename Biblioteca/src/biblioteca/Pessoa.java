
package biblioteca;

/**
 *
 * @author vitor
 */
public class Pessoa {
    private String nomeP;
    private int idPessoa;
    private String Email;

    public Pessoa() {
    }

    public Pessoa(String nomeP, int idPessoa, String Email) {
        this.nomeP = nomeP;
        this.idPessoa = idPessoa;
        this.Email = Email;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}

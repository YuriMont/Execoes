
package model.exeption;

// Para criar exceções é necessario colocar extends Exception ou RuntimeException
public class DominoDeExcecoes extends RuntimeException{
    //É necessario colocar private static final long serialVersionUID = 1L;
    private static final long serialVersionUID = 1L;

    public DominoDeExcecoes(String mensagem) {
        super(mensagem);
    }
    
}

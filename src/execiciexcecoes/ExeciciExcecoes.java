
package execiciexcecoes;

import entites.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.exeption.DominoDeExcecoes;

public class ExeciciExcecoes {

    public static void main(String[] args) {
        try{
            Scanner t = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Numero do Quarto: ");
            int num = t.nextInt();
            System.out.print("Data de Entrada (dd/MM/yyyy): ");
            Date dataEntrada = sdf.parse(t.next());
            System.out.print("Data de Saida (dd/MM/yyyy): ");
            Date dataSaida = sdf.parse(t.next());

                Reserva rese = new Reserva(num, dataEntrada, dataSaida);
                System.out.println(rese.toString());
                System.out.println("");
                System.out.println("Insira os dados para atualizar a reserva: ");
                System.out.print("Data de Entrada (dd/MM/yyyy): ");
                dataEntrada = sdf.parse(t.next());
                System.out.print("Data de Saida (dd/MM/yyyy): ");
                dataSaida = sdf.parse(t.next());

                rese.atalizarData(dataEntrada, dataSaida);
                System.out.println(rese.toString());
        } 
        catch (ParseException e){
            System.out.println("Formato de data Invalida");
        }
        catch (DominoDeExcecoes e){
            System.out.println("Erro na reserva " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Erro! ");
        }
       
    }
    
}

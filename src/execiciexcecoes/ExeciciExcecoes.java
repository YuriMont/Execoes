
package execiciexcecoes;

import entites.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExeciciExcecoes {

    public static void main(String[] args) throws ParseException {
        Scanner t = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Numero do Quarto: ");
        int num = t.nextInt();
        System.out.print("Data de Entrada (dd/MM/yyyy): ");
        Date dataEntrada = sdf.parse(t.next());
        System.out.print("Data de Saida (dd/MM/yyyy): ");
        Date dataSaida = sdf.parse(t.next());
        
        if(!dataSaida.after(dataEntrada)){
            System.out.println("Erro na reserva: a data de saida deve ser posterior à data de entrada");
            
        }
        else{
            Reserva rese = new Reserva(num, dataEntrada, dataSaida);
            System.out.println(rese.toString());
            System.out.println("");
            System.out.println("Insira os dados para atualizar a reserva: ");
            System.out.print("Data de Entrada (dd/MM/yyyy): ");
            dataEntrada = sdf.parse(t.next());
            System.out.print("Data de Saida (dd/MM/yyyy): ");
            dataSaida = sdf.parse(t.next());
          
               String error = rese.atalizarData(dataEntrada, dataSaida);
               if (error != null){
                   System.out.println("Erro na reseva: "+ error);
               }
               else{
                System.out.println(rese.toString());
               }
            
            
            
        }
        
        t.close();
    }
    
}

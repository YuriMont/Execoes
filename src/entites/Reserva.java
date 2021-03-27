
package entites;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reserva {
    private Integer quartoNumero;
    private Date dataEntrada;
    private Date dataSaida;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reserva() {
    }

    public Reserva(Integer quartoNumero, Date dataEntrada, Date dataSaida) {
        this.quartoNumero = quartoNumero;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getQuartoNumero() {
        return quartoNumero;
    }

    public void setQuartoNumero(Integer quartoNumero) {
        this.quartoNumero = quartoNumero;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }
    
    public long duracao(){
        long dife = dataSaida.getTime()-dataEntrada.getTime();
        return TimeUnit.DAYS.convert(dife, TimeUnit.MILLISECONDS);
    }
    public String atalizarData(Date dataEntrata, Date dataSaida){
        Date now = new Date();
         if(dataEntrada.before(now)||dataSaida.before(now)){
                return " as datas de reserva para atualização devem ser datas futuras";
                
            }
         if(!dataSaida.after(dataEntrada)){
            return "Erro na reserva: a data de saida deve ser posterior à data de entrada";
            
        }
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida ;
        return null;
    }

    @Override
    public String toString() {
        return "Reserva: Quarto "+quartoNumero+" Entrada: "+sdf.format(dataEntrada)
        +" ,Saida: "+sdf.format(dataSaida)+", "+duracao()+" noites";
    }
    
    
    
            
}

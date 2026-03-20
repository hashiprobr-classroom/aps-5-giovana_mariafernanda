public class DataHorario extends Momento{
    private Integer hora;
    private Integer minuto;
    private Data data;

    public DataHorario(Integer hora, Integer minuto, Data data){
        this.hora = 0;
        this.minuto = 0;
        this.data = data;
    }

    public Integer getHora(){
        return hora;
    }
    public Integer getMinuto(){
        return minuto;
    }
    public Data getData(){
        return data;
    }

}

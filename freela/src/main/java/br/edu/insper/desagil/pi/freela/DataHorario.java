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

    public void atualiza(int hora, int minuto){
        this.hora = ajusta(hora,0,23);
        this.minuto = ajusta(minuto,0,59);
    }

    @Override
    public Integer minutos(){
        Integer minutos_qnt = super.minutos();

        minutos_qnt = minutos_qnt + (this.hora *60);
        minutos_qnt = minutos_qnt + this.minuto;

        return minutos_qnt;
    }
}

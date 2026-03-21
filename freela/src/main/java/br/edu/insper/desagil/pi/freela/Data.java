import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private Integer ano;
    private Integer mes;
    private Integer dia;
    private Map<Integer, Integer> limite;

    public Data(Integer ano, Integer mes, Integer dia){
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;

        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public Integer getAno() {
        return ano;
    }
    public Integer getMes(){
        return mes;
    }
    public Integer getDia(){
        return dia;
    }

    public void atualiza(Integer novoAno, Integer novoMes, Integer novoDia){
        this.ano = ajusta(novoAno, 1970,2070);
        this.mes = ajusta(novoMes,1,12);

        if(this.mes.equals(2)){
            this.dia=ajusta(novoDia,1,28);
        }
        else if(this.mes.equals(1) || this.mes.equals(3) || this.mes.equals(5) ||
                this.mes.equals(7) || this.mes.equals(8) || this.mes.equals(10) || this.mes.equals(12)){
            this.dia=ajusta(novoDia,1,31);
        }
        else{
            this.dia=ajusta(novoDia,1,31);
        }
    }

    @Override
    public Integer minutos(){
        Integer minutos_qnt = 0;
        Integer dif_ano = this.ano - 1970;

        minutos_qnt = minutos_qnt + (dif_ano * 365 * 24 * 60);

        Integer mes = this.mes;
        while(mes > 1){
            mes = mes -1;
            Integer qnt_dias = limite.get(mes);
            minutos_qnt = minutos_qnt+ (qnt_dias * 24 * 60);
        }
        minutos_qnt = minutos_qnt + ((this.dia-1)*24*60);
        return minutos_qnt;
    }
}

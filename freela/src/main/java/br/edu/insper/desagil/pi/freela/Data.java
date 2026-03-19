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

        if(this.mes==2){
            this.dia=ajusta(novoDia,1,28);
        }
        else if(this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12){
            this.dia=ajusta(novoDia,1,31);
        }
        else{
            this.dia=ajusta(novoDia,1,31);
        }
    }
}

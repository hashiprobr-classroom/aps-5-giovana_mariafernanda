public abstract class Momento {

    public Integer ajusta(int valor, int minimo, int maximo){
        if(valor < minimo){
            return minimo;
        }else if(valor > maximo){
            return maximo;
        }else{
            return valor;
        }
    }

    public abstract Integer minutos();
}

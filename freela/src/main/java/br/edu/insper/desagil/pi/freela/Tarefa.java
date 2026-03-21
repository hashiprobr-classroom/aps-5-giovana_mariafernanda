public class Tarefa {
    private Integer id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(Integer id){
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public Integer getId(){
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public Momento getInicio(){
        return inicio;
    }
    public Momento getFim(){
        return fim;
    }

    private void atualiza(Momento inicio, Momento fim){
        if(inicio.minutos() >= fim.minutos()){
            throw new IllegalArgumentException("Erro: início deve ser antes do fim");
        }

        this.inicio = inicio;
        this.fim = fim;
    }
}

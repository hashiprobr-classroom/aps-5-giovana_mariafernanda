public class Tarefa {
    private Integer id;
    private String descricao;
    private Integer inicio;
    private Integer fim;

    public Tarefa(Integer id, String descricao, Integer inicio, Integer fim){
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    private void atualiza(Integer inicio, Integer fim){
        if(inicio > fim){
            throw new IllegalArgumentException("Erro: início deve ser antes do fim");
        }

        this.inicio = inicio;
        this.fim = fim;
    }
}

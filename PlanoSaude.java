import java.math.BigDecimal;

public class PlanoSaude {
    private String descricao;
    private String nomeOperadora;
    private Double percentualDesconto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public Double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public PlanoSaude(String descricao, String nomeOperadora){
        this.descricao = descricao;
        this.nomeOperadora = nomeOperadora;
        this.percentualDesconto = 0.0;
    }

    @Override
    public String toString() {
        return "PlanoSaude{" +
                "descricao='" + descricao + '\'' +
                ", nomeOperadora='" + nomeOperadora + '\'' +
                ", percentualDesconto=" + percentualDesconto +
                '}';
    }
}

import java.math.BigDecimal;
import java.util.List;

public class Medicamento {

    private String descricao;

    private Double valor;



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Medicamento(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}

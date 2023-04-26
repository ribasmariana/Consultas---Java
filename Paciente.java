import java.util.List;

public class Paciente extends Pessoa{
    private String codigoPaciente;
    private String dataCadastro;
    private Boolean temPlanoSaude;
    private PlanoSaude planoSaude;
    private Hospital hospital;
    private List<HistoricoMedico> historicos;

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean getTemPlanoSaude() {
        return temPlanoSaude;
    }

    public void setTemPlanoSaude(Boolean temPlanoSaude) {
        this.temPlanoSaude = temPlanoSaude;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public List<HistoricoMedico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<HistoricoMedico> historicos) {
        this.historicos = historicos;
    }

    public Paciente(Integer id, String nome, String cpf, String rg, String telefone, String email, String codigoPaciente,
                    String dataCadastro, Boolean temPlanoSaude, PlanoSaude planoSaude, Hospital hospital,
                    List historicos) {
        super(id, nome, cpf, rg, telefone, email);
        this.codigoPaciente = codigoPaciente;
        this.dataCadastro = dataCadastro;
        this.temPlanoSaude = temPlanoSaude;
        this.planoSaude = planoSaude;
        this.hospital = hospital;
        this.historicos = historicos;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codigoPaciente='" + codigoPaciente + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", temPlanoSaude=" + temPlanoSaude +
                ", planoSaude=" + planoSaude +
                ", hospital=" + hospital +
                ", historicos=" + historicos +
                '}';
    }
}

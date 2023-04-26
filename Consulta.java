import java.time.LocalDate;
import java.util.List;
public class Consulta {
    private LocalDate data;
    private Paciente paciente;
    private Medico medico;
    private Enfermeira enfermeira;
    private List <Procedimento> procedimentos;
    private List <Medicamento> medicamento;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Enfermeira getEnfermeira() {
        return enfermeira;
    }
    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }
    public List getProcedimentos() {
        return procedimentos;
    }
    public void setProcedimentos(List procedimentos) {
        this.procedimentos = procedimentos;
    }
    public List getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(List medicamento) {
        this.medicamento = medicamento;
    }
    public Consulta(LocalDate data, Paciente paciente, Medico medico, Enfermeira enfermeira, List procedimentos, List medicamento) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeira = enfermeira;
        this.procedimentos = procedimentos;
        this.medicamento = medicamento;
    }
    public Double getValorTotalMedicamentos() {
        Double valorTotalMedicamento = 0.00;
        for (Medicamento valor : medicamento) {
            valorTotalMedicamento += valor.getValor();
        }
        return valorTotalMedicamento;
    }

    public Double getValorTotalProcedimentos() {
        Double valorTotalProcedimento = 0.00;
        for (Procedimento valor : procedimentos) {
            valorTotalProcedimento += valor.getValor();
        }

        valorTotalProcedimento += (valorTotalProcedimento*(medico.getAcrescimoProcedimento()/100));
        valorTotalProcedimento += (valorTotalProcedimento*(enfermeira.getAcrescimoProcedimento()/100));


        return valorTotalProcedimento;
    }

    public Double getValorTotalConsulta (){
        Double valorTotal = 0.00;
        if (paciente.getTemPlanoSaude()){
            valorTotal = (this.getValorTotalProcedimentos()+this.getValorTotalMedicamentos());
            valorTotal = valorTotal -(valorTotal*(paciente.getPlanoSaude().getPercentualDesconto()/100));
            return valorTotal;

        }else {
            valorTotal = this.getValorTotalProcedimentos()+this.getValorTotalMedicamentos();
            return valorTotal;
        }
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", enfermeira=" + enfermeira +
                ", procedimentos=" + procedimentos +
                ", medicamento=" + medicamento +
                '}';
    }
}

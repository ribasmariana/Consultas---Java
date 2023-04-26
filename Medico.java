public class Medico extends FuncionarioHospital{

    private String especialidades;
    private String CRM;
    private String formacao;
    private String instituicao;
    private Double acreMedico;
    private Double acreMedEnferm;

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public Double getAcrescimoProcedimento() {
        return 15.00;
    }

    public Medico(Integer id, String nome, String cpf, String rg, String telefone, String email, String cracha, String horario, Hospital hospital,
                  String especialidades, String CRM, String formacao, String instituicao) {
        this.especialidades = especialidades;
        this.CRM = CRM;
        this.formacao = formacao;
        this.instituicao = instituicao;
    }
}


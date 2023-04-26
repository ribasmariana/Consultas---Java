public class Enfermeira extends FuncionarioHospital {

    private String especialidade;

    private String coren;

    private String formacao;
    private String instituicao;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
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

    public Enfermeira(String especialidade, String coren, String formacao, String instituicao) {
        this.especialidade = especialidade;
        this.coren = coren;
        this.formacao = formacao;
        this.instituicao = instituicao;
    }

    public Double getAcrescimoProcedimento() {
        return  5.00;
    }

    @Override
    public String toString() {
        return "Enfermeira{" +
                "especialidade='" + especialidade + '\'' +
                ", coren='" + coren + '\'' +
                ", formacao='" + formacao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                '}';
    }
}

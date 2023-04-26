public class FuncionarioHospital extends Pessoa {
    private String cracha;
    private String horario;
    private Hospital hospital;

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Double getAcrescimoProcedimento(){
        return null;
    }

    @Override
    public String toString() {
        return "FuncionarioHospital{" +
                "cracha='" + cracha + '\'' +
                ", horario='" + horario + '\'' +
                ", hospital=" + hospital +
                '}';
    }


}

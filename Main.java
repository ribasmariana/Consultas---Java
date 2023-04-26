import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hospital hospital1 = new Hospital("Unimed", "Criciuma", "09876766");



        List<HistoricoMedico>historicos = new ArrayList<>();
        HistoricoMedico historico1 = new HistoricoMedico("Ativo, vivo", LocalDate.now());
        HistoricoMedico historico2 = new HistoricoMedico("Sedentario, quase morrendo", LocalDate.now());

        historicos.add(historico1);
        historicos.add(historico2);

        PlanoSaude unimed = new PlanoSaude("Unimed", "Unimed");

        unimed.setPercentualDesconto(10.0);

        Paciente paciente1 = new Paciente(7594, "Maria", "123456", "123456", "123456",
                "maria1@1", "Maria783768", "18/08/2000", true, unimed,
                hospital1, historicos);

        List<Procedimento>procedimentos = new ArrayList<>();
        Procedimento procedimento1 = new Procedimento("Cirugia de joelho esquerdo", 300.00);
        Procedimento procedimento2 = new Procedimento("Transplante de pancreas", 700.00);
        procedimentos.add(procedimento1);
        procedimentos.add(procedimento2);

        List<Medicamento>medicamentos = new ArrayList<>();
        Medicamento medicamento1 = new Medicamento("Tramol", 150.00);
        Medicamento medicamento2 = new Medicamento("Insulina", 200.00);
        medicamentos.add(medicamento1);
        medicamentos.add(medicamento2);

        Medico medico1 = new Medico(1, "7894784", "Medicina esp. Ortopedia", "Unesc", "88945785", "gggggggggg",
                "8957", "8957895", hospital1, "55555555", "44444", "44444444", "33333333333");

        Enfermeira enfermeira1 = new Enfermeira("Generalista", "8947938", "Enfermagem", "Unesc");

        Consulta consulta1 = new Consulta(LocalDate.now(), paciente1, medico1, enfermeira1, procedimentos, medicamentos);

        consulta1.getValorTotalMedicamentos();

        consulta1.getValorTotalProcedimentos();

        consulta1.getValorTotalConsulta();

        /////////////////////////////////////////////////////////////////////////

        System.out.println(hospital1);
        System.out.println();
        System.out.println();
        System.out.println(paciente1);
        System.out.println();
        System.out.println(historicos);
        System.out.println();
        System.out.println(medicamentos);
        System.out.println();
        System.out.println(procedimentos);
        System.out.println();
        System.out.println(medico1);
        System.out.println();
        System.out.println(enfermeira1);
        System.out.println();
        System.out.println(consulta1);
        System.out.println();
        System.out.println(consulta1.getValorTotalMedicamentos());
        System.out.println();
        System.out.println(consulta1.getValorTotalProcedimentos());
        System.out.println();
        System.out.println(consulta1.getValorTotalConsulta());
    }}

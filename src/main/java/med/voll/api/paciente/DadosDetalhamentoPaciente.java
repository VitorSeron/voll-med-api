package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(String nome, String email, String telefone, String cpf, Endereco Endereco) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(),
                paciente.getEndereco());
    }
}

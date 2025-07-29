package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosListagemPacientes(String nome,String email,String cpf) {
    public DadosListagemPacientes(Paciente paciente) {
        this(paciente.getNome(),paciente.getEmail(),paciente.getCpf());
    }
}

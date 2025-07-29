package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotNull
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // são digitos de 4 a 6
        String crm,
        @NotNull // não é notblank pq não é string
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEndereco endereco
) {}

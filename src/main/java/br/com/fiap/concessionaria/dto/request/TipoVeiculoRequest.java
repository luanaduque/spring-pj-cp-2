package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;

public record TipoVeiculoRequest(
        @NotNull(message = "O nome precisa ser informado!")
        String nome
) {
}
package br.ce.hyrum.dtos.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoRequestDto {
    private Long id;
    private String nome;
    private String email;
}
package br.etec.com.lucas.exerciciopw2.model;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name="contaspagar")
public class ContasPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datacriacao;
    private LocalDate datavencimento;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name="idcliente")
    private Cliente cliente;

}

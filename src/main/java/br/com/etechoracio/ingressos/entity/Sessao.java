package br.com.etechoracio.ingressos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;




@Entity
@Getter
@Setter
@Table(name="TBL_SESSAO")
public class Sessao
{
    @Column(name = "ID_SESSAO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DT_DATA")
    private LocalDateTime data;

    @Column(name = "NR_PRECO")
    private double preco;

    @Column(name = "DT_EXCLUSAO")
    private LocalDateTime dataExclusao;

    @ManyToOne
    @JoinColumn(name = "ID_SALA")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "ID_FILME")
    private Filme filme;
}
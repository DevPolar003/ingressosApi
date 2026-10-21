package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingressos.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingressos.enums.SimNaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TBL_FILME")
public class Filme
{
    @Id
    @Column(name="ID_FILME")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identity
    private Long id;

    @Column(name="TX_NOME")
    private String nome;

    @Column(name="NR_DURACAO")
    private Integer duracao;

    @Column(name="TP_CATEGORIA")
    @Enumerated(EnumType.STRING)
    private CategoriaFilmeEnum categoria;

    @Enumerated(EnumType.STRING)
    @Column(name="TP_CLASSIFICACAO")
    private ClassificacaoIndicativaEnum classificacao;

    @Column(name="NR_ANO")
    private Integer ano;

    @Column(name="TX_CAPA")
    private String capa;

    @Column(name="TX_DIRETOR")
    private String diretor;

    @Column(name="TX_ELENCO")
    private String elenco;

    @Column(name="TX_DESCRICAO")
    private String descricao;

    @Column(name="NR_AVALIACAO")
    private Double avaliacao;

    @Enumerated(EnumType.STRING)
    @Column(name="CHK_EM_CARTAZ")
    private SimNaoEnum emCartaz;

}
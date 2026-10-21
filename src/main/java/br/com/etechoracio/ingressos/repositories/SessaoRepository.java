package br.com.etechoracio.ingressos.repositories;

import br.com.etechoracio.ingressos.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
}

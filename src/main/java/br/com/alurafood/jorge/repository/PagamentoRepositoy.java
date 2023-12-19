package br.com.alurafood.jorge.repository;

import br.com.alurafood.jorge.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}

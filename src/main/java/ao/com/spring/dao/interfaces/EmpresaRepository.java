package ao.com.spring.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.com.spring.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	public Empresa findByRazaoSocial(String razaoSocial);
}

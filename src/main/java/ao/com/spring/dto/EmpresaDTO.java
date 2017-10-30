package ao.com.spring.dto;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class EmpresaDTO {
	
	private Long id;
	private String razaoSocial;
	private Date dataAtualizacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotEmpty(message = "Razão Social deve sempre estar preenchida")
	@Length(min = 5, max = 200, message = "Razão social deve conter entre 5 e 200 caracteres")
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
}
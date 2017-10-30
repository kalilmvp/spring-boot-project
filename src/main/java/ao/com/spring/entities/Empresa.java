package ao.com.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "tb_empresa")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 7267796533039704454L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "razao_social")
	private String razaoSocial;
	
	@Column(name = "data_atualizacao")
	private Date dataAtualizacao;
	
	@PreUpdate
	private void preUpdate() {
		this.dataAtualizacao = new Date();
	}
	
	@PrePersist
	private void prePersist() {
		Date today = new Date();
		this.dataAtualizacao = today;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", dataAtualizacao=" + dataAtualizacao + "]";
	}
}

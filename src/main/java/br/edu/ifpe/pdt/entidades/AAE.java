package br.edu.ifpe.pdt.entidades;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*
 * Atividades de Apoio ao Ensino
 */
@ManagedBean(name = "aae")
@RequestScoped
@Entity
@Table( name = "aae" )
public class AAE {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", updatable=false)
	private Integer codigo;
	
	@Column(name="atividade", nullable=false, length=500)
	private String atividade;
	
	@Column(name="carga_horaria")
	private Integer cargaHoraria;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="ptd_id", updatable=false)
	private PTD ptd;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public PTD getPTD() {
		return ptd;
	}

	public void setPTD(PTD ptd) {
		this.ptd = ptd;
	}
}

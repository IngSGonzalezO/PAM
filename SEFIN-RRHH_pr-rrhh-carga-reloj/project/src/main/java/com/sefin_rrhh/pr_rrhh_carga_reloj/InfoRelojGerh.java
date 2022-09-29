package com.sefin_rrhh.pr_rrhh_carga_reloj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InfoRelojGerh implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("numero_siarh")
	private java.lang.String numero_siarh;
	@org.kie.api.definition.type.Label("nombre")
	private java.lang.String nombre;
	@org.kie.api.definition.type.Label("hora_entrada")
	private java.lang.String hora_entrada;
	@org.kie.api.definition.type.Label("hora_salida")
	private java.lang.String hora_salida;
	@org.kie.api.definition.type.Label("fecha")
	private java.lang.String fecha;
	@org.kie.api.definition.type.Label("direccion")
	private java.lang.String direccion;
	@org.kie.api.definition.type.Label("usu_cre")
	private java.lang.String usu_cre;
	@org.kie.api.definition.type.Label("fec_cre")
	private java.lang.String fec_cre;
	@org.kie.api.definition.type.Label("usu_mod")
	private java.lang.String usu_mod;
	@org.kie.api.definition.type.Label("fec_mod")
	private java.lang.String fec_mod;

	@org.kie.api.definition.type.Label("horas_trabajadas")
	private java.lang.String horas_trabajadas;

	@org.kie.api.definition.type.Label("horas_extras_autorizadas")
	private java.lang.String horas_extras_autorizadas;

	@org.kie.api.definition.type.Label("origen")
	private java.lang.String origen;

	@org.kie.api.definition.type.Label(value = "id_info_reloj")
	private java.lang.String id_info_reloj;

	@org.kie.api.definition.type.Label(value = "id_exp_identificaciones")
	private java.lang.String id_exp_identificaciones;

	@org.kie.api.definition.type.Label(value = "numero_identidad")
	private java.lang.String numero_identidad;

	public InfoRelojGerh() {
	}

	public java.lang.String getNumero_siarh() {
		return this.numero_siarh;
	}

	public void setNumero_siarh(java.lang.String numero_siarh) {
		this.numero_siarh = numero_siarh;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getHora_entrada() {
		return this.hora_entrada;
	}

	public void setHora_entrada(java.lang.String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public java.lang.String getHora_salida() {
		return this.hora_salida;
	}

	public void setHora_salida(java.lang.String hora_salida) {
		this.hora_salida = hora_salida;
	}

	public java.lang.String getFecha() {
		return this.fecha;
	}

	public void setFecha(java.lang.String fecha) {
		this.fecha = fecha;
	}

	public java.lang.String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	public java.lang.String getUsu_cre() {
		return this.usu_cre;
	}

	public void setUsu_cre(java.lang.String usu_cre) {
		this.usu_cre = usu_cre;
	}

	public java.lang.String getFec_cre() {
		return this.fec_cre;
	}

	public void setFec_cre(java.lang.String fec_cre) {
		this.fec_cre = fec_cre;
	}

	public java.lang.String getUsu_mod() {
		return this.usu_mod;
	}

	public void setUsu_mod(java.lang.String usu_mod) {
		this.usu_mod = usu_mod;
	}

	public java.lang.String getFec_mod() {
		return this.fec_mod;
	}

	public void setFec_mod(java.lang.String fec_mod) {
		this.fec_mod = fec_mod;
	}

	public java.lang.String getHoras_trabajadas() {
		return this.horas_trabajadas;
	}

	public void setHoras_trabajadas(java.lang.String horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}

	public java.lang.String getHoras_extras_autorizadas() {
		return this.horas_extras_autorizadas;
	}

	public void setHoras_extras_autorizadas(
			java.lang.String horas_extras_autorizadas) {
		this.horas_extras_autorizadas = horas_extras_autorizadas;
	}

	public java.lang.String getOrigen() {
		return this.origen;
	}

	public void setOrigen(java.lang.String origen) {
		this.origen = origen;
	}

	public java.lang.String getId_info_reloj() {
		return this.id_info_reloj;
	}

	public void setId_info_reloj(java.lang.String id_info_reloj) {
		this.id_info_reloj = id_info_reloj;
	}

	public java.lang.String getId_exp_identificaciones() {
		return this.id_exp_identificaciones;
	}

	public void setId_exp_identificaciones(
			java.lang.String id_exp_identificaciones) {
		this.id_exp_identificaciones = id_exp_identificaciones;
	}

	public java.lang.String getNumero_identidad() {
		return this.numero_identidad;
	}

	public void setNumero_identidad(java.lang.String numero_identidad) {
		this.numero_identidad = numero_identidad;
	}

	public InfoRelojGerh(java.lang.String numero_siarh,
			java.lang.String nombre, java.lang.String hora_entrada,
			java.lang.String hora_salida, java.lang.String fecha,
			java.lang.String direccion, java.lang.String usu_cre,
			java.lang.String fec_cre, java.lang.String usu_mod,
			java.lang.String fec_mod, java.lang.String horas_trabajadas,
			java.lang.String horas_extras_autorizadas, java.lang.String origen,
			java.lang.String id_info_reloj,
			java.lang.String id_exp_identificaciones,
			java.lang.String numero_identidad) {
		this.numero_siarh = numero_siarh;
		this.nombre = nombre;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
		this.fecha = fecha;
		this.direccion = direccion;
		this.usu_cre = usu_cre;
		this.fec_cre = fec_cre;
		this.usu_mod = usu_mod;
		this.fec_mod = fec_mod;
		this.horas_trabajadas = horas_trabajadas;
		this.horas_extras_autorizadas = horas_extras_autorizadas;
		this.origen = origen;
		this.id_info_reloj = id_info_reloj;
		this.id_exp_identificaciones = id_exp_identificaciones;
		this.numero_identidad = numero_identidad;
	}

}
package com.sefin_rrhh.pr_rrhh_carga_reloj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GlobalVar implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	@org.kie.api.definition.type.Label("urlAdministracion")
	private java.lang.String urlAdministracion = "http://api-rrhh-adm-administracion-desa-api-rrhh-pool.apps.galel.sefin.gob.hn/api";

	@org.kie.api.definition.type.Label(value = "charset")
	private java.lang.String charset = "UTF-8";

	public GlobalVar() {
	}

	public java.lang.String getUrlAdministracion() {
		return this.urlAdministracion;
	}

	public void setUrlAdministracion(java.lang.String urlAdministracion) {
		this.urlAdministracion = urlAdministracion;
	}

	public java.lang.String getCharset() {
		return this.charset;
	}

	public void setCharset(java.lang.String charset) {
		this.charset = charset;
	}

	public GlobalVar(java.lang.String urlAdministracion,
			java.lang.String charset) {
		this.urlAdministracion = urlAdministracion;
		this.charset = charset;
	}

}
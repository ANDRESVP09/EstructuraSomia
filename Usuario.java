package Clases;

import java.io.Serializable;

public class Usuario implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -1758408767177185385L;
	public int intIdUsuario;
	 public String strNombres;
	 public String strApellidos;
	 public boolean boolEstado;
	 public int intdni;
	 public int inttelefono;
	 public String strCodUsuario;
	 public String strdireccion; 
	 public String strcorrecio;
	 public String strPasword;
	 public String strMensaje;
	public int getIntIdUsuario() {
		return intIdUsuario;
	}
	public void setIntIdUsuario(int intIdUsuario) {
		this.intIdUsuario = intIdUsuario;
	}
	public String getStrNombres() {
		return strNombres;
	}
	public void setStrNombres(String strNombres) {
		this.strNombres = strNombres;
	}
	public String getStrApellidos() {
		return strApellidos;
	}
	public void setStrApellidos(String strApellidos) {
		this.strApellidos = strApellidos;
	}
	public boolean isBoolEstado() {
		return boolEstado;
	}
	public void setBoolEstado(boolean boolEstado) {
		this.boolEstado = boolEstado;
	}
	public int getIntdni() {
		return intdni;
	}
	public void setIntdni(int intdni) {
		this.intdni = intdni;
	}
	public int getInttelefono() {
		return inttelefono;
	}
	public void setInttelefono(int inttelefono) {
		this.inttelefono = inttelefono;
	}
	public String getStrdireccion() {
		return strdireccion;
	}
	public void setStrdireccion(String strdireccion) {
		this.strdireccion = strdireccion;
	}
	public String getStrcorrecio() {
		return strcorrecio;
	}
	public void setStrcorrecio(String strcorrecio) {
		this.strcorrecio = strcorrecio;
	}
	public String getStrPasword() {
		return strPasword;
	}
	public void setStrPasword(String strPasword) {
		this.strPasword = strPasword;
	}
	public String getStrMensaje() {
		return strMensaje;
	}
	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}
	
	
	public String getStrCodUsuario() {
		return strCodUsuario;
	}
	public void setStrCodUsuario(String strCodUsuario) {
		this.strCodUsuario = strCodUsuario;
	}
	
	public Usuario(int intIdUsuario, String strNombres, String strApellidos, boolean boolEstado, int intdni,
			int inttelefono, String strCodUsuario, String strdireccion, String strcorrecio, String strPasword,
			String strMensaje) {
		
		this.intIdUsuario = intIdUsuario;
		this.strNombres = strNombres;
		this.strApellidos = strApellidos;
		this.boolEstado = boolEstado;
		this.intdni = intdni;
		this.inttelefono = inttelefono;
		this.strCodUsuario = strCodUsuario;
		this.strdireccion = strdireccion;
		this.strcorrecio = strcorrecio;
		this.strPasword = strPasword;
		this.strMensaje = strMensaje;
	}
	public Usuario(){
		
	}
	 
}

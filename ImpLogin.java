package ClasesDAO;

import Clases.Usuario;
import Interfaces.ILogin;

public class ImpLogin implements ILogin {

	@Override
	public Usuario ValidaAcces(Usuario obj) {
		// TODO Auto-generated method stub
		
		Usuario usu = new Usuario(); 
		 if(obj.getStrCodUsuario().equals("admin") && obj.getStrMensaje().equals("admin")){
			 usu.setStrMensaje("Ingreso Correcto...");
		 usu.setBoolEstado(true);
		 }else{
			 usu.setStrMensaje("Error de Autentificacion...");
			 usu.setBoolEstado(false);
		 }
	
		return usu;
	}

}

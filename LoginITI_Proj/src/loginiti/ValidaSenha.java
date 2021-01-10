package loginiti;

import java.util.regex.Pattern;


public class ValidaSenha {
	
	public boolean valida(String pass) {
	    	
			/*
			 * Tratamento da valida��o
			 * Abaixo cada linha da regra est� alinhada com cada linha da instru��o "if" do c�digo
			 * ----------------------------------------------------------------------------------------------
			 * Ao menos 1 letra min�scula
			 * Ao menos 1 letra mai�scula 
			 * Ao menos 1 d�gito
			 * Ao menos 1 caractere especial .Considere como especial os seguintes caracteres: !@#$%^&*()-+ 
			 * Espa�os em branco n�o devem ser considerados como caracteres v�lidos.
			 * Nove ou mais caracteres 
			 * N�o possuir caracteres repetidos dentro do conjunto 
			 * ----------------------------------------------------------------------------------------------
			 */
	
	    	if(Pattern.matches(".*[a-z]+.*",pass) && 
	    	   Pattern.matches(".*[A-Z]+.*",pass) &&
	    	   Pattern.matches(".*[0-9]+.*",pass) && 
	    	   Pattern.matches(".*[!@#$%^&*()-+]+.*",pass) && 
	    	  !Pattern.matches(".*\\s+.*",pass) &&
	    	   Pattern.matches(".{9,}",pass) &&
	    	  !Pattern.matches(".*([!@#$%^&*()-+a-zA-Z0-9]).*\\1+.*",pass)) {
	    			return true;
	    	}else {
	    			return false;
	    	}
	}

}
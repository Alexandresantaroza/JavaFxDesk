package loginiti;

import java.util.regex.Pattern;


public class ValidaSenha {
	
	public boolean valida(String pass) {
	    	
			/*
			 * Tratamento da validação
			 * Abaixo cada linha da regra está alinhada com cada linha da instrução "if" do código
			 * ----------------------------------------------------------------------------------------------
			 * Ao menos 1 letra minúscula
			 * Ao menos 1 letra maiúscula 
			 * Ao menos 1 dígito
			 * Ao menos 1 caractere especial .Considere como especial os seguintes caracteres: !@#$%^&*()-+ 
			 * Espaços em branco não devem ser considerados como caracteres válidos.
			 * Nove ou mais caracteres 
			 * Não possuir caracteres repetidos dentro do conjunto 
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
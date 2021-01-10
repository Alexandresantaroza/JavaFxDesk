package loginiti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
 
public class LoginITIController {
	
	@FXML private Text senhaDigitada;
	@FXML private Text resultadoValida;
	@FXML private PasswordField passwordField;


	//Quando o usuário pressionar o botão
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
    	testaEMostraResultado();
    }


	//Se o usuário teclar ENTER na caixa de password, dispara a execução da validação
    @FXML protected void handlePassFieldEnterKey(KeyEvent event) {
    	//exibe texto digitado
    	KeyCode keyCode = event.getCode();
    	if(keyCode == KeyCode.ENTER) {
    		testaEMostraResultado();
    	}
    }   
    
	/*
	 * Faz a validação e exibe resultado: exibe a senha digitada e exibe True ou
	 * False conforme a senha seja valida ou não
	 */
    @FXML private void testaEMostraResultado() {
    	
    	ValidaSenha validaSenha = new ValidaSenha();
    	
    	//Código para tratar a validação da senha:
    	if(validaSenha.valida(passwordField.getText())) {
    		resultadoValida.setText("True");
    		resultadoValida.setStyle("-fx-fill: rgb(0,200,0);-fx-font-size: 14px;");
    	} else {
    		resultadoValida.setText("False");
			resultadoValida.setStyle("-fx-fill: rgb(255,0,0);-fx-font-size: 14px;");
    	}
        //exibe texto digitado
    	senhaDigitada.setText("Senha: " + passwordField.getText());
    }
    
    	
    	
    }
     

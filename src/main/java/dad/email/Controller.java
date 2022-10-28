package dad.email;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

import dad.Util.MyEmail;
import dad.main.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.util.converter.NumberStringConverter;

public class Controller implements Initializable  {
	
	//Model
	
	Model model = new Model();
	
	//View
	
	@FXML
	private BorderPane view;
	@FXML
	private TextField nombreServidorTextField,puertoServidorTextField,
						emailRemitenteTextField,passwordRemitenteTextField,
						emailDestinatarioTextField,asuntoTextField;
	@FXML
	private TextArea mensajeTextField;
	@FXML
	private CheckBox sslCheackBox;
	@FXML
	private Button enviarButton,vaciarButton,cerrarButton;
	
	public Controller() throws IOException {
		//FXML
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EmailView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Binding
		
		model.nombreServidorProperty().bind(nombreServidorTextField.textProperty());
		puertoServidorTextField.textProperty().bindBidirectional(model.puertoServidorProperty(),new NumberStringConverter());
		model.sslProperty().bind(sslCheackBox.selectedProperty());
		model.remitenteEmailProperty().bind(emailRemitenteTextField.textProperty());
		model.remitentePasswordProperty().bind(passwordRemitenteTextField.textProperty());
		model.destinatarioEmailProperty().bind(emailDestinatarioTextField.textProperty());
		model.asuntoProperty().bind(asuntoTextField.textProperty());
		model.mensajeProperty().bind(mensajeTextField.textProperty());
		
		
		//Listeners
		
		enviarButton.setOnAction(this::onEnviarAction);
		vaciarButton.setOnAction(this::onBorrarAction);
		cerrarButton.setOnAction(e -> App.stage.close());
		
		
	}
	
	private void onEnviarAction(ActionEvent e) {
		try {
			Email toSend = MyEmail.simpleEmail(
					model.getNombreServidor(), model.getPuertoServidor(), 
					model.isSsl(), model.getRemitenteEmail(),
					model.getRemitentePassword(),
					model.getDestinatarioEmail(),
					model.getAsunto(),
					model.getMensaje());
			toSend.send();
		} catch (EmailException e1) {
		}
	}
	private void onBorrarAction(ActionEvent e) {
		nombreServidorTextField.setText("");
		puertoServidorTextField.setText("");
		sslCheackBox.setSelected(false);
		emailRemitenteTextField.setText("");
		passwordRemitenteTextField.setText("");
		emailDestinatarioTextField.setText("");
		asuntoTextField.setText("");
		mensajeTextField.setText("");
	}
	
	public Model getModel() {return this.model;}
	public BorderPane getView() {return this.view;}

}

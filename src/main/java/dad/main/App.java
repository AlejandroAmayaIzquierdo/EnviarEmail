package dad.main;

import dad.email.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
	
	public static Stage stage;
	
	private Controller controller;

	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		
		controller = new Controller();
		
		stage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/email-send-icon-32x32.png")));
		
		stage.setMinWidth(345);
		stage.setMinHeight(250);
		
		stage.setTitle("Enviar Email");
		stage.setScene(new Scene(controller.getView()));
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

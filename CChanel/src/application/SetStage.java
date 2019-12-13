package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SetStage {
	/**
	 * Con este método se cambia de pantalla.
	 */
	@FXML
	public void Cambiar() {
		
		try {
			Stage primaryStage= new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("vista2.fxml"));
			//BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root,700,600);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Este método cierra la app.
	 */
	@FXML
	public void Cerrar() {
		System.exit(0);
	}
	
	
}

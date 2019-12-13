package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
/**
 * Aplicación que permite o cerrarla o cambiar a otra ventana.
 * @author Javier Muñoz
 * @see SetStage
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventanuco.fxml"));
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
	
	public static void main(String[] args) {
		launch(args);
	}
}

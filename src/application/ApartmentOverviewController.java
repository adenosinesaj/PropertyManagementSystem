package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApartmentOverviewController {
	Stage stage;
	Scene scene;
	Parent root;
	public void switchToLogInOverview(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LogInOverview.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToCommercialOverview(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("CommercialSpaceOverview.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToAdminPanel(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AdminPanelApartment.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}

import com.samugao.utils.EnvVariable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainWin extends Application {
	private Stage stage = null;

	private BorderPane root = null; // root laayout pane for the window
	private Scene scene = null; // stage scene for the window
	private static double winWidth = EnvVariable.getScreenWidth()*2/3; // window initial width
	private static double winHeight = EnvVariable.getScreenHeight()*2/3; // window initial height
	@Override
	public void init(){
		root = new BorderPane();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		scene = new Scene(root, winWidth, winHeight);
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}

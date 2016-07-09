import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Eduard Drenth at VectorPrint.nl
 */
public class Button extends Application {

   @Override
   public void start(final Stage stage) throws Exception {
      Parent root = null;
      try {
         root = FXMLLoader.load(getClass().getResource("button.fxml"));
      } catch (Exception ex) {
         ex.printStackTrace();
         throw ex;
      }
      stage.initStyle(StageStyle.TRANSPARENT);
      stage.setTitle("Button");
      Scene scene = new Scene(root);
      scene.setFill(Color.TRANSPARENT);
      stage.setScene(scene);
      stage.show();
   }

   @Override
   public void stop() throws Exception {
      System.exit(0);
   }

   public static void main(String[] args) throws Exception {
      launch(args);
   }
}

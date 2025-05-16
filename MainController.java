package mynewapp1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable {

    private int currentIndex = 0;

    @FXML private ImageView myImageView;
    @FXML private Button myButton;
    @FXML private Label myLabel;

    private final Image[] imageArray = new Image[]{
        new Image(getClass().getResourceAsStream("Summer.jpg")),
        new Image(getClass().getResourceAsStream("Autumn.jpg")),
        new Image(getClass().getResourceAsStream("Winter.jpg")),
        new Image(getClass().getResourceAsStream("Spring.jpg"))
    };

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myImageView.setImage(imageArray[currentIndex]);
        myLabel.setText("You are now in Spring.");
    }

    @FXML
    private void displayImage(ActionEvent e) {
        currentIndex = (currentIndex + 1) % imageArray.length;
        myImageView.setImage(imageArray[currentIndex]);
        switch(currentIndex)
        {
            case 0:
                myLabel.setText("You are now in Summer.");
                break;
            case 1:
                myLabel.setText("You are now in Autumn.");
                break;
            case 2:
                myLabel.setText("You are now in Winter.");
                break;
            case 3:
                myLabel.setText("You are now in Spring.");
                break;
        }
    }
}

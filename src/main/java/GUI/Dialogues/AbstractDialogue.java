package GUI.Dialogues;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AbstractDialogue {

    private final Stage stage;
    private GridPane gridPane;
    private int row;

    public AbstractDialogue (String header, String message){

        stage = new Stage();
        stage.setTitle(header);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(new Stage());

        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        fillGrid(message);

    }

    private void fillGrid(String message) {
        row = 0;
        gridPane.add(new Label(message), 0,row,2,1);
        gridPane.add(new Separator(), 0,++row,2,1);
    }

    public void show(){
        Scene dialogScene = new Scene(gridPane, 600, 200);
        stage.setScene(dialogScene);
        stage.show();
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public int getRow() {
        return row;
    }


    public void close() {
        stage.close();
    }
}
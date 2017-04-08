import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;


public class PlotSineCosine {

	public static void main(String[] args) {

	}


		launch(args);
	}


	@Override
	public void start(Stage stage)
	{
		stage.setTitle("Exercise 14.19");

		Label labelX = new Label("X");
		labelX.setLayoutX(380);
		labelX.setLayoutY(70);
		
		Label labelY = new Label("Y");
		labelY.setLayoutX(220);
		labelY.setLayoutY(10);
		
		Label labelPi1 = new Label("-2\u03c0");
		labelPi1.setLayoutX(90);
		labelPi1.setLayoutY(100);
		
		Label labelPi2 = new Label("-\u03c0");
		labelPi2.setLayoutX(140);
		labelPi2.setLayoutY(100);
		
		Label labelZero = new Label("0");
		labelZero.setLayoutX(200);
		labelZero.setLayoutY(100);
		
		Label labelPi3 = new Label("\u03c0");
		labelPi3.setLayoutX(250);
		labelPi3.setLayoutY(100);
		
		Label labelPi4 = new Label("2\u03c0");
		labelPi4.setLayoutX(345);
		labelPi4.setLayoutY(100);

	
		Line lineX = new Line(20, 100, 380, 100);
		Line lineY = new Line(200, 20, 200, 180);
		Line arrowX1 = new Line(370, 90, 380, 100);
		Line arrowX2 = new Line(370, 110, 380, 100);
		Line arrowY1 = new Line(190, 30, 200, 20);
		Line arrowY2 = new Line(210, 30, 200, 20);


		Polyline polylineSin = new Polyline();
		polylineSin.setStroke(Color.RED);
		ObservableList<Double> listSin = polylineSin.getPoints();
		for (int x = -170; x <= 170; x++)
		{
			listSin.add(x + 200.0);
			listSin.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}


		Polyline polylineCos = new Polyline();
		polylineCos.setStroke(Color.BLUE);
		ObservableList<Double> listCos = polylineCos.getPoints();
		for (int x = -170; x <= 170; x++)
		{
			listCos.add(x + 200.0);
			listCos.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}

		Pane borderPane = new Pane();


		borderPane.getChildren().addAll(lineX, lineY, arrowX1, arrowX2, arrowY1, arrowY2, polylineSin, polylineCos,
				labelX, labelY, labelPi1, labelPi2, labelZero, labelPi3, labelPi4);

		Scene scene = new Scene(borderPane, 400, 200);


		stage.setScene(scene);
		stage.show();
	}


}

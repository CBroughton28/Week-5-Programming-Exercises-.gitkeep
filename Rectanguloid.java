
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
	

	public class Rectanguloid extends Application
	{

		private static Rectangle upperSquare = new Rectangle(75, 25, 100, 100);
		private static Rectangle lowerSquare = new Rectangle(25, 75, 100, 100);
		
		private static Line lineLT = new Line(75, 25, 25, 75);
		private static Line lineRT = new Line(175, 25, 125, 75);
		private static Line lineLB = new Line(75, 125, 25, 175);
		private static Line lineRB = new Line(175, 125, 125, 175);
		
		public static void main(String[] args)
		{
			launch(args);
		}
	
		@Override
		public void start(Stage stage)
		{
			extracted(stage);
			
			Color strokeColor = Color.BLACK;
			int strokeWidth = 1;
	
			upperSquare.setFill(null);
			upperSquare.setStroke(strokeColor);
			upperSquare.setStrokeWidth(strokeWidth);
		
			lowerSquare.setFill(null);
			lowerSquare.setStroke(strokeColor);
			lowerSquare.setStrokeWidth(strokeWidth);

			BorderPane borderPane = new BorderPane();
	
			borderPane.getChildren().addAll(upperSquare, lowerSquare, lineLT, lineRT, lineLB, lineRB);
	
			Scene scene = new Scene(borderPane, 200, 200);
			
			stage.setScene(scene);
			stage.show();
	
			scene.widthProperty().addListener(listenerWidth);
			scene.heightProperty().addListener(listenerHeight);
		}

		private void extracted(Stage stage) {
			stage.setTitle("Rectanguloid")
		}
		

		ChangeListener<Number> listenerWidth = new ChangeListener<Number>()
		{
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number xOld, Number xNew)
			{
		
				double xFinal = xNew.doubleValue() - xOld.doubleValue();
	

				lineRT.setStartX(lineRT.getStartX() + xFinal);
				lineRT.setEndX(lineRT.getEndX() + xFinal);
				lineRB.setStartX(lineRB.getStartX() + xFinal);
				lineRB.setEndX(lineRB.getEndX() + xFinal);
				
				upperSquare.setWidth(upperSquare.getWidth() + xFinal);
				lowerSquare.setWidth(lowerSquare.getWidth() + xFinal);
	

			}
		};
	

		ChangeListener<Number> listenerHeight = new ChangeListener<Number>()
		{
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number yOld, Number yNew)
			{
				
				double yFinal = yNew.doubleValue() - yOld.doubleValue();
	

				lineLB.setStartY(lineLB.getStartY() + yFinal);
				lineLB.setEndY(lineLB.getEndY() + yFinal);
				lineRB.setStartY(lineRB.getStartY() + yFinal);
				lineRB.setEndY(lineRB.getEndY() + yFinal);
				
				
				upperSquare.setHeight(upperSquare.getHeight() + yFinal);
				lowerSquare.setHeight(lowerSquare.getHeight() + yFinal);
			}
		};
	

	}

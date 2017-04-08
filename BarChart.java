	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Label;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.VBox;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Rectangle;
	import javafx.stage.Stage;
	

	public class BarChart extends Application
	{
	

		public static void main(String[] args)
		{
			launch(args);
		}
	

		@Override
		public void start(Stage stage)
		{
			stage.setTitle("Exercise 14.12");
			
			Color strokeColor = Color.BLACK;
			int strokeWidth = 1;
	
			Label labelProject = new Label("Project -- 20%");
			Rectangle squareProject = new Rectangle(80, 40);
			squareProject.setFill(Color.RED);
			squareProject.setStroke(strokeColor);
			squareProject.setStrokeWidth(strokeWidth);
	

			Label labelQuiz = new Label("Quiz -- 10%");
			Rectangle squareQuiz = new Rectangle(80, 20);
			squareQuiz.setFill(Color.BLUE);
			squareQuiz.setStroke(strokeColor);
			squareQuiz.setStrokeWidth(strokeWidth);
	

			Label labelMidterm = new Label("Midterm -- 30%");
			Rectangle squareMidterm = new Rectangle(80, 60);
			squareMidterm.setFill(Color.GREEN);
			squareMidterm.setStroke(strokeColor);
			squareMidterm.setStrokeWidth(strokeWidth);
	

			Label labelFinal = new Label("Final -- 40%");
			Rectangle squareFinal = new Rectangle(80, 80);
			squareFinal.setFill(Color.ORANGE);
			squareFinal.setStroke(strokeColor);
			squareFinal.setStrokeWidth(strokeWidth);
	
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(10, 10, 10, 10));
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setAlignment(Pos.BOTTOM_CENTER);
	
			VBox v1 = new VBox();
			v1.getChildren().addAll(labelProject, squareProject);
			v1.setAlignment(Pos.BOTTOM_CENTER);
			
			VBox v2 = new VBox();
			v2.getChildren().addAll(labelQuiz, squareQuiz);
			v2.setAlignment(Pos.BOTTOM_CENTER);
			
			VBox v3 = new VBox();
			v3.getChildren().addAll(labelMidterm, squareMidterm);
			
			v3.setAlignment(Pos.BOTTOM_CENTER);
			VBox v4 = new VBox();
			v4.getChildren().addAll(labelFinal, squareFinal);
			v4.setAlignment(Pos.BOTTOM_CENTER);
	
			GridPane.setConstraints(v1, 0, 0);
			GridPane.setConstraints(v2, 1, 0);
			GridPane.setConstraints(v3, 2, 0);
			GridPane.setConstraints(v4, 3, 0);
	
			grid.getChildren().addAll(v1, v2, v3, v4);
	
			Scene scene = new Scene(grid, 400, 120);
			stage.setScene(scene);
			stage.show();
		}
	

	}

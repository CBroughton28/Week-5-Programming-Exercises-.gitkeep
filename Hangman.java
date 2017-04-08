import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Arc;
	import javafx.scene.shape.ArcType;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Line;
	import javafx.stage.Stage;
	

	public class Hangman extends Application
	{

		Arc arc = new Arc();
		private static Line line1 = new Line(50, 250, 50, 50);
		private static Line line2 = new Line(50, 50, 150, 50);
		private static Line line3 = new Line(150, 50, 150, 75);
		
		private static Circle head = new Circle(150, 100, 25);
		private static Line armLeft = new Line(135, 120, 100, 150);
		private static Line armRight = new Line(165, 120, 200, 150);
		private static Line torso = new Line(150, 125, 150, 190);
		private static Line legLeft = new Line(150, 190, 115, 235);
		private static Line legRight = new Line(150, 190, 185, 235);
		
		public static void main(String[] args)
		{
			launch(args);
		}
	

		@Override
		public void start(Stage stage)
		{
			stage.setTitle("Exercise 14.17");
			
			Color strokeColor = Color.BLACK;
			int strokeWidth = 1;
	
			arc.setCenterX(50);
			arc.setCenterY(265);
			arc.setRadiusX(30);
			arc.setRadiusY(15);
			arc.setLength(180);
			arc.setFill(null);
			arc.setStroke(strokeColor);
			arc.setStrokeWidth(strokeWidth);
			arc.setType(ArcType.OPEN);
			
			head.setFill(null);
			head.setStroke(strokeColor);
			head.setStrokeWidth(1);
			
			BorderPane borderPane = new BorderPane();
	
			borderPane.getChildren().addAll(arc, line1, line2, line3, head, armLeft, armRight, torso, legLeft, legRight);
	

			Scene scene = new Scene(borderPane, 250, 300);
			
			stage.setScene(scene);
			stage.show();
		}
	

	}


/**
 * Example: DrawingExample
 *          From "Java: An Eventful Approach", Chapter 2
 * 
 * Demonstrates parameters in event handlers.
 */
   
import objectdraw.*;
import java.awt.*;

    /**
     * A program that allows the user to draw by dragging the mouse.
     */
    public class DrawingExample extends WindowController
    {
       
        private Location initialPoint;
        
        public void onMousePress(Location pressPoint)
        {
            //new Text("Pressed", pressPoint, canvas);
            initialPoint = pressPoint;
        }
        
        public void onMouseDrag(Location releasePoint)
        {
            //new Text("Released", releasePoint, canvas);
            new Line(initialPoint, releasePoint, canvas);
            
            initialPoint = releasePoint;
        }
        
        
    }
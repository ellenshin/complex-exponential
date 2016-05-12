import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;
import java.awt.Font;
import javax.swing.ImageIcon;

public class GraphicsPanelCompExp extends JPanel     // Class
{
   /**
	 * 
	 */
	private int re = 0;
	private int im = 0;
   
   public GraphicsPanelCompExp(int a, int b)
   {
      re = a;
      im = b;
   }
   
   public void paintComponent(Graphics g)    // Method: paintComponent
   {
      Graphics2D g2 = (Graphics2D) g;  
      
      double width = 1200;
      double height = 900;
      
      double radius = 300;
      if (im > 0)
      {
    	  radius = im*300;
      }
      else if (im < 0)
      {
    	  radius = 25/(-1*im);
      }
      else
      {
    	  radius = 300;
      }
      
      int zer_x = (int)width/2;
      int zer_y = (int)height/2;
      int max_y = 0;
      int max_x = (int)width;
      int min_y = (int)height;
      int min_x = 0;
      
      g2.setColor(Color.BLACK);
      Ellipse2D.Double unit_cir = new Ellipse2D.Double(zer_x - radius/2, zer_y - radius/2, radius, radius); 
      g2.drawLine(min_x, zer_y, max_x, zer_y);
      g2.drawLine(zer_x, min_y, zer_x, max_y);
      g2.draw(unit_cir);
      
      System.out.println(im);
      System.out.println(re);
      System.out.println(zer_x);
      System.out.println(zer_y);
      System.out.println(Math.exp(-1*im*Math.PI/2));
      
      g2.setColor(Color.RED);
      
      if (re > 0)
      {
	      if(re % 4 == 0){
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x + radius*(Math.exp(-1*im*(Math.PI)/2))/2 - 2,zer_y - 2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);   
	      }
	      
	      else if(re % 4 == 1){
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2, zer_y - radius*(Math.exp(-1*im*(Math.PI)/2))/2 - 2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);
	      }
	      
	      else if(re % 4 == 2){
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2 - radius*(Math.exp(-1*im*Math.PI/2))/2,zer_y - 2 , 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);
	      }
	
	      else{
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2, zer_y - 2 + radius*(Math.exp(-1*im*Math.PI/2))/2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt); 
	      }
      }
      else if (re < 0)
      {
	      if(Math.abs(re) % 4 == 0){
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2 + radius*(Math.exp(-1*im*(Math.PI)/2))/2,zer_y - 2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);   
	      }
	      
	      else if(Math.abs(re) % 4 == 1){
	    	  Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2, zer_y - 2 + radius*(Math.exp(-1*im*Math.PI/2))/2, 5, 5);
		      g2.draw(prin_pt);
		      g2.fill(prin_pt);
	      }
	      
	      else if(Math.abs(re) % 4 == 2){
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2 - radius*(Math.exp(-1*im*Math.PI/2))/2,zer_y - 2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);
	      }
	
	      else{
	         Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2, zer_y - 2 - radius*(Math.exp(-1*im*(Math.PI)/2))/2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);
	      }
      }
      else
      {
    	  Ellipse2D.Double prin_pt = new Ellipse2D.Double(zer_x - 2 + radius*(Math.exp(-1*im*(Math.PI)/2))/2,zer_y - 2, 5, 5);
	         g2.draw(prin_pt);
	         g2.fill(prin_pt);   
      }

    }
    
  }


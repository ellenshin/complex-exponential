import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class ComplexExponential{
   public static void main(String [] args){
	  ImageIcon icon = new ImageIcon("src/Images/Realnumber.png");
      /**input real**/ JFrame frame = new JFrame();
      String real = (String)JOptionPane.showInputDialog(frame, "Enter real part of the exponent:", "Real", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      int a;
      try{
    	  a = Integer.parseInt(real);
      }
      catch (Exception e)
      {
    	  a = 0;
      }
      
      
      ImageIcon icon2 = new ImageIcon("src/Images/Imaginary.png");
      /**input image**/ JFrame frame1 = new JFrame();
      String imag = (String)JOptionPane.showInputDialog(frame, "Enter imaginary part of the exponent:", "Imaginary", JOptionPane.INFORMATION_MESSAGE, icon2, null, null);
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame1.setVisible(true);
      int b;
      try{
    	  b = Integer.parseInt(imag);
      }
      catch (Exception e)
      {
    	  b = 0;
      }
      
      ComplexNumber z = new ComplexNumber(a, b);
      
      ImageIcon icon3 = new ImageIcon("src/Images/Complex.png");
      JFrame frame2 = new JFrame();
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame2.setVisible(true);
      UIManager.put("OptionPane.okButtonText", "Graph");
      JOptionPane.showMessageDialog(frame, z.iRaisedTo() + "exp[" + z.reduce() + "], k ϵ ℤ", "Answer", JOptionPane.INFORMATION_MESSAGE, icon3);
      System.out.println(z.iRaisedTo() + "exp[" + z.reduce() + "], k ϵ ℤ");
     
      JFrame frame3 = new JFrame();     // new OBJECT of class type JFrame
      frame3.setSize(1200,600);          // JFrame METHODS setSize, setTitle, setDefaultCloseOperation
      frame3.setTitle("Principle Point Plot");
      frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	  
      GraphicsPanelCompExp panel = new GraphicsPanelCompExp(a, b);  // new OBJECT, called panel
      frame3.add(panel);                             // add panel to frame
  		
      frame3.setVisible(true);                       // ... so we can SEE it.
      
   }
}
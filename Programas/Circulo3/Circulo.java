import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo extends JApplet {
  int x=50;
  int y=100;
  
  public void paint (Graphics g) {


      //SEGUNDA Circulo

      g.drawString ("*",40,27);//1
      g.drawString ("*",50,25);//2 ARRIBA
      g.drawString ("*",60,27);//3
      g.drawString ("*",67,33 );// ESQDER
      g.drawString ("*",72,40 );//4
      g.drawString ("*",75,50 );//5 MDER
      g.drawString ("*",72,60 );//6
      g.drawString ("*",67,67 );//ESQDERI
      g.drawString ("*",60,72);//7
      g.drawString ("*",50,75 );//8 ABAJO
      g.drawString ("*",40,72 );//9
      g.drawString ("*",33,67 );//ESQIZQI
      g.drawString ("*",27,60 );//10
      g.drawString ("*",25,50 );//11 MIZQ
      g.drawString ("*",27,40 );//12
      g.drawString ("*",33,33 );//ESQIZQ
      g.drawString ("*",50,50);//MITAD
 
  }

  
}
  public static void main (String[] args){
    JFrame frame = new JFrame ("Circulo");
    Circulo circuloApplet = new Circulo();
    circuloApplet.init();
    frame.getContentPane().add(circuloApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
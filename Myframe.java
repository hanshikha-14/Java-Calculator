import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame
{
	Label lab1,lab2;
	TextField t1,t2;
	Button b1;
	Frame f;
	Panel p;
	Myframe()
	{
		 content();
	}
	public void content()
	{
		  f=new Frame("New Frame");
          
          
		  f.setSize(300,250);
          
		  f.setVisible(true);
          
		  f.addWindowListener(new myclass());
		  
		  
		  p=new Panel();
		  p.setBackground(Color.blue);
		  
		  lab1=new Label("Usename");
		  
		  t1=new TextField();
		  
		  lab2=new Label("Password");
		  
		  t2=new TextField();
		  
		  b1=new Button("Submit");
		  
		  p.setLayout(null);
		  
		  lab1.setBounds(50,50,100,30);
		  
		  t1.setBounds(150,50,100,30);
		  lab2.setBounds(50,100,100,30);
		  t2.setBounds(150,100,100,30);
		  b1.setBounds(150,150,50,30);
		  
		  p.add(lab1);
		  p.add(t1);
		  p.add(lab2);
		  p.add(t2);
		  p.add(b1);
		  
		  f.add(p);
		  
	}
          public static void main(String args[])
          {
           new Myframe();
          }
    }
           class myclass extends WindowAdapter
          {
	        public void windowClosing(WindowEvent e)
	      {
		    System.exit(0);
	      }
}
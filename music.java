//Applet to play sound    
import java.applet.*;    
import java.awt.*;    
import java.net.*;    
import java.awt.event.*;    
     
public class Musicapplet extends Applet implements ActionListener    
{    
    Button b1,b2,b3;    
    AudioClip au;    
  public void init()    
     {    
        Font f=new Font("Arial",Font.BOLD,25);    
        setFont(f);    
   try{ URL u1=new URL("file:///E:/java/airtel.au");    
    au=getAudioClip(u1);    
   b1=new Button("Play");    
   b2=new Button("Repeat");    
   b3=new Button("Stop");    
     
add(b1);add(b2);add(b3);    
   b1.addActionListener(this);    
   b2.addActionListener(this);    
   b3.addActionListener(this);    
    Label   lab1=new Label("Playing  music");    
       
    setBackground(Color.yellow);    
    add(lab1);    
}    
catch(Exception  e){    
   System.out.println(e);    
    }    
     
   }    
  public void actionPerformed(ActionEvent ae)    
   {    
   Button b=(Button)ae.getSource();    
   if(b==b1)    
      au.play();    
    else if(b==b2)    
      au.loop();    
    else    
      au.stop();    
    }    
}    
     
/*   
 <applet code="Musicapplet" height="200"  width="200">   
</applet>   
  */

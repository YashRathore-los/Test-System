import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class result{
	public static void main(String[] args) {
		score obj=new score();

	}
}
class score extends JFrame{
           JLabel l1;
           score(){

           	Container cn=getContentPane();
            setTitle("JAVA TEST");
            cn.setBackground(Color.YELLOW);
            cn.setLayout(null);
            setBounds(300,200,900,800);
          
             setDefaultCloseOperation(EXIT_ON_CLOSE);
           	    l1=new JLabel("YOUR TEST SCORE IS");
           	    add(l1);
           	    l1.setBounds(150,100,600,400);
           	    l1.setFont(new Font("Serif",Font.BOLD,50));
           	    setVisible(true);
           }
}
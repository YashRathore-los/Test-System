import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class registration{
	public static void main(String[] args) {
		form obj=new form();

	}

}
class form extends JFrame implements ActionListener{
   JTextField j,j1;
   JLabel l1,l2,l3,l4,l5,l6;
   JPasswordField p;
   JButton b;
   JCheckBox c;
   JComboBox d,m,y;
   JRadioButton r,r1;


	form(){
		  Container cn=getContentPane();
          setTitle("Registration form");
          cn.setBackground(Color.CYAN);
          cn.setLayout(null);
          setBounds(300,100,600,600);
          
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          l1=new JLabel("STUDENT NAME");
          l1.setBounds(20,50,100,20);
          add(l1);
          j=new JTextField();
          j.setBounds(130,50,100,20);
          add(j);
          l2=new JLabel("Roll NO");
          l2.setBounds(20,100,100,20);
          add(l2);
          j1=new JTextField();
          j1.setBounds(130,100,100,20);
          add(j1);
          l3=new JLabel("GENDER");
          l3.setBounds(20,165,100,20);
          r=new JRadioButton("MALE");
          r.setBounds(130,165,80,15);
          r1=new JRadioButton("FEMALE");
           r1.setBounds(220,165,80,15);
           add(r);
           add(r1);
           add(l3);
           ButtonGroup ob=new ButtonGroup();
           ob.add(r);
           ob.add(r1);
           l4=new JLabel("DOB");
           l4.setBounds(20,210,100,20);
           add(l4);
           b=new JButton("submit");
           b.setBounds(110,450,80,30);
           add(b);
           b.addActionListener(this);

           c=new JCheckBox("I  agree to the terms and conditions!!");
           c.setBounds(90,400,300,20);
           add(c);
           l5=new JLabel("PASSWORD");
           l5.setBounds(20,285,100,20);
           p=new JPasswordField();
           p.setBounds(130,275,250,30);
           add(l5);
           add(p);
           
           l6=new JLabel("");
           l6.setBounds(30,500,300,70);
           add(l6);
           String []days={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};

           d=new JComboBox(days);
           d.setBounds(130,210,50,30);
           String []months={"1","2","3","4","5","6","7","8","9","10","11","12"};
            m=new JComboBox(months);
           m.setBounds(180,210,50,30);
           String []years={"1999","1988","1997","1996","1995","1994","1993","1992","1991","1990"};
            y=new JComboBox(years);
           y.setBounds(230,210,60,30);
           cn.add(y);
           cn.add(m);

           cn.add(d);
           setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
                if(c.isSelected()){
                	l6.setText("Your Data Has Been Recorded!!");
                	
                    new testportal();
                    dispose();
                    this.setVisible(false);
                }
                else{
                	l6.setText("Please agree conditions!!");
                }
	}
}

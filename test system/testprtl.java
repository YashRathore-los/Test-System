import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class testprtl{
	public static void main(String[] args) {
		testportal ob=new testportal();

		
	}

	
}
class testportal extends JFrame implements ActionListener{
	int curr=0;
	int cout=0;
	JLabel j1;
	JRadioButton radio[]=new JRadioButton[5];
	JButton pre,next,result;
	ButtonGroup bg;
	Container cn;
    testportal(){
    	
          setTitle("JAVA TEST");
          cn=getContentPane();
          cn.setBackground(Color.CYAN);
          cn.setLayout(null);
          setBounds(300,100,700,600);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          j1=new JLabel();
          j1.setBounds(30,40,450,30);
          bg=new ButtonGroup();
          for(int i=0;i<4;i++){
          	radio[i]=new JRadioButton();
          	add(radio[i]);
          	bg.add(radio[i]);
          }
          radio[0].setBounds(70,100,100,20);
          radio[1].setBounds(70,150,100,20);
          radio[2].setBounds(70,200,100,20);
          radio[3].setBounds(70,250,100,20);
          next=new JButton("next");
          next.setBounds(160,400,90,20);
          next.addActionListener(this);
          cn.add(j1);
          cn.add(next);
           pre=new JButton("previous");
          pre.setBounds(30,400,90,20);
          pre.addActionListener(this);
          cn.add(pre);
          result=new JButton("result");
          result.setBounds(110,450,70,20);
          cn.add(result);
          result.setEnabled(false);  
          result.addActionListener(this);                
          setVisible(true);
          set();
            }
          public void actionPerformed(ActionEvent ae){
                      if(ae.getSource()==result){
                      	if(check()){
                      		cout++;
                      	}
                      	JOptionPane.showMessageDialog(this,"Your total score="+cout);
                      	new score();
                      	System.exit(0);
                        
                      }
                      if(ae.getSource()==next){
                      	if(check()){
                      		cout++;
                      	}
                      	if(curr==3){
                      		next.setEnabled(false);
                      	}
                      	curr++;
                      	set();
                      }
                      if(ae.getSource()==pre){
                      	curr--;
                      	cout--;
                      	set();
                      }
          }
          void set(){
          	if(curr==0){
          		j1.setText("Q1. which of the following is not primitive datattype?");
          		radio[0].setText("class");
          		radio[1].setText("int");
          		radio[2].setText("float");
          		radio[3].setText("char");
          		pre.setEnabled(false);

          	}
          	if(curr==1){
          		j1.setText("Q2. what is fullform of JVM?");
          		
          		radio[0].setText("java virtual machine");
          		radio[1].setText("java visual machie");
          		radio[2].setText("java video machie");
          		radio[3].setText("java vigo machie");
          		pre.setEnabled(true);
          		
          	}
          	if(curr==2){
          		j1.setText("Q3. Which among these is not a valid java component?");
          		
          		radio[0].setText("JButton");
          		radio[1].setText("JLabel");
          		radio[2].setText("JRadioButton");
          		radio[3].setText("JList");
          		next.setEnabled(true);
          	}
          	if(curr==3){
          		j1.setText("Q4. Which among these is not a class?");
          		
          		radio[0].setText("swing");
          		radio[1].setText("actionPerformed");
          		radio[2].setText("ActionEvent");
          		radio[3].setText("Button");
          	}
          	if(curr==4){
          		j1.setText("Q5. Which class ia availle to all the class automatically?");
          		
          		radio[0].setText("swing");
          		radio[1].setText("applet");
          		radio[2].setText("net");
          		radio[3].setText("lang");
                result.setEnabled(true);
                      
          	}
          	j1.setBounds(30,40,500,50);
          	j1.setFont(new Font("Serif",Font.BOLD,20));
          	for(int i=0,j=0;i<=250;i+=50,j++){
          		radio[j].setBounds(50,100+i,150,20);
          	}

          }
          boolean check(){
          	if(curr==0){
          		return(radio[0].isSelected());
          	}
          	if(curr==1){
          		return(radio[0].isSelected());
          	}
          	if(curr==2){
          		return(radio[3].isSelected());
          	}
          	if(curr==3){
          		return(radio[1].isSelected());
          	}
          	if(curr==4){
          		return(radio[2].isSelected());
          	}
          	return false;
          }
          

}

package Examples;
import java.awt.*;  
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.event.*;  
public class CharCount extends JFrame implements ActionListener{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel chars,word;  
    JTextArea ta;  
    JButton check;  
    JButton pad,textb;
    JPanel answer;
    CharCount(){  
        super("Character count");  
        answer=new JPanel(new BorderLayout());
        
        
        chars=new JLabel("Characters: ");  
        word=new JLabel("Words: ");  
        
        
        answer.add(chars, BorderLayout.NORTH);
        answer.add(word, BorderLayout.SOUTH);
        answer.setVisible(false);
        
        ta=new JTextArea();  
        ta.setBounds(50,30,300,200);  
          
        check=new JButton("check");  
        check.setBounds(50,250, 80,30);
        check.addActionListener(this);  
      
        pad=new JButton("Pad Color");  
        pad.setBounds(140,250, 110,30);
        pad.addActionListener(this);  
  
        textb=new JButton("Text Color");  
        textb.setBounds(260,250, 110,30);
        textb.addActionListener(this);  
  
        add(ta);add(answer);add(check);add(pad);add(textb);  
          
        setSize(400,400);  
        setLayout(null); 
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
    	
        if(e.getSource()==check){  
        	String text=ta.getText();
        	answer.setVisible(true);
        	
        	//changing position
        	answer.setBounds(50,250,100,40);
        	check.setBounds(50,320, 80,30);
        	pad.setBounds(140,320, 110,30);
        	textb.setBounds(260,320, 110,30);
        	chars.setText("Characters: "+text.length());  
        
        	String words[]=text.split("\\s");  
        	word.setText("Words: "+words.length);  
        }
        else if(e.getSource()==pad){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setBackground(c);  
        }
        else if(e.getSource()==textb){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
        }  
    }  
public static void main(String[] args) {  
	try{
		for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
			if("Nimbus".equals(info.getName())){
				UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
	}
	catch(Exception e){
		}
    new CharCount();  
}}  

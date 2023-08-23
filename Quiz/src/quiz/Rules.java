
package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton back, start;

    public Rules() throws HeadlessException {
    }
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Brain Burst");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
             "<html>"+ 
                "1. Before you answer the questions it is adviced to read the questions twice" + "<br><br>" +
                "2. You will be given 15 seconds to answer each questions, if you fail to answer within 15 seconds you will be redirected to the next question" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Don't unnecessarily talk to your friends, if you are seen to do so you will be disquallified " + "<br><br>" +
                "5. Using any electronic device such as mobile phones, smart watchers are strictly prohibited" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. You can take help-line options as given in the question " + "<br><br>" +
                "8. And last but no the least, Good Luck!" + "<br><br>" +
            "<html>"
        );
        
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if(ae.getSource()== start){
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    
    public static void main(String[] args){
        new Rules("User");
    }

    
}

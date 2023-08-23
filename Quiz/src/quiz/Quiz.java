
package quiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener{
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, lifeline, submit;
    
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String username){
        
        this.name = name;
        
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        
        questions[0][0] = "Who inivented Omnitrix?";
        questions[0][1] = "Ben";
        questions[0][2] = "Max";
        questions[0][3] = "Azmuth";
        questions[0][4] = "Jully";

        questions[1][0] = "In Ben 10 Alien Force, which alien hologram appeared first in Ben's omnitrix?";
        questions[1][1] = "Swamp Fire";
        questions[1][2] = "Ditto";
        questions[1][3] = "Four Arms";
        questions[1][4] = "Chromastone";

        questions[2][0] = "What is the main power of Kevin in Ben 10 Alien Force?";
        questions[2][1] = "He can turn in alien whenever he wants";
        questions[2][2] = "He can absorve Gwen's power";
        questions[2][3] = "He is an Osmosian";
        questions[2][4] = "He is an plumber";

        questions[3][0] = "Name the Alien who used say: Let me tell you something-";
        questions[3][1] = "Brainstorm";
        questions[3][2] = "Vilgax";
        questions[3][3] = "Heat Blast";
        questions[3][4] = "Rath";

        questions[4][0] = "What was prototype version of Omnitrix?";
        questions[4][1] = "Ultimatrix";
        questions[4][2] = "Unix";
        questions[4][3] = "Omnitrix itself";
        questions[4][4] = "None of the above";

        questions[5][0] = "Who was the commander of the autobots in Transformers G1?";
        questions[5][1] = "Optimus";
        questions[5][2] = "Barricade";
        questions[5][3] = "Mirage";
        questions[5][4] = "Magnus";

        questions[6][0] = "Who became the leader of the Wrecker in Transformers after Impactor's death?";
        questions[6][1] = "ironhide";
        questions[6][2] = "Michael Bay";
        questions[6][3] = "Springer";
        questions[6][4] = "Wreck-gar";

        questions[7][0] = "In Transformers Prime, Who was the best pal of Bulkhead?";
        questions[7][1] = "Wheeljack";
        questions[7][2] = "Cliffjumper";
        questions[7][3] = "Arcee";
        questions[7][4] = "breakdown";

        questions[8][0] = "In Transformers Live Action Movies, who was Optimus Prime's Weapon specialist?";
        questions[8][1] = "Jazz";
        questions[8][2] = "Bone-crusher";
        questions[8][3] = "Ironhide";
        questions[8][4] = "sam Witwicky";

        questions[9][0] = "In Transformers ROTB, 'someone give me a real fight' was utterted by whom?";
        questions[9][1] = "Optimus Primal";
        questions[9][2] = "Optimus";
        questions[9][3] = "Wheeljack";
        questions[9][4] = "Battletrap";
        
        
        
        
        answers[0][1] = "Azmuth";
        answers[1][1] = "Chromastone";
        answers[2][1] = "He is an Osmosian";
        answers[3][1] = "Rath";
        answers[4][1] = "Unix";
        answers[5][1] = "Magnus";
        answers[6][1] = "Springer";
        answers[7][1] = "Wheeljack";
        answers[8][1] = "Ironhide";
        answers[9][1] = "Battletrap";
        
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50 50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        
        
        
        
        
        
        setVisible(true);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == next){
            
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
             if (groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
             
            if (count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
             
             
             
            count++;
            start(count);
            
        } else if (ae.getSource() == lifeline){
            
            if (count == 2 || count == 4 || count == 6 || count ==8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
                   
        } else if (ae.getSource() == submit) {
            
            ans_given = 1;
            
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            } else {
              useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
                
            for (int i=0; i<useranswers.length; i++){
                if (useranswers[i][0].equals(answers[i][1])){
                        score += 10;
                } else {
                    score += 0;
                }
           }
                setVisible(false);
                new Score(name, score);
            
        }
        
    }
    
    public void paint(Graphics g){
        
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0){
          
            g.drawString(time, 1100, 500);
         
        } else {
        
        g.drawString("Times up!!", 1100, 500);
        
        }
        
        timer--;
        
        try{
            Thread.sleep(1000); //1 sec = 1000 ms     
            repaint();
        } catch(Exception e){
            
            e.printStackTrace();
            
        }
        if (ans_given == 1){
            
            ans_given = 0;
            timer = 15;
            
        } else if (timer < 0){
            
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
              
            if (count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9){ // submit case 
                if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
                } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i=0; i<useranswers.length; i++){
                    if (useranswers[i][0].equals(answers[i][1])){
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                
                if (groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            count++;
            start(count);
            }
            
        }
    }
    
    public void start(int count){
        
        qno.setText(""+ (count + 1) + ". ");
        question.setText(questions[count][0]);
        
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
        
    }
    
    public static void main(String[] args){
        new Quiz("User");
    }

    
    
}

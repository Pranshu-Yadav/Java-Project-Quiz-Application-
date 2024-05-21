import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener {

    score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("THANK YOU " + name + " FOR PLAYING JAVA QUIZ ");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Constantia", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("YOUR SCORE IS " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Times New Roman ", Font.BOLD, 26));
        add(lblscore);
        
        JButton submit = new JButton("PLAY AGAIN ");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new score("User", 0);
    }
}
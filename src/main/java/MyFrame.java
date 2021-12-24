import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button;
    static Pawn pawn2;
    MyFrame() {

        super("Chinese Checkers by Sagan");
        Dimension dimension = new Dimension(500,500);
        setSize(dimension);
        setLocation(600,300);
        setResizable(false);



        ImageIcon image = new ImageIcon("icon.jpg");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(255,255,255));
        setLayout(null);

//        JLabel label = new JLabel("Tura");
//        add(label);



        Pawn pawn1 = new Pawn(1,1,2);
        pawn1.setBounds(30,100,50,50);
        add(pawn1);
        pawn2 = new Pawn(1,1,3);
        pawn2.setBounds(100,100,50,50);
        add(pawn2);


//        button = new JButton();
//        button.setBounds(30,100,50,50);
//        button.addActionListener(e -> System.out.println("poo"));
//        add(button);








        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}

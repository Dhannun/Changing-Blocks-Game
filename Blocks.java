
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.*;

class Blocks implements ActionListener {

    JFrame f1 = new JFrame("Symantec Memory Blocks Ver.2.0.0.0");

    JButton b1 = new JButton("?");
    JButton b2 = new JButton("?");
    JButton b3 = new JButton("?");
    JButton b4 = new JButton("?");
    JButton b5 = new JButton("?");
    JButton b6 = new JButton("?");
    JButton b7 = new JButton("?");
    JButton b8 = new JButton("?");
    JButton b9 = new JButton("?");
    JButton b10 = new JButton("?");
    JButton b11 = new JButton("?");
    JButton b12 = new JButton("?");
    JButton b13 = new JButton("?");
    JButton b14 = new JButton("?");
    JButton b15 = new JButton("?");
    JButton b16 = new JButton("?");
    JButton b17 = new JButton("?");
    JButton b18 = new JButton("?");
    JButton b19 = new JButton("?");
    JButton b20 = new JButton("?");

    ImageIcon ic1 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-Preferences-Desktop-C-icon.png");
    ImageIcon ic2 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-preferences-desktop-cryptography-icon.png");
    ImageIcon ic3 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-preferences-desktop-gaming-icon.png");
    ImageIcon ic4 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-preferences-desktop-launch-feedback-icon.png");
    ImageIcon ic5 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-preferences-desktop-remote-desktop-icon.png");
    ImageIcon ic6 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-preferences-desktop-user-icon.png");
    ImageIcon ic7 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Apps-preferences-desktop-user-password-icon.png");
    ImageIcon ic8 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\Folder-Desktop-icon.png");
    ImageIcon ic9 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\help-desk-icon.png");
    ImageIcon ic10 = new ImageIcon("E:\\Java Projects\\Symantec Memory Blocks\\Image Icons\\preferences-desktop-sound-icon.png");

    Font font1 = new Font("Century", Font.BOLD, 30);

    int score = 0, a;

    void shuffle() {
        //To Suffle the Elements//

        List<Integer> list = new ArrayList<Integer>();

        //Add values in the list  
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Blocks t = new Blocks();

        Collections.shuffle(list);

        a = t.getRandomElement(list);
        
    }

    void dothis() {

        shuffle();

        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        b3.setBackground(Color.YELLOW);
        b4.setBackground(Color.YELLOW);
        b5.setBackground(Color.YELLOW);
        b6.setBackground(Color.YELLOW);
        b7.setBackground(Color.YELLOW);
        b8.setBackground(Color.YELLOW);
        b9.setBackground(Color.YELLOW);
        b10.setBackground(Color.YELLOW);
        b11.setBackground(Color.YELLOW);
        b12.setBackground(Color.YELLOW);
        b13.setBackground(Color.YELLOW);
        b14.setBackground(Color.YELLOW);
        b15.setBackground(Color.YELLOW);
        b16.setBackground(Color.YELLOW);
        b17.setBackground(Color.YELLOW);
        b18.setBackground(Color.YELLOW);
        b19.setBackground(Color.YELLOW);
        b20.setBackground(Color.YELLOW);

        buttonFont();

    }

    void buttonFont() {

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);
        b19.setFont(font1);
        b20.setFont(font1);

        AddListeners();
    }

    void AddListeners() {

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        frameSettings();
    }

    void frameSettings() {

        f1.setIconImage(ic3.getImage());
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.add(b10);
        f1.add(b11);
        f1.add(b12);
        f1.add(b13);
        f1.add(b14);
        f1.add(b15);
        f1.add(b16);
        f1.add(b17);
        f1.add(b18);
        f1.add(b19);
        f1.add(b20);

        f1.setLocation(350, 170);
        f1.setVisible(true);
        f1.setLayout(new GridLayout(4, 20));
        f1.setSize(700, 400);
        f1.setDefaultCloseOperation(3);

    }

    public int getRandomElement(List<Integer> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    void button1() {
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b1.getIcon() == b13.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b1.setVisible(false);
            b13.setVisible(false);
        }
    }

    void button2() {
        b1.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b2.getIcon() == b15.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b2.setVisible(false);
            b15.setVisible(false);
        }
    }

    void button3() {
        b1.setIcon(null);
        b2.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b16.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b3.getIcon() == b17.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b3.setVisible(false);
            b17.setVisible(false);
        }
    }

    void button4() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b20.setIcon(null);

        if (b4.getIcon() == b19.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b4.setVisible(false);
            b19.setVisible(false);
        }
    }

    void button5() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);

        if (b5.getIcon() == b14.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b5.setVisible(false);
            b14.setVisible(false);
        }
    }

    void button6() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);

        if (b6.getIcon() == b20.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b6.setVisible(false);
            b20.setVisible(false);
        }
    }

    void button7() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b7.getIcon() == b12.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b7.setVisible(false);
            b12.setVisible(false);
        }
    }

    void button8() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b8.getIcon() == b11.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b8.setVisible(false);
            b11.setVisible(false);
        }
    }

    void button9() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b9.getIcon() == b16.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b9.setVisible(false);
            b16.setVisible(false);
        }
    }

    void button10() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b10.getIcon() == b18.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b10.setVisible(false);
            b18.setVisible(false);
        }
    }

    void button11() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b12.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b11.getIcon() == b8.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b11.setVisible(false);
            b8.setVisible(false);
        }
    }

    void button12() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b12.getIcon() == b7.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b12.setVisible(false);
            b7.setVisible(false);
        }
    }

    void button13() {
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b14.setIcon(null);
        b16.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b13.getIcon() == b1.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b13.setVisible(false);
            b1.setVisible(false);
        }
    }

    void button14() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b20.setIcon(null);

        if (b14.getIcon() == b5.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b14.setVisible(false);
            b5.setVisible(false);
        }
    }

    void button15() {
        b1.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b15.getIcon() == b2.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b15.setVisible(false);
            b2.setVisible(false);
        }
    }

    void button16() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b16.getIcon() == b9.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b16.setVisible(false);
            b9.setVisible(false);
        }
    }

    void button17() {
        b1.setIcon(null);
        b2.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b17.getIcon() == b3.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b17.setVisible(false);
            b3.setVisible(false);
        }
    }

    void button18() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b19.setIcon(null);
        b20.setIcon(null);

        if (b18.getIcon() == b10.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b18.setVisible(false);
            b10.setVisible(false);
        }
    }

    void button19() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b20.setIcon(null);

        if (b19.getIcon() == b4.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b19.setVisible(false);
            b4.setVisible(false);
        }
    }

    void button20() {
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b13.setIcon(null);
        b14.setIcon(null);
        b15.setIcon(null);
        b16.setIcon(null);
        b17.setIcon(null);
        b18.setIcon(null);
        b19.setIcon(null);

        if (b20.getIcon() == b6.getIcon()) {
            score = score + 1;
            JOptionPane.showMessageDialog(f1, "Match Found !");
            b20.setVisible(false);
            b6.setVisible(false);
        }
    }

    public void actionPerformed(ActionEvent ae) {

        if (a == 1) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic1);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic2);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic3);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic4);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic5);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic6);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic7);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic8);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic9);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic10);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic8);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic7);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic1);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic5);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic2);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic9);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic3);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic10);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic4);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic6);
                button20();
            }

        }

        if (a == 2) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic2);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic3);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic4);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic5);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic6);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic7);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic8);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic9);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic10);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic1);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic9);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic8);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic2);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic6);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic3);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic10);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic4);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic1);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic5);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic7);
                button20();
            }

        }

        if (a == 3) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic3);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic4);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic5);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic6);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic7);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic8);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic9);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic10);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic1);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic2);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic10);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic9);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic3);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic7);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic4);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic1);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic5);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic2);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic6);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic8);
                button20();
            }

        }

        if (a == 4) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic4);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic5);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic6);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic7);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic8);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic9);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic10);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic1);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic2);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic3);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic1);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic10);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic4);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic8);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic5);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic2);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic6);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic3);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic7);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic9);
                button20();
            }

        }

        if (a == 5) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic5);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic6);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic7);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic8);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic9);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic10);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic1);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic2);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic3);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic4);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic2);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic1);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic5);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic9);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic6);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic3);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic7);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic4);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic8);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic10);
                button20();
            }

        }

        if (a == 6) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic6);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic7);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic8);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic9);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic10);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic1);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic2);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic3);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic4);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic5);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic3);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic2);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic6);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic10);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic7);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic4);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic8);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic5);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic9);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic1);
                button20();
            }

        }

        if (a == 7) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic7);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic8);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic9);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic10);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic1);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic2);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic3);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic4);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic5);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic6);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic4);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic3);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic7);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic1);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic8);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic5);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic9);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic6);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic10);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic2);
                button20();
            }

        }

        if (a == 8) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic8);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic9);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic10);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic1);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic2);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic3);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic4);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic5);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic6);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic7);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic5);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic4);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic8);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic2);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic9);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic6);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic10);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic7);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic1);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic3);
                button20();
            }

        }

        if (a == 9) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic9);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic10);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic1);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic2);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic3);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic4);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic5);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic6);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic7);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic8);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic6);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic5);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic9);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic3);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic10);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic7);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic1);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic8);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic2);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic4);
                button20();
            }

        }

        if (a == 10) {
            if (ae.getSource() == b1) {
                b1.setIcon(ic10);
                button1();
            }

            if (ae.getSource() == b2) {
                b2.setIcon(ic1);
                button2();
            }

            if (ae.getSource() == b3) {
                b3.setIcon(ic2);
                button3();
            }

            if (ae.getSource() == b4) {
                b4.setIcon(ic3);
                button4();
            }

            if (ae.getSource() == b5) {
                b5.setIcon(ic4);
                button5();
            }

            if (ae.getSource() == b6) {
                b6.setIcon(ic5);
                button6();
            }

            if (ae.getSource() == b7) {
                b7.setIcon(ic6);
                button7();
            }

            if (ae.getSource() == b8) {
                b8.setIcon(ic7);
                button8();
            }

            if (ae.getSource() == b9) {
                b9.setIcon(ic8);
                button9();
            }

            if (ae.getSource() == b10) {
                b10.setIcon(ic9);
                button10();
            }

            if (ae.getSource() == b11) {
                b11.setIcon(ic7);
                button11();
            }

            if (ae.getSource() == b12) {
                b12.setIcon(ic6);
                button12();
            }

            if (ae.getSource() == b13) {
                b13.setIcon(ic10);
                button13();
            }

            if (ae.getSource() == b14) {
                b14.setIcon(ic4);
                button14();
            }

            if (ae.getSource() == b15) {
                b15.setIcon(ic1);
                button15();
            }

            if (ae.getSource() == b16) {
                b16.setIcon(ic8);
                button16();
            }

            if (ae.getSource() == b17) {
                b17.setIcon(ic2);
                button17();
            }

            if (ae.getSource() == b18) {
                b18.setIcon(ic9);
                button18();
            }

            if (ae.getSource() == b19) {
                b19.setIcon(ic3);
                button19();
            }

            if (ae.getSource() == b20) {
                b20.setIcon(ic5);
                button20();
            }

        }

        if (score >= 10) {
            JOptionPane.showMessageDialog(f1, "GAME OVER ! THANK YOU FOR PLAYING");
            System.exit(0);
        }

    }

    public static void main(String arg[]) {
        new Blocks().dothis();
    }

}

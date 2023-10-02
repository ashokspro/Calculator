import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JLabel displayLabel;
    JButton sevenbutton;
    JButton eightbutton;
    JButton ninebutton;
    JButton fourbutton;
    JButton fivebutton;
    JButton sixbutton;
    JButton onebutton;
    JButton twobutton;
    JButton threebutton;
    JButton dotbutton;
    JButton zerobutton;
    JButton equalbutton;
    JButton divisionbutton;
    JButton multibutton;
    JButton minusbutton;
    JButton addbutton;
    JButton clearbutton;
    String oldValue,newValue;
    Float newValueF,oldValueF,result;
    boolean isOperatorClicked,isaddOperatorClicked,isminusOperatorClicked,isdivOperatorClicked,ismultiOperatorClicked;

    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setLocation(400, 100);
        jf.setSize(500, 500);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 370, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30, 100, 70, 70);
        sevenbutton.addActionListener(this);
        jf.add(sevenbutton);

        eightbutton = new JButton("8");
        eightbutton.setBounds(120, 100, 70, 70);
        eightbutton.addActionListener(this);
        jf.add(eightbutton);

        ninebutton = new JButton("9");
        ninebutton.setBounds(210, 100, 70, 70);
        ninebutton.addActionListener(this);
        jf.add(ninebutton);

        fourbutton = new JButton("4");
        fourbutton.setBounds(30, 190, 70, 70);
        fourbutton.addActionListener(this);
        jf.add(fourbutton);

        fivebutton = new JButton("5");
        fivebutton.setBounds(120, 190, 70, 70);
        fivebutton.addActionListener(this);
        jf.add(fivebutton);

        sixbutton = new JButton("6");
        sixbutton.setBounds(210, 190, 70, 70);
        sixbutton.addActionListener(this);
        jf.add(sixbutton);

        onebutton = new JButton("1");
        onebutton.setBounds(30, 280, 70, 70);
        onebutton.addActionListener(this);
        jf.add(onebutton);

        twobutton = new JButton("2");
        twobutton.setBounds(120, 280, 70, 70);
        twobutton.addActionListener(this);
        jf.add(twobutton);

        threebutton = new JButton("3");
        threebutton.setBounds(210, 280, 70, 70);
        threebutton.addActionListener(this);
        jf.add(threebutton);

        dotbutton = new JButton(".");
        dotbutton.setBounds(30, 370, 70, 70);
        dotbutton.addActionListener(this);
        jf.add(dotbutton);

        zerobutton = new JButton("0");
        zerobutton.setBounds(120, 370, 70, 70);
        zerobutton.addActionListener(this);
        jf.add(zerobutton);

        equalbutton = new JButton("=");
        equalbutton.setBounds(210, 370, 70, 70);
        equalbutton.addActionListener(this);
        jf.add(equalbutton);

        divisionbutton = new JButton("/");
        divisionbutton.setBounds(300, 100, 70, 70);
        divisionbutton.addActionListener(this);
        jf.add(divisionbutton);

        multibutton = new JButton("X");
        multibutton.setBounds(300, 190, 70, 70);
        multibutton.addActionListener(this);
        jf.add(multibutton);

        minusbutton = new JButton("-");
        minusbutton.setBounds(300, 280, 70, 70);
        minusbutton.addActionListener(this);
        jf.add(minusbutton);

        addbutton = new JButton("+");
        addbutton.setBounds(300, 370, 70, 70);
        addbutton.addActionListener(this);
        jf.add(addbutton);

        clearbutton = new JButton("Clear");
        clearbutton.setBounds(390, 370, 70, 70);
        clearbutton.addActionListener(this);
        jf.add(clearbutton);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenbutton) {
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "7");

            }
        } else if (e.getSource() == eightbutton) {
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;

            }
            else {
                displayLabel.setText(displayLabel.getText() + "8");

            }
        } else if (e.getSource() == ninebutton) {
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "9");

            }
        } else if (e.getSource() == fourbutton) {
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "4");

            }
        } else if (e.getSource() == fivebutton) {
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "5");

            }
        } else if (e.getSource() == sixbutton) {
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "6");

            }
        } else if (e.getSource() == onebutton) {
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "1");

            }
        } else if (e.getSource() == twobutton) {
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "2");

            }
        } else if (e.getSource() == threebutton) {
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "3");

            }

        } else if (e.getSource() == dotbutton) {
                displayLabel.setText(displayLabel.getText() + ".");

            }

        else if (e.getSource() == zerobutton) {
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;

            }else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        }



        else if (e.getSource() == equalbutton) {
            newValue=displayLabel.getText();
            newValueF=Float.parseFloat(newValue);

            if (isaddOperatorClicked){
                result=oldValueF + newValueF;
                isaddOperatorClicked=false;
            }
            else if(isminusOperatorClicked){
                result=oldValueF-newValueF;
                isminusOperatorClicked=false;
            }
            else if(isdivOperatorClicked){
                result=oldValueF/newValueF;
                isdivOperatorClicked=false;
            }
            else if(ismultiOperatorClicked){
                result=oldValueF*newValueF;
                ismultiOperatorClicked=false;
            }

            displayLabel.setText(result+ " ");
        }


        else if (e.getSource() == addbutton) {
            isOperatorClicked=true;
            isaddOperatorClicked=true;

            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);

            displayLabel.setText("+");


        }
        else if (e.getSource() == divisionbutton) {
            isOperatorClicked=true;
            isdivOperatorClicked=true;

            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);

            displayLabel.setText("/");


        }
        else if (e.getSource() == multibutton) {
            isOperatorClicked=true;
            ismultiOperatorClicked=true;

            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);

            displayLabel.setText("X");


        }
        else if (e.getSource() == minusbutton) {
            isOperatorClicked=true;
            isminusOperatorClicked=true;

            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);

            displayLabel.setText("-");
        }
        else{
           displayLabel.setText("");

       }
    }
}


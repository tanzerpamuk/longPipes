
package longpipes;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class PipeGUI extends JFrame implements ActionListener {
    
    final private String grades[] = {"1", "2", "3", "4", "5"};
    final private String colors[] = {"0", "1", "2"};
    final private JLabel gradeLbl;
    final private JLabel colorLbl;
    final private JComboBox gradeBox;
    final private JLabel gradeValue;
    final private JComboBox colorPrintBox;
    final private JCheckBox insulationBox;
    final private JCheckBox reinforcementBox;
    final private JCheckBox chemicalBox;
    final private JLabel insLbl;
    final private JLabel reinfLbl;
    final private JLabel chemLbl;
    final private JButton calculateBtn;
    
    public PipeGUI() {
        gradeLbl = new JLabel("Plastic Grade:");
        colorLbl = new JLabel("Color Print:");
        gradeBox = new JComboBox(grades);
        gradeValue = new JLabel(gradeBox.getSelectedItem().toString());
        colorPrintBox = new JComboBox(colors);
        insulationBox = new JCheckBox("Enable Logging");
        reinforcementBox = new JCheckBox("Enable Logging");
        chemicalBox = new JCheckBox("Enable Logging");
        insLbl = new JLabel("Inner Insulation");
        reinfLbl = new JLabel("Outer Reinforcement");
        chemLbl = new JLabel("Chemical resistance");
        calculateBtn = new JButton("Calculate");
        insLbl.setBounds(20, 100, 100, 30);
        reinfLbl.setBounds(20, 140, 120, 30);
        chemLbl.setBounds(20, 180, 120, 30);
        gradeLbl.setBounds(20, 20, 100, 30);
        colorLbl.setBounds(20, 60, 100, 30);
        gradeBox.setBounds(130, 20, 20, 30);
        gradeValue.setBounds(110, 20, 20, 30);
        gradeValue.setBackground(Color.white);
        gradeValue.setOpaque(true);
        colorPrintBox.setBounds(110, 60, 20, 30);
        insulationBox.setBounds(150, 105, 20, 20);
        reinforcementBox.setBounds(150, 145, 20, 20);
        chemicalBox.setBounds(150, 185, 20, 20);
        calculateBtn.setBounds(20, 240, 100, 20);
        build();
    }
    
    public void build() {
        setLayout(null);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calculateBtn.addActionListener(this);
        add(gradeLbl);
        add(gradeValue);
        add(colorLbl);
        add(insLbl);
        add(reinfLbl);
        add(chemLbl);
        add(gradeBox);
        add(colorPrintBox);
        add(insulationBox);
        add(reinforcementBox);
        add(chemicalBox);
        add(calculateBtn);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String gradeData = gradeBox.getSelectedItem().toString();
        String colorData = colorPrintBox.getSelectedItem().toString();
        Boolean insData = insulationBox.isSelected();
        Boolean reinfData = reinforcementBox.isSelected();
        Boolean chemData = chemicalBox.isSelected();
        String data[] = {gradeData, colorData}; //, insData, reinfData, chemData
        System.out.println(gradeData);
        System.out.println(colorData);
        System.out.println(insData);
        System.out.println(reinfData);
        System.out.println(chemData);
    }
                
}

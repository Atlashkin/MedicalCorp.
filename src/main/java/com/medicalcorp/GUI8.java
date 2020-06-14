package com.medicalcorp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI8 {
    static JFrame jFrame8 = Main.getFrame();


    public GUI8() throws Exception{
        JPanel jPanel = new JPanel();
        jFrame8.add(jPanel);
        jPanel.setLayout(null);

        JLabel mc = new JLabel("ПЕРСОНАЛ");
        mc.setFont( new Font("Verdana", Font.PLAIN, 25));
        mc.setBounds(20, 5, 400, 50);

        JButton gm = new JButton("Главное меню");
        gm.setFont( new Font("Verdana", Font.PLAIN, 10));
        gm.setBounds(630, 15, 120, 30);
        gm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame8.dispose();
                jFrame8.setVisible(false);
                GUI2.jFrame2.show();
                GUI2.jFrame2.setVisible(true);
            }
        });

        Object[] headers = { "№", "ФИО", "Возраст", "Должность"};
        Object[][] data = {{"1", "oo", "pp", "rr"},{"1", "oo", "pp", "rr"},{"1", "oo", "pp", "rr"},{"1", "oo", "pp", "rr"},{"1", "oo", "pp", "rr"},{"1", "oo", "pp", "rr"}};


        JTable patients;
        patients = new JTable(data, headers);
        JScrollPane sr = new JScrollPane(patients);


        patients.setPreferredScrollableViewportSize(new Dimension(650, 350));
        sr.setBounds(70, 70, 650, 350);
        patients.setBounds(70, 70, 650, 350);

        //patients.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        patients.getColumnModel().getColumn(0).setMinWidth(10);
        patients.getColumnModel().getColumn(0).setMaxWidth(50);

        patients.getColumnModel().getColumn(1).setMinWidth(100);
        patients.getColumnModel().getColumn(1).setMaxWidth(250);

        patients.getColumnModel().getColumn(2).setMinWidth(50);
        patients.getColumnModel().getColumn(2).setMaxWidth(150);

        patients.getColumnModel().getColumn(3).setMinWidth(100);
        patients.getColumnModel().getColumn(3).setMaxWidth(250);




        jPanel.add(gm);
        jPanel.add(mc);
        jPanel.add(sr);

        SwingUtilities.invokeLater((new Runnable() {
            public void run() {
                try {
                    new GUI8();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }));



        jPanel.revalidate();
    }

}